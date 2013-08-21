package com.buildcoolrobots.games.pgcgame.CoreTypes;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Buttons;
import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.DPadDirection;
import com.buildcoolrobots.games.pgcgame.Screens.GameScreen;

import me.pagekite.glen3b.gjlib.KeysTracker;

public class DebugInputProcessor extends KeysTracker {
	@Override
	public boolean keyDown(int key) {
		super.keyDown(key);
		
		if(StateManager.DebugData.AllowScreenSwitching) {
			if(key >= Input.Keys.F1 && key <= Input.Keys.F12) {
				StateManager.SwitchScreen(key);
			}
		}
		
		if (StateManager.DebugData.KeyboardControlEnabled) {
			if(key == Input.Keys.W) {
				switch(GameScreen.Dpad.debugShipDirection) {
				case EAST:
				case NORTHEAST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NORTHEAST;
					break;
				
				case WEST:
				case NORTHWEST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NORTHWEST;
					break;
					
				default:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NORTH;
					break;
				}
			}
			if(key == Input.Keys.A) {
				switch(GameScreen.Dpad.debugShipDirection) {
				case NORTH:
				case NORTHWEST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NORTHWEST;
					break;
				
				case SOUTH:
				case SOUTHWEST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.SOUTHWEST;
					break;
					
				default:
					GameScreen.Dpad.debugShipDirection = DPadDirection.WEST;
					break;
				}
			}
			if(key == Input.Keys.S) {
				switch(GameScreen.Dpad.debugShipDirection) {
				case WEST:
				case SOUTHWEST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.SOUTHWEST;
					break;
				
				case EAST:
				case SOUTHEAST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.SOUTHEAST;
					break;
					
				default:
					GameScreen.Dpad.debugShipDirection = DPadDirection.SOUTH;
					break;
				}			}
			if(key == Input.Keys.D) {
				switch(GameScreen.Dpad.debugShipDirection) {
				case NORTH:
				case NORTHEAST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NORTHEAST;
					break;
				
				case SOUTH:
				case SOUTHEAST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.SOUTHEAST;
					break;
					
				default:
					GameScreen.Dpad.debugShipDirection = DPadDirection.EAST;
					break;
				}
			}


		}		
		
		return true;		
	}

	@Override
	public boolean keyUp(int key) {
		if (StateManager.DebugData.KeyboardControlEnabled) {
			//if(key == Input.Keys.W || key == Input.Keys.A || key == Input.Keys.S || key == Input.Keys.D) {
			//	GameScreen.Dpad.debugShipDirection = DPadDirection.NONE;	
			//}
			if (key == Input.Keys.W){
				switch(GameScreen.Dpad.debugShipDirection) {
				case NORTHWEST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.WEST;
					break;
					
				case NORTHEAST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.EAST;
					break;
					
				default:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NONE;
					break;
				}
			}
			if (key == Input.Keys.A){
				switch(GameScreen.Dpad.debugShipDirection) {
				case NORTHWEST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NORTH;
					break;
					
				case SOUTHWEST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.SOUTH;
					break;
					
				default:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NONE;
					break;
				}
			}
			if (key == Input.Keys.S){
				switch(GameScreen.Dpad.debugShipDirection) {
				case SOUTHWEST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.WEST;
					break;
					
				case SOUTHEAST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.EAST;
					break;
					
				default:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NONE;
					break;
				}
			}
			if (key == Input.Keys.D){
				switch(GameScreen.Dpad.debugShipDirection) {
				case NORTHEAST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NORTH;
					break;
					
				case SOUTHEAST:
					GameScreen.Dpad.debugShipDirection = DPadDirection.SOUTH;
					break;
					
				default:
					GameScreen.Dpad.debugShipDirection = DPadDirection.NONE;
					break;
				}
			}
		}				
		
		return false;		
	}
	
	
	@Override
	public boolean touchDown(int x, int y, int eventPointer, int button) {
		super.touchDown(x, y, eventPointer, button);
		
		//Allow screen switching on Android device via top-left corner touch
		if(x < 25 && y < 25 && button == Buttons.LEFT) {
			StateManager.SwitchNextScreen();
		}
		
		return true;		
	}
}
