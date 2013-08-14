package com.buildcoolrobots.games.pgcgame.Ships.Enemies;


import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.Ships.BaseShip;

public class BaseEnemyShip extends BaseShip{

	public BaseEnemyShip(Vector2 position, Texture texture, SpriteManager allSprites) {
		super(position, texture, allSprites);
		this.setLocation(position);
		this.setTexture(texture);
		// TODO Auto-generated constructor stub
	}
	

	
	public void Draw(SpriteBatch batch) {
		batch.draw(getTexture(), this.getLocation().x, this.getLocation().y);
	}
	
	public void Update() {
		
		
		
	}
	
}
