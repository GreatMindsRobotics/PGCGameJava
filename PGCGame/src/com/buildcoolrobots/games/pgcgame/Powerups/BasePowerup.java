package com.buildcoolrobots.games.pgcgame.Powerups;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseGameSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GamePowerup;

public abstract class BasePowerup extends BaseGameSprite {
	private GamePowerup _powerUp;
	public BasePowerup(Texture powerUpTexture, GamePowerup powerUp) {
		super(powerUpTexture);
	
		_powerUp = powerUp;
		
	}
	
}
