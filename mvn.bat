set M2_HOME=%CD%\tools\maven
set M2=%M2_HOME%\bin
CALL %M2%\mvn %*
IF ERRORLEVEL 1 GOTO RedBuild
IF ERRORLEVEL 0 GOTO GreenBuild

:RedBuild
color 4F
GOTO TheEnd

:GreenBuild
color 2F

:TheEnd
PAUSE
ECHO .
ECHO .
ECHO .
 
color 07
