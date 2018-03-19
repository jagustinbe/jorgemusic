package com.jorge.music.menu;

import java.util.ArrayList;
import java.util.Iterator;

/*****************************************************************
*
*	Date: 2018
*	@author COR
*
* 	Ref: https://github.com/bethrobson/Head-First-Design-Patterns/tree/master/src/headfirst/designpatterns/composite/menu
* 
*****************************************************************/

public class MenuBuilder {

	Menu aMenu;

	// CONSTRUCTORS
	//............................................................
	
	public MenuBuilder() {
		
		buildMenu();
		
	}

	// METHODS 
	//............................................................
	
	private void buildMenu()
	{
		// The Menu
		
		this.aMenu = 
			new Menu( "Music and Life", " Appreciate the music of others through their life experiences");
		
		// Headings
		
		MenuHeading playHeading = 
			new MenuHeading (1,"Review","Music and Life playlist review");
		
		
		// Add headings to the menu
		
		aMenu.add(playHeading);
		
		
		// play menu
		
		playHeading.add( new MenuItem( 
				1,
				"List Playlists",
				"List the playlists available in the system",
				"com.jorge.music.playlist.PlaylistViewMenuItem"
				));

		playHeading.add( new MenuItem( 
				2,
				"List Music",
				"List the music available in the system",
				"com.jorge.music.music.MusicViewMenuItem"
				));
		
		playHeading.add( new MenuItem( 
				3,
				"List Users",
				"List the users in the system",
				"com.jorge.music.user.UserViewMenuItem"
				));	
	}
	
	public Menu getMenu()
	{
		return this.aMenu;
	}
	
	public void print()
	{
		this.aMenu.print();
	}
	
	public String display()
	{
		return this.aMenu.toString();
	}

}
