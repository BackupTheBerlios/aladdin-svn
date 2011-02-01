#!/bin/sh

wsdl2java.sh -uri raac.wsdl -p com.aladdin.raac -d xmlbeans -s -ss -sd -ssi -o .
