package com.buildcoolrobots.games.pgcgame.CoreTypes;

import me.pagekite.glen3b.gjlib.ExtendedSprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.DPadDirection;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;

public class DPad extends ExtendedSprite {
	// 0 - SouthWest
	// 1 - South
	// 2 - SouthEast
	// 3 - West
	// 4 - East
	// 5 - NorthWest
	// 6 - North
	// 7 - NorthEast
	public static Rectangle dirRectangle[];
	
	public static Texture baseTexture = GameImage.CONTROL_DIRECTIONAL.ImageTexture();
	
	public static DPadDirection shipDirection = DPadDirection.NONE;
	
	public static int buttonWidth;
	public static int buttonHeight;
	
	public DPad() {
		super(baseTexture);
		dirRectangle = new Rectangle[8];
		
		buttonWidth = baseTexture.getWidth() / 3;
		buttonHeight = baseTexture.getHeight() / 3;
		
		dirRectangle[DPadDirection.NORTH.ordinal()] = new Rectangle(buttonWidth, buttonHeight * 2, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.NORTHEAST.ordinal()] = new Rectangle(buttonWidth * 2, buttonHeight * 2, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.EAST.ordinal()] = new Rectangle(buttonWidth * 2, buttonHeight, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.SOUTHEAST.ordinal()] = new Rectangle(buttonWidth * 2, 0, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.SOUTH.ordinal()] = new Rectangle(buttonWidth, 0, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.SOUTHWEST.ordinal()] = new Rectangle(0, 0, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.WEST.ordinal()] = new Rectangle(0, buttonHeight, buttonWidth, buttonHeight);
		dirRectangle[DPadDirection.NORTHWEST.ordinal()] = new Rectangle(0, buttonHeight * 2, buttonWidth, buttonHeight);
	}

	public void update(float deltaTime) {
		super.update(deltaTime);
		
		if (Gdx.input.isTouched(0)) {
			for (int i = 0; i < DPadDirection.values().length - 1; i++) {
				if(Gdx.input.getX() >= dirRectangle[i].getX()
					&& Gdx.input.getX() <= dirRectangle[i].getX() + dirRectangle[i].getWidth()
					&& Gdx.graphics.getHeight() - Gdx.input.getY() >= dirRectangle[i].getY()
					&& Gdx.graphics.getHeight() - Gdx.input.getY() <= dirRectangle[i].getY()
					+ dirRectangle[i].getHeight()) {
						shipDirection = DPadDirection.values()[i];
				}				
			}
		} 
		
		else{
			shipDirection = DPadDirection.NONE;	
		}
	}
}
