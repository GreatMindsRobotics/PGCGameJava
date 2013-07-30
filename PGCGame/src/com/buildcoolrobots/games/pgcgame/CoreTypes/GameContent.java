package com.buildcoolrobots.games.pgcgame.CoreTypes;

import java.util.EnumMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.*;

public class GameContent {
	private static GameContent _gameAssets = new GameContent();
	
	private GameContent()  {			
		_images = this.new Images();		
		_gameAssets = this;
	}
	
	public static GameContent GameAssets() {
		return _gameAssets;
	}
	
	private Images _images;	
	public Images Images() {
		return _images;
	}
	
	public class Images {
		public Images() {
			_ships = this.new Ships();
		}
		
		private Ships _ships;
		public Ships Ships() {
			return _ships;
		}
		
		public class Ships {
			public Ships() {
				_ships = new EnumMap<ShipTypes, Texture>(ShipTypes.class);
				
				_ships.put(ShipTypes.PLAYERSHIP, new Texture(Gdx.files.internal("Images/PurpShipRotated.png")));
				_ships.put(ShipTypes.ENEMYDRONE1, new Texture(Gdx.files.internal("Images/EnemyDrone.png")));
				_ships.put(ShipTypes.ENEMYDRONE2, new Texture(Gdx.files.internal("Images/EnemyDrone2.png")));
			}
			
			private EnumMap<ShipTypes, Texture> _ships;

			public final Texture Bullet = new Texture(Gdx.files.internal("Images/SingleBullet.png"));			
			
			public Texture Ship(ShipTypes ship) {
				return _ships.get(ship);
			}
		}		
	}	
}
