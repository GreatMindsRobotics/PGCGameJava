package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;

public class TitleScreen extends BaseScreen {
	ExtendedSprite background;
	public TitleScreen(SpriteManager allSprites, SpriteBatch spriteBatch) {
		super(allSprites, spriteBatch);

		background = new ExtendedSprite(ScreenType.TITLESCREEN.ScreenTexture());
		background.setPosition(0, 0);
		background.xSpeed = -0.5f;

		allSprites.add(background);
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		if (background.getX() + background.getWidth() <= Gdx.graphics.getWidth()) {
			background.setPosition(0, 0);
		}
	}

}
