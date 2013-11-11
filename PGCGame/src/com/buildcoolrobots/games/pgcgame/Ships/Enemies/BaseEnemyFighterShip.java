package com.buildcoolrobots.games.pgcgame.Ships.Enemies;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.Ships.Bullets.Bullet;

public class BaseEnemyFighterShip extends BaseEnemyShip{

	public BaseEnemyFighterShip(Vector2 position, Texture texture, SpriteManager allSprites) {
		super(position, texture, allSprites);
					
	}
	
	public void shoot() {
		_bullets.add(new Bullet(new Vector2(getX() + getWidth() - 20, getY() + getHeight()/2 - 6), -10));
	}
	
	public void Update() {
		shoot();
	}

}
