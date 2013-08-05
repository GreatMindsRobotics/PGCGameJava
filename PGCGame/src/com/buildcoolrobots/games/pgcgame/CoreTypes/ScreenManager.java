package com.buildcoolrobots.games.pgcgame.CoreTypes;

import java.util.ArrayList;

import com.buildcoolrobots.games.pgcgame.CoreTypes.Enums.ScreenType;

public class ScreenManager {
	private ArrayList<BaseScreen> _allScreens;
	
	public ScreenManager(BaseScreen... baseScreens) {
		_allScreens = new ArrayList<BaseScreen>();
		for (int i = 0; i < baseScreens.length; i++) {
			_allScreens.add(i, baseScreens[i]);
		}
	}
	
	public ArrayList<BaseScreen> getAllScreens() {
		return _allScreens;
	}
	
	public BaseScreen getScreen(ScreenType screenType){
		for(BaseScreen screen : _allScreens) {
			if(screen.getScreenType() == screenType) {
				return screen;
			}
		}
		return null;
	}
	
	public void setScreen(BaseScreen screen) {
		_allScreens.add(screen);
	}
}
