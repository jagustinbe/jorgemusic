package com.jorge.music.playlist;

import java.util.Scanner;

import com.jorge.music.menu.ConsoleControls;
import com.jorge.music.menu.IExecuatable;

public class PlaylistViewMenuItem implements IExecuatable {

	Scanner input = new Scanner(System.in);
	 
	public PlaylistViewMenuItem() {}

	@Override
	public void execute() {
		
		System.out.println( ConsoleControls.ANSI_YELLOW_BRIGHT + "... PLAYLIST VIEWER ..." + ConsoleControls.ANSI_RESET);
		System.out.println("\n" + PlaylistViewMenuItem.class.getName() + " has no MVC implementation.");
        System.out.println(" \n Press enter return to the main menu");
		this.input.nextLine();
	}
}
