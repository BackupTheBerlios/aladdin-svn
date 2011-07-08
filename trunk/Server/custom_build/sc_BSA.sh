#!/bin/sh

rm -rf StorageComponent
svn export https://svn.berlios.de/svnroot/repos/aladdin/trunk/Server/StorageComponent StorageComponent
cd StorageComponent/

rm -f src/com/aladdin/sc/config/Configuration.java
echo "package com.aladdin.sc.config;" >> src/com/aladdin/sc/config/Configuration.java
echo "public class Configuration {" >> src/com/aladdin/sc/config/Configuration.java
echo "public static String hibernateCfg = \"/hibernate-aladdin-sc-bsa.cfg.xml\";" >> src/com/aladdin/sc/config/Configuration.java
echo "public static String forumSC = \"http://dafnis.atosorigin.es/BSA/Aladdin/includes/sc.php\";" >> src/com/aladdin/sc/config/Configuration.java
echo "public static String trustedIP[] = {\"193.174.152.114\", \"127.0.0.1\"};" >> src/com/aladdin/sc/config/Configuration.java
echo "}" >> src/com/aladdin/sc/config/Configuration.java

cat ./src/com/aladdin/raac/RaacStub.java|sed 's/http:\/\/193.174.152.114:8080\/axis2\/services\/raac\//http:\/\/193.174.152.114:8080\/axis2\/services\/raacBSA\//' > tmp
mv tmp ./src/com/aladdin/raac/RaacStub.java

cat build.xml |sed 's/<property name="name" value="StorageComponent"\/>/<property name="name" value="SCBSA"\/>/' > tmp
mv tmp build.xml

cat resources/services.xml|sed 's/<service name="StorageComponent">/<service name="SCBSA">/' > tmp
mv tmp resources/services.xml

cat resources/StorageComponent.wsdl|sed 's/<wsdl:service name="StorageComponent">/<wsdl:service name="SCBSA">/' > tmp
mv tmp resources/StorageComponent.wsdl

cat ./src/com/aladdin/raac/RaacStub.java|sed 's/http:\/\/193.174.152.114:8080\/axis2\/services\/raac\//http:\/\/127.0.0.1:8080\/axis2\/services\/raacBSA\//' > tmp
mv tmp ./src/com/aladdin/raac/RaacStub.java

ant
mv build/lib/*.aar ..
cd ..
