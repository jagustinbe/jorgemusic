insert into User ( userName, userEmail, userRole, userToken, userStatus, userLastUpdate ) 
values  ('Jorge Benitez', 'j_agustinbe@hotmail.com', 'admin', 'token', '1', datetime('now'));

insert into UserMusic(userID,listName,description, theme,motivation,significance)values(1,'Jorges list','Music list of Jorge','A list with my favorite songs','songs I like','Best songs ever');

insert into Music(userMusciId,songName,artist,yearPublished,songUrl,description,why,parentAnotation)
values(1,'November Rain','Guns and roses','1991-11-11','https://www.youtube.com/watch?v=8SbUC-UaAxE','Love song','Close to my heart','best song');

insert into Music(userMusciId,songName,artist,yearPublished,songUrl,description,why,parentAnotation)
values(1,'Master of Puppets','Metallica','1988-02-02','https://www.youtube.com/watch?v=xnKhsTXoKCI','Heavy','Powerfull','beautifull');