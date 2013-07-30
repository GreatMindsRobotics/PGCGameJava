package com.buildcoolrobots.games.pgcgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.*;
import com.buildcoolrobots.games.pgcgame.CoreTypes.GameContent;

public class PGCGameCore implements ApplicationListener {
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private Sprite sprite;
		
	@Override
	public void create() {		
		float width = Gdx.graphics.getWidth();
		float height = Gdx.graphics.getHeight();
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, width, height);
		batch = new SpriteBatch();
		
		loadContent();
		
		sprite = new Sprite(GameContent.GameAssets().Images().Ships().Ship(ShipTypes.PLAYERSHIP));
		sprite = new Sprite(ShipTypes.PLAYERSHIP.GameTexture());
		
		
		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);

		sprite.setPosition(width / 2, height / 2);
	}

	@SuppressWarnings("unused")
	private void loadContent() {
		//Pre-load images
		for(IGameObject gameObject : ShipTypes.values()) {
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
		sprite.draw(batch);
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
