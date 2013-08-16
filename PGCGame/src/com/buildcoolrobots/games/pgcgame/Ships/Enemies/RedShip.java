package com.buildcoolrobots.games.pgcgame.Ships.Enemies;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class RedShip extends BaseEnemyShip {

	public RedShip(Vector2 position, Texture texture, SpriteManager allSprites) {
		super(position, texture, allSprites);

		health = 2;
		
		enemyValue = 2;
	}
}
