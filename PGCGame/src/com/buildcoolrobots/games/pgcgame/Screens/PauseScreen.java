package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseGameSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.ScreenManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class PauseScreen extends BaseScreen {

	BaseGameSprite ResumeButton;
	ExtendedLabel ResumeButtonText;
	BaseGameSprite MainMenuButton;
	ExtendedLabel MainMenuButtonText;
	BaseGameSprite SettingsButton;
	ExtendedLabel SettingsButtonText;

	public PauseScreen(SpriteManager allSprites, SpriteBatch target,
			ScreenType screenType) {
		super(allSprites, target, screenType);
		ResumeButton = new BaseGameSprite(
				GameImage.PAUSESCREENBUTTON.ImageTexture());
		ResumeButton.setPosition(
				Gdx.graphics.getWidth() / 2 - ResumeButton.getWidth() / 2,
				Gdx.graphics.getHeight() - 150);
		ResumeButtonText = new ExtendedLabel("Resume",
				GameImage.PAUSESCREENBUTTON.ImageText());
		ResumeButtonText.setPosition(Gdx.graphics.getWidth() / 2
				- ResumeButtonText.getWidth() / 2,
				Gdx.graphics.getHeight() - 130);
		MainMenuButton = new BaseGameSprite(
				GameImage.PAUSESCREENBUTTON.ImageTexture());
		MainMenuButton.setPosition(
				Gdx.graphics.getWidth() / 2 - MainMenuButton.getWidth() / 2,
				Gdx.graphics.getHeight() - 250);
		MainMenuButtonText = new ExtendedLabel("Main Menu",
				GameImage.PAUSESCREENBUTTON.ImageText());
		MainMenuButtonText.setPosition(Gdx.graphics.getWidth() / 2
				- MainMenuButtonText.getWidth() / 2,
				Gdx.graphics.getHeight() - 230);
		SettingsButton = new BaseGameSprite(
				GameImage.PAUSESCREENBUTTON.ImageTexture());
		SettingsButton.setPosition(
				Gdx.graphics.getWidth() / 2 - SettingsButton.getWidth() / 2,
				Gdx.graphics.getHeight() - 350);
		SettingsButtonText = new ExtendedLabel("Settings",
				GameImage.PAUSESCREENBUTTON.ImageText());
		SettingsButtonText.setPosition(Gdx.graphics.getWidth() / 2
				- SettingsButtonText.getWidth() / 2,
				Gdx.graphics.getHeight() - 330);

		allSprites.add(ResumeButton);
		allSprites.add(ResumeButtonText);
		allSprites.add(MainMenuButton);
		allSprites.add(MainMenuButtonText);
		allSprites.add(SettingsButton);
		allSprites.add(SettingsButtonText);
	}

	public void update(float deltaTime) {
		super.update(deltaTime);

		if (Gdx.input.isTouched()
				&& Gdx.input.getX() >= ResumeButton.getX()
				&& Gdx.input.getX() <= ResumeButton.getX()
						+ ResumeButton.getWidth()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() >= ResumeButton
						.getY()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() <= ResumeButton
						.getY() + ResumeButton.getHeight()) {
			StateManager.GoBackScreen();
		} else if (Gdx.input.isTouched()
				&& Gdx.input.getX() >= MainMenuButton.getX()
				&& Gdx.input.getX() <= MainMenuButton.getX()
						+ MainMenuButton.getWidth()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() >= MainMenuButton
						.getY()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() <= MainMenuButton
						.getY() + MainMenuButton.getHeight()) {

			((GameScreen) StateManager.AllScreens.getScreen(ScreenType.GAMESCREEN)).Reset();

			StateManager.SwitchScreen(ScreenType.MAINMENU);
		} else if (Gdx.input.isTouched()
				&& Gdx.input.getX() >= SettingsButton.getX()
				&& Gdx.input.getX() <= SettingsButton.getX()
						+ SettingsButton.getWidth()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() >= SettingsButton
						.getY()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() <= SettingsButton
						.getY() + SettingsButton.getHeight()) {
			StateManager.SwitchScreen(ScreenType.SETTINGSSCREEN);
		}
	}
}
