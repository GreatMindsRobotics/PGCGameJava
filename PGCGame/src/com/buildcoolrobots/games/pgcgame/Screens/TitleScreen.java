package com.buildcoolrobots.games.pgcgame.Screens;

import java.util.Random;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;

public class TitleScreen extends BaseScreen {
	
	private ExtendedSprite background;
	private ExtendedSprite background2;
	private ExtendedSprite gameTitle;
	private ExtendedSprite ship;
	
	Random rand = new Random();
	
	public TitleScreen(SpriteManager allSprites, SpriteBatch spriteBatch) {
		super(allSprites, spriteBatch);
		
		StateManager.TitleScreenBGSpriteDebug = false;
		
		gameTitle = new ExtendedSprite(GameImage.GAMETITLE.ImageTexture());
		gameTitle.setPosition(Gdx.graphics.getWidth() / 2 - gameTitle.getWidth() / 2, Gdx.graphics.getHeight() - 100);
		gameTitle.setScale(new Vector2 (1.3f, 1.3f));
		
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
		allSprites.add(gameTitle);
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		if (ship.getX() > 175 && ship.getX() < Gdx.graphics.getWidth()) {
			ship.xSpeed *= 1.035f;
			ship.ySpeed *= 0;
			if (ship.getRotation() >= 1) {
				ship.rotate(-1f);
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
