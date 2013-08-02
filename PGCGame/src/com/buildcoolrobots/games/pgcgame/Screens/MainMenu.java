package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SimpleSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class MainMenu extends BaseScreen {

	public MainMenu(SpriteManager allSprites, SpriteBatch target) {
		super(allSprites, target);
		ExtendedSprite PlayButton = new ExtendedSprite(GameImage.PLAYBUTTON.ImageTexture());
		PlayButton.setPosition(100,  100);

		
		ExtendedLabel PlayButtonText = new ExtendedLabel("Play", GameImage.PLAYBUTTON.ImageText());
		PlayButtonText.setPosition(100, 100);		
		allSprites.add(PlayButton);
		allSprites.add(PlayButtonText);

	}

}
