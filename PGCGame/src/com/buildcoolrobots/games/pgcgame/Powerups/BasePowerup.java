package com.buildcoolrobots.games.pgcgame.Powerups;

import com.badlogic.gdx.graphics.Texture;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseGameSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GamePowerup;
import com.buildcoolrobots.games.pgcgame.Ships.Allies.PlayerShip;

public abstract class BasePowerup extends BaseGameSprite {
	private GamePowerup _powerUp;
	public BasePowerup(Texture powerUpTexture, GamePowerup powerUp) {
		super(powerUpTexture);
	
		_powerUp = powerUp;
		
	}
	
	public void update(float deltaTime) {
		super.update(deltaTime);
		this.xSpeed = 1;
	}
	
	public void usePowerUp(PlayerShip ship) {
		
	}
	
	public GamePowerup getPowerUp()
	{
		return _powerUp;
	}
}
