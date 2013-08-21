package com.buildcoolrobots.games.pgcgame.CoreTypes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.DPadDirection;
import com.buildcoolrobots.games.pgcgame.Screens.SettingsScreen;

public class DPad extends BaseGameSprite {
	private Rectangle dirRectangle[];
	private int buttonWidth;
	private int buttonHeight;	
	private int dPadPosLefty;	
	private Vector2 scale;
		
	public DPadDirection shipDirection = DPadDirection.NONE;
	public DPadDirection debugShipDirection = DPadDirection.NONE;
	
	public DPad() {
		super(DPadDirection.NONE.ImageTexture());
		dirRectangle = new Rectangle[8];

		//TODO: Move the scale calculations to BaseSprite (uhm... create BaseSprite)
		//Adjust for screen resolution		
		scale = new Vector2((float)Gdx.graphics.getWidth() / 1920f, (float)Gdx.graphics.getHeight() / 1080f);
		
		buttonWidth = (int) (DPadDirection.NONE.ImageTexture().getWidth() / 3 * scale.x);
		buttonHeight = (int) (DPadDirection.NONE.ImageTexture().getHeight() / 3 * scale.y);		
		setScale(scale);
		
		dPadPosLefty = (int) (Gdx.graphics.getWidth() - DPadDirection.NONE.ImageTexture().getWidth() * scale.x);
		
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

		setOrigin(0, 0);
		setPosition(SettingsScreen.leftyMode ? Gdx.graphics.getWidth() - (float)getWidth() * scale.x : 0, 0);
	}
	
	public void update(float deltaTime) {
		super.update(deltaTime);
				
		boolean isDpadTouched = false;

		for (int j = 0; j < 2; j++) {
			if (Gdx.input.isTouched(j)) {
				for (int i = 0; i < DPadDirection.values().length - 1; i++) {
					if(Gdx.input.getX(j) >= dirRectangle[i].getX()
						&& Gdx.input.getX(j) <= dirRectangle[i].getX() + dirRectangle[i].getWidth()
						&& Gdx.graphics.getHeight() - Gdx.input.getY(j) >= dirRectangle[i].getY()
						&& Gdx.graphics.getHeight() - Gdx.input.getY(j) <= dirRectangle[i].getY()
						+ dirRectangle[i].getHeight()) {
							shipDirection = DPadDirection.values()[i];
							
							isDpadTouched = true;
							break;
					}				
				}
			} 		
		}
		//If no known direction, or not touched then, check keyboard
		//If debug keyboard use is enabled, set to debugShipDirection
		//If it's not enabled, it would remain "NONE" 
		if(!isDpadTouched) {
			shipDirection = debugShipDirection;
		}
		//Assign proper image based on ship direction
		setTexture(shipDirection.ImageTexture());
	}
}
