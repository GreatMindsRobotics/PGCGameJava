package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public enum GameLevel implements IGameLevel{
	LEVEL1 (null, 1, 100, 200, 0),
	LEVEL2 (null, 2, 150, 250, 10),
	LEVEL3 (null, 3, 200, 300, 20),
	LEVEL4 (null, 3, 250, 350, 30),
	LEVEL5 (null, 5, 300, 400, 40);
	
	private GameLevel(String MapTexturePath, int speed, int value1, int value2, int enemyDeaths) {
		_mapTexture = MapTexturePath == null ? null : new Texture(Gdx.files.internal(MapTexturePath));
		_speed = speed;
		_enemyDeaths = enemyDeaths;
	}

	private final Texture _mapTexture;
	
	private final int _speed;
	
	private final int _enemyDeaths;
	@Override
	public Texture MapTexture() {
		// TODO Auto-generated method stub
		return _mapTexture;
	}
	
	public int getEnemyDeaths() {
		return _enemyDeaths;
	}
	
	public int Speed()
	{
	    return _speed;	
	}
}
	

