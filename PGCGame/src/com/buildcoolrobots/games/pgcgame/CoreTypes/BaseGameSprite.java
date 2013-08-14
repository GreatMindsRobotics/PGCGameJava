package com.buildcoolrobots.games.pgcgame.CoreTypes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.RectangleInt;

public class BaseGameSprite extends ExtendedSprite {

	public BaseGameSprite(Texture texture) {
		super(texture);
		// TODO Auto-generated constructor stub
	}

	public BaseGameSprite(TextureRegion region) {
		super(region);
		// TODO Auto-generated constructor stub
	}

	public BaseGameSprite(Texture texture, RectangleInt region) {
		super(texture, region);
		// TODO Auto-generated constructor stub
	}

}
