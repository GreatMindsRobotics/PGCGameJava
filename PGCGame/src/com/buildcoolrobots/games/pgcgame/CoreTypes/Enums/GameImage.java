package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public enum GameImage implements IGameImage{

	GAMETITLE ("Images/Backgrounds/gametitle.png", null, null),
	MAINMENUPLAYBUTTON ("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png");
	
	private GameImage(String ImagePath, String textLabelStyleFntFile, String textLabelStylePngFile) {
		_imageTexture = ImagePath == null ? null : new Texture(ImagePath);	 
		
		 if(textLabelStyleFntFile != null && textLabelStylePngFile != null) {
			 BitmapFont tempBitmapFont = new BitmapFont(Gdx.files.internal(textLabelStyleFntFile), Gdx.files.internal( textLabelStylePngFile), false);		 
			 _imageText = new LabelStyle(tempBitmapFont, Color.WHITE);	 			 
		 } else {
			 _imageText = null;
		 }
	}
	
	public Texture ImageTexture() {
		return _imageTexture;
	}
	public LabelStyle ImageText() {
		return _imageText;
	}
	private Texture _imageTexture;
	private LabelStyle _imageText;
}
