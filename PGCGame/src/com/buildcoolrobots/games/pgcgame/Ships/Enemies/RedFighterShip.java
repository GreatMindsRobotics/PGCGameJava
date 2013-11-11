package com.buildcoolrobots.games.pgcgame.Ships.Enemies;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;

public class RedFighterShip extends BaseEnemyFighterShip {

	
	public RedFighterShip(Vector2 position, Texture texture, SpriteManager allSprites) {
		super(position, texture, allSprites);
		
		health = 3;
		enemyValue = StateManager.CurrentLevel.value3();
	}
	
}
