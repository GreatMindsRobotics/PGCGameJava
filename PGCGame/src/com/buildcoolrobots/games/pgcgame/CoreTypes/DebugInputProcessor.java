package com.buildcoolrobots.games.pgcgame.CoreTypes;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Buttons;

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
	
		return true;		
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
