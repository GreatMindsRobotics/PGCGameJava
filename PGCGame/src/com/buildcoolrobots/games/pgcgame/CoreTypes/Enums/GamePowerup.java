package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public enum GamePowerup implements IGamePowerup{
	
	EXTRA_LIFE("Images/Powerups/LifePowerup.png", "extra life"),
	SHIELD("Images/Powerups/ShieldPowerup.png", "shield");
	
	private GamePowerup(String PowerupTextureFileName, String PowerupName) {
		_PowerupTexture = PowerupTextureFileName == null ? null : new Texture(Gdx.files.internal(PowerupTextureFileName));
		_PowerupName = PowerupName == null ? null : PowerupName;
	}
	
	public Texture PowerupTexture() {
		return _PowerupTexture;
	}

	public String PowerupName() {
		return _PowerupName;
	}
	
	private Texture _PowerupTexture;
	private String _PowerupName;
}
