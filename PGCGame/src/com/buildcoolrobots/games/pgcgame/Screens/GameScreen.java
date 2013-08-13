package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.DPad;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;
import com.buildcoolrobots.games.pgcgame.Ships.BaseShip;

public class GameScreen extends BaseScreen {
	public static DPad Dpad;
	
	BaseShip Ship;
	ExtendedSprite FireButton;
	ExtendedLabel xy;
	String coor = "0,0";
	
	public GameScreen(SpriteManager allSprites, SpriteBatch spriteBatch, ScreenType screenType) {
		super(allSprites, spriteBatch, screenType);
		
		Ship = new BaseShip(new Vector2(100, Gdx.graphics.getHeight()/2 - ShipTypes.PLAYERSHIP.GameTexture().getHeight()/2), ShipTypes.PLAYERSHIP.GameTexture(), allSprites);
		Dpad = new DPad();
		FireButton = new ExtendedSprite(GameImage.FIREBUTTON.ImageTexture());
		
		xy = new ExtendedLabel(coor , GameImage.DEBUGFONT.ImageText());
		xy.setPosition(Gdx.graphics.getWidth() - 150, 50);
		//xy.setFontScale(2,2);
		
		allSprites.add(xy);
		allSprites.add(Ship);
		allSprites.add(Dpad);
		allSprites.add(FireButton);
	}
	
	private boolean lastTouch = false;
	public void update(float deltaTime) {
		super.update(deltaTime);

		if (Gdx.input.isTouched()) {
			coor = "" + Gdx.input.getX() + "," + (Gdx.graphics.getHeight() - Gdx.input.getY());
			xy.setText(coor + "\ndir: " + Dpad.shipDirection.toString());
			
			if (!SettingsScreen.leftyMode) {
				Dpad.setPosition(0, 0);
				FireButton.setPosition(Gdx.graphics.getWidth() - FireButton.getWidth(),0);
			} else {
				Dpad.setPosition(Gdx.graphics.getWidth() - Dpad.getWidth(), 0);
				FireButton.setPosition(0, 0);
			}
			
	        
		}

		Ship.move(Dpad.shipDirection);		
		
		if (Gdx.input.isTouched() &&
			Gdx.input.getX() >= FireButton.getX() && Gdx.input.getX() <= FireButton.getX() + FireButton.getWidth() &&
			Gdx.graphics.getHeight() - Gdx.input.getY() >= FireButton.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= FireButton.getY() + FireButton.getHeight() && !lastTouch) {
			
			Ship.shoot();
			
			lastTouch = true;
		}
		if (!Gdx.input.isTouched()) {
			lastTouch = false;
		}
	}
}