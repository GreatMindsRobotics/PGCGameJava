package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class PauseScreen extends BaseScreen {

ExtendedSprite ResumeButton;
ExtendedLabel ResumeButtonText;
ExtendedSprite MainMenuButton;
ExtendedLabel MainMenuButtonText;
ExtendedSprite SettingsButton;
ExtendedLabel SettingsButtonText;

	public PauseScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		ResumeButton = new ExtendedSprite(GameImage.PAUSESCREENBUTTON.ImageTexture());
		ResumeButton.setPosition(Gdx.graphics.getWidth()/2 - ResumeButton.getWidth()/2, Gdx.graphics.getHeight() - 100);
		ResumeButtonText = new ExtendedLabel("Resume", GameImage.PAUSESCREENBUTTON.ImageText());
		ResumeButtonText.setPosition(Gdx.graphics.getWidth()/2 - ResumeButtonText.getWidth()/2, Gdx.graphics.getHeight() - 80);
		MainMenuButton = new ExtendedSprite(GameImage.PAUSESCREENBUTTON.ImageTexture());
		MainMenuButton.setPosition(Gdx.graphics.getWidth()/2 - MainMenuButton.getWidth()/2, Gdx.graphics.getHeight() - 200);
		MainMenuButtonText = new ExtendedLabel("Main Menu", GameImage.PAUSESCREENBUTTON.ImageText());
		MainMenuButtonText.setPosition(Gdx.graphics.getWidth()/2 - MainMenuButtonText.getWidth()/2, Gdx.graphics.getHeight() - 180);
		SettingsButton = new ExtendedSprite(GameImage.PAUSESCREENBUTTON.ImageTexture());
		SettingsButton.setPosition(Gdx.graphics.getWidth()/2 - SettingsButton.getWidth()/2, Gdx.graphics.getHeight() - 300);
		SettingsButtonText = new ExtendedLabel("Main Menu", GameImage.PAUSESCREENBUTTON.ImageText());
		SettingsButtonText.setPosition(Gdx.graphics.getWidth()/2 - SettingsButtonText.getWidth()/2, Gdx.graphics.getHeight() - 280);
		
		allSprites.add(ResumeButton);
		allSprites.add(ResumeButtonText);
		allSprites.add(MainMenuButton);
		allSprites.add(MainMenuButtonText);
		allSprites.add(SettingsButton);
		allSprites.add(SettingsButtonText);
	}
}
