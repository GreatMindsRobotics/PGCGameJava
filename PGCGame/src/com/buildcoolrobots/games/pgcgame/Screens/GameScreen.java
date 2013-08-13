package com.buildcoolrobots.games.pgcgame.Screens;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SimpleSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.DPad;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.DPadDirection;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;

public class GameScreen extends BaseScreen {

	ExtendedSprite Ship;
	ExtendedSprite FireButton;
	DPad Dpad;
	ExtendedLabel xy;
	String coor = "0,0";
	public GameScreen(SpriteManager allSprites, SpriteBatch spriteBatch, ScreenType screenType) {
		super(allSprites, spriteBatch, screenType);
		
		Ship = new ExtendedSprite(ShipTypes.PLAYERSHIP.GameTexture());
		Ship.setPosition(100, Gdx.graphics.getHeight()/2 - Ship.getHeight()/2);
		Dpad = new DPad();
		FireButton = new ExtendedSprite(GameImage.FIREBUTTON.ImageTexture());
		
		xy = new ExtendedLabel(coor , GameImage.DEBUGFONT.ImageText());
		xy.setPosition(Gdx.graphics.getWidth() - 150, 50);
		//xy.setFontScale(2,2);
		
		allSprites.add(xy);
		allSprites.add(Ship);
		allSprites.add(Dpad);
		allSprites.add(FireButton);
	}
	
	private boolean lastTouch = false;
	public void update(float deltaTime) {
		super.update(deltaTime);

		if (Gdx.input.isTouched()) {
			coor = "" + Gdx.input.getX() + "," + (Gdx.graphics.getHeight() - Gdx.input.getY());
			xy.setText(coor + "\ndir: " + Dpad.shipDirection.toString());
			
			if (!SettingsScreen.leftyMode) {
				Dpad.setPosition(0, 0);
				FireButton.setPosition(Gdx.graphics.getWidth() - FireButton.getWidth(),0);
			} else {
				Dpad.setPosition(Gdx.graphics.getWidth() - Dpad.getWidth(), 0);
				FireButton.setPosition(0, 0);
			}
			
	        
		}
		
		//Ben's borked movement.
		switch(DPad.shipDirection){
		case NONE:{
			Ship.xSpeed = 0;
			Ship.ySpeed = 0;
			break;
		}
		case NORTH:{
			if(Ship.getY() + Ship.getHeight() < Gdx.graphics.getHeight())
			{
        	 Ship.ySpeed = 5;
			}
			else{
				Ship.ySpeed = 0;
			}
			Ship.xSpeed = 0;
        	break;
        }
		case NORTHEAST:{
			if(Ship.getX() + Ship.getTexture().getWidth() < Gdx.graphics.getWidth()){
				Ship.xSpeed = 5;
			}
			else
			{
				Ship.xSpeed = 0;
			}
			if(Ship.getY()+ Ship.getTexture().getHeight() < Gdx.graphics.getHeight()){
				Ship.ySpeed = 5;
			}
			else{
				Ship.ySpeed = 0;
			}
			
			break;
		}
		case EAST:{
			if(Ship.getX() + Ship.getTexture().getWidth() < Gdx.graphics.getWidth()){
				Ship.xSpeed = 5;
			}
			else{
				Ship.xSpeed = 0;
			}
        	
        	Ship.ySpeed = 0;
        	break;
        }
		case SOUTHEAST:{
			if(Ship.getX() + Ship.getTexture().getWidth() < Gdx.graphics.getWidth()){
				Ship.xSpeed = 5;
			}
			else{
				Ship.xSpeed = 0;
			}
			if(Ship.getY() > 0){
				Ship.ySpeed = -5;

			}
			else{
				Ship.ySpeed = 0;
			}
		    break;
		}
		case SOUTH:{
			if(Ship.getY() > 0){
				Ship.ySpeed = -5;
			}
			else{
				Ship.ySpeed = 0;
			}
			Ship.xSpeed = 0;
			break;
		}
		case SOUTHWEST:{
			if(Ship.getX() > 0){
				Ship.xSpeed = -5;
			}
			else{
				Ship.xSpeed = 0;
			}
			if(Ship.getY()  > 0){
				Ship.ySpeed = -5;
			}
			else{
				Ship.ySpeed = 0;
			}
			
			break;
		}
		case WEST:{
		if(Ship.getX() > 0){
			Ship.xSpeed = -5;
		}
		else{
			Ship.xSpeed = 0;
		}
			
			Ship.ySpeed = 0;
			break;
		}
		case NORTHWEST:{
			if(Ship.getX() > 0){
				Ship.xSpeed = -5;
			}
			else{
				Ship.xSpeed = 0;
			}
			if(Ship.getY() + Ship.getHeight() < Gdx.graphics.getHeight()){
					Ship.ySpeed = 5;
			}
			else{
				Ship.ySpeed = 0;
			}
		
			break;
		}
		}
		
		
		if (Gdx.input.isTouched() &&
			Gdx.input.getX() >= FireButton.getX() && Gdx.input.getX() <= FireButton.getX() + FireButton.getWidth() &&
			Gdx.graphics.getHeight() - Gdx.input.getY() >= FireButton.getY() && Gdx.graphics.getHeight() - Gdx.input.getY() <= FireButton.getY() + FireButton.getHeight() && !lastTouch) {
			//for debug purposes
			Gdx.app.error("MEE LIYK", "POOTAYTOHS");
			
			lastTouch = true;
		}
		if (!Gdx.input.isTouched()) {
			lastTouch = false;
		}
	}
}