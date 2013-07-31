package com.buildcoolrobots.games.pgcgame.CoreTypes;

import javax.management.InstanceAlreadyExistsException;
import javax.management.InstanceNotFoundException;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class BGSprite extends Sprite {
	private static BGSprite _currentBG = null;
	
	public BGSprite(Texture texture) throws InstanceAlreadyExistsException {
		super(texture);
		
		if(_currentBG != null) {
			throw new InstanceAlreadyExistsException("This class is a singleton; use BGSprite.getInstance()");
		}
		
		_currentBG = this;
	}
	
	public static BGSprite getInstance() throws InstanceNotFoundException {
        if(_currentBG == null)
        {
            throw new InstanceNotFoundException("BGSprite is not initialized. Please create a new instance.");
        }

        return _currentBG;
      
	}
	
	Vector2 Speed = new Vector2(1,0);
	public void LoadContent(Vector2 position, Vector2 speed, Texture background) {
		this.setPosition(position.x, position.y);
		this.setTexture(background);
		
		//position += speed;
		
		if (position.x + background.getWidth() <= this.getWidth()) {
			position.x = 0;
		}
	}
	
}
