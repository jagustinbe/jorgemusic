package com.jorge.music.menu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jorge.music.App;
import com.jorge.music.music.MusicViewMenuItem;
import com.jorge.music.playlist.PlaylistViewMenuItem;
import com.jorge.music.user.UserViewMenuItem;

/*
 * This class could be used instead of the generic Factory class
 */

public class MenuItemFactory {
	
	private static Logger LOG;
	
	public MenuItemFactory() {
		LOG = LogManager.getLogger(MenuItemFactory.class);
	}

	public IExecuatable getMenuItem(String className) {
		
		if ("com.jorge.music.playlist.PlaylistViewMenuItem".equals(className)) {
			return (IExecuatable) new PlaylistViewMenuItem();
		}
		
		if ("com.jorge.music.music.MusicViewMenuItem".equals(className)) {
			return (IExecuatable) new MusicViewMenuItem();
		}
		
		if ("com.jorge.music.user.UserViewMenuItem".equals(className)) {
			return (IExecuatable) new UserViewMenuItem();
		}
		
		// for each menu item take a copy of an if line above change the class it is looking for
		// and the class to use
		
		
		// this catches deliberetly undefined menu items and errors
		
		if ("com.jorge.music.playlist.UndefinedMenuItem".equals(className)) {
			return (IExecuatable) new UndefinedMenuItem();
		}
		else
		{
			LOG.error("Undefined class requested" + className);
			return (IExecuatable) new UndefinedMenuItem();
		}
		
	}

}
