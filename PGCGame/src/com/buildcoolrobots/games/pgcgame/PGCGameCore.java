package com.buildcoolrobots.games.pgcgame;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BGSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.DebugInputProcessor;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.*;
import com.buildcoolrobots.games.pgcgame.Screens.CreditsScreen;
import com.buildcoolrobots.games.pgcgame.Screens.GameScreen;
import com.buildcoolrobots.games.pgcgame.Screens.MainMenu;
import com.buildcoolrobots.games.pgcgame.Screens.SettingsScreen;
import com.buildcoolrobots.games.pgcgame.Screens.TitleScreen;

public class PGCGameCore extends Game {
	private OrthographicCamera camera;
	private SpriteBatch batch;

	//private DebugInputProcessor debugKeys;
	private DebugInputProcessor debugKeys;
	
	@Override
	public void create() {		
		float width = Gdx.graphics.getWidth();
		float height = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, width, height);
		batch = new SpriteBatch();
		
		loadContent();
		
		TitleScreen titleScreen = new TitleScreen(new SpriteManager(), batch, ScreenType.TITLESCREEN);
		titleScreen.setAutoSpriteBatchManager(true);
		MainMenu mainMenuScreen = new MainMenu(new SpriteManager(), batch, ScreenType.MAINMENU);
		mainMenuScreen.setAutoSpriteBatchManager(true);
		SettingsScreen settingsScreen = new SettingsScreen(new SpriteManager(), batch, ScreenType.SETTINGSSCREEN);
		settingsScreen.setAutoSpriteBatchManager(true);
		CreditsScreen creditsScreen = new CreditsScreen(new SpriteManager(), batch, ScreenType.CREDITSSCREEN);
		creditsScreen.setAutoSpriteBatchManager(true);
		GameScreen gameScreen = new GameScreen(new SpriteManager(), batch, ScreenType.GAMESCREEN);
		gameScreen.setAutoSpriteBatchManager(true);
		
		
		settingsScreen.hide();
		mainMenuScreen.hide();
		creditsScreen.hide();
		gameScreen.hide();
		
		this.setScreen(titleScreen);
		StateManager.PGC = this;
		
		//Input processor
		debugKeys = new DebugInputProcessor();		
		Gdx.input.setInputProcessor(debugKeys);		
	}

	@SuppressWarnings("unused")
	private void loadContent() {
		//Pre-load images
		for(IGameObject gameObject : ShipTypes.values()) {
			//Looping through the enum values causes type instantiation and texture load
		}
		for(IGameScreen gameScreen : ScreenType.values()) {
			//Looping through the enum values causes type instantiation and texture load
		}
		for(IGameLevel gameLevel : GameLevel.values()) {
			//Looping through the enum values causes type instantiation and texture load
		}
	}
	
	@Override
	public void dispose() {
		batch.dispose();
	}
	
	private void update() {
		//Update BGSprite - only call this method from here, not from each screen!
		BGSprite.scrollingBackgroundUpdate();			
	}
	
	private void draw() {
		//Screens are rendered and updated by the Game class
		super.render();
	}
	
	@Override
	public void render() {
		update();
		draw();
	}
	

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
