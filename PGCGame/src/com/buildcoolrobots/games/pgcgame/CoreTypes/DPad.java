package com.buildcoolrobots.games.pgcgame.CoreTypes;

import me.pagekite.glen3b.gjlib.ExtendedSprite;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.DPadDirection;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;

public class DPad extends ExtendedSprite {
	public static Rectangle dirRectangle[];
		
	public static DPadDirection shipDirection = DPadDirection.NONE;
	
	public static int buttonWidth;
	public static int buttonHeight;
	
	public DPad() {
		super(DPadDirection.NONE.ImageTexture());
		dirRectangle = new Rectangle[8];
		
		buttonWidth = DPadDirection.NONE.ImageTexture().getWidth() / 3;
		buttonHeight = DPadDirection.NONE.ImageTexture().getHeight() / 3;
		
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
