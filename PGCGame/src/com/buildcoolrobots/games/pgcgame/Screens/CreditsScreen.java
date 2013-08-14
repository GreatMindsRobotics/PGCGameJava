
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
	ExtendedLabel CW7;
	ExtendedLabel CW8;
	
	ExtendedLabel CA1;  // functional spec. and game management
	ExtendedLabel CA2;  // class design, functionality, technical spec
	ExtendedLabel CA3;  // ai programming
	ExtendedLabel CA4;  // Xbox conversion
	ExtendedLabel CA5;  // generl game programming
	ExtendedLabel CA6;  // ???
	ExtendedLabel CA7;
	ExtendedLabel CA8;
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
    ExtendedLabel W4AlexL;
    ExtendedLabel W4AndrewK;
    ExtendedLabel W4MichaelK;
    ExtendedLabel W4GlenH;
    ExtendedLabel W4PierreB;
    ExtendedLabel W4KevinF;
    ExtendedLabel W4JosephV;
    ExtendedLabel W4JeremiahT;
    ExtendedLabel W4EedanS;
    // WEEK 5
    ExtendedLabel W5AaronO;
    ExtendedLabel W5AlexL;
    ExtendedLabel W5AlyssaF;
    ExtendedLabel W5AndrewK;
    ExtendedLabel W5BrandonF;
    ExtendedLabel W5GlenH;
    ExtendedLabel W5PierreB;
    ExtendedLabel W5JeremiahT;
    ExtendedLabel W5JosephV;
    ExtendedLabel W5MichaelK;  
    //WEEK 6
    ExtendedLabel W6MichaelK;
    ExtendedLabel W6AlexL;
    ExtendedLabel W6GlenH;
    ExtendedLabel W6RossT;
    ExtendedLabel W6BrandonU;
    ExtendedLabel W6BrandonF;
    ExtendedLabel W6AlyssaF;
    ExtendedLabel W6AndrewK;
    ExtendedLabel W6JeremiahT;
    ExtendedLabel W6RehaanI;
    // WEEK 7
    ExtendedLabel W7MichaelK;
    ExtendedLabel W7AlexL;
    ExtendedLabel W7RossT;
    ExtendedLabel W7BrandonU;
    ExtendedLabel W7RehaanI;
    // WEEK 8
    ExtendedLabel W8MichaelK;
    ExtendedLabel W8AlexL;
    ExtendedLabel W8BrandonU;
    ExtendedLabel W8RehaanI;
    ExtendedLabel W8AndrewK;
    // WEEK 9
    
    ExtendedLabel CN13RossT;
    ExtendedLabel CN14BrandonU;
    ExtendedLabel CN15PierreB;
    ExtendedLabel CN16EedanS;
    ExtendedLabel CN17RehaanI;
    

    
    
	
	private final int scrollSpeed = 5;
	
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
		
		CW4 = new ExtendedLabel("Week 4", GameImage.CREDITFONT.ImageText());
		CA4 = new ExtendedLabel("Xbox Conversion", GameImage.CREDITFONT.ImageText());
		W4AlexL = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		W4AndrewK = new ExtendedLabel("Andrew K.", GameImage.CREDITFONT.ImageText());
		W4EedanS = new ExtendedLabel("Eedan S.",GameImage.CREDITFONT.ImageText());
		W4GlenH = new ExtendedLabel("Glen H.", GameImage.CREDITFONT.ImageText());
		W4JeremiahT = new ExtendedLabel("Jeremiah T.", GameImage.CREDITFONT.ImageText());
		W4JosephV = new ExtendedLabel("Joseph V.", GameImage.CREDITFONT.ImageText());
		W4KevinF = new ExtendedLabel("Kevin F.", GameImage.CREDITFONT.ImageText());
		W4MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		W4PierreB = new ExtendedLabel("Pierre B.", GameImage.CREDITFONT.ImageText());
		
		CW5 = new ExtendedLabel("Week 5", GameImage.CREDITFONT.ImageText());
		CA5 = new ExtendedLabel("General Game Programming", GameImage.CREDITFONT.ImageText());
		W5MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		W5AlexL = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		W5GlenH = new ExtendedLabel("Glen H.", GameImage.CREDITFONT.ImageText());
		W5PierreB = new ExtendedLabel("Pierre B.", GameImage.CREDITFONT.ImageText());
		W5AndrewK = new ExtendedLabel("Andrew K.", GameImage.CREDITFONT.ImageText());
		W5JeremiahT = new ExtendedLabel("Jeremiah T.", GameImage.CREDITFONT.ImageText());
		W5AaronO = new ExtendedLabel("Aaron O.", GameImage.CREDITFONT.ImageText());
		W5BrandonF = new ExtendedLabel("Brandon F.", GameImage.CREDITFONT.ImageText());
		W5AlyssaF = new ExtendedLabel("Alyssa F.", GameImage.CREDITFONT.ImageText());
		
		CW6 = new ExtendedLabel("Week 6", GameImage.CREDITFONT.ImageText());
		CA6 = new ExtendedLabel("?       ?       ?", GameImage.CREDITFONT.ImageText());
		W6MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		W6AlexL = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		W6GlenH = new ExtendedLabel("Glen H.", GameImage.CREDITFONT.ImageText());
		W6RossT = new ExtendedLabel("Ross T.", GameImage.CREDITFONT.ImageText());
		W6BrandonU = new ExtendedLabel("Brandon U.", GameImage.CREDITFONT.ImageText());
		W6BrandonF = new ExtendedLabel("Brandon F.", GameImage.CREDITFONT.ImageText());
		W6AlyssaF = new ExtendedLabel("Alyssa F.", GameImage.CREDITFONT.ImageText());
		W6AndrewK = new ExtendedLabel("Andrew K.", GameImage.CREDITFONT.ImageText());
		W6JeremiahT = new ExtendedLabel("Jeremiah T.", GameImage.CREDITFONT.ImageText());
		
		CW7 = new ExtendedLabel("Week 7", GameImage.CREDITFONT.ImageText());
		CA7 = new ExtendedLabel("?       ?       ?",GameImage.CREDITFONT.ImageText());
		W7MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		W7AlexL = new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		W7RossT = new ExtendedLabel("Ross T.", GameImage.CREDITFONT.ImageText());
		W7BrandonU = new ExtendedLabel("Brandon U.", GameImage.CREDITFONT.ImageText());
		W7RehaanI= new ExtendedLabel("Rehaan I.", GameImage.CREDITFONT.ImageText());
		 
		CW8= new ExtendedLabel("Week 8", GameImage.CREDITFONT.ImageText());
		CA8= new ExtendedLabel("?       ?       ?", GameImage.CREDITFONT.ImageText());
		W8AlexL= new ExtendedLabel("Alex L.", GameImage.CREDITFONT.ImageText());
		W8MichaelK = new ExtendedLabel("Michael K.", GameImage.CREDITFONT.ImageText());
		W8AndrewK= new ExtendedLabel("Andrew K.", GameImage.CREDITFONT.ImageText());
		W8BrandonU= new ExtendedLabel("Brandon U.", GameImage.CREDITFONT.ImageText());
		W8RehaanI= new ExtendedLabel("Rehaan I.", GameImage.CREDITFONT.ImageText());
		
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
	    
	    allSprites.add(CW4);
	    allSprites.add(CA4);
	    allSprites.add(W4AlexL);
	    allSprites.add(W4AndrewK);
	    allSprites.add(W4EedanS);
	    allSprites.add(W4GlenH);
	    allSprites.add(W4JeremiahT);
	    allSprites.add(W4JosephV);
	    allSprites.add(W4KevinF);
	    allSprites.add(W4MichaelK);
	    allSprites.add(W4PierreB);
	    
	    allSprites.add(CW5);
	    allSprites.add(CA5);
	    allSprites.add(W5MichaelK);
	    allSprites.add(W5AlexL);
	    allSprites.add(W5GlenH);
	    allSprites.add(W5PierreB);
	    allSprites.add(W5AndrewK);
	    allSprites.add(W5JeremiahT);
	    allSprites.add(W5AaronO);
	    allSprites.add(W5BrandonF);
	    allSprites.add(W5AlyssaF);
	    
	    allSprites.add(CW6);
	    allSprites.add(CA6);
	    allSprites.add(W6AlexL);
	    allSprites.add(W6AlyssaF);
	    allSprites.add(W6AndrewK);
	    allSprites.add(W6BrandonF);
	    allSprites.add(W6BrandonU);
	    allSprites.add(W6GlenH);
	    allSprites.add(W6JeremiahT);
	    allSprites.add(W6MichaelK);
	    
	    allSprites.add(CW7);
	    allSprites.add(CA7);
	    allSprites.add(W7AlexL);
	    allSprites.add(W7BrandonU);
	    allSprites.add(W7MichaelK);
	    allSprites.add(W7RehaanI);
	    allSprites.add(W7RossT);
	    
	    allSprites.add(CW8);
	    allSprites.add(CA8);
	    allSprites.add(W8AlexL);
	    allSprites.add(W8AndrewK);
	    allSprites.add(W8BrandonU);
	    allSprites.add(W8MichaelK);
	    allSprites.add(W8RehaanI);
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
		W3JosephV.setPosition(Gdx.graphics.getWidth()/2 - W3JosephV.getWidth() / 3, - 1860);
		
		CW4.setPosition(Gdx.graphics.getWidth()/2 - CW4.getWidth() / 3, - 2040);
		
		CA4.setPosition(Gdx.graphics.getWidth()/2 - 40 - CA4.getWidth() / 3, - 2130);
		W4AlexL.setPosition(Gdx.graphics.getWidth()/2 - W4AlexL.getWidth() / 3, - 2190);
		W4AndrewK.setPosition(Gdx.graphics.getWidth()/2 - W4AndrewK.getWidth() / 3, - 2250);
		W4EedanS.setPosition(Gdx.graphics.getWidth()/2 - W4EedanS.getWidth() / 3, - 2310);
		W4GlenH.setPosition(Gdx.graphics.getWidth()/2 - W4GlenH.getWidth() / 3, - 2370);
		W4JeremiahT.setPosition(Gdx.graphics.getWidth()/2 - W4JeremiahT.getWidth() / 3, - 2430);
		W4JosephV.setPosition(Gdx.graphics.getWidth()/2 - W4JosephV.getWidth() / 3, - 2490);
		W4KevinF.setPosition(Gdx.graphics.getWidth()/2 - W4KevinF.getWidth() / 3, - 2550);
		W4MichaelK.setPosition(Gdx.graphics.getWidth()/2 - W4MichaelK.getWidth() / 3, - 2610);
		W4PierreB.setPosition(Gdx.graphics.getWidth()/2 - W4PierreB.getWidth() / 3, - 2670);
		
		CW5.setPosition(Gdx.graphics.getWidth()/2 - CW5.getWidth() / 3, - 2850);
		
		CA5.setPosition(Gdx.graphics.getWidth()/2 - 60 - CA5.getWidth() / 3, - 2940);
		W5AaronO.setPosition(Gdx.graphics.getWidth()/2 - W5AaronO.getWidth() / 3, - 3000);
		W5AlexL.setPosition(Gdx.graphics.getWidth()/2 - W5AlexL.getWidth() / 3, - 3060);
		W5AlyssaF.setPosition(Gdx.graphics.getWidth()/2 - W5AlyssaF.getWidth() / 3, - 3120);
		W5AndrewK.setPosition(Gdx.graphics.getWidth()/2 - W5AndrewK.getWidth() / 3, - 3180);
		W5BrandonF.setPosition(Gdx.graphics.getWidth()/2 - W5BrandonF.getWidth() / 3, - 3240);
		W5GlenH.setPosition(Gdx.graphics.getWidth()/2 - W5GlenH.getWidth() / 3, - 3300);
		W5JeremiahT.setPosition(Gdx.graphics.getWidth()/2 - W5JeremiahT.getWidth() / 3, - 3360);
		W5MichaelK.setPosition(Gdx.graphics.getWidth()/2 - W5MichaelK.getWidth() / 3, - 3420);
		W5PierreB.setPosition(Gdx.graphics.getWidth()/2 - W5PierreB.getWidth() / 3, - 3480);
		
		CW6.setPosition(Gdx.graphics.getWidth()/2 - CW6.getWidth() / 3, - 3660);
		
		CA6.setPosition(Gdx.graphics.getWidth()/2 - CA6.getWidth() / 3, - 3750);
		W6AlexL.setPosition(Gdx.graphics.getWidth()/2 - W6AlexL.getWidth() / 3, - 3810);
		W6AlyssaF.setPosition(Gdx.graphics.getWidth()/2 - W6AlyssaF.getWidth() / 3, - 3870);
		W6AndrewK.setPosition(Gdx.graphics.getWidth()/2 - W6AndrewK.getWidth() / 3, - 3930);
		W6BrandonF.setPosition(Gdx.graphics.getWidth()/2 - W6BrandonF.getWidth() / 3, - 3990);
		W6BrandonU.setPosition(Gdx.graphics.getWidth()/2 - W6BrandonU.getWidth() / 3, - 4050);
		W6GlenH.setPosition(Gdx.graphics.getWidth()/2 - W6GlenH.getWidth() / 3, - 4110);
		W6JeremiahT.setPosition(Gdx.graphics.getWidth()/2 - W6JeremiahT.getWidth() / 3, - 4170);
		W6MichaelK.setPosition(Gdx.graphics.getWidth()/2 - W6MichaelK.getWidth() / 3, - 4230);
		
		CW7.setPosition(Gdx.graphics.getWidth()/2 - CW7.getWidth() / 3, - 4410);
		
	    CA7.setPosition(Gdx.graphics.getWidth()/2 - CA7.getWidth() / 3, - 4500);
	    W7AlexL.setPosition(Gdx.graphics.getWidth()/2 - W7AlexL.getWidth() / 3, - 4560);
	    W7BrandonU.setPosition(Gdx.graphics.getWidth()/2 - W7BrandonU.getWidth() / 3, - 4620);
	    W7MichaelK.setPosition(Gdx.graphics.getWidth()/2 - W7MichaelK.getWidth() / 3, - 4680);
	    W7RehaanI.setPosition(Gdx.graphics.getWidth()/2 - W7RehaanI.getWidth() / 3, - 4740);
	    W7RossT.setPosition(Gdx.graphics.getWidth()/2 - W7RossT.getWidth() / 3, - 4800);
	
	    CW8.setPosition(Gdx.graphics.getWidth()/2 - CW8.getWidth() / 3, - 4980);
	    
	    CA8.setPosition(Gdx.graphics.getWidth()/2 - CA8.getWidth() / 3, - 5070);
	    W8AlexL.setPosition(Gdx.graphics.getWidth()/2 - W8AlexL.getWidth() / 3, - 5130);
	    W8AndrewK.setPosition(Gdx.graphics.getWidth()/2 - W8AndrewK.getWidth() / 3, - 5190);
	    W8BrandonU.setPosition(Gdx.graphics.getWidth()/2 - W8BrandonU.getWidth() / 3, - 5250);
	    W8MichaelK.setPosition(Gdx.graphics.getWidth()/2 - W8MichaelK.getWidth() / 3, - 5310);
	    W8RehaanI.setPosition(Gdx.graphics.getWidth()/2 - W8RehaanI.getWidth() / 3, - 5370);
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
		
		CW4.setPosition(CW4.getX(), CW4.getY() + scrollSpeed);
		CA4.setPosition( CA4.getX(), CA4.getY() + scrollSpeed);
		W4AlexL.setPosition(W4AlexL.getX(), W4AlexL.getY() + scrollSpeed);
		W4AndrewK.setPosition(W4AndrewK.getX(), W4AndrewK.getY() + scrollSpeed);
		W4EedanS.setPosition(W4EedanS.getX(), W4EedanS.getY() + scrollSpeed);
		W4GlenH.setPosition(W4GlenH.getX(), W4GlenH.getY() + scrollSpeed);
		W4JeremiahT.setPosition(W4JeremiahT.getX(), W4JeremiahT.getY() + scrollSpeed);
		W4JosephV.setPosition(W4JosephV.getX(), W4JosephV.getY() + scrollSpeed);
		W4KevinF.setPosition(W4KevinF.getX(), W4KevinF.getY() + scrollSpeed);
		W4MichaelK.setPosition(W4MichaelK.getX(), W4MichaelK.getY() + scrollSpeed);
		W4PierreB.setPosition(W4PierreB.getX(), W4PierreB.getY() + scrollSpeed);
		
		CW5.setPosition(CW5.getX(), CW5.getY() + scrollSpeed);
		CA5.setPosition(CA5.getX(), CA5.getY() + scrollSpeed);
		W5AaronO.setPosition(W5AaronO.getX(), W5AaronO.getY() + scrollSpeed);
		W5AlexL.setPosition(W5AlexL.getX(), W5AlexL.getY() + scrollSpeed);
		W5AlyssaF.setPosition(W5AlyssaF.getX(), W5AlyssaF.getY() + scrollSpeed);		
		W5AndrewK.setPosition(W5AndrewK.getX(), W5AndrewK.getY() + scrollSpeed);
		W5BrandonF.setPosition(W5BrandonF.getX(), W5BrandonF.getY() + scrollSpeed);
		W5JeremiahT.setPosition(W5JeremiahT.getX(), W5JeremiahT.getY() + scrollSpeed);
		W5MichaelK.setPosition(W5MichaelK.getX(), W5MichaelK.getY() + scrollSpeed);
		W5PierreB.setPosition(W5PierreB.getX(), W5PierreB.getY() + scrollSpeed);
		W5GlenH.setPosition(W5GlenH.getX(), W5GlenH.getY() + scrollSpeed);
		
		CW6.setPosition(CW6.getX(), CW6.getY() + scrollSpeed);
		CA6.setPosition(CA6.getX(), CA6.getY() + scrollSpeed);
		W6AlexL.setPosition(W6AlexL.getX(), W6AlexL.getY() + scrollSpeed);
		W6AlyssaF.setPosition(W6AlyssaF.getX(), W6AlyssaF.getY() + scrollSpeed);
		W6AndrewK.setPosition(W6AndrewK.getX(), W6AndrewK.getY() + scrollSpeed);
		W6BrandonF.setPosition(W6BrandonF.getX(), W6BrandonF.getY() + scrollSpeed);
		W6BrandonU.setPosition(W6BrandonU.getX(), W6BrandonU.getY() + scrollSpeed);
		W6GlenH.setPosition(W6GlenH.getX(), W6GlenH.getY() + scrollSpeed);
		W6JeremiahT.setPosition(W6JeremiahT.getX(), W6JeremiahT.getY() + scrollSpeed);
		W6MichaelK.setPosition(W6MichaelK.getX(), W6MichaelK.getY() + scrollSpeed);
		
		CW7.setPosition(CW7.getX(), CW7.getY() + scrollSpeed);
	    CA7.setPosition(CA7.getX(), CA7.getY() + scrollSpeed);
	    W7AlexL.setPosition(W7AlexL.getX(), W7AlexL.getY() + scrollSpeed);
	    W7BrandonU.setPosition(W7BrandonU.getX(), W7BrandonU.getY() + scrollSpeed);
	    W7MichaelK.setPosition(W7MichaelK.getX(), W7MichaelK.getY() + scrollSpeed);
	    W7RehaanI.setPosition(W7RehaanI.getX(), W7RehaanI.getY() + scrollSpeed);
	    W7RossT.setPosition(W7RossT.getX(), W7RossT.getY() + scrollSpeed);
	
	    CW8.setPosition(CW8.getX(), CW8.getY() + scrollSpeed);	
	    CA8.setPosition(CA8.getX(), CA8.getY() + scrollSpeed);
	    W8AlexL.setPosition(W8AlexL.getX(), W8AlexL.getY() + scrollSpeed);
	    W8AndrewK.setPosition(W8AndrewK.getX(), W8AndrewK.getY() + scrollSpeed);
	    W8BrandonU.setPosition(W8BrandonU.getX(), W8BrandonU.getY() + scrollSpeed);
	    W8MichaelK.setPosition(W8MichaelK.getX(), W8MichaelK.getY() + scrollSpeed);
	    W8RehaanI.setPosition(W8RehaanI.getX(), W8RehaanI.getY() + scrollSpeed);
	}
	
	@Override
	public void show() {
		super.show();
		reset();
	}

}
