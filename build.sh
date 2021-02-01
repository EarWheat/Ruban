#!/bin/bash
export JAVA_HOME=/usr/local/jdk1.8.0_65
export PATH=$JAVA_HOME/bin:$PATH
mvn clean package -Dmaven.test.skip=true
ret=$?
if [ $ret -ne 0 ];then
    echo "===== maven build failure ====="
    exit $ret
else
    echo -n "===== maven build successfully! ====="
fi

cd ./ruban-backend/target/
mv ruban-backend-1.0-SNAPSHOT.war  /home/liuzhaolu/tomcat/tomcat8/webapps
cp control.sh /home/liuzhaolu/tomcat/tomcat8/webapps

