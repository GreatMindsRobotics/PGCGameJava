package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class CreditsScreen extends BaseScreen {

	ExtendedLabel CLine1;
	ExtendedLabel CLine2;	
	ExtendedLabel CLine3;
	ExtendedLabel CLine4;
	ExtendedLabel CLine5;
	ExtendedLabel CLine6;
	ExtendedLabel CLine7;
	ExtendedLabel CLine8;
	ExtendedLabel CLine9;
	ExtendedLabel CLine10;
	ExtendedLabel CLine11;
	
	private final int scrollSpeed = 1;
	
	public CreditsScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		CLine1 = new ExtendedLabel("Credits", GameImage.CREDITFONT.ImageText());
		CLine2 = new ExtendedLabel("Week 1", GameImage.CREDITFONT.ImageText());
		CLine3 = new ExtendedLabel("Functional Spec and Game Management", GameImage.CREDITFONT.ImageText());
		CLine4 = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		CLine5 = new ExtendedLabel("Alexa L.", GameImage.CREDITFONT.ImageText());
		CLine6 = new ExtendedLabel("Andrea L.", GameImage.CREDITFONT.ImageText());
		CLine7 = new ExtendedLabel("Jeremiah T.", GameImage.CREDITFONT.ImageText());
		CLine8 = new ExtendedLabel("Kai F-H", GameImage.CREDITFONT.ImageText());
		CLine9 = new ExtendedLabel("Matthew P.", GameImage.CREDITFONT.ImageText());
		CLine10 = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		CLine11 = new ExtendedLabel("", GameImage.CREDITFONT.ImageText());
		reset();
		
		allSprites.add(CLine1);
		allSprites.add(CLine2);
		allSprites.add(CLine3);
		allSprites.add(CLine4);
		allSprites.add(CLine5);
		allSprites.add(CLine6);
		allSprites.add(CLine7);
		allSprites.add(CLine8);
		allSprites.add(CLine9);
		allSprites.add(CLine10);
		allSprites.add(CLine11);
	}
	
	public void reset() {
		CLine1.setPosition(Gdx.graphics.getWidth()/2 - CLine1.getWidth() /3, +120 -120);
		CLine2.setPosition(Gdx.graphics.getWidth()/2 - CLine2.getWidth() /3, -20 - 120);
		CLine3.setPosition(Gdx.graphics.getWidth()/3 + 20 - CLine3.getWidth() /3, -60 - 120);
		CLine4.setPosition(Gdx.graphics.getWidth()/2 - CLine4.getWidth() /3, -120 - 120);
		CLine5.setPosition(Gdx.graphics.getWidth()/2 - CLine5.getWidth() /3, -180 - 120);
		CLine6.setPosition(Gdx.graphics.getWidth()/2 - CLine6.getWidth() /3, -240 - 120);
		CLine7.setPosition(Gdx.graphics.getWidth()/2 - CLine7.getWidth() /3, -300 - 120);
		CLine8.setPosition(Gdx.graphics.getWidth()/2 - CLine8.getWidth() /3, -360 - 120);
		CLine9.setPosition(Gdx.graphics.getWidth()/2 - CLine9.getWidth() /3, -420 - 120);
		CLine10.setPosition(Gdx.graphics.getWidth()/2 - CLine10.getWidth() /3,-480 - 120);
		CLine11.setPosition(Gdx.graphics.getWidth()/2 - CLine11.getWidth() /3,-540 - 120);
	}

	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		CLine1.setPosition(CLine1.getX(), CLine1.getY() + scrollSpeed);
		CLine2.setPosition(CLine2.getX(), CLine2.getY() + scrollSpeed);
		CLine3.setPosition(CLine3.getX(), CLine3.getY() + scrollSpeed);
		CLine4.setPosition(CLine4.getX(), CLine4.getY() + scrollSpeed);
		CLine5.setPosition(CLine5.getX(), CLine5.getY() + scrollSpeed);
		CLine6.setPosition(CLine6.getX(), CLine6.getY() + scrollSpeed);
		CLine7.setPosition(CLine7.getX(), CLine7.getY() + scrollSpeed);
		CLine8.setPosition(CLine8.getX(), CLine8.getY() + scrollSpeed);
		CLine9.setPosition(CLine9.getX(), CLine9.getY() + scrollSpeed);
		CLine10.setPosition(CLine10.getX(), CLine10.getY() + scrollSpeed);
		CLine11.setPosition(CLine11.getX(), CLine11.getY() + scrollSpeed);
	}
	
	@Override
	public void show() {
		super.show();
		reset();
	}

}
