package com.buildcoolrobots.games.pgcgame.CoreTypes.Enums;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;


public interface IGameScreen {
	public Texture ScreenTexture();	
	public LabelStyle ScreenLabelStyle();
}