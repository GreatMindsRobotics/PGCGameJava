package com.buildcoolrobots.games.pgcgame.Ships.Enemies;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.Ships.BaseShip;

public class BaseEnemyShip extends BaseShip{

	public BaseEnemyShip(Vector2 position, Vector2 speed, Texture texture) {
		super(position, speed, texture);
		this.setLocation(position);
		this.xSpeed = speed.x;
		this.xSpeed = speed.y;
		this.setTexture(texture);
		
		// TODO Auto-generated constructor stub
	}
	

	
	public void Draw(SpriteBatch batch) {
		batch.draw(getTexture(), this.getLocation().x, this.getLocation().y);
	}
	
	public void Update() {
		
		
		
	}
	
}
