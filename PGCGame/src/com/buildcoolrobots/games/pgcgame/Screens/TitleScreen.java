package com.buildcoolrobots.games.pgcgame.Screens;

import java.util.Random;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;

public class TitleScreen extends BaseScreen {
	
	private ExtendedSprite background;
	private ExtendedSprite background2;
	private ExtendedSprite ship;
	
	Random rand = new Random();
	
	public TitleScreen(SpriteManager allSprites, SpriteBatch spriteBatch) {
		super(allSprites, spriteBatch);
		
		StateManager.TitleScreenBGSpriteDebug = false;
		
		ExtendedLabel titleText = new ExtendedLabel("Plequarius: Galactic Commanders", ScreenType.TITLESCREEN.ScreenLabelStyle());
		titleText.setPosition((Gdx.graphics.getWidth() - titleText.getWidth()) / 2, Gdx.graphics.getHeight() - titleText.getHeight() - 50);
		
		
		background = new ExtendedSprite(ScreenType.TITLESCREEN.ScreenTexture());
		background.setPosition(0, 0);
		background.xSpeed = -1f;
		
		background2 = new ExtendedSprite(ScreenType.TITLESCREEN.ScreenTexture());
		if (!StateManager.TitleScreenBGSpriteDebug) {
			background2.setPosition(background.getX() + background.getWidth(), 0);
		}
		else {
			background2.setPosition(background.getX() + background.getWidth() + 1, 0);
		}
		background2.xSpeed = -1f;
		
		ship = new ExtendedSprite(ShipTypes.PLAYERSHIP.GameTexture());
		ship.setPosition(-200, -100);
		ship.xSpeed = 3f;
		ship.ySpeed = 2f;
		ship.setRotation(25);
		
		
		
		allSprites.add(background);
		allSprites.add(background2);
		allSprites.add(ship);
		allSprites.add(titleText);
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		if (ship.getX() > 100 && ship.getX() < Gdx.graphics.getWidth()) {
			ship.xSpeed *= 1.035f;
			if (ship.getRotation() >= 8) {
				ship.rotate(-.8f);
			}
		}
		
		if (ship.getX() > Gdx.graphics.getWidth()) {
			ship.setPosition(-500, -300);
			ship.xSpeed = 3f;
			ship.ySpeed = 2f;
			
			ship.setRotation(25);
		}
		
		if (background.getX() + background.getWidth() <= 0) {
			if (!StateManager.TitleScreenBGSpriteDebug) {
				background.setPosition(background2.getX() + background2.getWidth(), 0);
			}
			else {
				background.setPosition(background2.getX() + background2.getWidth() + 1, 0);
			}
		}
		
		if (background2.getX() + background2.getWidth() <= 0) {
			if (!StateManager.TitleScreenBGSpriteDebug) {
				background2.setPosition(background.getX() + background.getWidth(), 0);
			}
			else {
				background2.setPosition(background.getX() + background.getWidth() + 1, 0);
			}
		}
	}

}
