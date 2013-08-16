package com.buildcoolrobots.games.pgcgame.Ships.Enemies;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class WhiteShip extends BaseEnemyShip {

	public WhiteShip(Vector2 position, Texture texture, SpriteManager allSprites) {
		super(position, texture, allSprites);

		health = 1;
		
		enemyValue = 1;
	}
}
