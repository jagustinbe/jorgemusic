CREATE TABLE User
(
	userID			integer		    not null	PRIMARY KEY AUTOINCREMENT,
	userName			varchar(100)	not null,
	userEmail		varchar(100)	not null,
	userRole			varchar(20)	not null,
	userToken		varchar(100)	not null,
	userStatus		integer	not null,
	userLastUpdate	text not null
);

CREATE TABLE UserMusic
(
	userMusicID		integer	not null PRIMARY KEY AUTOINCREMENT,
	userID			integer not null,
	listName		varchar(255) null,
	description		TEXT null, -- description	of	the	list
	theme			varchar(255) null,
	motivation		varchar(255) null, -- explaining	their	overall	motivation	of	creating	this	list
	significance 	varchar(255) null, -- its	significance	to	them	or	its	musical	significance	
	FOREIGN KEY (userID) REFERENCES User(userID) --Foreign key from user table
);

CREATE TABLE Music
(
	musicID 			integer	not null PRIMARY KEY AUTOINCREMENT,
	userMusciId			integer not null,
	songName			varchar(255) null,
	artist				varchar(150) null,
	yearPublished		datetime,
	songUrl				varchar(255) null,
	description 		TEXT null,-- description	regarding	the	song
	why 				varchar(255) null,-- why	this	song	is	in	the	list reflecting	back	to	the	theme	of	the	list.	
	parentAnotation		varchar(255) null,
	FOREIGN KEY (userMusciId) REFERENCES UserMusic(userMusciId)	--foreign key from UserMusic table
);