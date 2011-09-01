#!/bin/sh

rm -rf tmp
wsdl2java.sh -uri StorageComponent.wsdl -p com.aladdin.sc -d xmlbeans -s -ss -sd -ssi -o tmp
exit
cd hibernate
ant
ant sql
