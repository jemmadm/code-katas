#!/bin/bash
MAVEN_HOME=$PWD/../tools/maven
export MAVEN_HOME

export MAVEN_OPTS=-XX:MaxPermSize=256m

echo MAVEN_HOME $MAVEN_HOME
echo M2_HOME $M2_HOME

$MAVEN_HOME/bin/mvn -version

$MAVEN_HOME/bin/mvn $m