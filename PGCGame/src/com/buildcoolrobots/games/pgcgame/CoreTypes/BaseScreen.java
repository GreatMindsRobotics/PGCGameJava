package com.buildcoolrobots.games.pgcgame.CoreTypes;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

import me.pagekite.glen3b.gjlib.BasicScreen;
import me.pagekite.glen3b.gjlib.SpriteManager;

public abstract class BaseScreen extends BasicScreen {

	public BaseScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target);		
		
		_screenType = screenType;
		StateManager.AllScreens.setScreen(this);
	}
	
	private ScreenType _screenType;
	
	public ScreenType getScreenType() {
		return _screenType;
	}

}
