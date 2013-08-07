package com.buildcoolrobots.games.pgcgame.Screens;

import javax.swing.JOptionPane;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
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
	
	boolean leftyMode = false;
	boolean SFX = true;
	boolean music = true;
	int difficulty = 1; //1 is easy, 2 is medium, 3 is hard
	//TODO prompt when you click reset progress "are you sure you want to reset all progress?" and have a yes or no
	boolean lastTouch = false;
	public SettingsScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		
		Button1 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button1.setPosition(100, Gdx.graphics.getHeight() - 150);
		
		ButtonLabel1 = new ExtendedLabel("Lefty Mode: Off",GameImage.SETTINGSSCREENBUTTON.ImageText());
		ButtonLabel1.setPosition(Button1.getX() + 20, Button1.getY() + Button1.getHeight()/2 - 15);
		ButtonLabel1.setFontScale(.75f, .75f);
		
		Button2 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button2.setPosition(100, Gdx.graphics.getHeight() - 250);
		
		ButtonLabel2 = new ExtendedLabel("SFX: On",GameImage.SETTINGSSCREENBUTTON.ImageText());
		ButtonLabel2.setPosition(Button2.getX() + Button2.getWidth()/2 - ButtonLabel2.getWidth()/2 + 10, Button2.getY() + Button2.getHeight()/2 - 15);
		ButtonLabel2.setFontScale(.75f, .75f);
		
		Button3 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button3.setPosition(100, Gdx.graphics.getHeight() - 350);
		
		ButtonLabel3 = new ExtendedLabel("Music: On",GameImage.SETTINGSSCREENBUTTON.ImageText());
		ButtonLabel3.setPosition(Button3.getX() + Button3.getWidth()/2 - ButtonLabel3.getWidth()/2 + 15, Button3.getY() + Button3.getHeight()/2 - 15);
		ButtonLabel3.setFontScale(.75f, .75f);
		
		Button4 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button4.setPosition(450, Gdx.graphics.getHeight() - 150);
		
		ButtonLabel4 = new ExtendedLabel("Difficulty: Easy",GameImage.SETTINGSSCREENBUTTON.ImageText());
		ButtonLabel4.setPosition(Button4.getX() + 12, Button4.getY() + Button4.getHeight()/2 - 15);
		ButtonLabel4.setFontScale(.75f, .75f);
		
		Button5 = new ExtendedSprite(GameImage.SETTINGSSCREENBUTTON.ImageTexture());
		Button5.setPosition(450, Gdx.graphics.getHeight() - 250);
		
		ButtonLabel5 = new ExtendedLabel("Reset Progress",GameImage.SETTINGSSCREENBUTTON.ImageText());
		ButtonLabel5.setPosition(Button5.getX() + Button5.getWidth()/2 - ButtonLabel5.getWidth()/2 + 30, Button5.getY() + Button5.getHeight()/2 - 15);
		ButtonLabel5.setFontScale(.75f, .75f);
		
		allSprites.add(Button1);
		allSprites.add(ButtonLabel1);
		allSprites.add(Button2);
		allSprites.add(ButtonLabel2);
		allSprites.add(Button3);
		allSprites.add(ButtonLabel3);
		allSprites.add(Button4);
		allSprites.add(ButtonLabel4);
		allSprites.add(Button5);
		allSprites.add(ButtonLabel5);

	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		if(!Gdx.input.isTouched()){
			lastTouch = false;
		}
		
			if (Gdx.input.isTouched() && 
			Gdx.input.getX() >= Button1.getX() && Gdx.input.getX() <= Button1.getX() + Button1.getWidth() &&
			Gdx.graphics.getHeight() - Gdx.input.getY() >= Button1.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= Button1.getY() + Button1.getHeight() && !lastTouch) {	
				if (leftyMode == false) {
					leftyMode = true;
					ButtonLabel1.setText("Lefty Mode: On");
				} else {
					leftyMode = false;
					ButtonLabel1.setText("Lefty Mode: Off");
				}
			lastTouch = true;

			}
	}
	
	
}
