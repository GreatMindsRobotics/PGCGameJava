package com.buildcoolrobots.games.pgcgame.CoreTypes;

import javax.swing.JOptionPane;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;

import me.pagekite.glen3b.gjlib.ExtendedSprite;

public class DPad extends ExtendedSprite {
	// 0 - SouthWest
	// 1 - South
	// 2 - SouthEast
	// 3 - West
	// 4 - East
	// 5 - NorthWest
	// 6 - North
	// 7 - NorthEast
	Rectangle dirRectangle[];
	
	private static Texture baseTexture = GameImage.CONTROL_DIRECTIONAL.ImageTexture();

	public DPad() {
		super(baseTexture);
		dirRectangle = new Rectangle[8];

		// assuming if bottom left
		
		dirRectangle[0] = new Rectangle(0, 0, baseTexture.getWidth() / 3,
				baseTexture.getHeight() / 3);
		dirRectangle[1] = new Rectangle(baseTexture.getWidth()/3, 0, baseTexture.getWidth() / 3,
				baseTexture.getHeight() / 3);
		dirRectangle[2] = new Rectangle((baseTexture.getWidth()/3) *2, 0, baseTexture.getWidth() / 3,
				baseTexture.getHeight() / 3);
		dirRectangle[3] = new Rectangle(0, baseTexture.getHeight() / 3, baseTexture.getWidth() / 3,
				baseTexture.getHeight() / 3);

	}

	public void update(float deltaTime) {
		super.update(deltaTime);
		for (int i = 0; i < 4; i++) {
			if (Gdx.input.isTouched()
				&& Gdx.input.getX() >= dirRectangle[i].getX()
				&& Gdx.input.getX() <= dirRectangle[i].getX() + dirRectangle[i].getWidth()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() >= dirRectangle[i].getY()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() <= dirRectangle[i].getY()
						+ dirRectangle[0].getHeight()) {
				JOptionPane.showMessageDialog(null,"workin bro: " + i);
			}
		}
	}

}
