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
	// WEEK 1
	ExtendedLabel W1AlexL;
	ExtendedLabel W1AlexaL;
	ExtendedLabel W1AndreaL;
	ExtendedLabel W1JeremiahT;
	ExtendedLabel W1KaiFH;
	ExtendedLabel W1MatthewP;
	ExtendedLabel W1MichaelK;
	// WEEK 2
	ExtendedLabel W2GlenH;
    ExtendedLabel W2AlexL;
	ExtendedLabel W2MatthewP;
    ExtendedLabel W2MichaelK;
	// WEEK 3
    ExtendedLabel W3AlexL;
    ExtendedLabel W3KaiFH;
    ExtendedLabel W3MatthewP;
    ExtendedLabel W3MichaelK;
    ExtendedLabel W3JeremiahT;
	ExtendedLabel W3AndrewK;
	ExtendedLabel W3KevinF;
    ExtendedLabel W3JosephV;
    // WEEK 4
    ExtendedLabel CN12AlyssaF;
    ExtendedLabel CN13RossT;
    ExtendedLabel CN14BrandonU;
    ExtendedLabel CN15PierreB;
    ExtendedLabel CN16EedanS;
    ExtendedLabel CN17RehaanI;
    ExtendedLabel CN18BrandonF;
    

    
    
	
	private final int scrollSpeed = 1;
	
	public CreditsScreen(SpriteManager allSprites, SpriteBatch target, ScreenType screenType) {
		super(allSprites, target, screenType);
		CTLine = new ExtendedLabel("Credits", GameImage.CREDITFONT.ImageText());
		CW1 = new ExtendedLabel("Week 1", GameImage.CREDITFONT.ImageText());
		CA1 = new ExtendedLabel("Functional Spec and Game Management", GameImage.CREDITFONT.ImageText());
		W1AlexL = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		W1AlexaL = new ExtendedLabel("Alexa L.", GameImage.CREDITFONT.ImageText());
		W1AndreaL = new ExtendedLabel("Andrea L.", GameImage.CREDITFONT.ImageText());
		W1JeremiahT = new ExtendedLabel("Jeremiah T.", GameImage.CREDITFONT.ImageText());
		W1KaiFH = new ExtendedLabel("Kai F-H", GameImage.CREDITFONT.ImageText());
		W1MatthewP = new ExtendedLabel("Matthew P.", GameImage.CREDITFONT.ImageText());
		W1MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		
		CW2 = new ExtendedLabel("Week 2", GameImage.CREDITFONT.ImageText());
		CA2 = new ExtendedLabel("Class Design,Functionality,Technical Spec.", GameImage.CREDITFONT.ImageText());		
		W2AlexL = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		W2GlenH = new ExtendedLabel("Glen H.", GameImage.CREDITFONT.ImageText());
		W2MatthewP = new ExtendedLabel("Matthew P.", GameImage.CREDITFONT.ImageText());
		W2MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		
		CW3 = new ExtendedLabel("Week 3", GameImage.CREDITFONT.ImageText());
		CA3 = new ExtendedLabel("AI Programming", GameImage.CREDITFONT.ImageText());
		W3AlexL = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		W3AndrewK = new ExtendedLabel("Andrew K.", GameImage.CREDITFONT.ImageText());
		W3KaiFH = new ExtendedLabel("Kai F-H", GameImage.CREDITFONT.ImageText());
		W3KevinF = new ExtendedLabel("Kevin F.", GameImage.CREDITFONT.ImageText());
		W3MatthewP = new ExtendedLabel("Matthew P.", GameImage.CREDITFONT.ImageText());
		W3MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		W3JeremiahT = new ExtendedLabel("Jeremaih T.", GameImage.CREDITFONT.ImageText());
		W3JosephV = new ExtendedLabel("Joseph V.", GameImage.CREDITFONT.ImageText());
		
		reset();
		
		allSprites.add(CTLine);
		
		allSprites.add(CW1);
		allSprites.add(CA1);
		allSprites.add(W1AlexL);
		allSprites.add(W1AlexaL);
		allSprites.add(W1AndreaL);
		allSprites.add(W1JeremiahT);
		allSprites.add(W1KaiFH);
		allSprites.add(W1MatthewP);
		allSprites.add(W1MichaelK);
		
		allSprites.add(CW2);
		allSprites.add(CA2);
		allSprites.add(W2AlexL);
		allSprites.add(W2GlenH);
		allSprites.add(W2MatthewP);
		allSprites.add(W2MichaelK);
		
		allSprites.add(CW3);
		allSprites.add(CA3);
		allSprites.add(W3AlexL);
		allSprites.add(W3AndrewK);
		allSprites.add(W3KaiFH);
		allSprites.add(W3KevinF);
		allSprites.add(W3MatthewP);
		allSprites.add(W3MichaelK);
	    allSprites.add(W3JeremiahT);
	    allSprites.add(W3JosephV);
	}
	
	public void reset() {
		
		CTLine.setPosition(Gdx.graphics.getWidth()/2 - CTLine.getWidth() /3, +150 -120);
		
		CW1.setPosition(Gdx.graphics.getWidth()/2 - CW1.getWidth() /3, + 30 - 120);
		
		CA1.setPosition(Gdx.graphics.getWidth()/3 + 20 - CA1.getWidth() /3, -60 - 120);
		W1AlexL.setPosition(Gdx.graphics.getWidth()/2 - W1AlexL.getWidth() /3, -120 - 120);
		W1AlexaL.setPosition(Gdx.graphics.getWidth()/2 - W1AlexaL.getWidth() /3, -180 - 120);
		W1AndreaL.setPosition(Gdx.graphics.getWidth()/2 - W1AndreaL.getWidth() /3, -240 - 120);
		W1JeremiahT.setPosition(Gdx.graphics.getWidth()/2 - W1JeremiahT.getWidth() /3, -300 - 120);
		W1KaiFH.setPosition(Gdx.graphics.getWidth()/2 - W1KaiFH.getWidth() /3, -360 - 120);
		W1MatthewP.setPosition(Gdx.graphics.getWidth()/2 - W1MatthewP.getWidth() /3, -420 - 120);
		W1MichaelK.setPosition(Gdx.graphics.getWidth()/2 - W1MichaelK.getWidth() /3,-480 - 120); //600
		
		CW2.setPosition(Gdx.graphics.getWidth()/2 - CW2.getWidth() /3, - 780 ); 
		
		CA2.setPosition(Gdx.graphics.getWidth()/2 - 120 - CA2.getWidth() /3, - 870 );
		W2AlexL.setPosition(Gdx.graphics.getWidth()/2 - W2AlexL.getWidth() /3, - 930);
		W2GlenH.setPosition(Gdx.graphics.getWidth()/2 - W2GlenH.getWidth() /3, - 990);
		W2MatthewP.setPosition(Gdx.graphics.getWidth()/2 - W2MatthewP.getWidth() /3, - 1050);
		W2MichaelK.setPosition(Gdx.graphics.getWidth()/2 - W2MichaelK.getWidth() /3, - 1110);
		
		CW3.setPosition(Gdx.graphics.getWidth()/2 - CW3.getWidth() / 3, - 1290);
		
		CA3.setPosition(Gdx.graphics.getWidth()/2 - 30 - CA3.getWidth() / 3, - 1380);
		W3AlexL.setPosition(Gdx.graphics.getWidth()/2 - W1AlexL.getWidth() / 3, - 1440);
		W3AndrewK.setPosition(Gdx.graphics.getWidth()/2 - W3AndrewK.getWidth() / 3, - 1500);
		W3KaiFH.setPosition(Gdx.graphics.getWidth()/2 - W1KaiFH.getWidth() / 3, - 1560);
		W3KevinF.setPosition(Gdx.graphics.getWidth()/2 - W3KevinF.getWidth() / 3, - 1620);
		W3MatthewP.setPosition(Gdx.graphics.getWidth()/2 - W3MatthewP.getWidth() / 3, - 1680);
		W3MichaelK.setPosition(Gdx.graphics.getWidth()/2 - W3MichaelK.getWidth() / 3, - 1740);
		W3JeremiahT.setPosition(Gdx.graphics.getWidth()/2 - W3JeremiahT.getWidth() / 3, - 1800);
		W3JosephV.setPosition(Gdx.graphics.getWidth()/2 - W3JosephV.getWidth() / 3, -1860);
	}

	@Override
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		CTLine.setPosition(CTLine.getX(), CTLine.getY() + scrollSpeed);
		CW1.setPosition(CW1.getX(), CW1.getY() + scrollSpeed);
		CA1.setPosition(CA1.getX(), CA1.getY() + scrollSpeed);
		W1AlexL.setPosition(W1AlexL.getX(), W1AlexL.getY() + scrollSpeed);
		W1AlexaL.setPosition(W1AlexaL.getX(), W1AlexaL.getY() + scrollSpeed);
		W1AndreaL.setPosition(W1AndreaL.getX(), W1AndreaL.getY() + scrollSpeed);
		W1JeremiahT.setPosition(W1JeremiahT.getX(), W1JeremiahT.getY() + scrollSpeed);
		W1KaiFH.setPosition(W1KaiFH.getX(), W1KaiFH.getY() + scrollSpeed);
		W1MatthewP.setPosition(W1MatthewP.getX(), W1MatthewP.getY() + scrollSpeed);
		W1MichaelK.setPosition(W1MichaelK.getX(), W1MichaelK.getY() + scrollSpeed);
		
		CW2.setPosition(CW2.getX(), CW2.getY() + scrollSpeed);
		CA2.setPosition(CA2.getX(), CA2.getY() + scrollSpeed);
		W2AlexL.setPosition(W2AlexL.getX(), W2AlexL.getY() + scrollSpeed);
		W2GlenH.setPosition(W2GlenH.getX(), W2GlenH.getY() + scrollSpeed);
		W2MatthewP.setPosition(W2MatthewP.getX(), W2MatthewP.getY() + scrollSpeed);
		W2MichaelK.setPosition(W2MichaelK.getX(), W2MichaelK.getY() + scrollSpeed);
		
		CW3.setPosition(CW3.getX(), CW3.getY() + scrollSpeed);
		CA3.setPosition(CA3.getX(), CA3.getY() + scrollSpeed);
		W3AlexL.setPosition(W3AlexL.getX(), W3AlexL.getY() + scrollSpeed);
		W3AndrewK.setPosition(W3AndrewK.getX(), W3AndrewK.getY() + scrollSpeed);
		W3KaiFH.setPosition(W3KaiFH.getX(), W3KaiFH.getY() + scrollSpeed);
		W3KevinF.setPosition(W3KevinF.getX(), W3KevinF.getY() + scrollSpeed);
		W3MatthewP.setPosition(W3MatthewP.getX(), W3MatthewP.getY() + scrollSpeed);
		W3MichaelK.setPosition(W3MichaelK.getX(), W3MichaelK.getY() + scrollSpeed);
		W3JeremiahT.setPosition(W3JeremiahT.getX(), W3JeremiahT.getY() + scrollSpeed);
		W3JosephV.setPosition(W3JosephV.getX(), W3JosephV.getY() + scrollSpeed);
	}
	
	@Override
	public void show() {
		super.show();
		reset();
	}

}
