package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public enum ScreenType implements IGameScreen {
	
	TITLESCREEN (null),
	MAINMENU (null);
	
	 private ScreenType(String screenTexturePath) {
		 _screenTexture = screenTexturePath == null ? null : new Texture(Gdx.files.internal(screenTexturePath));
	 }

	private final Texture _screenTexture;

	@Override
	public Texture ScreenTexture() {
		// TODO Auto-generated method stub
		return _screenTexture;
	}

}
