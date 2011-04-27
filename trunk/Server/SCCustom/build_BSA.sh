#!/bin/sh

rm -rf StorageComponent
svn export svn://svn.berlios.de/aladdin/trunk/Server/StorageComponent StorageComponent
rm -f StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "package com.aladdin.sc.config;" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public class Configuration {" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public String hibernateCfg = \"/hibernate-aladdin-sc-bsa.cfg.xml\";" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public String forumSC = \"http://dafnis.atosorigin.es/BSA/Aladdin/includes/sc.php\";" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "}" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
cd StorageComponent/
cat build.xml |sed 's/<property name="name" value="StorageComponent"\/>/<property name="name" value="SCBSA"\/>/' > tmp
mv tmp build.xml
cat resources/services.xml|sed 's/<service name="StorageComponent">/<service name="SCBSA">/' > tmp
mv tmp resources/services.xml
cat resources/StorageComponent.wsdl|sed 's/<wsdl:service name="StorageComponent">/<wsdl:service name="SCBSA">/' > tmp
mv tmp resources/StorageComponent.wsdl
ant
mv build/lib/*.aar ..
cd ..
