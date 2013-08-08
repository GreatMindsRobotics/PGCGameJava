package com.buildcoolrobots.games.pgcgame.Ships.Allies;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.Ships.BaseShip;
import com.buildcoolrobots.games.pgcgame.Ships.Bullets.Bullet;

public class PlayerShip extends BaseShip {
	public PlayerShip(Vector2 position, Vector2 speed, Texture texture) {
		super(position, speed, texture);

	}
	


public void Update() {

	if(Gdx.input.getX() < 200){
		
		this.setPosition(Gdx.input.getX(),Gdx.input.getY());
	}
	
	if(Gdx.input.getX() > 350) {
	shoot();
	}
}
	


}