#!/bin/sh

rm -rf StorageComponent
svn export svn://svn.berlios.de/aladdin/trunk/Server/StorageComponent StorageComponent
rm -f StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "package com.aladdin.sc.config;" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public class Configuration {" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public String hibernateCfg = \"/hibernate-aladdin-sc-bsa.cfg.xml\";" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "public String forumSC = \"http://dafnis.atosorigin.es/BSA/Aladdin/includes/sc.php\";" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
echo "}" >> StorageComponent/src/com/aladdin/sc/config/Configuration.java
cp build_BSA.xml StorageComponent/build.xml
cd StorageComponent/
ant
mv build/lib/*.aar ..
cd ..
