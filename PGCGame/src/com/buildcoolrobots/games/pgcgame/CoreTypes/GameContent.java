package com.buildcoolrobots.games.pgcgame.CoreTypes;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class GameContent {
	public static class Ships {
		Texture enemyDrone1;
		Texture enemyDrone2;
		Texture playerShip;
		
		Ships (){
			playerShip = new Texture(Gdx.files.internal("Images/PurpShipRotated"));
			enemyDrone1 = new Texture(Gdx.files.internal("Images/EnemyDrone"));
			enemyDrone2 = new Texture(Gdx.files.internal("Images/EnemyDrone2"));
		}
	}
}
