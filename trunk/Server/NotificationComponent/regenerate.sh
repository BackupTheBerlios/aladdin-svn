#!/bin/sh

rm -rf tmp
mkdir tmp
cd tmp
wsdl2java.sh -uri ../NotificationComponent.wsdl -p com.aladdin.nc -d xmlbeans -s -ss -sd -ssi -o .
cd ..
