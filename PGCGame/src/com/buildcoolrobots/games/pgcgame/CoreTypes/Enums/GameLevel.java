package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public enum GameLevel implements IGameLevel{
	LEVEL1 (null),
	LEVEL2 (null),
	LEVEL3 (null),
	LEVEL4 (null),
	LEVEL5 (null);
	
	private GameLevel(String MapTexturePath) {
		_mapTexture = MapTexturePath == null ? null : new Texture(Gdx.files.internal(MapTexturePath));
	}

	private final Texture _mapTexture;
	
	@Override
	public Texture MapTexture() {
		// TODO Auto-generated method stub
		return _mapTexture;
	}
	
}
