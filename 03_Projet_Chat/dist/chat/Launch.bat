@echo off

java -jar chat.jar
start chrome %cd%\Chat_lib\chatSUS.txt

pause