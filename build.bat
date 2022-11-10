@echo off

call mvn clean source:jar install -Dmaven.test.skip=true

pause
