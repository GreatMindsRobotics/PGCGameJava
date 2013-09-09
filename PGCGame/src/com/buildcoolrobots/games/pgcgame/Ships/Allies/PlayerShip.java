package com.buildcoolrobots.games.pgcgame.Ships.Allies;


import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.Ships.BaseShip;

public class PlayerShip extends BaseShip {
	public PlayerShip(Vector2 position, Texture texture, SpriteManager allSprites) {
		super(position, texture, allSprites);

	}
	

	@Override
	public void shoot(){
		super.shoot();
		StateManager.bulletsShot++;
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