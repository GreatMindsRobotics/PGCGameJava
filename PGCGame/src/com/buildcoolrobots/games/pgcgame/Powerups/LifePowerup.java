package com.buildcoolrobots.games.pgcgame.Powerups;

import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GamePowerup;
import com.buildcoolrobots.games.pgcgame.Ships.Allies.PlayerShip;

public class LifePowerup extends BasePowerup {
	
	public LifePowerup() {
		super(GamePowerup.EXTRA_LIFE.PowerupTexture(), GamePowerup.EXTRA_LIFE);
	}
	
	public void usePowerUp(Object oLives) {
		int lives = Integer.parseInt(oLives.toString());
		lives++;
		oLives = lives;
	}
	
}
