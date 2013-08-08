package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public enum ScreenType implements IGameScreen {
	
	TITLESCREEN (null, null, null, Input.Keys.F1),
	MAINMENU (null, null, null, Input.Keys.F2),
	SETTINGSSCREEN (null, null, null, Input.Keys.F3),
	CREDITSSCREEN (null, null, null, Input.Keys.F4),
	GAMESCREEN (null, null, null, Input.Keys.F5);
	
	
	private ScreenType(String screenTexturePath, String screenLabelFntFile, String screenLabelPngFile, int debugKey) {
		 _screenTexture = screenTexturePath == null ? null : new Texture(Gdx.files.internal(screenTexturePath));
		 
		 if(screenLabelFntFile != null && screenLabelPngFile != null) {
			 BitmapFont tempBitmapFont = new BitmapFont(Gdx.files.internal(screenLabelFntFile), Gdx.files.internal(screenLabelPngFile), false);		 
			 _screenLabel = new LabelStyle(tempBitmapFont, Color.WHITE);	 			 
		 } else {
			 _screenLabel = null;
		 }
			 
		 _debugKey = debugKey;
	 }
	 
	private final Texture _screenTexture;
	private final LabelStyle _screenLabel;
	private final int _debugKey; 

	@Override
	public Texture ScreenTexture() {
		// TODO Auto-generated method stub
		return _screenTexture;
	}
	
	public LabelStyle ScreenLabelStyle() {
		return _screenLabel;
	}

	@Override
	public int DebugKey() {
		return _debugKey;
	}
	
	

}
