package com.buildcoolrobots.games.pgcgame.CoreTypes;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import java.util.UUID;

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
    private static ScreenManager AllScreens = new ScreenManager();
    
    // Public Fields
    public static ArrayList<Bullet> LegitBullets = new ArrayList<Bullet>();
    public static boolean IsWSFirstUpdate = true;
    public static final Rectangle WorldSize = new Rectangle(0, 0, (Gdx.graphics.getWidth()) * 5, Gdx.graphics.getHeight());
    
    public static ShipTypes SelectedShip;
    //public static ShipTier SelectedTier;

    public static int SpacePoints = 0;
    
    public static final ArrayList<BaseEnemyShip> ActiveShips = new ArrayList<BaseEnemyShip>();
    
    public static int Lives = 5;
    
    private static GameLevel _level = GameLevel.LEVEL1;
    public static GameLevel CurrentLevel = GameLevel.LEVEL1;
    public static boolean NextLevel = false;
    
    
    //public static ScreenManager AllScreens;
    
    
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
    public static void setScreenState(ScreenType ScreenState) {
    	_screenStack.push(ScreenState);
    	_screenState = ScreenState;
    	//SwitchScreen(ScreenState); Need to make this method
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

    
    public static void GoBackScreen() {
    	_screenStack.pop();
    	if (_screenStack.size() == 0) {
    		//TODO: Make exit function
    		//StateManager.Exit();
    		
    		return;
    	}
    	_screenState = _screenStack.peek();
    	SwitchScreen(_screenState);	
    }
    
    public static void SwitchScreen(ScreenType screenType) {
    	//TODO: Rehaan work in progress
    	for(BaseScreen screen: AllScreens.getAllScreens()) {
    		//TODO: Create an arraylist of all screen
    		screen.hide();
    	}
    } 
    
    public static void Reset()
    {
        //Screens.Shop.firstShop = true;
        NextLevel = false;
        _level = GameLevel.LEVEL1;
        SpacePoints = 0;
        Stack<ScreenType> _screenStack = new Stack<ScreenType>();
        _spaceBucks = 200000;
        IsWSFirstUpdate = true;
        _enemyID = UUID.randomUUID();
        Lives = 5;
    }
    
    
    
	public static class DebugData {
	}
	
	public static class Options {
		
	}
	
	
}
