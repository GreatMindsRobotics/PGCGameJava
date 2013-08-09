package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class CreditsScreen extends BaseScreen {

	ExtendedLabel CTLine;
	
	ExtendedLabel CW1;	
	ExtendedLabel CW2;
	ExtendedLabel CW3;
	ExtendedLabel CW4;
	ExtendedLabel CW5;
	ExtendedLabel CW6;
	
	ExtendedLabel CA1;  // functional spec. and game management
	ExtendedLabel CA2;  // class design, functionality, technical spec
	ExtendedLabel CA3;  // ai programming
	ExtendedLabel CA4;  // Xbox conversion
	ExtendedLabel CA5;  // generl game programming
	ExtendedLabel CA6;  //
	
	ExtendedLabel CN1AlexL;
	ExtendedLabel CN2AlexaL;
	ExtendedLabel CN3AndreaL;
	ExtendedLabel CN4JeremiahT;
	ExtendedLabel CN5KaiFH;
	ExtendedLabel CN6MatthewP;
	ExtendedLabel CN7MichaelK;
	ExtendedLabel CN8GlenH;
	ExtendedLabel CN9AndrewK;
	ExtendedLabel CN10KevinF;
    ExtendedLabel CN11JosephV;
    ExtendedLabel CN12AlyssaF;
    ExtendedLabel CN13RossT;
    ExtendedLabel CN14BrandonU;
    ExtendedLabel CN15PierreB;
    ExtendedLabel CN16EedanS;
    ExtendedLabel CN17RehaanI;
    ExtendedLabel CN18BrandonF;
    
	ExtendedLabel CN1AlexL2;
	ExtendedLabel CN6MatthewP2;
    ExtendedLabel CN7MichaelK2;
	
	private final int scrollSpeed = 1;
	
	public CreditsScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		CTLine = new ExtendedLabel("Credits", GameImage.CREDITFONT.ImageText());
		CW1 = new ExtendedLabel("Week 1", GameImage.CREDITFONT.ImageText());
		CA1 = new ExtendedLabel("Functional Spec and Game Management", GameImage.CREDITFONT.ImageText());
		CN1AlexL = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		CN2AlexaL = new ExtendedLabel("Alexa L.", GameImage.CREDITFONT.ImageText());
		CN3AndreaL = new ExtendedLabel("Andrea L.", GameImage.CREDITFONT.ImageText());
		CN4JeremiahT = new ExtendedLabel("Jeremiah T.", GameImage.CREDITFONT.ImageText());
		CN5KaiFH = new ExtendedLabel("Kai F-H", GameImage.CREDITFONT.ImageText());
		CN6MatthewP = new ExtendedLabel("Matthew P.", GameImage.CREDITFONT.ImageText());
		CN7MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		
		CW2 = new ExtendedLabel("Week 2", GameImage.CREDITFONT.ImageText());
		CA2 = new ExtendedLabel("Class Design,Functionality,Technical Spec.", GameImage.CREDITFONT.ImageText());		
		CN1AlexL2 = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		CN8GlenH = new ExtendedLabel("Glen H.", GameImage.CREDITFONT.ImageText());
		CN6MatthewP2 = new ExtendedLabel("Matthew P.", GameImage.CREDITFONT.ImageText());
		CN7MichaelK2 = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		
		reset();
		
		allSprites.add(CTLine);
		
		allSprites.add(CW1);
		allSprites.add(CA1);
		allSprites.add(CN1AlexL);
		allSprites.add(CN2AlexaL);
		allSprites.add(CN3AndreaL);
		allSprites.add(CN4JeremiahT);
		allSprites.add(CN5KaiFH);
		allSprites.add(CN6MatthewP);
		allSprites.add(CN7MichaelK);
		
		allSprites.add(CW2);
		allSprites.add(CA2);
		allSprites.add(CN1AlexL2);
		allSprites.add(CN8GlenH);
		allSprites.add(CN6MatthewP2);
		allSprites.add(CN7MichaelK2);
	}
	
	public void reset() {
		
		CTLine.setPosition(Gdx.graphics.getWidth()/2 - CTLine.getWidth() /3, +150 -120);
		
		CW1.setPosition(Gdx.graphics.getWidth()/2 - CW1.getWidth() /3, + 30 - 120);
		
		CA1.setPosition(Gdx.graphics.getWidth()/3 + 20 - CA1.getWidth() /3, -60 - 120);
		CN1AlexL.setPosition(Gdx.graphics.getWidth()/2 - CN1AlexL.getWidth() /3, -120 - 120);
		CN2AlexaL.setPosition(Gdx.graphics.getWidth()/2 - CN2AlexaL.getWidth() /3, -180 - 120);
		CN3AndreaL.setPosition(Gdx.graphics.getWidth()/2 - CN3AndreaL.getWidth() /3, -240 - 120);
		CN4JeremiahT.setPosition(Gdx.graphics.getWidth()/2 - CN4JeremiahT.getWidth() /3, -300 - 120);
		CN5KaiFH.setPosition(Gdx.graphics.getWidth()/2 - CN5KaiFH.getWidth() /3, -360 - 120);
		CN6MatthewP.setPosition(Gdx.graphics.getWidth()/2 - CN6MatthewP.getWidth() /3, -420 - 120);
		CN7MichaelK.setPosition(Gdx.graphics.getWidth()/2 - CN7MichaelK.getWidth() /3,-480 - 120);
		
		CW2.setPosition(Gdx.graphics.getWidth()/2 - CW2.getWidth() /3, - 780 ); 
		
		CA2.setPosition(Gdx.graphics.getWidth()/2 - 120 - CA2.getWidth() /3, - 870 );
		CN1AlexL2.setPosition(Gdx.graphics.getWidth()/2 - CN1AlexL2.getWidth() /3, - 930);
		CN8GlenH.setPosition(Gdx.graphics.getWidth()/2 - CN8GlenH.getWidth() /3, - 990);
		CN6MatthewP2.setPosition(Gdx.graphics.getWidth()/2 - CN6MatthewP2.getWidth() /3, - 1050);
		CN7MichaelK2.setPosition(Gdx.graphics.getWidth()/2 - CN7MichaelK2.getWidth() /3, - 1110);
	}

	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		CTLine.setPosition(CTLine.getX(), CTLine.getY() + scrollSpeed);
		CW1.setPosition(CW1.getX(), CW1.getY() + scrollSpeed);
		CA1.setPosition(CA1.getX(), CA1.getY() + scrollSpeed);
		CN1AlexL.setPosition(CN1AlexL.getX(), CN1AlexL.getY() + scrollSpeed);
		CN2AlexaL.setPosition(CN2AlexaL.getX(), CN2AlexaL.getY() + scrollSpeed);
		CN3AndreaL.setPosition(CN3AndreaL.getX(), CN3AndreaL.getY() + scrollSpeed);
		CN4JeremiahT.setPosition(CN4JeremiahT.getX(), CN4JeremiahT.getY() + scrollSpeed);
		CN5KaiFH.setPosition(CN5KaiFH.getX(), CN5KaiFH.getY() + scrollSpeed);
		CN6MatthewP.setPosition(CN6MatthewP.getX(), CN6MatthewP.getY() + scrollSpeed);
		CN7MichaelK.setPosition(CN7MichaelK.getX(), CN7MichaelK.getY() + scrollSpeed);
		
		CW2.setPosition(CW2.getX(), CW2.getY() + scrollSpeed);
		CA2.setPosition(CA2.getX(), CA2.getY() + scrollSpeed);
		CN1AlexL2.setPosition(CN1AlexL2.getX(), CN1AlexL2.getY() + scrollSpeed);
		CN8GlenH.setPosition(CN8GlenH.getX(), CN8GlenH.getY() + scrollSpeed);
		CN6MatthewP2.setPosition(CN6MatthewP2.getX(), CN6MatthewP2.getY() + scrollSpeed);
		CN7MichaelK2.setPosition(CN7MichaelK2.getX(), CN7MichaelK2.getY() + scrollSpeed);
	}
	
	@Override
	public void show() {
		super.show();
		reset();
	}

}
