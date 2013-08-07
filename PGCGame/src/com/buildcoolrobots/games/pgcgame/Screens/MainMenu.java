package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class MainMenu extends BaseScreen {

	public MainMenu(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		
		ExtendedSprite PlayButton = new ExtendedSprite(GameImage.MAINMENUPLAYBUTTON.ImageTexture());
		ExtendedSprite SettingsButton = new ExtendedSprite(GameImage.MAINMENUSETTINGSBUTTON.ImageTexture());
		
		PlayButton.setPosition(Gdx.graphics.getWidth() / 2 - PlayButton.getWidth() / 2, 100);
		PlayButton.setScale(new Vector2(1f, 1f));
		
		SettingsButton.setPosition(Gdx.graphics.getWidth() / 4 - SettingsButton.getWidth() / 2, 300);
		SettingsButton.setScale(new Vector2(1f, 1f));
		
		
		ExtendedLabel PlayButtonText = new ExtendedLabel("Play", GameImage.MAINMENUPLAYBUTTON.ImageText());
		PlayButtonText.setPosition(Gdx.graphics.getWidth() / 2 - PlayButtonText.getWidth() / 2, 120);
		
        ExtendedLabel SettingsButtonText = new ExtendedLabel("Settings", GameImage.MAINMENUSETTINGSBUTTON.ImageText());
        SettingsButtonText.setPosition(Gdx.graphics.getWidth() / 4 - SettingsButtonText.getWidth() / 2, 320);
		
		allSprites.add(PlayButton);
		allSprites.add(PlayButtonText);
		allSprites.add(SettingsButton);
		allSprites.add(SettingsButtonText);

	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
	}

}
