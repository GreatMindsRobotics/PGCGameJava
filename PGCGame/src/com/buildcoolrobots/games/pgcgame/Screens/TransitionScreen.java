package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;

public class TransitionScreen extends BaseScreen {

	ExtendedSprite scrollingDoor;
	ExtendedSprite ship;

	private final int scrollingSpeed = 2;

	public TransitionScreen(SpriteManager allSprites, SpriteBatch target,
			ScreenType screenType) {
		super(allSprites, target, screenType);

		scrollingDoor = new ExtendedSprite(
				GameImage.TRANSITIONBACKGROUND.ImageTexture());
		scrollingDoor.setPosition(0, 0);
		scrollingDoor.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		
		ship  = new ExtendedSprite(ShipTypes.PLAYERSHIP.GameTexture());
		
		
		Reset();

		allSprites.add(scrollingDoor);
		allSprites.add(ship);
		
	}

	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		scrollingDoor.setPosition(scrollingDoor.getX(), scrollingDoor.getY()
				+ scrollingSpeed);
		if (ship.getX() > Gdx.graphics.getWidth()) {
			ship.setPosition(-500, -300);
			ship.xSpeed = 3f;
			ship.ySpeed = 2f;
			
			ship.setRotation(25);
			
			StateManager.SwitchScreen(ScreenType.GAMESCREEN);
		}
		
		if (ship.getX() > 50 && ship.getX() < Gdx.graphics.getWidth()) {
			ship.xSpeed *= 1.035f;
			ship.ySpeed *= 0;
			if (ship.getRotation() >= 1) {
				ship.rotate(-1f);
			}
		}
	}

	private void Reset() {
		scrollingDoor.setPosition(0, 0);
		ship.xSpeed = 3f;
		ship.ySpeed = 2f;
		ship.setPosition(-500, -300);
		
		ship.setRotation(25);
	}

	@Override
	public void show() {
		super.show();
		Reset();
	}

}
