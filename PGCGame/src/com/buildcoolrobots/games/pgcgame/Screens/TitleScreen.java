package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;

public class TitleScreen extends BaseScreen {

	public TitleScreen(SpriteManager allSprites, SpriteBatch target) {
		super(allSprites, target);
		
		ExtendedSprite playerShip = new ExtendedSprite(ShipTypes.PLAYERSHIP.GameTexture());
		playerShip.setPosition(100,  100);
		playerShip.xSpeed = 0.5f;
		
		ExtendedSprite enemyDrone = new ExtendedSprite(ShipTypes.ENEMYDRONE1.GameTexture());
		enemyDrone.setPosition(200, 200);
		
		ExtendedLabel titleText = new ExtendedLabel("Plequarius: Galactic Commanders", ScreenType.TITLESCREEN.ScreenLabelStyle());
		titleText.setPosition((Gdx.graphics.getWidth() - titleText.getWidth()) / 2, Gdx.graphics.getHeight() - titleText.getHeight() - 50);		
		allSprites.add(enemyDrone);
		allSprites.add(playerShip);
		allSprites.add(titleText);

		
	}

}
