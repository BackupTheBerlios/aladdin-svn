#!/bin/sh

rm -rf WebGUI
svn export https://svn.berlios.de/svnroot/repos/aladdin/trunk/Server/WebGUI-maven WebGUI
cd WebGUI
echo "storagecomponent.uri = http://127.0.0.1/axis2/services/SCBSA/" > src/main/resources/webgui.properties
echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Context antiJARLocking=\"true\" path=\"/WebGUIBSA\"/>" > src/main/webapp/META-INF/context.xml
cat pom.xml|sed 's/<finalName>WebGUI<\/finalName>/<finalName>WebGUIBSA<\/finalName>/' > tmp
mv tmp pom.xml
mvn package
cd ..
cp WebGUI/target/WebGUIBSA.war .
