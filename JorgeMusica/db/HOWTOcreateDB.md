
 ./sqlite3.exe
SQLite version 3.22.0 2018-01-22 18:45:57
Enter ".help" for usage hints.
Connected to a transient in-memory database.
Use ".open FILENAME" to reopen on a persistent database.
sqlite> .open jorgemusic.db
sqlite> .read ../db/createTables.sql
sqlite> .read ../db/insertData.sql
sqlite>