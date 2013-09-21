package com.buildcoolrobots.games.pgcgame.CoreTypes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

import me.pagekite.glen3b.gjlib.BasicScreen;
import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

public abstract class BaseScreen extends BasicScreen {
	public Boolean FullScreenBackground = true;
	
	public BaseScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target);		

		_screenType = screenType;
		BGSprite.scrollingBackground(allSprites);

		//If this screen has a background, set it
		if(screenType.ScreenTexture() != null) {
			BaseGameSprite bgImage = new BaseGameSprite(screenType.ScreenTexture());
			
			if(FullScreenBackground)
			{
				bgImage.setPosition(0, 0);
				bgImage.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
			}
			
			allSprites.add(bgImage);			
		}
		
		
		//Show debug info if in debug mode
		if(StateManager.DebugData.AllowScreenSwitching || StateManager.DebugData.ShowScreenName)
		{
			ExtendedLabel ScreenTypeText = new ExtendedLabel(String.format("[DebugMode] %s", _screenType.toString()), GameImage.DEBUGFONT.ImageText());
			//ScreenTypeText.setPosition(Gdx.graphics.getWidth() - 100 , 100);
		    ScreenTypeText.setColor(Color.RED);
			ScreenTypeText.setPosition(0, Gdx.graphics.getHeight() - ScreenTypeText.getHeight());
			ScreenTypeText.setFontScale(1.70f, 1.70f);
	
			allSprites.add(ScreenTypeText);
		}
		
		StateManager.AllScreens.setScreen(this);
	}
	
	private ScreenType _screenType;
	
	public ScreenType getScreenType() {
		return _screenType;
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);		
		
	}

}
