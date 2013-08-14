package com.buildcoolrobots.games.pgcgame.CoreTypes;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;

public class BGSprite extends BaseGameSprite {
	private static final BGSprite _currentBG = new BGSprite();
	
	
	private BGSprite() {
		super(GameImage.SCROLLINGBACKGROUND.ImageTexture());

		background = new BaseGameSprite(GameImage.SCROLLINGBACKGROUND.ImageTexture());
		background.setPosition(0, 0);
		background.xSpeed = -1f;
		
		background2 = new BaseGameSprite(GameImage.SCROLLINGBACKGROUND.ImageTexture());
		if (!StateManager.TitleScreenBGSpriteDebug) {
			background2.setPosition(background.getX() + background.getWidth(), 0);
		}
		else {
			background2.setPosition(background.getX() + background.getWidth() + 1, 0);
		}
		background2.xSpeed = -1f;
	}
	
	public static BGSprite getInstance() {
        return _currentBG;      
	}
	
	
	private static BaseGameSprite background;
	private static BaseGameSprite background2;
	public static void scrollingBackground(SpriteManager allSprites) {		
		allSprites.add(background);
		allSprites.add(background2);
	}
	
	public static void scrollingBackgroundUpdate() {
		if (background.getX() + background.getWidth() <= 0) {
			if (!StateManager.TitleScreenBGSpriteDebug) {
				background.setPosition(background2.getX() + background2.getWidth(), 0);
			}
			else {
				background.setPosition(background2.getX() + background2.getWidth() + 1, 0);
			}
		}
		
		if (background2.getX() + background2.getWidth() <= 0) {
			if (!StateManager.TitleScreenBGSpriteDebug) {
				background2.setPosition(background.getX() + background.getWidth(), 0);
			}
			else {
				background2.setPosition(background.getX() + background.getWidth() + 1, 0);
			}
		}
	}
}
