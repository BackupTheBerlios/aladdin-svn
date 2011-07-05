#!/bin/sh

rm -rf raac
svn export https://svn.berlios.de/svnroot/repos/aladdin/trunk/Server/raac raac
cd raac

cat ./src/com/aladdin/sc/StorageComponentStub.java|sed 's/http:\/\/193.174.152.114:8080\/axis2\/services\/StorageComponent\//http:\/\/127.0.0.1:8080\/axis2\/services\/SCBSA\//'>tmp
mv tmp ./src/com/aladdin/sc/StorageComponentStub.java

cat build.xml |sed 's/<property name="name" value="raac"\/>/<property name="name" value="raacBSA"\/>/' > tmp
mv tmp build.xml

cat resources/services.xml|sed 's/<service name="raac">/<service name="raacBSA">/' > tmp
mv tmp resources/services.xml

cat resources/raac.wsdl|sed 's/<wsdl:service name="raac">/<wsdl:service name="raacBSA">/' > tmp
mv tmp resources/raac.wsdl

cat src/com/aladdin/raac/RaacSkeleton.java|sed 's/String trustedIp[] = {"193.174.152.114", "127.0.0.1"};/String trustedIp[] = {"193.174.152.114", "127.0.0.1"};/' > tmp
mv tmp src/com/aladdin/raac/RaacSkeleton.java

ant
mv build/lib/*.aar ..
cd ..
