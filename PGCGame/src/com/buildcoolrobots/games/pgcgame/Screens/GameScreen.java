package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.DPad;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;
import com.buildcoolrobots.games.pgcgame.Ships.BaseShip;

public class GameScreen extends BaseScreen {
	public static DPad Dpad;
	
	BaseShip Ship;
	ExtendedSprite FireButton;
	ExtendedSprite PauseButton;
	ExtendedLabel xy;
	String coor = "0,0";
	
	float timeSinceLastFire = 0;
	final float fireDelay = 0.150f;  
	
	public GameScreen(SpriteManager allSprites, SpriteBatch spriteBatch, ScreenType screenType) {
		super(allSprites, spriteBatch, screenType);
		
		Ship = new BaseShip(new Vector2(100, Gdx.graphics.getHeight()/2 - ShipTypes.PLAYERSHIP.GameTexture().getHeight()/2), ShipTypes.PLAYERSHIP.GameTexture(), allSprites);
		Dpad = new DPad();
		FireButton = new ExtendedSprite(GameImage.FIREBUTTON.ImageTexture());
		PauseButton = new ExtendedSprite(GameImage.PAUSEBUTTON.ImageTexture());
		PauseButton.setPosition(Gdx.graphics.getWidth() - PauseButton.getWidth(), Gdx.graphics.getHeight() - PauseButton.getHeight());
		
		xy = new ExtendedLabel(coor , GameImage.DEBUGFONT.ImageText());
		xy.setPosition(25, Gdx.graphics.getHeight() - 50);
		//xy.setFontScale(2,2);
		
		allSprites.add(xy);
		allSprites.add(Ship);
		allSprites.add(Dpad);
		allSprites.add(FireButton);
		allSprites.add(PauseButton);
	}
	
	public void update(float deltaTime) {
		super.update(deltaTime);
		timeSinceLastFire += deltaTime;

		if (Gdx.input.isTouched()) {
			coor = "" + Gdx.input.getX() + "," + (Gdx.graphics.getHeight() - Gdx.input.getY());
			xy.setText(coor + "\ndir: " + Dpad.shipDirection.toString());
			
			if (!SettingsScreen.leftyMode) {
				FireButton.setPosition(Gdx.graphics.getWidth() - FireButton.getWidth(),0);
			} else {
				FireButton.setPosition(0, 0);
			}
			
	        
		}

		Ship.move(Dpad.shipDirection);		
		
		
		for (int i = 0; i < 2; i++) {
			if (Gdx.input.isTouched(i) &&
					Gdx.input.getX(i) >= FireButton.getX() && Gdx.input.getX(i) <= FireButton.getX() + FireButton.getWidth() &&
					Gdx.graphics.getHeight() - Gdx.input.getY(i) >= FireButton.getY() && Gdx.graphics.getHeight() - Gdx.input.getY(i) <= FireButton.getY() + FireButton.getHeight()) {
					
					if(timeSinceLastFire >= fireDelay) {
						Ship.shoot();
						timeSinceLastFire = 0;
					} 	
					
				}		
		}
		
		if (Gdx.input.isTouched() &&
				Gdx.input.getX() >= PauseButton.getX() && Gdx.input.getX() <= PauseButton.getX() + PauseButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= PauseButton.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= PauseButton.getY() + PauseButton.getHeight()) {
			StateManager.SwitchScreen(ScreenType.PAUSESCREEN);
		}
	}
}