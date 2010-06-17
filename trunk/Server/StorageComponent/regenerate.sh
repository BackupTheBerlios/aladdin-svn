#!/bin/sh

wsdl2java.sh -uri StorageComponent.wsdl -p com.aladdin.sc -d xmlbeans -s -ss -sd -ssi -o tmp
cd hibernate
ant
ant sql