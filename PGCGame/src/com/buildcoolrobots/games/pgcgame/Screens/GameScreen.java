package com.buildcoolrobots.games.pgcgame.Screens;

import java.util.ArrayList;
import java.util.Random;

import me.pagekite.glen3b.gjlib.ExtendedLabel;
import me.pagekite.glen3b.gjlib.SpriteManager;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseGameSprite;
import com.buildcoolrobots.games.pgcgame.CoreTypes.BaseScreen;
import com.buildcoolrobots.games.pgcgame.CoreTypes.DPad;
import com.buildcoolrobots.games.pgcgame.CoreTypes.StateManager;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameImage;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.GameLevel;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ShipTypes;
import com.buildcoolrobots.games.pgcgame.Powerups.BasePowerup;
import com.buildcoolrobots.games.pgcgame.Powerups.LifePowerup;
import com.buildcoolrobots.games.pgcgame.Powerups.ShieldPowerup;
import com.buildcoolrobots.games.pgcgame.Ships.BaseShip;
import com.buildcoolrobots.games.pgcgame.Ships.Allies.PlayerShip;
import com.buildcoolrobots.games.pgcgame.Ships.Bullets.Bullet;
import com.buildcoolrobots.games.pgcgame.Ships.Enemies.BaseEnemyShip;
import com.buildcoolrobots.games.pgcgame.Ships.Enemies.RedFighterShip;
import com.buildcoolrobots.games.pgcgame.Ships.Enemies.RedShip;
import com.buildcoolrobots.games.pgcgame.Ships.Enemies.WhiteShip;


public class GameScreen extends BaseScreen {
	Texture[] EnemyTextures = new Texture[3];
	
	public int enemyDeaths = 0;
	
	public static DPad Dpad;
	
	ArrayList<BaseEnemyShip> enemies;
	BaseShip Ship;
	BaseGameSprite FireButton;
	BaseGameSprite PauseButton;
	ExtendedLabel Score;
	ExtendedLabel xy;
	ExtendedLabel Invincibility;
	String coor = "0,0";
	ExtendedLabel CurrentLevel;
	ExtendedLabel Overheating;
	
	private int lives = 3;
	private int maxlives = 5;
	
	private ArrayList<BaseGameSprite> _livesShips; 

	private SpriteManager _allSprites;
	
	float timeSinceLastFire = 0;
	final float fireDelay = 0.150f;
	private ArrayList<BasePowerup> _AllPowerups;
	
	int energy = 100;
	float elapsedRegenRate = 0;
	//todo: make final regenRate
	float regenRate = 0.1f;
	
	private boolean isOverheating = false;
	
	float timeSinceLastEnemySpawn = 0;
	final float enemySpawnTimer = 2;

	
	public static int score = 0;

	public GameScreen(SpriteManager allSprites, SpriteBatch spriteBatch,
			ScreenType screenType) {
		super(allSprites, spriteBatch, screenType);
		
		_AllPowerups = new ArrayList<BasePowerup>();
		
		EnemyTextures[0] = ShipTypes.ENEMYDRONE1.GameTexture();
		EnemyTextures[1] = ShipTypes.ENEMYDRONE2.GameTexture();
		EnemyTextures[2] = ShipTypes.ENEMYDRONE3.GameTexture();

		enemies = new ArrayList<BaseEnemyShip>();
		Ship = new PlayerShip(new Vector2(100, Gdx.graphics.getHeight() / 2 - ShipTypes.PLAYERSHIP.GameTexture().getHeight() / 2),ShipTypes.PLAYERSHIP.GameTexture(), allSprites);
		Dpad = new DPad();
		FireButton = new BaseGameSprite(GameImage.FIREBUTTON.ImageTexture());
		PauseButton = new BaseGameSprite(GameImage.PAUSEBUTTON.ImageTexture());
		PauseButton.setPosition(Gdx.graphics.getWidth() - PauseButton.getWidth(), Gdx.graphics.getHeight() - PauseButton.getHeight());
		
		Invincibility = new ExtendedLabel("Invincibility: On", GameImage.DEBUGFONT.ImageText());
		Invincibility.setPosition(525, Gdx.graphics.getHeight() - 60);
		
		CurrentLevel = new ExtendedLabel("Level: 1", GameImage.CREDITFONT.ImageText());
		CurrentLevel.setPosition(Gdx.graphics.getWidth()/2 - CurrentLevel.getWidth()/2 - 100, Gdx.graphics.getHeight() - 50);
		CurrentLevel.setFontScale(.8f, .8f);
		
		xy = new ExtendedLabel(coor, GameImage.DEBUGFONT.ImageText());
		xy.setPosition(525, Gdx.graphics.getHeight() - 30);
		// xy.setFontScale(2,2);
		
		
		Score = new ExtendedLabel("Score: 0", GameImage.CREDITFONT.ImageText());
		Score.setPosition(Gdx.graphics.getWidth()/2 - Score.getWidth()/2 + 50, Gdx.graphics.getHeight() - 50);
		Score.setFontScale(.8f,.8f);
		
		Overheating = new ExtendedLabel("Energy: 100", GameImage.CREDITFONT.ImageText());
		Overheating.setPosition(Gdx.graphics.getWidth()/2 + 150, Gdx.graphics.getHeight() - 50);
		Overheating.setFontScale(.8f,.8f);
		
		allSprites.add(xy);
		if (StateManager.DebugData.Invincible) {
			allSprites.add(Invincibility);
		}
		allSprites.add(Ship);
		allSprites.add(Dpad);
		allSprites.add(FireButton);
		allSprites.add(PauseButton);
		allSprites.add(Score);
		allSprites.add(CurrentLevel);
		allSprites.add(Overheating);
		
		// Save allSprites reference
		_allSprites = allSprites;

		//Last, but not least - add lives!
		createLives();		
	}
	


	public void removeLives() {
		for (int i = 0; i < lives; i++) {
			_allSprites.remove(_livesShips.get(_livesShips.size() - 1));
			_livesShips.remove(_livesShips.size() - 1);

		}
	}
	
	private void createLives() {
		_livesShips = new ArrayList<BaseGameSprite>();				
		
		int lifeSpacer = 15;
		for (int i = 0; i < lives; i++) {
			BaseGameSprite life = new BaseGameSprite(ShipTypes.PLAYERSHIP.GameTexture());
			life.setScale(.2f);
			life.setOrigin(0, 0);
			life.setPosition(i * (life.getWidth() * life.getScaleX() + lifeSpacer), Gdx.graphics.getHeight() - 50);			
			
			_livesShips.add(life);
			_allSprites.add(life);
		}

		
	}

	Random randomNum = new Random();
	
	public void update(float deltaTime) {
		super.update(deltaTime);
		
		
		Overheating.setText(String.format("Energy: %d", energy));
		
		if (enemyDeaths < 10){
			StateManager.setLevel(GameLevel.LEVEL1);
		} else if (enemyDeaths >= 10 && enemyDeaths < 20) {
			StateManager.setLevel(GameLevel.LEVEL2);
		} else if (enemyDeaths >= 20 && enemyDeaths < 30) {
			StateManager.setLevel(GameLevel.LEVEL3);
		} else if (enemyDeaths >= 30 && enemyDeaths < 40) {
			StateManager.setLevel(GameLevel.LEVEL4);
		} else if (enemyDeaths >= 40 && enemyDeaths < 50) {
			StateManager.setLevel(GameLevel.LEVEL5);
		} else if (enemyDeaths >= 50) {
			StateManager.SwitchScreen(ScreenType.GAMEOVERSCREEN);
		}
		
		
		Score.setText(String.format("Score: %s", score));
		
		CurrentLevel.setText(String.format("Level: %s", StateManager.getIntLevel()));
		
		//CurrentLevel.setText(String.format("Level: %s", level));

		
		timeSinceLastFire += deltaTime;
		timeSinceLastEnemySpawn += deltaTime;

		if (timeSinceLastEnemySpawn >= enemySpawnTimer) {
			BaseEnemyShip enemy;		
			int num = randomNum.nextInt(10);
			if (num > 7) {
				enemy = new WhiteShip(new Vector2(0, 0), EnemyTextures[1], getAllSprites());
			}
			else if(num > 3) {
				enemy = new RedShip(new Vector2(0, 0), EnemyTextures[0], getAllSprites());
			}
			else
			{
				enemy = new RedFighterShip(new Vector2(0, 0), EnemyTextures[2], getAllSprites());
			}
			enemy.setPosition(Gdx.graphics.getWidth(), randomNum.nextInt(Gdx.graphics.getHeight() - 2* (int) enemy.getHeight() - (int) enemy.getHeight()) + (int) enemy.getHeight());
			enemies.add(enemy);
			enemies.get(enemies.size() - 1).xSpeed = -2*(StateManager.getLevel().Speed());
			_allSprites.add(enemy);
			timeSinceLastEnemySpawn = 0;
		}

		for (int i = 0; i < enemies.size(); i++) {
			enemies.get(i).Update();
			if (enemies.get(i).getX() + enemies.get(i).getWidth() < 0) {

				//Remove enemy that passed the edge of the screen
				_allSprites.remove(enemies.get(i));
				enemies.remove(i);
				i--;

				//Remove one life unless invincible
				if (!StateManager.DebugData.Invincible) {
					lives--;		
					removeLives();
					createLives();
				}			
				if (lives == 0) {

					StateManager.SwitchScreen(ScreenType.GAMEOVERSCREEN);
					break;
				}
			}
		}

		if (Gdx.input.isTouched()) {
			coor = "" + Gdx.input.getX() + ","
					+ (Gdx.graphics.getHeight() - Gdx.input.getY());
			xy.setText(coor + "\ndir: " + Dpad.shipDirection.toString());
		}
		
		//TODO: Move this into a separate function, and run on load and on return settings change
		if (!SettingsScreen.leftyMode) {
			FireButton.setPosition(Gdx.graphics.getWidth() - FireButton.getWidth(), 0);
		} else {
			FireButton.setPosition(0, 0);
		}


		Ship.move(Dpad.shipDirection);

		boolean isShooting = false;

		for (int i = 0; i < 2; i++) 
		{
			
			if (Gdx.input.isTouched(i)
					&& Gdx.input.getX(i) >= FireButton.getX()
					&& Gdx.input.getX(i) <= FireButton.getX() + FireButton.getWidth()
					&& Gdx.graphics.getHeight() - Gdx.input.getY(i) >= FireButton.getY()
					&& Gdx.graphics.getHeight() - Gdx.input.getY(i) <= FireButton.getY() + FireButton.getHeight()) 
			{

				if (timeSinceLastFire >= fireDelay && !isOverheating) 
				{
					Ship.shoot();
					energy--;
					
					if (energy <= 0) {
						isOverheating = true;
					}
					
					FireButton.setColor(Color.PINK);
					timeSinceLastFire = 0;
				}

				isShooting = true;
				break;
			} 
			else 
			{
				isShooting = false;
			}
			

			if (Gdx.input.isTouched(i)
					&& Gdx.input.getX(i) >= PauseButton.getX()
					&& Gdx.input.getX(i) <= PauseButton.getX() + PauseButton.getWidth()
					&& Gdx.graphics.getHeight() - Gdx.input.getY(i) >= PauseButton.getY()
					&& Gdx.graphics.getHeight() - Gdx.input.getY(i) <= PauseButton.getY() + PauseButton.getHeight()) {
				StateManager.SwitchScreen(ScreenType.PAUSESCREEN);
			}
		}

		if (!isShooting) {
			FireButton.setColor(Color.WHITE);
			isShooting = true;//useless
			isShooting = false;
			
			elapsedRegenRate += deltaTime;
			if(elapsedRegenRate >= regenRate){
				elapsedRegenRate = 0;
				
				if(energy < 100){
					energy++;
					
					if (energy >= 20) {
						isOverheating = false;
					}
				}
			}
		}
		
		
		

		if (Gdx.input.isTouched()
				&& Gdx.input.getX() >= PauseButton.getX()
				&& Gdx.input.getX() <= PauseButton.getX() + PauseButton.getWidth()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() >= PauseButton.getY()
				&& Gdx.graphics.getHeight() - Gdx.input.getY() <= PauseButton.getY() + PauseButton.getHeight()) {
			
			StateManager.SwitchScreen(ScreenType.PAUSESCREEN);
		}

		for (int i = 0; i < _AllPowerups.size(); i++) {
			if (_AllPowerups.get(i).getX() >= Gdx.graphics.getWidth()) {
				_AllPowerups.remove(i);
				i--;
			}
			else if (_AllPowerups.get(i).getX() <= Ship.getX() + Ship.getWidth()
					&& _AllPowerups.get(i).getX() + _AllPowerups.get(i).getWidth() >= Ship.getX() + Ship.getWidth()
					&& _AllPowerups.get(i).getY() <= Ship.getY() + Ship.getHeight()
					&& _AllPowerups.get(i).getY() >= Ship.getY()) {
				
				
				if(_AllPowerups.get(i).getPowerUp().PowerupName().equals("extra life"))
				{
					if (lives < maxlives) {
						lives++;
					}
					_allSprites.removeAll(_livesShips);
					createLives();
				}
				
				_allSprites.remove(_AllPowerups.get(i));
				_AllPowerups.remove(i);
				i--;
			}
		}
		
		for (int i = 0; i < enemies.size(); i++) {
			BaseEnemyShip enemy = enemies.get(i);
			for (int j = 0; j < Ship.getListBulletSize(); j++) {
				Bullet bullet = Ship.getBullet(j);
				if (bullet.getX() + bullet.getWidth() >= enemy.getX()
						&& bullet.getX() <= enemy.getX() + enemy.getWidth()
						&& bullet.getY() + bullet.getHeight() <= enemy.getY()+ enemy.getHeight()
						&& bullet.getY() >= enemy.getY()) {

					
					enemy.isShot();
					
					if (enemy.isDead()) {
						//TODO: Finish Powerups
						int powerupchance = randomNum.nextInt(3);
						if (powerupchance == 0) {
							_AllPowerups.add(new LifePowerup());
							
						} else if (powerupchance == 1) {
							_AllPowerups.add(new ShieldPowerup());
							_AllPowerups.get(_AllPowerups.size() - 1).setPosition(Ship.getX(), Ship.getX());
						}
						if (powerupchance < 2){
							_AllPowerups.get(_AllPowerups.size() - 1).setPosition(enemy.getX(), enemy.getY());

							_allSprites.add(_AllPowerups.get(_AllPowerups.size() - 1));
						}
						score += enemy.EnemyValue();
						_allSprites.remove(enemy);
						enemies.remove(enemy);
						i--;
						enemyDeaths++;				
					}
					
					Ship.removeBulletFromScreen(j);
					j--;
				}
			}
		}
		

		
		
		
		
		
	}
	
	public void Reset() { 
		_allSprites.removeAll(enemies);
		_allSprites.removeAll(_AllPowerups);
		_AllPowerups.clear();
		enemies.clear();
		Ship.clearBullets();
		Ship.setPosition(100, Gdx.graphics.getHeight() / 2 - ShipTypes.PLAYERSHIP.GameTexture().getHeight() / 2);
		timeSinceLastEnemySpawn = 0;
		score = 0;
		lives = 3;	
		StateManager.bulletEnemyHits = 0;
		StateManager.bulletsShot = 0;
		StateManager.setLevel(GameLevel.LEVEL1);
		enemyDeaths = 0;
		createLives();		
	}
}
