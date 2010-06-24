#!/bin/sh

wsdl2java.sh -uri NotificationComponent.wsdl -p com.aladdin.nc -d xmlbeans -s -ss -sd -ssi -o .
