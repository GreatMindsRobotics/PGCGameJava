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
	GAMEOVERFONT (null, "Fonts/GameOverFont.fnt", "Fonts/GameOverFont.png"),
	DEBUGFONT (null, "Fonts/PGCGameDebugFont.fnt", "Fonts/PGCGameDebugFont.png" ),
	SCROLLINGBACKGROUND ("Images/Backgrounds/background.png", null, null),
	TRANSITIONBACKGROUND("Images/Backgrounds/SpaceShopBackground.png", null, null),
	CREDITFONT(null, "Fonts/CreditFont.fnt", "Fonts/CreditFont.png"),
	
	//D-Pad
	CONTROL_DIRECTIONAL ("Images/Controls/DpadButtons/Control_Directional.png", null, null),
	CONTROL_N ("Images/Controls/DpadButtons/Control_N.png", null, null),
	CONTROL_NE ("Images/Controls/DpadButtons/Control_NE.png", null, null),
	CONTROL_E ("Images/Controls/DpadButtons/Control_E.png", null, null),
	CONTROL_SE ("Images/Controls/DpadButtons/Control_SE.png", null, null),
	CONTROL_S ("Images/Controls/DpadButtons/Control_S.png", null, null),
	CONTROL_SW ("Images/Controls/DpadButtons/Control_SW.png", null, null),
	CONTROL_W ("Images/Controls/DpadButtons/Control_W.png", null, null),
	CONTROL_NW ("Images/Controls/DpadButtons/Control_NW.png", null, null);

	
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
