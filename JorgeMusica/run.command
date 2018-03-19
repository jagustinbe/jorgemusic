#!/bin/bash
#ref: https://stackoverflow.com/questions/59895/getting-the-source-directory-of-a-bash-script-from-within

thisDir="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# means the line is a comment

# Need to put the program into the project folder, bash puts you in your home directory
# and note target/ infront of .jar as we are in the root folder of the program
# Uncomment the lines below if you want to check the directory you are in
# if you to uncomment these then put a # on the clear command to comment it out
# or you will not see the echo's below.

# echo "Current Dir:"
# echo $thisDir

cd $thisDir
clear

### TESTING

# logging level at info default
# java -cp target/pythia-v1.jar com.jorge.music.App

# logging level at debug
# java -cp target/pythia-v1.jar com.jorge.music.App -v

# help text
# java -cp target/pythia-v1.jar com.jorge.music.App -help

# help text
# java -cp target/pythia-v1.jar com.jorge.music.App -version

# add database parameter
# java -cp target/pythia-v1.jar com.jorge.music.App -d jdbc:sqlite:database/jorgemusic.db

# mySQL locator will be jdbc:mysql://hostname:port/dbname - so we could parse out :mysql: or :sqlite: so we know which database to connect to
# - u for user, -p for password

### RUN

# logging level at debug
java -cp target/pythia-v1.jar com.jorge.music.App -v -d jdbc:sqlite:database/jorgemusic.db

echo "Press ENTER to close window ..."
read aKey
