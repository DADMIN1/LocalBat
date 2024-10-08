# LocalBat
A webscraper for codingbat (https://codingbat.com) that generates Java files for local/offline use.

# How to setup (in Eclipse IDE)
## 1) Create a new workspace
  When you open Eclipse, simply rewrite the path to 'localBat-workspace' or something similar.
  
  It will create a directory for that workspace if it doesn't exist.
  
  You can achieve the same thing from the 'switch workspace' prompt.

## 2) Create a new java project
  Uncheck the option to 'Create module-info.java file', then hit 'Finish'

## 3) Copy the files into the project
  Locate the 'src' directory of the newly created project. (e.g. "localBat-workspace/localBat/src/")
  
  Copy everything under '<a href=https://github.com/DADMIN1/LocalBat/tree/master/savedir/javaFiles>savedir/javaFiles/</a>' into the 'src' directory.

## 4) Hit F5
  Go back to Eclipse and check to see if the project has been populated with the files.
  
  If not, refresh it once or twice by hitting 'F5'

## 5) Disable launch errors
  Pick any file and write in a solution.

  Run the file (CTRL+F11), and a popup will appear asking for confirmation: "Errors exist in required projects: localBat"

  This warning will always appear because all of the unsolved problems in other files lack a return statement.

  The warning is irrelevant because each file runs independently. 
  Check the box to 'Always launch without asking' to avoid this annoyance.

Setup is now complete.
