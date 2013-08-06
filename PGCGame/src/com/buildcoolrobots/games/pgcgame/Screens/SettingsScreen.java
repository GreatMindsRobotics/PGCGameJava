package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BGSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class SettingsScreen extends BaseScreen {

	public SettingsScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		// TODO Auto-generated constructor stub
		BGSprite.scrollingBackground(allSprites);
	}

}
