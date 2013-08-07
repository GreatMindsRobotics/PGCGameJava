package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;


public class GameScreen extends BaseScreen {
	
	ExtendedSprite background;
	
	public GameScreen(SpriteManager allSprites, SpriteBatch spriteBatch, ScreenType screenType) {
		super(allSprites, spriteBatch, screenType);		
	}
}