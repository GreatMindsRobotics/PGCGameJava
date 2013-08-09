package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SimpleSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.DPad;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;

public class GameScreen extends BaseScreen {

	ExtendedSprite Ship;
	DPad Dpad;
	ExtendedLabel xy;
	String coor = "0,0";
	public GameScreen(SpriteManager allSprites, SpriteBatch spriteBatch, ScreenType screenType) {
		super(allSprites, spriteBatch, screenType);
		
	
		
		Ship = new ExtendedSprite(ShipTypes.PLAYERSHIP.GameTexture());
		Ship.setPosition(100, Gdx.graphics.getHeight()/2 - Ship.getHeight()/2);
		Dpad = new DPad();
		Dpad.setPosition(0, 0);
		xy = new ExtendedLabel(coor , GameImage.DEBUGFONT.ImageText());
		xy.setPosition(Gdx.graphics.getWidth() - 150, 50);
		xy.setFontScale(2,2);
		allSprites.add(xy);
		allSprites.add(Ship);
		allSprites.add((SimpleSprite) Dpad);

	}
	
	
	public void update(float deltaTime) {
		super.update(deltaTime);
		if (Gdx.input.isTouched()) {
			coor = "" + Gdx.input.getX() + "," + Gdx.input.getY();
			xy.setText(coor);
		}
	}
}