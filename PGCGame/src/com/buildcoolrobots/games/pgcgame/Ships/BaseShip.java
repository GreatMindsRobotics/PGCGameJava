package com.buildcoolrobots.games.pgcgame.Ships;

import java.util.ArrayList;

import me.pagekite.glen3b.gjlib.ExtendedSprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.Ships.Bullets.Bullet;

public class BaseShip extends ExtendedSprite {

	protected Vector2 _movementSpeed;
	private ArrayList<Bullet> _bullets;	
	
	public BaseShip(Vector2 position, Vector2 speed, Texture texture) {
		super(texture);
		_bullets = new ArrayList<Bullet>();
		this.setPosition(position.x, position.y);		
		_movementSpeed = speed;
	}
	
	public void shoot() {
		 Bullet tempBullet = new Bullet(GameImage.GAMETITLE.ImageTexture());
		 tempBullet.xSpeed = 5;
		 _bullets.add (tempBullet);
		 
	    }

	
	public void Update()
	{
		
		
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
	
	
	

	
	
	
}
