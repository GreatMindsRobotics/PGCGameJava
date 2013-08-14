package com.buildcoolrobots.games.pgcgame.CoreTypes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.UUID;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameLevel;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;
import com.buildcoolrobots.games.pgcgame.Ships.Bullets.Bullet;
import com.buildcoolrobots.games.pgcgame.Ships.Enemies.BaseEnemyShip;


public abstract class StateManager {
	
	// Debug Features
    public static boolean TitleScreenBGSpriteDebug = false;

	// Private Fields
    public static int HealthPacks = 0;
    private static Stack<ScreenType> _screenStack = new Stack<ScreenType>();
    private static ScreenType _screenState = ScreenType.TITLESCREEN;
    private static UUID _enemyID = UUID.randomUUID();
    private static int _spaceBucks = 200000;    
    
    // Public Fields
    public static Game PGC;
    
    public static ArrayList<Bullet> LegitBullets = new ArrayList<Bullet>();
    public static boolean IsWSFirstUpdate = true;
    public static final Rectangle WorldSize = new Rectangle(0, 0, (Gdx.graphics.getWidth()) * 5, Gdx.graphics.getHeight());
    public static ScreenManager AllScreens = new ScreenManager();
    
    public static ShipTypes SelectedShip;
    //public static ShipTier SelectedTier;

    public static int SpacePoints = 0;
    
    public static final ArrayList<BaseEnemyShip> ActiveShips = new ArrayList<BaseEnemyShip>();
    
    public static int SpaceLives = 5;   
    private static GameLevel _level = GameLevel.LEVEL1;
    public static GameLevel CurrentLevel = GameLevel.LEVEL1;
    public static boolean NextLevel = false;
       
    public static final Random RandomGenerator = new Random();
    
    //get and sets
    
    public static GameLevel getLevel() {
		return _level;
    }
    public static void setLevel(GameLevel level) {
    	if (level != _level) {
    		if (CurrentLevel == _level) {
    			//_level++;
    			
    		}
    		_level = level;
    		// check if level completed?
    	}
    }
    public static ScreenType getScreenState() {
    	return _screenState;
    }
    public static void SwitchScreen(ScreenType screenState) {
    	if(screenState != null) {
	    	_screenStack.push(screenState);
	    	_screenState = screenState;
	    	PGC.setScreen(AllScreens.getScreen(screenState));
    	}
    }
    public static int getSpaceBucks() {
    	return _spaceBucks;
    }
    public static void setSpaceBucks(int SpaceBucks) {
    	_spaceBucks = SpaceBucks;
    }
    public static UUID getEnemyID() {
    	return _enemyID;
    }
    public static void setEnemyID(UUID EnemyID) {
    	_enemyID = EnemyID;
    }
    
    //TODO: Make a musicenabledchanged event
    
    public static void GoBackScreen() {
    	_screenStack.pop();
    	if (_screenStack.size() == 0) {
    		Gdx.app.exit();
    		return;
    	}
    	_screenState = _screenStack.peek();
    	PGC.setScreen(AllScreens.getScreen(_screenStack.peek()));
    }

    public static void SwitchScreen(int debugKey) {
    	SwitchScreen(AllScreens.getScreenType(debugKey));
    	if(debugKey == 244){
    		_screenStack.clear();
    		_screenStack.add(ScreenType.TITLESCREEN);
    	}
    	
    }
    
	public static void SwitchNextScreen() {		
		SwitchScreen(AllScreens.getNextScreen());
	}

    
    public static void Reset()
    {
        //Screens.Shop.firstShop = true;
        NextLevel = false;
        _level = GameLevel.LEVEL1;
        SpacePoints = 0;
        _screenStack.clear();
        _spaceBucks = 200000;
        IsWSFirstUpdate = true;
        _enemyID = UUID.randomUUID();
        SpaceLives = 5;
    }
    
    
    
	public static class DebugData {
		public static Boolean AllowScreenSwitching = true;
		public static Boolean ShowScreenName = true;
	}
	
	public static class Options {
		
	}

	
	
}
