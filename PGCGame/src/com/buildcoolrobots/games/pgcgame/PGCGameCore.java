package com.buildcoolrobots.games.pgcgame;

import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BGSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.*;
import com.buildcoolrobots.games.pgcgame.Screens.CreditsScreen;
import com.buildcoolrobots.games.pgcgame.Screens.MainMenu;
import com.buildcoolrobots.games.pgcgame.Screens.SettingsScreen;
import com.buildcoolrobots.games.pgcgame.Screens.TitleScreen;

public class PGCGameCore extends Game {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	
	@Override
	public void create() {		
		float width = Gdx.graphics.getWidth();
		float height = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, width, height);
		batch = new SpriteBatch();
		
		loadContent();
				
		
		
		TitleScreen titleScreen = new TitleScreen(new SpriteManager(), batch, ScreenType.TITLESCREEN);
		MainMenu mainMenuScreen = new MainMenu(new SpriteManager(), batch, ScreenType.MAINMENU);
		SettingsScreen settingsScreen = new SettingsScreen(new SpriteManager(), batch, ScreenType.SETTINGSSCREEN);
		CreditsScreen creditsScreen = new CreditsScreen(new SpriteManager(), batch, ScreenType.CREDITSSCREEN);
		
		settingsScreen.hide();
		mainMenuScreen.hide();
		creditsScreen.hide();
		
		this.setScreen(titleScreen);
		
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
		//Update all created screens; if screen is not active, it is the screen's responsibility to not run update unnecessarily
		BGSprite.scrollingBackgroundUpdate();
		
		for(BaseScreen screen : StateManager.AllScreens.getAllScreens()) {
			screen.update(Gdx.graphics.getDeltaTime());
		}

		//NOTE: Using this.setScreen increases background scrolling speed
		if(StateManager.DebugData.AllowScreenSwitching) {
			if(Gdx.input.isKeyPressed(Input.Keys.F1)) {
				//this.setScreen(StateManager.AllScreens.getScreen(ScreenType.TITLESCREEN));
				StateManager.SwitchScreen(ScreenType.TITLESCREEN);
			} else if (Gdx.input.isKeyPressed(Input.Keys.F2)) {
				//this.setScreen(StateManager.AllScreens.getScreen(ScreenType.MAINMENU));
				StateManager.SwitchScreen(ScreenType.MAINMENU);
			} else if (Gdx.input.isKeyPressed(Input.Keys.F3)) {
				//this.setScreen(StateManager.AllScreens.getScreen(ScreenType.SETTINGSSCREEN));
				StateManager.SwitchScreen(ScreenType.SETTINGSSCREEN);
			} else if (Gdx.input.isKeyPressed(Input.Keys.F4)) {
				//this.setScreen(StateManager.AllScreens.getScreen(ScreenType.CREDITSSCREEN));
				StateManager.SwitchScreen(ScreenType.CREDITSSCREEN);
			}
		}		
	}
	
	private void draw() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);	
		
		batch.setProjectionMatrix(camera.combined);		
			
		batch.begin();		

		//Update all created screens; if screen is not active, it is the screen's responsibility to not run update unnecessarily
		for(BaseScreen screen : StateManager.AllScreens.getAllScreens()) {
			screen.draw();
		}
		
		batch.end();
		
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
