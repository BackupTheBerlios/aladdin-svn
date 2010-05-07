package com.aladdin.sc;

import com.aladdin.xsd.SystemParameter;

public class PersonSearchCriteria {
	String FieldName;
	SystemParameter CompareOp;
	public PersonSearchCriteria(String fieldName, SystemParameter compareOp,
			String fieldValue1, String fieldValue2) {
		super();
		FieldName = fieldName;
		CompareOp = compareOp;
		FieldValue1 = fieldValue1;
		FieldValue2 = fieldValue2;
	}
	String FieldValue1;
	String FieldValue2;
	public String getFieldName() {
		return FieldName;
	}
	public void setFieldName(String fieldName) {
		FieldName = fieldName;
	}
	public SystemParameter getCompareOp() {
		return CompareOp;
	}
	public void setCompareOp(SystemParameter compareOp) {
		CompareOp = compareOp;
	}
	public String getFieldValue1() {
		return FieldValue1;
	}
	public void setFieldValue1(String fieldValue1) {
		FieldValue1 = fieldValue1;
	}
	public String getFieldValue2() {
		return FieldValue2;
	}
	public void setFieldValue2(String fieldValue2) {
		FieldValue2 = fieldValue2;
	}
}
