package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public enum ShipTypes implements IGameObject {
	PLAYERSHIP ("Player's Ship", "Images/Player/PlayerShip.png", null),
	ENEMYDRONE1 ("Enemy Drone Tier 1", "Images/Enemies/EnemyDrone.png", "Images/Enemies/EnemyDrone.png"),
	ENEMYDRONE2 ("Enemy Drone Tier 2", "Images/Enemies/EnemyDrone2.png", "Images/Enemies/EnemyDrone2.png");

	private final String _displayName;
	private final Texture _shopTexture;
	private final Texture _gameTexture;
	
	private ShipTypes(String displayName, String gameTexturePath, String shopTexturePath) {
		_displayName = displayName;
		_gameTexture = gameTexturePath == null ? null : new Texture(Gdx.files.internal(gameTexturePath));
		_shopTexture = shopTexturePath == null ? null : new Texture(Gdx.files.internal(shopTexturePath));
	}
	
	@Override
	public String DisplayName() {
		return _displayName;
	}

	@Override
	public Texture ShopTexture() {
		return _shopTexture;
	}

	@Override
	public Texture GameTexture() {
		return _gameTexture;
	}
}