package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BGSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class CreditsScreen extends BaseScreen {

	public CreditsScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		//ExtendedLabel Line1 = new ExtendedLabel("Credits", GameImage.CREDITFONT.ImageText());
		//Line1.setPosition(Gdx.graphics.getWidth()/2 - Line1.getWidth() /2, Gdx.graphics.getHeight() - 150);
		
		//allSprites.add(Line1);		
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
	}

}
