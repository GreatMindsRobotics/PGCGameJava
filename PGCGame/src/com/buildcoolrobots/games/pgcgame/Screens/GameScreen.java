package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;


public class GameScreen extends BaseScreen {
	ExtendedSprite dpadUp;
	ExtendedSprite dpadDown;
	ExtendedSprite dpadLeft;
	ExtendedSprite dpadRight;
	ExtendedSprite dpadCenter;
	
	public GameScreen(SpriteManager allSprites, SpriteBatch spriteBatch, ScreenType screenType) {
		super(allSprites, spriteBatch, screenType);
		
		dpadUp = new ExtendedSprite(GameImage.GAMEDPADUP.ImageTexture());
		dpadDown = new ExtendedSprite(GameImage.GAMEDPADDOWN.ImageTexture());
		dpadLeft = new ExtendedSprite(GameImage.GAMEDPADLEFT.ImageTexture());
		dpadRight = new ExtendedSprite(GameImage.GAMEDPADRIGHT.ImageTexture());
		dpadCenter = new ExtendedSprite(GameImage.GAMEDPADCENTER.ImageTexture());
		
		dpadCenter.setPosition(100,100);
		dpadUp.setPosition(dpadCenter.getX(), dpadCenter.getY() + dpadUp.getHeight());
		dpadDown.setPosition(dpadCenter.getX(), dpadCenter.getY() - dpadDown.getHeight());
		
		allSprites.add(dpadCenter);
		allSprites.add(dpadUp);
		allSprites.add(dpadDown);
	}
	
	public void update(float deltaTime) {
		super.update(deltaTime);
	}
}