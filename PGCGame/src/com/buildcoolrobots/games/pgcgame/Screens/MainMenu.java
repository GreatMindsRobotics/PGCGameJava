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
		
		ExtendedSprite MainMenuPlayButton = new ExtendedSprite(GameImage.MAINMENUPLAYBUTTON.ImageTexture());
		ExtendedSprite MainMenuSettingsButton = new ExtendedSprite(GameImage.MAINMENUSETTINGSBUTTON.ImageTexture());
		ExtendedSprite MainMenuCreditsButton = new ExtendedSprite(GameImage.MAINMENUCREDITSBUTTON.ImageTexture());
		
		MainMenuPlayButton.setPosition(Gdx.graphics.getWidth() / 2 - MainMenuPlayButton.getWidth() / 2, Gdx.graphics.getHeight() / 4);
		MainMenuPlayButton.setScale(new Vector2(1f, 1f));
		
		MainMenuSettingsButton.setPosition(Gdx.graphics.getWidth() / 4 - MainMenuSettingsButton.getWidth() / 2, Gdx.graphics.getHeight() * 2/3);
		MainMenuSettingsButton.setScale(new Vector2(1f, 1f));
		
		MainMenuCreditsButton.setPosition(Gdx.graphics.getWidth() - MainMenuCreditsButton.getWidth() - (Gdx.graphics.getWidth() / 4 - MainMenuSettingsButton.getWidth() / 2) , MainMenuSettingsButton.getY());
		MainMenuCreditsButton.setScale(new Vector2(1f, 1f));
		
		
		ExtendedLabel MainMenuPlayButtonText = new ExtendedLabel("Play", GameImage.MAINMENUPLAYBUTTON.ImageText());
		MainMenuPlayButtonText.setPosition(Gdx.graphics.getWidth() / 2 - MainMenuPlayButtonText.getWidth() / 2, MainMenuPlayButton.getY() + MainMenuPlayButton.getHeight() / 4);
		
        ExtendedLabel MainMenuSettingsButtonText = new ExtendedLabel("Settings", GameImage.MAINMENUSETTINGSBUTTON.ImageText());
        MainMenuSettingsButtonText.setPosition(MainMenuSettingsButton.getX() - MainMenuSettingsButtonText.getWidth() / 2 + MainMenuSettingsButton.getWidth() / 2, MainMenuSettingsButton.getY() + MainMenuSettingsButton.getHeight() / 4);
        
        ExtendedLabel MainMenuCreditsButtonText = new ExtendedLabel("Credits", GameImage.MAINMENUCREDITSBUTTON.ImageText());
        MainMenuCreditsButtonText.setPosition(MainMenuCreditsButton.getX() + MainMenuCreditsButton.getHeight(), MainMenuCreditsButton.getY() + MainMenuCreditsButton.getHeight() / 4);

		allSprites.add(MainMenuPlayButton);
		allSprites.add(MainMenuPlayButtonText);
		allSprites.add(MainMenuSettingsButton);
		allSprites.add(MainMenuSettingsButtonText);
        allSprites.add(MainMenuCreditsButton);
        allSprites.add(MainMenuCreditsButtonText);
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);

	}

}
