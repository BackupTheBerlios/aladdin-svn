#!/bin/sh

rm -rf tmp
mkdir tmp
wsdl2java.sh -uri raac.wsdl -p com.aladdin.raac -d xmlbeans -s -ss -sd -ssi -o tmp
