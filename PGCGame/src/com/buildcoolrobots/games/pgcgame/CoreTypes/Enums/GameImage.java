package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public enum GameImage implements IGameImage{

	GAMETITLE ("Images/Backgrounds/gametitle.png", null, null),
	MAINMENUPLAYBUTTON ("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png"),
	MAINMENUSETTINGSBUTTON("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png"),
	MAINMENUCREDITSBUTTON("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png"),
	SETTINGSSCREENBUTTON ("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png"),
	DEBUGFONT (null, "Fonts/PGCGameDebugFont.fnt", "Fonts/PGCGameDebugFont.png" ),
	GAMEDPADUP ("Images/Controls/DpadButtons/upArrow.png", null, null),
	GAMEDPADDOWN ("Images/Controls/DpadButtons/downArrow.png", null, null),
	GAMEDPADLEFT ("Images/Controls/DpadButtons/leftArrow.png", null, null),
	GAMEDPADRIGHT ("Images/Controls/DpadButtons/rightArrow.png", null, null),
	GAMEDPADCENTER ("Images/Controls/DpadButtons/center.png", null, null),
	SCROLLINGBACKGROUND ("Images/Backgrounds/background.png", null, null),
	CREDITFONT(null, "Fonts/CreditFont.fnt", "Fonts/CreditFont.png" );
	
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
