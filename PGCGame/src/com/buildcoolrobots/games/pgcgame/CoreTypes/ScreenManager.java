package com.buildcoolrobots.games.pgcgame.CoreTypes;

import java.util.ArrayList;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;

public class ScreenManager {
	private ArrayList<BaseScreen> AllScreens;
	public ScreenManager(BaseScreen... baseScreens) {
		AllScreens = new ArrayList<BaseScreen>();
		for (int i = 0; i < baseScreens.length; i++) {
			AllScreens.add(i, baseScreens[i]);
		}
	}
	public ArrayList<BaseScreen> getAllScreens() {
		return AllScreens;
	}
}
