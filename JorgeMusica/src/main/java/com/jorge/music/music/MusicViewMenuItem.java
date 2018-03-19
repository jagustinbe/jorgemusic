package com.jorge.music.music;

import java.util.Scanner;

import com.jorge.music.data.DataManagerSQLite;
import com.jorge.music.menu.ConsoleControls;
import com.jorge.music.menu.IExecuatable;
import com.jorge.music.user.UserConsoleListView;
import com.jorge.music.user.UserController;
import com.jorge.music.user.UserDAO;

public class MusicViewMenuItem implements IExecuatable {

	Scanner input = new Scanner(System.in);
	 
	public MusicViewMenuItem() {}

	@Override
	public void execute() {
		
		MusicDAO model = new MusicDAO( DataManagerSQLite.getInstance() );
		MusicConsoleListView view = new MusicConsoleListView();
		MusicController controller = new MusicController( view, model);
		controller.display();
	}

}
