package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class TransitionScreen extends BaseScreen {

	ExtendedSprite scrollingDoor;
	
	private final int scrollingSpeed = 2;
	
	public TransitionScreen(SpriteManager allSprites, SpriteBatch target,
			ScreenType screenType) {
		super(allSprites, target, screenType);
		
		scrollingDoor = new ExtendedSprite(GameImage.GAMETITLE.ImageTexture());
		scrollingDoor.setPosition(0, 0);
		
		allSprites.add(scrollingDoor);
	}
	
	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		scrollingDoor.setPosition(scrollingDoor.getX(), scrollingDoor.getY() + scrollingSpeed);
		if (scrollingDoor.getY() - scrollingDoor.getHeight() > Gdx.graphics.getHeight()) {
			StateManager.SwitchScreen(ScreenType.GAMESCREEN);
		}
	}

}
