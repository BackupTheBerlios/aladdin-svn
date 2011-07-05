#!/bin/sh

rm -rf StorageComponent
svn export svn://svn.berlios.de/aladdin/trunk/Server/StorageComponent StorageComponent
rm -f StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "package com.aladdin.sc.config;" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public class Configuration {" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public String hibernateCfg = \"/hibernate-aladdin-sc-dafni.cfg.xml\";" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public String forumSC = \"http://dafnis.atosorigin.es/DAFNI/Aladdin/includes/sc.php\";" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public static String trustedIP[] = {\"193.174.152.114\", \"127.0.0.1\"};" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "}" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
cd StorageComponent/

cat build.xml |sed 's/<property name="name" value="StorageComponent"\/>/<property name="name" value="SCDAFNI"\/>/' > tmp
mv tmp build.xml

cat resources/services.xml|sed 's/<service name="StorageComponent">/<service name="SCDAFNI">/' > tmp
mv tmp resources/services.xml

cat resources/StorageComponent.wsdl|sed 's/<wsdl:service name="StorageComponent">/<wsdl:service name="SCDAFNI">/' > tmp
mv tmp resources/StorageComponent.wsdl

cat ./src/com/aladdin/raac/RaacStub.java|sed 's/http:\/\/193.174.152.114:8080\/axis2\/services\/raac\//http:\/\/127.0.0.1:8080\/axis2\/services\/raacDAFNI\//' > tmp
mv tmp ./src/com/aladdin/raac/RaacStub.java

ant
mv build/lib/*.aar ..
cd ..
