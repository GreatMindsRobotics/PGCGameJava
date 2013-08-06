package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BGSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class SettingsScreen extends BaseScreen {
	
	private ExtendedSprite Button1;
	private ExtendedSprite Button2;
	private ExtendedSprite Button3;
	private ExtendedSprite Button4;
	private ExtendedSprite Button5;
	private ExtendedLabel ButtonLabel1;
	private ExtendedLabel ButtonLabel2;
	private ExtendedLabel ButtonLabel3;
	private ExtendedLabel ButtonLabel4;
	private ExtendedLabel ButtonLabel5;
	
	public SettingsScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		
		Button1 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button1.setPosition(100, Gdx.graphics.getHeight() - 100);
		
		Button2 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button2.setPosition(100, Gdx.graphics.getHeight() - 200);
		
		Button3 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button3.setPosition(100, Gdx.graphics.getHeight() - 300);
		
		Button4 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button4.setPosition(450, Gdx.graphics.getHeight() - 100);
		
		Button5 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button5.setPosition(450, Gdx.graphics.getHeight() - 200);
		
		allSprites.add(Button1);
		allSprites.add(Button2);
		allSprites.add(Button3);
		allSprites.add(Button4);
		allSprites.add(Button5);

	}

	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
	}
}
