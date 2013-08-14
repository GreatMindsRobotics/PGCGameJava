package com.buildcoolrobots.games.pgcgame.Ships.Bullets;

import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseGameSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;

public class Bullet extends BaseGameSprite {
	public Bullet(Vector2 position, int xSpeed) {
		super(GameImage.LASERBULLET.ImageTexture());
			setPosition(position.x, position.y);
			this.xSpeed = xSpeed;
		}
}
