package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseGameSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class GameOverScreen extends BaseScreen {

	private ExtendedLabel GameOver;
	private BaseGameSprite PlayButton;
	private ExtendedLabel PlayButtonText;
	private ExtendedLabel Score;
	private int accuracyBonus;
	
	public GameOverScreen(SpriteManager allSprites, SpriteBatch target,
			ScreenType screenType) {
		super(allSprites, target, screenType);
		
		GameOver = new ExtendedLabel("Game Over", GameImage.GAMEOVERFONT.ImageText());
		GameOver.setPosition(Gdx.graphics.getWidth() / 2 - GameOver.getWidth() / 2, Gdx.graphics.getHeight() - 100);
		
		Score = new ExtendedLabel("Score: 0", GameImage.GAMEOVERFONT.ImageText());
		Score.setFontScale(.8f,.8f);
		Score.setPosition(Gdx.graphics.getWidth()/2 - Score.getWidth()/2 - 20, GameOver.getY() - 70);
		
		
		PlayButton = new BaseGameSprite(GameImage.MAINMENUPLAYBUTTON.ImageTexture());
		PlayButton.setPosition(Gdx.graphics.getWidth()/2 - PlayButton.getWidth()/2, Gdx.graphics.getHeight()/2 - PlayButton.getHeight());
		
		PlayButtonText = new ExtendedLabel("Main Menu", GameImage.MAINMENUPLAYBUTTON.ImageText());
		PlayButtonText.setPosition(Gdx.graphics.getWidth()/2 - PlayButtonText.getWidth()/2, Gdx.graphics.getHeight()/2 - PlayButton.getHeight() + PlayButtonText.getHeight()/2);
	
		allSprites.add(GameOver);
		allSprites.add(PlayButton);
		allSprites.add(PlayButtonText);
		allSprites.add(Score);
	}
	
	@Override
	public void update(float deltatime) {
		super.update(deltatime);
		accuracyBonus = (int) StateManager.getAccuracyPercentage();
		if (StateManager.getAccuracyPercentage() >= 40 && StateManager.getAccuracyPercentage() < 95){
			accuracyBonus *= 10;
		} else if (StateManager.getAccuracyPercentage() >= 90) {
			accuracyBonus = 5000;
		} else {
			accuracyBonus = 0;
		}
		
		int score = GameScreen.score;
		float accuracy = StateManager.getAccuracyPercentage();
		Score.setText(String.format("Score: %d\nAccuracy: %1.0f%%\nAccuracy Bonus: %d\nTotal Score: %d", score, accuracy, accuracyBonus, score + accuracyBonus));
		
		
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= PlayButton.getX() && Gdx.input.getX() <= PlayButton.getX() + PlayButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= PlayButton.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= PlayButton.getY() + PlayButton.getHeight()) {
				
					StateManager.SwitchScreen(ScreenType.MAINMENU);
					
					((GameScreen)StateManager.AllScreens.getScreen(ScreenType.GAMESCREEN)).Reset();
				}
		
	}

}
