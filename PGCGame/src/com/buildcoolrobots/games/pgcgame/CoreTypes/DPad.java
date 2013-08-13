package com.buildcoolrobots.games.pgcgame.CoreTypes;

import me.pagekite.glen3b.gjlib.ExtendedSprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.DPadDirection;
import com.buildcoolrobots.games.pgcgame.Screens.SettingsScreen;

public class DPad extends ExtendedSprite {
	private Rectangle dirRectangle[];
	private int buttonWidth;
	private int buttonHeight;	
	private int dPadPosLefty;	
	
		
	public DPadDirection shipDirection = DPadDirection.NONE;
	
	public DPad() {
		super(DPadDirection.NONE.ImageTexture());
		dirRectangle = new Rectangle[8];
		
		buttonWidth = DPadDirection.NONE.ImageTexture().getWidth() / 3;
		buttonHeight = DPadDirection.NONE.ImageTexture().getHeight() / 3;
				
		dPadPosLefty = Gdx.graphics.getWidth() - DPadDirection.NONE.ImageTexture().getWidth();
		
		setControlPosition();
	}
	
	public void setControlPosition() {
		dirRectangle[DPadDirection.NORTH.ordinal()] = new Rectangle(buttonWidth + (SettingsScreen.leftyMode ? dPadPosLefty : 0), buttonHeight * 2, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.NORTHEAST.ordinal()] = new Rectangle(buttonWidth * 2 + (SettingsScreen.leftyMode ? dPadPosLefty : 0), buttonHeight * 2, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.EAST.ordinal()] = new Rectangle(buttonWidth * 2 + (SettingsScreen.leftyMode ? dPadPosLefty : 0), buttonHeight, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.SOUTHEAST.ordinal()] = new Rectangle(buttonWidth * 2 + (SettingsScreen.leftyMode ? dPadPosLefty : 0), 0, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.SOUTH.ordinal()] = new Rectangle(buttonWidth + (SettingsScreen.leftyMode ? dPadPosLefty : 0), 0, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.SOUTHWEST.ordinal()] = new Rectangle((SettingsScreen.leftyMode ? dPadPosLefty : 0), 0, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.WEST.ordinal()] = new Rectangle((SettingsScreen.leftyMode ? dPadPosLefty : 0), buttonHeight, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.NORTHWEST.ordinal()] = new Rectangle((SettingsScreen.leftyMode ? dPadPosLefty : 0), buttonHeight * 2, buttonWidth, buttonHeight);
	}
	
	public void update(float deltaTime) {
		super.update(deltaTime);
				
		boolean isDpadTouched = false;

		if (Gdx.input.isTouched(0)) {
			for (int i = 0; i < DPadDirection.values().length - 1; i++) {
				if(Gdx.input.getX() >= dirRectangle[i].getX()
					&& Gdx.input.getX() <= dirRectangle[i].getX() + dirRectangle[i].getWidth()
					&& Gdx.graphics.getHeight() - Gdx.input.getY() >= dirRectangle[i].getY()
					&& Gdx.graphics.getHeight() - Gdx.input.getY() <= dirRectangle[i].getY()
					+ dirRectangle[i].getHeight()) {
						shipDirection = DPadDirection.values()[i];
						
						isDpadTouched = true;
						break;
				}				
			}
		} 		

		//If no known direction, or not touched - set to NONE
		if(!isDpadTouched) {
			shipDirection = DPadDirection.NONE;
		}
		
		//Assign proper image based on ship direction
		setTexture(shipDirection.ImageTexture());
	}
}
