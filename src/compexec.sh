#!/bin/bash
find -name "*.java" > source.txt
javac -d build @source.txt
java -cp .:build:**/*.class application.App

