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
		ship.setPosition(-300, -100);
		ship.xSpeed = 3;
		ship.ySpeed = 1;
		
		allSprites.add(background);
		allSprites.add(background2);
		allSprites.add(ship);
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		ship.xSpeed *= 1.018;
		ship.ySpeed *= 1.018;
		
		if (ship.getX() > Gdx.graphics.getWidth()) {
			ship.setPosition(-100, rand.nextInt(Gdx.graphics.getHeight() - 100));
			ship.xSpeed = 3;
			ship.ySpeed = rand.nextInt(5) - 3;
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
