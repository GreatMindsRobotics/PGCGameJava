package com.buildcoolrobots.games.pgcgame.Screens.SelectScreens;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.badlogic.gdx.graphics.*;

public abstract class BaseSelectScreen extends BaseScreen {

	ExtendedSprite LevelSelectRightButton;
	ExtendedSprite LevelSelectLeftButton;
	ExtendedSprite LevelSelectBackButton;
	ExtendedSprite LevelSelectAcceptButton;
	Map<ExtendedSprite, ExtendedLabel> items = new HashMap<ExtendedSprite, ExtendedLabel>();
	int selected = 0;
	
	public BaseSelectScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
			for(Map.Entry<ExtendedSprite, ExtendedLabel> item : items.entrySet()) {
				//item.get
				item.getKey().setColor(Color.WHITE);
				item.getValue().setColor(0, 0, 0, 0);
				
				allSprites.add(item.getKey());
				allSprites.add(item.getValue());
			}		
			
		
		LevelSelectRightButton = new ExtendedSprite(GameImage.LEVELSELECTRIGHTBUTTON.ImageTexture());
		LevelSelectLeftButton = new ExtendedSprite(GameImage.LEVELSELECTLEFTBUTTON.ImageTexture());
		LevelSelectBackButton = new ExtendedSprite(GameImage.LEVELSELECTBACKBUTTON.ImageTexture());
		LevelSelectAcceptButton = new ExtendedSprite(GameImage.LEVELSELECTACCEPTBUTTON.ImageTexture());

		LevelSelectRightButton.setPosition(Gdx.graphics.getWidth() - LevelSelectRightButton.getWidth() - (Gdx.graphics.getWidth() / 4 - LevelSelectRightButton.getWidth() / 2) , Gdx.graphics.getHeight() / 4);
		LevelSelectRightButton.setScale(new Vector2(.6f, 1f));
		
		LevelSelectLeftButton.setPosition(Gdx.graphics.getWidth() / 4 - LevelSelectLeftButton.getWidth() / 2, Gdx.graphics.getHeight() / 4);
		LevelSelectLeftButton.setScale(new Vector2(.6f, 1f));
		
		LevelSelectBackButton.setPosition(-25, -5);
		LevelSelectBackButton.setScale(new Vector2(.8f, 1f));
		
		LevelSelectAcceptButton.setPosition(Gdx.graphics.getWidth() - LevelSelectAcceptButton.getWidth() + 25, Gdx.graphics.getHeight() - Gdx.graphics.getHeight() - 5);
		LevelSelectAcceptButton.setScale(new Vector2(.8f, 1f));
		
		
		ExtendedLabel LevelSelectRightButtonText = new ExtendedLabel(">>>", GameImage.LEVELSELECTRIGHTBUTTON.ImageText());
		LevelSelectRightButtonText.setPosition(LevelSelectRightButton.getX() + LevelSelectRightButton.getWidth() / 2 - LevelSelectRightButtonText.getWidth() / 2,LevelSelectLeftButton.getY() + LevelSelectLeftButton.getHeight() / 4);
		
        ExtendedLabel LevelSelectLeftButtonText = new ExtendedLabel("<<<", GameImage.LEVELSELECTLEFTBUTTON.ImageText());
        LevelSelectLeftButtonText.setPosition(LevelSelectLeftButton.getX() - LevelSelectLeftButtonText.getWidth() / 2 + LevelSelectLeftButton.getWidth() / 2, LevelSelectLeftButton.getY() + LevelSelectLeftButton.getHeight() / 4);
        
        ExtendedLabel LevelSelectBackButtonText = new ExtendedLabel("Back", GameImage.LEVELSELECTBACKBUTTON.ImageText());
        LevelSelectBackButtonText.setPosition(LevelSelectBackButton.getX() - LevelSelectBackButtonText.getWidth() / 2 + LevelSelectBackButton.getWidth() / 2, LevelSelectBackButton.getY() + LevelSelectBackButton.getHeight() / 4);
		
        ExtendedLabel LevelSelectAcceptButtonText = new ExtendedLabel("Accept", GameImage.LEVELSELECTACCEPTBUTTON.ImageText());
        LevelSelectAcceptButtonText.setPosition(LevelSelectAcceptButton.getX() - LevelSelectAcceptButtonText.getWidth() / 2 + LevelSelectAcceptButton.getWidth() / 2, LevelSelectAcceptButton.getY() + LevelSelectAcceptButton.getHeight() / 4);
        
		
		allSprites.add(LevelSelectRightButton);
		allSprites.add(LevelSelectRightButtonText);
		allSprites.add(LevelSelectLeftButton);
		allSprites.add(LevelSelectLeftButtonText);
		allSprites.add(LevelSelectBackButton);
		allSprites.add(LevelSelectBackButtonText);
		allSprites.add(LevelSelectAcceptButton);
		allSprites.add(LevelSelectAcceptButtonText);

	}

	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= LevelSelectRightButton.getX() && Gdx.input.getX() <= LevelSelectRightButton.getX() + LevelSelectRightButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= LevelSelectRightButton.getY() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() <= LevelSelectRightButton.getY() + LevelSelectRightButton.getHeight()) {
			        
					ArrayList<Map.Entry<ExtendedSprite, ExtendedLabel>> list = new ArrayList<Entry<ExtendedSprite, ExtendedLabel>>(items.entrySet());
					
					list.get(selected).getKey().setColor(Color.WHITE);
					list.get(selected).getValue().setColor(0, 0, 0, 0);
			
			        selected++;
			        
					if(selected == items.size())
					{
						selected -= items.size();
					}		
					
					list.get(selected).getKey().setColor(Color.WHITE);
					list.get(selected).getValue().setColor(0, 0, 0, 0);
					
				}
		
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= LevelSelectLeftButton.getX() && Gdx.input.getX() <= LevelSelectLeftButton.getX() + LevelSelectLeftButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= LevelSelectLeftButton.getY() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() <= LevelSelectLeftButton.getY() + LevelSelectLeftButton.getHeight()) {
			
					selected--;
					
					if(selected == 0)
					{
						selected += items.size();
					}
					
	            }
		
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= LevelSelectBackButton.getX() && Gdx.input.getX() <= LevelSelectBackButton.getX() + LevelSelectBackButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= LevelSelectBackButton.getY() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() <= LevelSelectBackButton.getY() + LevelSelectBackButton.getHeight()) {
				
					StateManager.SwitchScreen(ScreenType.MAINMENU);
				}
		
		if (Gdx.input.isTouched() && 
				Gdx.input.getX() >= LevelSelectAcceptButton.getX() && Gdx.input.getX() <= LevelSelectAcceptButton.getX() + LevelSelectAcceptButton.getWidth() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() >= LevelSelectAcceptButton.getY() &&
				Gdx.graphics.getHeight() - Gdx.input.getY() <= LevelSelectAcceptButton.getY() + LevelSelectAcceptButton.getHeight()) {
				
			// buy/select the thing showed on the screen
		}
	}
}
