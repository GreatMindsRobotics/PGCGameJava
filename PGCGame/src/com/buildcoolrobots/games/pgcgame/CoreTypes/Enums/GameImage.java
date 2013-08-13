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
	FIREBUTTON ("Images/Controls/FireButton.png", null, null),
	LASERBULLET ("Images/Bullets/Bullet.png", null, null),
	PAUSEBUTTON ("Images/Controls/PauseButton.png", null, null),
	
	TRANSITIONBACKGROUND("Images/Backgrounds/SpaceShopBackground.png", null, null),
	CREDITFONT(null, "Fonts/CreditFont.fnt", "Fonts/CreditFont.png"),
		
	LEVELSELECTRIGHTBUTTON("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png"),
	LEVELSELECTLEFTBUTTON("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png"),
	LEVELSELECTBACKBUTTON("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png"),
    LEVELSELECTACCEPTBUTTON("Images/Controls/DefaultButton.png", "Fonts/DefaultButtonFont.fnt", "Fonts/DefaultButtonFont.png"),
	
	// Levels
	
	PLANET1("Images/Planets/AlternativePlanet.png", null, null),
	PLANET2("Images/Planets/Planet.png", null, null),
	PLANET3("Images/Planets/Planet3.png", null, null),
	PLANET4("Images/Planets/Planet4.png", null, null);
	
	
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
