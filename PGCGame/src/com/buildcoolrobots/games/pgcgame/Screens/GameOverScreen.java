package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseGameSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class GameOverScreen extends BaseScreen {

	private ExtendedLabel GameOver;
	private BaseGameSprite PlayButton;
	private ExtendedLabel PlayButtonText;
	
	public GameOverScreen(SpriteManager allSprites, SpriteBatch target,
			ScreenType screenType) {
		super(allSprites, target, screenType);
		
		GameOver = new ExtendedLabel("Game Over", GameImage.GAMEOVERFONT.ImageText());
		GameOver.setPosition(Gdx.graphics.getWidth() / 2 - GameOver.getWidth() / 2, Gdx.graphics.getHeight() - 200);
		
		PlayButton = new BaseGameSprite(GameImage.MAINMENUPLAYBUTTON.ImageTexture());
		PlayButton.setPosition(Gdx.graphics.getWidth()/2 - PlayButton.getWidth()/2, Gdx.graphics.getHeight()/2 - PlayButton.getHeight());
		PlayButton.setScale(new Vector2(1f, 1f));
		
		PlayButtonText = new ExtendedLabel("Main Menu", GameImage.MAINMENUPLAYBUTTON.ImageText());
		PlayButtonText.setPosition(Gdx.graphics.getWidth()/2 - PlayButtonText.getWidth()/2, Gdx.graphics.getHeight()/2 - PlayButton.getHeight() + PlayButtonText.getHeight()/2);
	
		allSprites.add(GameOver);
		allSprites.add(PlayButton);
		allSprites.add(PlayButtonText);
		
	}
	
	@Override
	public void update(float deltatime) {
		super.update(deltatime);
		
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= PlayButton.getX() && Gdx.input.getX() <= PlayButton.getX() + PlayButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= PlayButton.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= PlayButton.getY() + PlayButton.getHeight()) {
				
					StateManager.SwitchScreen(ScreenType.MAINMENU);
				}
	}

}
