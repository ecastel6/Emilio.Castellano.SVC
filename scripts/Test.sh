#!/bin/bash 
echo -e "[INFO] Author: ecastel6 <ecastel6@gmail.com>"
echo -e "[INFO] (c) MIW ETSISI"
export pomfile=../pom.xml
mvn clean test -Denvironment.type=develop -f $pomfile
