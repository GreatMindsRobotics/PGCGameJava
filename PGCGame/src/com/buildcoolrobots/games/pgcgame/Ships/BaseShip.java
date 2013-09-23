package com.buildcoolrobots.games.pgcgame.Ships;

import java.util.ArrayList;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseGameSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.DPadDirection;
import com.buildcoolrobots.games.pgcgame.Ships.Bullets.Bullet;

public class BaseShip extends BaseGameSprite {

	protected Vector2 _movementSpeed;
	private ArrayList<Bullet> _bullets;	
	SpriteManager _spriteManager;
	
	public BaseShip(Vector2 position, Texture texture, SpriteManager allSprites) {
		super(texture);
		_bullets = new ArrayList<Bullet>();
		this.setPosition(position.x, position.y);		
		_movementSpeed = new Vector2(0, 0);
		
		
		
		
		
		//Store reference to the SpriteManager
		_spriteManager = allSprites;
	}
	
	public void shoot() {
		 _bullets.add (new Bullet(new Vector2(getX() + getWidth() - 20, getY() + getHeight()/2 - 6), 10));		
	}

	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		for (int i = 0; i < _bullets.size(); i++) {
			Bullet bullet = _bullets.get(i);
			
			bullet.update(deltaTime);
			
			if(bullet.getX() > Gdx.graphics.getWidth()) {
				removeBulletFromScreen(bullet);
				i--;
			}
		}
		
	}
	
	@Override
	public  void draw(SpriteBatch batch)
	{
		for(int i = 0; i < _bullets.size(); i++)
		{
			_bullets.get(i).draw(batch);
		}
	   super.draw(batch);
	}

	public void move(DPadDirection shipDirection) {
		switch(shipDirection) {
		case NONE:
			xSpeed = 0;
			ySpeed = 0;

			break;
		
		case NORTH:
			if(getY() + getHeight() < Gdx.graphics.getHeight()) {
				ySpeed = 5;
			} else {
				ySpeed = 0;
			}
			xSpeed = 0;

			break;
        
		case NORTHEAST:
			if(getX() + getTexture().getWidth() < Gdx.graphics.getWidth()){
				xSpeed = 5;
			} else {
				xSpeed = 0;
			}
			if(getY() + getTexture().getHeight() < Gdx.graphics.getHeight()){
				ySpeed = 5;
			}
			else{
				ySpeed = 0;
			}
			
			break;
		
		case EAST:
			if(getX() + getTexture().getWidth() < Gdx.graphics.getWidth()){
				xSpeed = 5;
			}
			else{
				xSpeed = 0;
			}
        	
        	ySpeed = 0;
        	break;
        
		case SOUTHEAST:
			if(getX() + getTexture().getWidth() < Gdx.graphics.getWidth()){
				xSpeed = 5;
			} else {
				xSpeed = 0;
			}
			if(getY() > 0){
				ySpeed = -5;

			} else {
				ySpeed = 0;
			}
		    break;
		
		case SOUTH:
			if(getY() > 0){
				ySpeed = -5;
			} else {
				ySpeed = 0;
			}
			xSpeed = 0;
			break;
		
		case SOUTHWEST:
			if(getX() > 0){
				xSpeed = -5;
			} else {
				xSpeed = 0;
			}
			if(getY()  > 0){
				ySpeed = -5;
			} else {
				ySpeed = 0;
			}
			
			break;
		
		case WEST:
			if(getX() > 0){
				xSpeed = -5;
			}
			else{
				xSpeed = 0;
			}
			
			ySpeed = 0;
			break;

		case NORTHWEST:
			if(getX() > 0){
				xSpeed = -5;
			}
			else{
				xSpeed = 0;
			}
			if(getY() + getHeight() < Gdx.graphics.getHeight()){
					ySpeed = 5;
			}
			else{
				ySpeed = 0;
			}
		
			break;		
		}
	}

	public void clearBullets() {
		_bullets.clear();
	}	
	
	public int getListBulletSize() {
		return _bullets.size();
	}
	
	public Bullet getBullet(int i) {
		return _bullets.get(i);
	}

	public void removeBulletFromScreen(int j) {
		_spriteManager.remove(_bullets.get(j));
		_bullets.remove(j);
	}
	
	public void removeBulletFromScreen(Bullet bullet) {
		_spriteManager.remove(bullet);
		_bullets.remove(bullet);
	}
}
