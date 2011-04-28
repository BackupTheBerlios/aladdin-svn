#!/bin/sh

rm -rf raac
svn export svn://svn.berlios.de/aladdin/trunk/Server/raac raac
cd raac

cat ./src/com/aladdin/sc/StorageComponentStub.java|sed 's/http:\/\/193.174.152.114:8080\/axis2\/services\/StorageComponent\//http:\/\/193.174.152.114:8080\/axis2\/services\/SCDAFNI\//'>tmp
mv tmp ./src/com/aladdin/sc/StorageComponentStub.java

cat build.xml |sed 's/<property name="name" value="raac"\/>/<property name="name" value="raacDAFNI"\/>/' > tmp
mv tmp build.xml

cat resources/services.xml|sed 's/<service name="raac">/<service name="raacDAFNI">/' > tmp
mv tmp resources/services.xml

cat resources/raac.wsdl|sed 's/<wsdl:service name="raac">/<wsdl:service name="raacDAFNI">/' > tmp
mv tmp resources/raac.wsdl

ant
mv build/lib/*.aar ..
cd ..
