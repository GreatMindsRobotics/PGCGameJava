package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public enum ScreenType implements IGameScreen {
	
	TITLESCREEN ("Images/Backgrounds/background.png", "Fonts/PGCTitleFont.fnt", "Fonts/PGCTitleFont.png"),
	MAINMENU (null, null, null);
	 
	
	private ScreenType(String screenTexturePath, String screenLabelFntFile, String screenLabelPngFile) {
		 _screenTexture = screenTexturePath == null ? null : new Texture(Gdx.files.internal(screenTexturePath));
		 
		 if(screenLabelFntFile != null && screenLabelPngFile != null) {
			 BitmapFont tempBitmapFont = new BitmapFont(Gdx.files.internal(screenLabelFntFile), Gdx.files.internal(screenLabelPngFile), false);		 
			 _screenLabel = new LabelStyle(tempBitmapFont, Color.WHITE);	 			 
		 } else {
			 _screenLabel = null;
		 }
			 
	 }
	 
	private final Texture _screenTexture;
	private final LabelStyle _screenLabel;

	@Override
	public Texture ScreenTexture() {
		// TODO Auto-generated method stub
		return _screenTexture;
	}
	
	public LabelStyle ScreenLabelStyle() {
		return _screenLabel;
	}

}
