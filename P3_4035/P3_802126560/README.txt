README:

In order to compile and run this program you must have installed the JDR and the JDK.

Ubuntu(Linux)

1. Open Terminal window
2. Find the location where your package classes are by typing cd %PATH%\%PROJECTPATH%\src\
3. Type javac %PATH%\%PROJECTPATH%\src\Class.java for the class you want to compile
that is inside the src folder of your project package.
4. If it doesnt show any errors type java %PATH%\%PROJECTPATH%\src\Class with out any file extension
5. Program should run perfectly

Windows

1. Open Command Prompt window as Administrator
2. Write the location you have your project classes cd C:\%PATH%\%PROJECTPATH%\src\
3. Set the path of the JDK to the actual path 
by writing the following: set path=%path%;C:\Program Files\Java\jdkX.X.X_XX\bin where
X represents your version of the JDK
example: set path=%path%;C:\Program Files\Java\jdk1.8.0_71\bin
4.Type set classpath=\%PATH%\%PROJECTPATH%\src\
example: set classpath=C:\Users\Daniel\workspace\P3_802126560\src
5. Type javac \%PATH%\%PROJECTPATH%\src\Main.java for the class you want to compile
that is inside the src folder of your project package. 
ex: javac C:\Users\Daniel\workspace\P3_802126560\src\Main.java
6. If it doesnt show any errors type java Main with out any file extension and with an addtional argument if its loading a file.
7. Program should run perfectly

JAVA DIDNT LET ME ACCESS ELECTION DATA FROM OUTSIDE SRC SO I PLACED DOUBLE DOTS("../") IN EVERY FILE PATH FOR IT TO WORK. CLASSPATH IN
WINDOWS WASNT WORKING EITHER TO SOLVE THIS PROBLEM.

