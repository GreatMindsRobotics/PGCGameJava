package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public enum GameLevel implements IGameLevel{
	LEVEL1 (null, 1f, 100, 200, 0),
	LEVEL2 (null, 1.5f, 150, 250, 10),
	LEVEL3 (null, 2f, 200, 300, 20),
	LEVEL4 (null, 2.5f, 250, 350, 30),
	LEVEL5 (null, 3f, 300, 400, 40);
	
	private GameLevel(String MapTexturePath, float speed, int value1, int value2, int enemyDeaths) {
		_mapTexture = MapTexturePath == null ? null : new Texture(Gdx.files.internal(MapTexturePath));
		_speed = speed;
		_enemyDeaths = enemyDeaths;
		_value1 = value1;
		_value2 = value2;
	}

	private final Texture _mapTexture;
	
	private final float _speed;
	
	private final int _enemyDeaths;
	
	private final int _value1;
	
	private final int _value2;
	@Override
	public Texture MapTexture() {
		// TODO Auto-generated method stub
		return _mapTexture;
	}
	
	public int getEnemyDeaths() {
		return _enemyDeaths;
	}
	
	public float Speed()
	{
	    return _speed;	
	}
	
	public int value1() {
		return _value1;
	}
	
	public int value2() {
		return _value2;
	}
}
	

