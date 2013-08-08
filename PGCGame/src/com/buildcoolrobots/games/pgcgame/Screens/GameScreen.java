package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;


public class GameScreen extends BaseScreen {
	ExtendedSprite dpadUp;
	ExtendedSprite dpadDown;
	ExtendedSprite dpadLeft;
	ExtendedSprite dpadRight;
	ExtendedSprite dpadCenter;
	
	ExtendedSprite Ship;
	
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
		dpadLeft.setPosition(dpadCenter.getX() - dpadLeft.getWidth(), dpadCenter.getY());
		dpadRight.setPosition(dpadCenter.getX() + dpadRight.getWidth(), dpadCenter.getY());
		
		
		Ship = new ExtendedSprite(ShipTypes.PLAYERSHIP.GameTexture());
		Ship.setPosition(100, Gdx.graphics.getHeight()/2 - Ship.getHeight()/2);
		
		allSprites.add(Ship);
		allSprites.add(dpadCenter);
		allSprites.add(dpadUp);
		allSprites.add(dpadDown);
		allSprites.add(dpadLeft);
		allSprites.add(dpadRight);
	}
	
	boolean lastTouch = false;
	
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		if (!Gdx.input.isTouched()) {
			dpadUp.setColor(Color.WHITE);
			dpadDown.setColor(Color.WHITE);
			dpadLeft.setColor(Color.WHITE);
			dpadRight.setColor(Color.WHITE);
			Ship.xSpeed = 0;
			Ship.ySpeed = 0;
			lastTouch = false;
		}
		
		if (Gdx.input.isTouched()) {
			if (Gdx.input.getX() >= dpadUp.getX() && Gdx.input.getX() <= dpadUp.getX() + dpadUp.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= dpadUp.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= dpadUp.getY() + dpadUp.getHeight() && !lastTouch) {
				dpadUp.setColor(Color.GRAY);
				Ship.ySpeed = 5;
				lastTouch = true;
			} else if (Gdx.input.getX() >= dpadDown.getX() && Gdx.input.getX() <= dpadDown.getX() + dpadDown.getWidth() &&
			Gdx.graphics.getHeight() - Gdx.input.getY() >= dpadDown.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= dpadDown.getY() + dpadDown.getHeight() && !lastTouch) {
				dpadDown.setColor(Color.GRAY);
				Ship.ySpeed = -5;
				lastTouch = true;
			} else if (Gdx.input.getX() >= dpadLeft.getX() && Gdx.input.getX() <= dpadLeft.getX() + dpadLeft.getWidth() &&
			Gdx.graphics.getHeight() - Gdx.input.getY() >= dpadLeft.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= dpadLeft.getY() + dpadLeft.getHeight() && !lastTouch) {
				dpadLeft.setColor(Color.GRAY);
				Ship.xSpeed = -5;
				lastTouch = true;
			} else if (Gdx.input.getX() >= dpadRight.getX() && Gdx.input.getX() <= dpadRight.getX() + dpadRight.getWidth() &&
			Gdx.graphics.getHeight() - Gdx.input.getY() >= dpadRight.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= dpadRight.getY() + dpadRight.getHeight() && !lastTouch) {
				dpadRight.setColor(Color.GRAY);
				Ship.xSpeed = 5;
				lastTouch = true;
			}
		}
	}
}