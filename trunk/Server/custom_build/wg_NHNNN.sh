#!/bin/sh

rm -rf WebGUI
svn export https://svn.berlios.de/svnroot/repos/aladdin/trunk/Server/WebGUI WebGUI
cd WebGUI
echo "storagecomponent.uri = http://127.0.0.1/axis2/services/SCNHNN/" > src/main/resources/webgui.properties
echo "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Context antiJARLocking=\"true\" path=\"/WebGUINHNN\"/>" > src/main/webapp/META-INF/context.xml
cat pom.xml|sed 's/<finalName>WebGUI<\/finalName>/<finalName>WebGUINHNN<\/finalName>/' > tmp
mv tmp pom.xml
mvn package
cd ..
cp WebGUI/target/WebGUINHNN.war .
