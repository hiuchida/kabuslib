@echo off

mvn clean source:jar install -Dmaven.test.skip=true
