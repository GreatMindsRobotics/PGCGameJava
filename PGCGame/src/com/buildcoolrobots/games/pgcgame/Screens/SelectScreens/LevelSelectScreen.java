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
	ExtendedSprite Planet1;
	ExtendedSprite Planet2;
	ExtendedSprite Planet3;
	ExtendedSprite Planet4;
	
	public LevelSelectScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		
		Planet1 = new ExtendedSprite(GameImage.PLANET1.ImageTexture());
		Planet2 = new ExtendedSprite(GameImage.PLANET2.ImageTexture());
		Planet3 = new ExtendedSprite(GameImage.PLANET3.ImageTexture());
		Planet4 = new ExtendedSprite(GameImage.PLANET4.ImageTexture());
		
		Planet1.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
		Planet1.setScale(.5f, .5f);
		Planet2.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
		Planet2.setScale(.5f, .5f);
		Planet3.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
		Planet3.setScale(.5f, .5f);
		Planet4.setPosition(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2);
		Planet4.setScale(.5f, .5f);
		
		allSprites.add(Planet1);
		allSprites.add(Planet2);
        allSprites.add(Planet3);
        allSprites.add(Planet4);
	}
}
