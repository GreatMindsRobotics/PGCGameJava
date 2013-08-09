package com.buildcoolrobots.games.pgcgame.Screens.SelectScreens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class LevelSelectScreen extends BaseSelectScreen{

	ExtendedSprite LevelSelectRightButton;
	ExtendedSprite LevelSelectLeftButton;
	ExtendedSprite LevelSelectBackButton;
	
	public LevelSelectScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		
		LevelSelectRightButton = new ExtendedSprite(GameImage.LEVELSELECTRIGHTBUTTON.ImageTexture());
		LevelSelectLeftButton = new ExtendedSprite(GameImage.LEVELSELECTLEFTBUTTON.ImageTexture());
		LevelSelectBackButton = new ExtendedSprite(GameImage.LEVELSELECTBACKBUTTON.ImageTexture());

		LevelSelectRightButton.setPosition(Gdx.graphics.getWidth() - LevelSelectRightButton.getWidth() - (Gdx.graphics.getWidth() / 4 - LevelSelectRightButton.getWidth() / 2) , Gdx.graphics.getHeight() / 4);
		LevelSelectRightButton.setScale(new Vector2(.6f, 1f));
		
		LevelSelectLeftButton.setPosition(Gdx.graphics.getWidth() / 4 - LevelSelectLeftButton.getWidth() / 2, Gdx.graphics.getHeight() / 4);
		LevelSelectLeftButton.setScale(new Vector2(.6f, 1f));
		
		LevelSelectBackButton.setPosition(-25, -5);
		LevelSelectBackButton.setScale(new Vector2(.8f, 1f));
		
		
		ExtendedLabel LevelSelectRightButtonText = new ExtendedLabel(">>>", GameImage.LEVELSELECTRIGHTBUTTON.ImageText());
		LevelSelectRightButtonText.setPosition(LevelSelectRightButton.getX() + LevelSelectRightButton.getWidth() / 2 - LevelSelectRightButtonText.getWidth() / 2,LevelSelectLeftButton.getY() + LevelSelectLeftButton.getHeight() / 4);
		
        ExtendedLabel LevelSelectLeftButtonText = new ExtendedLabel("<<<", GameImage.LEVELSELECTLEFTBUTTON.ImageText());
        LevelSelectLeftButtonText.setPosition(LevelSelectLeftButton.getX() - LevelSelectLeftButtonText.getWidth() / 2 + LevelSelectLeftButton.getWidth() / 2, LevelSelectLeftButton.getY() + LevelSelectLeftButton.getHeight() / 4);
        
        ExtendedLabel LevelSelectBackButtonText = new ExtendedLabel("Back", GameImage.LEVELSELECTBACKBUTTON.ImageText());
        LevelSelectBackButtonText.setPosition(LevelSelectBackButton.getX() - LevelSelectBackButtonText.getWidth() / 2 + LevelSelectBackButton.getWidth() / 2, LevelSelectBackButton.getY() + LevelSelectBackButton.getHeight() / 4);
		
		
		allSprites.add(LevelSelectRightButton);
		allSprites.add(LevelSelectRightButtonText);
		allSprites.add(LevelSelectLeftButton);
		allSprites.add(LevelSelectLeftButtonText);
		allSprites.add(LevelSelectBackButton);
		allSprites.add(LevelSelectBackButtonText);
	}

	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= LevelSelectRightButton.getX() && Gdx.input.getX() <= LevelSelectRightButton.getX() + LevelSelectRightButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= LevelSelectRightButton.getY() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() <= LevelSelectRightButton.getY() + LevelSelectRightButton.getHeight()) {
				
					// switch to higher(to the right) level
				}
		
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= LevelSelectLeftButton.getX() && Gdx.input.getX() <= LevelSelectLeftButton.getX() + LevelSelectLeftButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= LevelSelectLeftButton.getY() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() <= LevelSelectLeftButton.getY() + LevelSelectLeftButton.getHeight()) {
				
					// switch to lower(to the left) level
	            }
		
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= LevelSelectBackButton.getX() && Gdx.input.getX() <= LevelSelectBackButton.getX() + LevelSelectBackButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= LevelSelectBackButton.getY() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() <= LevelSelectBackButton.getY() + LevelSelectBackButton.getHeight()) {
				
					StateManager.SwitchScreen(ScreenType.MAINMENU);
				}
	}
	
}
