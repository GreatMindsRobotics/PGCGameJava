package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class GameOverScreen extends BaseScreen {

	private ExtendedLabel GameOver;
	
	public GameOverScreen(SpriteManager allSprites, SpriteBatch target,
			ScreenType screenType) {
		super(allSprites, target, screenType);
		
		GameOver = new ExtendedLabel("Game Over", GameImage.MAINMENUPLAYBUTTON.ImageText());
		GameOver.setPosition(0, 0);
	
		allSprites.add(GameOver);
		
	}
	
	@Override
	public void update(float deltatime) {
		super.update(deltatime);
	}

}
