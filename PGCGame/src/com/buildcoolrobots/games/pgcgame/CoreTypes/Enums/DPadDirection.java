package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

public enum DPadDirection {
	NORTH ("Images/Controls/DpadButtons/Control_N.png"),
	NORTHEAST ("Images/Controls/DpadButtons/Control_NE.png"),
	EAST ("Images/Controls/DpadButtons/Control_E.png"),
	SOUTHEAST ("Images/Controls/DpadButtons/Control_SE.png"),
	SOUTH ("Images/Controls/DpadButtons/Control_S.png"),
	SOUTHWEST ("Images/Controls/DpadButtons/Control_SW.png"),
	WEST ("Images/Controls/DpadButtons/Control_W.png"),
	NORTHWEST ("Images/Controls/DpadButtons/Control_NW.png"),
	NONE ("Images/Controls/DpadButtons/Control_Directional.png");	
	
	private DPadDirection(String ImagePath) {
		_imageTexture = ImagePath == null ? null : new Texture(ImagePath);	 		
	}
	
	private Texture _imageTexture;
	public Texture ImageTexture() {
		return _imageTexture;
	}
}
