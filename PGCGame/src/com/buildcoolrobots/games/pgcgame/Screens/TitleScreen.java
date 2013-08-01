package com.buildcoolrobots.games.pgcgame.Screens;

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
	
	ExtendedSprite background;
	ExtendedSprite background2;
	public TitleScreen(SpriteManager allSprites, SpriteBatch spriteBatch) {
		super(allSprites, spriteBatch);
		
		StateManager._titleScreenBGSpriteDebug = false;
		
		background = new ExtendedSprite(ScreenType.TITLESCREEN.ScreenTexture());
		background.setPosition(0, 0);
		background.xSpeed = -1f;
		
		background2 = new ExtendedSprite(ScreenType.TITLESCREEN.ScreenTexture());
		if (!StateManager._titleScreenBGSpriteDebug) {
			background2.setPosition(background.getX() + background.getWidth(), 0);
		}
		else {
			background2.setPosition(background.getX() + background.getWidth() + 1, 0);
		}
		background2.xSpeed = -1f;
		
		allSprites.add(background);
		allSprites.add(background2);
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		if (background.getX() + background.getWidth() <= 0) {
			if (!StateManager._titleScreenBGSpriteDebug) {
				background.setPosition(background2.getX() + background2.getWidth(), 0);
			}
			else {
				background.setPosition(background2.getX() + background2.getWidth() + 1, 0);
			}
		}
		
		if (background2.getX() + background2.getWidth() <= 0) {
			if (!StateManager._titleScreenBGSpriteDebug) {
				background2.setPosition(background.getX() + background.getWidth(), 0);
			}
			else {
				background2.setPosition(background.getX() + background.getWidth() + 1, 0);
			}
		}
	}

}
