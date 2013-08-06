package com.buildcoolrobots.games.pgcgame.Ships;

import java.util.ArrayList;

import me.pagekite.glen3b.gjlib.ExtendedSprite;

import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.Ships.Bullets.Bullet;

public class BaseShip extends ExtendedSprite {

	protected Vector2 _movementSpeed;
	private ArrayList<Bullet> _bullets;	
	
	public BaseShip(Vector2 position, Vector2 speed, Texture texture) {
		super(texture);
		
		this.setPosition(position.x, position.y);		
		_movementSpeed = speed;
	}
	
	public void shoot() {
		_bullets.add(new Bullet());
	}
	
	
	
	
	

	
	
	
}
