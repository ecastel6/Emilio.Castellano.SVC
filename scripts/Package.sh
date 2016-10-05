#!/bin/bash 
echo -e "[INFO] Author: ecastel6 <ecastel6@gmail.com>"
echo -e "[INFO](c) MIW ETSISI"mvn clean test -Denvironment.type=develop -f $pomFile

export pomFile=../pom.xml

if [ $? -eq 0 ] ; then
	mvn package -Denvironment.type=preproduction -f $pomFile
else
    echo -e "[ERROR] ------------------------------------------------------------------------"
    echo -e "[ERROR] ------------------------------------------------------------------------"
    echo -e "[ERROR] ------------------------------------------------------------------------"
    echo -e "[ERROR] Errors found testing develop branch. Packaging Canceled"
	echo -e "[ERROR] ------------------------------------------------------------------------"
    echo -e "[ERROR] ------------------------------------------------------------------------"
    echo -e "[ERROR] ------------------------------------------------------------------------"
fi
