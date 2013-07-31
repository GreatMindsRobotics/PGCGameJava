package com.buildcoolrobots.games.pgcgame;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.ExtendedSprite;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.*;
import com.buildcoolrobots.games.pgcgame.Screens.TitleScreen;

public class PGCGameCore implements ApplicationListener {
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

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);	
		
		batch.setProjectionMatrix(camera.combined);
				
		batch.begin();
		batch.end();
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
