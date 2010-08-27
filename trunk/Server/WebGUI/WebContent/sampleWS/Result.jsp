<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleWSid" scope="session" class="eu.aladdin_project.StorageComponent.StorageComponentProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleWSid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleWSid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleWSid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        eu.aladdin_project.StorageComponent.StorageComponent_PortType getStorageComponent_PortType10mtemp = sampleWSid.getStorageComponent_PortType();
if(getStorageComponent_PortType10mtemp == null){
%>
<%=getStorageComponent_PortType10mtemp %>
<%
}else{
        if(getStorageComponent_PortType10mtemp!= null){
        String tempreturnp11 = getStorageComponent_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String name_3id=  request.getParameter("name28");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String surname_4id=  request.getParameter("surname30");
            java.lang.String surname_4idTemp = null;
        if(!surname_4id.equals("")){
         surname_4idTemp  = surname_4id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PersonData_2id" scope="session" class="eu.aladdin_project.xsd.PersonData" />
        <%
        eu1aladdin_project1xsd1PersonData_2id.setName(name_3idTemp);
        eu1aladdin_project1xsd1PersonData_2id.setSurname(surname_4idTemp);
        String value_7id=  request.getParameter("value36");
        long value_7idTemp  = Long.parseLong(value_7id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_6id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_6id.setValue(value_7idTemp);
        String value_9id=  request.getParameter("value40");
        long value_9idTemp  = Long.parseLong(value_9id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_8id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_8id.setValue(value_9idTemp);
        String description_11id=  request.getParameter("description44");
            java.lang.String description_11idTemp = null;
        if(!description_11id.equals("")){
         description_11idTemp  = description_11id;
        }
        String code_12id=  request.getParameter("code46");
            java.lang.String code_12idTemp = null;
        if(!code_12id.equals("")){
         code_12idTemp  = code_12id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_10id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_10id.setDescription(description_11idTemp);
        eu1aladdin_project1xsd1SystemParameter_10id.setCode(code_12idTemp);
        String description_14id=  request.getParameter("description50");
            java.lang.String description_14idTemp = null;
        if(!description_14id.equals("")){
         description_14idTemp  = description_14id;
        }
        String code_15id=  request.getParameter("code52");
            java.lang.String code_15idTemp = null;
        if(!code_15id.equals("")){
         code_15idTemp  = code_15id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_13id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_13id.setDescription(description_14idTemp);
        eu1aladdin_project1xsd1SystemParameter_13id.setCode(code_15idTemp);
        String description_17id=  request.getParameter("description56");
            java.lang.String description_17idTemp = null;
        if(!description_17id.equals("")){
         description_17idTemp  = description_17id;
        }
        String code_18id=  request.getParameter("code58");
            java.lang.String code_18idTemp = null;
        if(!code_18id.equals("")){
         code_18idTemp  = code_18id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_16id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_16id.setDescription(description_17idTemp);
        eu1aladdin_project1xsd1SystemParameter_16id.setCode(code_18idTemp);
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SocioDemographicData_5id" scope="session" class="eu.aladdin_project.xsd.SocioDemographicData" />
        <%
        eu1aladdin_project1xsd1SocioDemographicData_5id.setAge(org1apache1axis1types1UnsignedByte_6id);
        eu1aladdin_project1xsd1SocioDemographicData_5id.setChildren(org1apache1axis1types1UnsignedByte_8id);
        eu1aladdin_project1xsd1SocioDemographicData_5id.setMaritalStatus(eu1aladdin_project1xsd1SystemParameter_10id);
        eu1aladdin_project1xsd1SocioDemographicData_5id.setLivingWith(eu1aladdin_project1xsd1SystemParameter_13id);
        eu1aladdin_project1xsd1SocioDemographicData_5id.setGender(eu1aladdin_project1xsd1SystemParameter_16id);
        String responsibleClinicianID_19id=  request.getParameter("responsibleClinicianID60");
            java.lang.String responsibleClinicianID_19idTemp = null;
        if(!responsibleClinicianID_19id.equals("")){
         responsibleClinicianID_19idTemp  = responsibleClinicianID_19id;
        }
        String iD_20id=  request.getParameter("iD62");
            java.lang.String iD_20idTemp = null;
        if(!iD_20id.equals("")){
         iD_20idTemp  = iD_20id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Patient_1id" scope="session" class="eu.aladdin_project.xsd.Patient" />
        <%
        eu1aladdin_project1xsd1Patient_1id.setPersonData(eu1aladdin_project1xsd1PersonData_2id);
        eu1aladdin_project1xsd1Patient_1id.setSD_Data(eu1aladdin_project1xsd1SocioDemographicData_5id);
        eu1aladdin_project1xsd1Patient_1id.setResponsibleClinicianID(responsibleClinicianID_19idTemp);
        eu1aladdin_project1xsd1Patient_1id.setID(iD_20idTemp);
        String userId_21id=  request.getParameter("userId64");
            java.lang.String userId_21idTemp = null;
        if(!userId_21id.equals("")){
         userId_21idTemp  = userId_21id;
        }
        eu.aladdin_project.xsd.OperationResult createPatient13mtemp = sampleWSid.createPatient(eu1aladdin_project1xsd1Patient_1id,userId_21idTemp);
if(createPatient13mtemp == null){
%>
<%=createPatient13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(createPatient13mtemp != null){
java.lang.String typedescription20 = createPatient13mtemp.getDescription();
        String tempResultdescription20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription20));
        %>
        <%= tempResultdescription20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(createPatient13mtemp != null){
java.lang.String typecode22 = createPatient13mtemp.getCode();
        String tempResultcode22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode22));
        %>
        <%= tempResultcode22 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 66:
        gotMethod = true;
        String name_24id=  request.getParameter("name81");
            java.lang.String name_24idTemp = null;
        if(!name_24id.equals("")){
         name_24idTemp  = name_24id;
        }
        String surname_25id=  request.getParameter("surname83");
            java.lang.String surname_25idTemp = null;
        if(!surname_25id.equals("")){
         surname_25idTemp  = surname_25id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PersonData_23id" scope="session" class="eu.aladdin_project.xsd.PersonData" />
        <%
        eu1aladdin_project1xsd1PersonData_23id.setName(name_24idTemp);
        eu1aladdin_project1xsd1PersonData_23id.setSurname(surname_25idTemp);
        String value_28id=  request.getParameter("value89");
        long value_28idTemp  = Long.parseLong(value_28id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_27id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_27id.setValue(value_28idTemp);
        String value_30id=  request.getParameter("value93");
        long value_30idTemp  = Long.parseLong(value_30id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_29id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_29id.setValue(value_30idTemp);
        String description_32id=  request.getParameter("description97");
            java.lang.String description_32idTemp = null;
        if(!description_32id.equals("")){
         description_32idTemp  = description_32id;
        }
        String code_33id=  request.getParameter("code99");
            java.lang.String code_33idTemp = null;
        if(!code_33id.equals("")){
         code_33idTemp  = code_33id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_31id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_31id.setDescription(description_32idTemp);
        eu1aladdin_project1xsd1SystemParameter_31id.setCode(code_33idTemp);
        String description_35id=  request.getParameter("description103");
            java.lang.String description_35idTemp = null;
        if(!description_35id.equals("")){
         description_35idTemp  = description_35id;
        }
        String code_36id=  request.getParameter("code105");
            java.lang.String code_36idTemp = null;
        if(!code_36id.equals("")){
         code_36idTemp  = code_36id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_34id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_34id.setDescription(description_35idTemp);
        eu1aladdin_project1xsd1SystemParameter_34id.setCode(code_36idTemp);
        String description_38id=  request.getParameter("description109");
            java.lang.String description_38idTemp = null;
        if(!description_38id.equals("")){
         description_38idTemp  = description_38id;
        }
        String code_39id=  request.getParameter("code111");
            java.lang.String code_39idTemp = null;
        if(!code_39id.equals("")){
         code_39idTemp  = code_39id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_37id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_37id.setDescription(description_38idTemp);
        eu1aladdin_project1xsd1SystemParameter_37id.setCode(code_39idTemp);
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SocioDemographicData_26id" scope="session" class="eu.aladdin_project.xsd.SocioDemographicData" />
        <%
        eu1aladdin_project1xsd1SocioDemographicData_26id.setAge(org1apache1axis1types1UnsignedByte_27id);
        eu1aladdin_project1xsd1SocioDemographicData_26id.setChildren(org1apache1axis1types1UnsignedByte_29id);
        eu1aladdin_project1xsd1SocioDemographicData_26id.setMaritalStatus(eu1aladdin_project1xsd1SystemParameter_31id);
        eu1aladdin_project1xsd1SocioDemographicData_26id.setLivingWith(eu1aladdin_project1xsd1SystemParameter_34id);
        eu1aladdin_project1xsd1SocioDemographicData_26id.setGender(eu1aladdin_project1xsd1SystemParameter_37id);
        String responsibleClinicianID_40id=  request.getParameter("responsibleClinicianID113");
            java.lang.String responsibleClinicianID_40idTemp = null;
        if(!responsibleClinicianID_40id.equals("")){
         responsibleClinicianID_40idTemp  = responsibleClinicianID_40id;
        }
        String iD_41id=  request.getParameter("iD115");
            java.lang.String iD_41idTemp = null;
        if(!iD_41id.equals("")){
         iD_41idTemp  = iD_41id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Patient_22id" scope="session" class="eu.aladdin_project.xsd.Patient" />
        <%
        eu1aladdin_project1xsd1Patient_22id.setPersonData(eu1aladdin_project1xsd1PersonData_23id);
        eu1aladdin_project1xsd1Patient_22id.setSD_Data(eu1aladdin_project1xsd1SocioDemographicData_26id);
        eu1aladdin_project1xsd1Patient_22id.setResponsibleClinicianID(responsibleClinicianID_40idTemp);
        eu1aladdin_project1xsd1Patient_22id.setID(iD_41idTemp);
        String userId_42id=  request.getParameter("userId117");
            java.lang.String userId_42idTemp = null;
        if(!userId_42id.equals("")){
         userId_42idTemp  = userId_42id;
        }
        eu.aladdin_project.xsd.OperationResult updatePatient66mtemp = sampleWSid.updatePatient(eu1aladdin_project1xsd1Patient_22id,userId_42idTemp);
if(updatePatient66mtemp == null){
%>
<%=updatePatient66mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(updatePatient66mtemp != null){
java.lang.String typedescription73 = updatePatient66mtemp.getDescription();
        String tempResultdescription73 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription73));
        %>
        <%= tempResultdescription73 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(updatePatient66mtemp != null){
java.lang.String typecode75 = updatePatient66mtemp.getCode();
        String tempResultcode75 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode75));
        %>
        <%= tempResultcode75 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 119:
        gotMethod = true;
        String id_43id=  request.getParameter("id130");
            java.lang.String id_43idTemp = null;
        if(!id_43id.equals("")){
         id_43idTemp  = id_43id;
        }
        String userId_44id=  request.getParameter("userId132");
            java.lang.String userId_44idTemp = null;
        if(!userId_44id.equals("")){
         userId_44idTemp  = userId_44id;
        }
        eu.aladdin_project.xsd.OperationResult deletePatient119mtemp = sampleWSid.deletePatient(id_43idTemp,userId_44idTemp);
if(deletePatient119mtemp == null){
%>
<%=deletePatient119mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deletePatient119mtemp != null){
java.lang.String typedescription126 = deletePatient119mtemp.getDescription();
        String tempResultdescription126 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription126));
        %>
        <%= tempResultdescription126 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deletePatient119mtemp != null){
java.lang.String typecode128 = deletePatient119mtemp.getCode();
        String tempResultcode128 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode128));
        %>
        <%= tempResultcode128 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 134:
        gotMethod = true;
        String id_45id=  request.getParameter("id183");
            java.lang.String id_45idTemp = null;
        if(!id_45id.equals("")){
         id_45idTemp  = id_45id;
        }
        String userId_46id=  request.getParameter("userId185");
            java.lang.String userId_46idTemp = null;
        if(!userId_46id.equals("")){
         userId_46idTemp  = userId_46id;
        }
        eu.aladdin_project.xsd.Patient getPatient134mtemp = sampleWSid.getPatient(id_45idTemp,userId_46idTemp);
if(getPatient134mtemp == null){
%>
<%=getPatient134mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">personData:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getPatient134mtemp.getPersonData();
if(tebece0 != null){
java.lang.String typename139 = tebece0.getName();
        String tempResultname139 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename139));
        %>
        <%= tempResultname139 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">communicationList:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getPatient134mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Communication[] typecommunicationList141 = tebece0.getCommunicationList();
        String tempcommunicationList141 = null;
        if(typecommunicationList141 != null){
        java.util.List listcommunicationList141= java.util.Arrays.asList(typecommunicationList141);
        tempcommunicationList141 = listcommunicationList141.toString();
        }
        %>
        <%=tempcommunicationList141%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">addressList:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getPatient134mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Address[] typeaddressList143 = tebece0.getAddressList();
        String tempaddressList143 = null;
        if(typeaddressList143 != null){
        java.util.List listaddressList143= java.util.Arrays.asList(typeaddressList143);
        tempaddressList143 = listaddressList143.toString();
        }
        %>
        <%=tempaddressList143%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">surname:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getPatient134mtemp.getPersonData();
if(tebece0 != null){
java.lang.String typesurname145 = tebece0.getSurname();
        String tempResultsurname145 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesurname145));
        %>
        <%= tempResultsurname145 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">identifierList:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getPatient134mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Identifier[] typeidentifierList147 = tebece0.getIdentifierList();
        String tempidentifierList147 = null;
        if(typeidentifierList147 != null){
        java.util.List listidentifierList147= java.util.Arrays.asList(typeidentifierList147);
        tempidentifierList147 = listidentifierList147.toString();
        }
        %>
        <%=tempidentifierList147%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">patientCarerList:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.PatientCarer[] typepatientCarerList149 = getPatient134mtemp.getPatientCarerList();
        String temppatientCarerList149 = null;
        if(typepatientCarerList149 != null){
        java.util.List listpatientCarerList149= java.util.Arrays.asList(typepatientCarerList149);
        temppatientCarerList149 = listpatientCarerList149.toString();
        }
        %>
        <%=temppatientCarerList149%>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sD_Data:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">age:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">children:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">maritalStatus:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">description:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getPatient134mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getMaritalStatus();
if(tebece1 != null){
java.lang.String typedescription163 = tebece1.getDescription();
        String tempResultdescription163 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription163));
        %>
        <%= tempResultdescription163 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">code:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getPatient134mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getMaritalStatus();
if(tebece1 != null){
java.lang.String typecode165 = tebece1.getCode();
        String tempResultcode165 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode165));
        %>
        <%= tempResultcode165 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">livingWith:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">description:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getPatient134mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getLivingWith();
if(tebece1 != null){
java.lang.String typedescription169 = tebece1.getDescription();
        String tempResultdescription169 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription169));
        %>
        <%= tempResultdescription169 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">code:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getPatient134mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getLivingWith();
if(tebece1 != null){
java.lang.String typecode171 = tebece1.getCode();
        String tempResultcode171 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode171));
        %>
        <%= tempResultcode171 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">gender:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">description:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getPatient134mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getGender();
if(tebece1 != null){
java.lang.String typedescription175 = tebece1.getDescription();
        String tempResultdescription175 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription175));
        %>
        <%= tempResultdescription175 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">code:</TD>
<TD>
<%
if(getPatient134mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getPatient134mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getGender();
if(tebece1 != null){
java.lang.String typecode177 = tebece1.getCode();
        String tempResultcode177 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode177));
        %>
        <%= tempResultcode177 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">responsibleClinicianID:</TD>
<TD>
<%
if(getPatient134mtemp != null){
java.lang.String typeresponsibleClinicianID179 = getPatient134mtemp.getResponsibleClinicianID();
        String tempResultresponsibleClinicianID179 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeresponsibleClinicianID179));
        %>
        <%= tempResultresponsibleClinicianID179 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">iD:</TD>
<TD>
<%
if(getPatient134mtemp != null){
java.lang.String typeiD181 = getPatient134mtemp.getID();
        String tempResultiD181 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeiD181));
        %>
        <%= tempResultiD181 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 187:
        gotMethod = true;
        String name_49id=  request.getParameter("name202");
            java.lang.String name_49idTemp = null;
        if(!name_49id.equals("")){
         name_49idTemp  = name_49id;
        }
        String surname_50id=  request.getParameter("surname204");
            java.lang.String surname_50idTemp = null;
        if(!surname_50id.equals("")){
         surname_50idTemp  = surname_50id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PersonData_48id" scope="session" class="eu.aladdin_project.xsd.PersonData" />
        <%
        eu1aladdin_project1xsd1PersonData_48id.setName(name_49idTemp);
        eu1aladdin_project1xsd1PersonData_48id.setSurname(surname_50idTemp);
        String iD_51id=  request.getParameter("iD206");
            java.lang.String iD_51idTemp = null;
        if(!iD_51id.equals("")){
         iD_51idTemp  = iD_51id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Administrator_47id" scope="session" class="eu.aladdin_project.xsd.Administrator" />
        <%
        eu1aladdin_project1xsd1Administrator_47id.setPersonData(eu1aladdin_project1xsd1PersonData_48id);
        eu1aladdin_project1xsd1Administrator_47id.setID(iD_51idTemp);
        String userId_52id=  request.getParameter("userId208");
            java.lang.String userId_52idTemp = null;
        if(!userId_52id.equals("")){
         userId_52idTemp  = userId_52id;
        }
        eu.aladdin_project.xsd.OperationResult createAdministrator187mtemp = sampleWSid.createAdministrator(eu1aladdin_project1xsd1Administrator_47id,userId_52idTemp);
if(createAdministrator187mtemp == null){
%>
<%=createAdministrator187mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(createAdministrator187mtemp != null){
java.lang.String typedescription194 = createAdministrator187mtemp.getDescription();
        String tempResultdescription194 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription194));
        %>
        <%= tempResultdescription194 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(createAdministrator187mtemp != null){
java.lang.String typecode196 = createAdministrator187mtemp.getCode();
        String tempResultcode196 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode196));
        %>
        <%= tempResultcode196 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 210:
        gotMethod = true;
        String name_55id=  request.getParameter("name225");
            java.lang.String name_55idTemp = null;
        if(!name_55id.equals("")){
         name_55idTemp  = name_55id;
        }
        String surname_56id=  request.getParameter("surname227");
            java.lang.String surname_56idTemp = null;
        if(!surname_56id.equals("")){
         surname_56idTemp  = surname_56id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PersonData_54id" scope="session" class="eu.aladdin_project.xsd.PersonData" />
        <%
        eu1aladdin_project1xsd1PersonData_54id.setName(name_55idTemp);
        eu1aladdin_project1xsd1PersonData_54id.setSurname(surname_56idTemp);
        String iD_57id=  request.getParameter("iD229");
            java.lang.String iD_57idTemp = null;
        if(!iD_57id.equals("")){
         iD_57idTemp  = iD_57id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Administrator_53id" scope="session" class="eu.aladdin_project.xsd.Administrator" />
        <%
        eu1aladdin_project1xsd1Administrator_53id.setPersonData(eu1aladdin_project1xsd1PersonData_54id);
        eu1aladdin_project1xsd1Administrator_53id.setID(iD_57idTemp);
        String userId_58id=  request.getParameter("userId231");
            java.lang.String userId_58idTemp = null;
        if(!userId_58id.equals("")){
         userId_58idTemp  = userId_58id;
        }
        eu.aladdin_project.xsd.OperationResult updateAdministrator210mtemp = sampleWSid.updateAdministrator(eu1aladdin_project1xsd1Administrator_53id,userId_58idTemp);
if(updateAdministrator210mtemp == null){
%>
<%=updateAdministrator210mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(updateAdministrator210mtemp != null){
java.lang.String typedescription217 = updateAdministrator210mtemp.getDescription();
        String tempResultdescription217 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription217));
        %>
        <%= tempResultdescription217 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(updateAdministrator210mtemp != null){
java.lang.String typecode219 = updateAdministrator210mtemp.getCode();
        String tempResultcode219 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode219));
        %>
        <%= tempResultcode219 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 233:
        gotMethod = true;
        String id_59id=  request.getParameter("id244");
            java.lang.String id_59idTemp = null;
        if(!id_59id.equals("")){
         id_59idTemp  = id_59id;
        }
        String userId_60id=  request.getParameter("userId246");
            java.lang.String userId_60idTemp = null;
        if(!userId_60id.equals("")){
         userId_60idTemp  = userId_60id;
        }
        eu.aladdin_project.xsd.OperationResult deleteAdministrator233mtemp = sampleWSid.deleteAdministrator(id_59idTemp,userId_60idTemp);
if(deleteAdministrator233mtemp == null){
%>
<%=deleteAdministrator233mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deleteAdministrator233mtemp != null){
java.lang.String typedescription240 = deleteAdministrator233mtemp.getDescription();
        String tempResultdescription240 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription240));
        %>
        <%= tempResultdescription240 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deleteAdministrator233mtemp != null){
java.lang.String typecode242 = deleteAdministrator233mtemp.getCode();
        String tempResultcode242 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode242));
        %>
        <%= tempResultcode242 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 248:
        gotMethod = true;
        String id_61id=  request.getParameter("id265");
            java.lang.String id_61idTemp = null;
        if(!id_61id.equals("")){
         id_61idTemp  = id_61id;
        }
        String userId_62id=  request.getParameter("userId267");
            java.lang.String userId_62idTemp = null;
        if(!userId_62id.equals("")){
         userId_62idTemp  = userId_62id;
        }
        eu.aladdin_project.xsd.Administrator getAdministrator248mtemp = sampleWSid.getAdministrator(id_61idTemp,userId_62idTemp);
if(getAdministrator248mtemp == null){
%>
<%=getAdministrator248mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">personData:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getAdministrator248mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getAdministrator248mtemp.getPersonData();
if(tebece0 != null){
java.lang.String typename253 = tebece0.getName();
        String tempResultname253 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename253));
        %>
        <%= tempResultname253 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">communicationList:</TD>
<TD>
<%
if(getAdministrator248mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getAdministrator248mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Communication[] typecommunicationList255 = tebece0.getCommunicationList();
        String tempcommunicationList255 = null;
        if(typecommunicationList255 != null){
        java.util.List listcommunicationList255= java.util.Arrays.asList(typecommunicationList255);
        tempcommunicationList255 = listcommunicationList255.toString();
        }
        %>
        <%=tempcommunicationList255%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">addressList:</TD>
<TD>
<%
if(getAdministrator248mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getAdministrator248mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Address[] typeaddressList257 = tebece0.getAddressList();
        String tempaddressList257 = null;
        if(typeaddressList257 != null){
        java.util.List listaddressList257= java.util.Arrays.asList(typeaddressList257);
        tempaddressList257 = listaddressList257.toString();
        }
        %>
        <%=tempaddressList257%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">surname:</TD>
<TD>
<%
if(getAdministrator248mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getAdministrator248mtemp.getPersonData();
if(tebece0 != null){
java.lang.String typesurname259 = tebece0.getSurname();
        String tempResultsurname259 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesurname259));
        %>
        <%= tempResultsurname259 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">identifierList:</TD>
<TD>
<%
if(getAdministrator248mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getAdministrator248mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Identifier[] typeidentifierList261 = tebece0.getIdentifierList();
        String tempidentifierList261 = null;
        if(typeidentifierList261 != null){
        java.util.List listidentifierList261= java.util.Arrays.asList(typeidentifierList261);
        tempidentifierList261 = listidentifierList261.toString();
        }
        %>
        <%=tempidentifierList261%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">iD:</TD>
<TD>
<%
if(getAdministrator248mtemp != null){
java.lang.String typeiD263 = getAdministrator248mtemp.getID();
        String tempResultiD263 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeiD263));
        %>
        <%= tempResultiD263 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 269:
        gotMethod = true;
        String name_65id=  request.getParameter("name284");
            java.lang.String name_65idTemp = null;
        if(!name_65id.equals("")){
         name_65idTemp  = name_65id;
        }
        String surname_66id=  request.getParameter("surname286");
            java.lang.String surname_66idTemp = null;
        if(!surname_66id.equals("")){
         surname_66idTemp  = surname_66id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PersonData_64id" scope="session" class="eu.aladdin_project.xsd.PersonData" />
        <%
        eu1aladdin_project1xsd1PersonData_64id.setName(name_65idTemp);
        eu1aladdin_project1xsd1PersonData_64id.setSurname(surname_66idTemp);
        String value_69id=  request.getParameter("value292");
        long value_69idTemp  = Long.parseLong(value_69id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_68id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_68id.setValue(value_69idTemp);
        String value_71id=  request.getParameter("value296");
        long value_71idTemp  = Long.parseLong(value_71id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_70id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_70id.setValue(value_71idTemp);
        String description_73id=  request.getParameter("description300");
            java.lang.String description_73idTemp = null;
        if(!description_73id.equals("")){
         description_73idTemp  = description_73id;
        }
        String code_74id=  request.getParameter("code302");
            java.lang.String code_74idTemp = null;
        if(!code_74id.equals("")){
         code_74idTemp  = code_74id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_72id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_72id.setDescription(description_73idTemp);
        eu1aladdin_project1xsd1SystemParameter_72id.setCode(code_74idTemp);
        String description_76id=  request.getParameter("description306");
            java.lang.String description_76idTemp = null;
        if(!description_76id.equals("")){
         description_76idTemp  = description_76id;
        }
        String code_77id=  request.getParameter("code308");
            java.lang.String code_77idTemp = null;
        if(!code_77id.equals("")){
         code_77idTemp  = code_77id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_75id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_75id.setDescription(description_76idTemp);
        eu1aladdin_project1xsd1SystemParameter_75id.setCode(code_77idTemp);
        String description_79id=  request.getParameter("description312");
            java.lang.String description_79idTemp = null;
        if(!description_79id.equals("")){
         description_79idTemp  = description_79id;
        }
        String code_80id=  request.getParameter("code314");
            java.lang.String code_80idTemp = null;
        if(!code_80id.equals("")){
         code_80idTemp  = code_80id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_78id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_78id.setDescription(description_79idTemp);
        eu1aladdin_project1xsd1SystemParameter_78id.setCode(code_80idTemp);
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SocioDemographicData_67id" scope="session" class="eu.aladdin_project.xsd.SocioDemographicData" />
        <%
        eu1aladdin_project1xsd1SocioDemographicData_67id.setAge(org1apache1axis1types1UnsignedByte_68id);
        eu1aladdin_project1xsd1SocioDemographicData_67id.setChildren(org1apache1axis1types1UnsignedByte_70id);
        eu1aladdin_project1xsd1SocioDemographicData_67id.setMaritalStatus(eu1aladdin_project1xsd1SystemParameter_72id);
        eu1aladdin_project1xsd1SocioDemographicData_67id.setLivingWith(eu1aladdin_project1xsd1SystemParameter_75id);
        eu1aladdin_project1xsd1SocioDemographicData_67id.setGender(eu1aladdin_project1xsd1SystemParameter_78id);
        String iD_81id=  request.getParameter("iD316");
            java.lang.String iD_81idTemp = null;
        if(!iD_81id.equals("")){
         iD_81idTemp  = iD_81id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Carer_63id" scope="session" class="eu.aladdin_project.xsd.Carer" />
        <%
        eu1aladdin_project1xsd1Carer_63id.setPersonData(eu1aladdin_project1xsd1PersonData_64id);
        eu1aladdin_project1xsd1Carer_63id.setSD_Data(eu1aladdin_project1xsd1SocioDemographicData_67id);
        eu1aladdin_project1xsd1Carer_63id.setID(iD_81idTemp);
        String userId_82id=  request.getParameter("userId318");
            java.lang.String userId_82idTemp = null;
        if(!userId_82id.equals("")){
         userId_82idTemp  = userId_82id;
        }
        eu.aladdin_project.xsd.OperationResult createCarer269mtemp = sampleWSid.createCarer(eu1aladdin_project1xsd1Carer_63id,userId_82idTemp);
if(createCarer269mtemp == null){
%>
<%=createCarer269mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(createCarer269mtemp != null){
java.lang.String typedescription276 = createCarer269mtemp.getDescription();
        String tempResultdescription276 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription276));
        %>
        <%= tempResultdescription276 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(createCarer269mtemp != null){
java.lang.String typecode278 = createCarer269mtemp.getCode();
        String tempResultcode278 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode278));
        %>
        <%= tempResultcode278 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 320:
        gotMethod = true;
        String name_85id=  request.getParameter("name335");
            java.lang.String name_85idTemp = null;
        if(!name_85id.equals("")){
         name_85idTemp  = name_85id;
        }
        String surname_86id=  request.getParameter("surname337");
            java.lang.String surname_86idTemp = null;
        if(!surname_86id.equals("")){
         surname_86idTemp  = surname_86id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PersonData_84id" scope="session" class="eu.aladdin_project.xsd.PersonData" />
        <%
        eu1aladdin_project1xsd1PersonData_84id.setName(name_85idTemp);
        eu1aladdin_project1xsd1PersonData_84id.setSurname(surname_86idTemp);
        String value_89id=  request.getParameter("value343");
        long value_89idTemp  = Long.parseLong(value_89id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_88id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_88id.setValue(value_89idTemp);
        String value_91id=  request.getParameter("value347");
        long value_91idTemp  = Long.parseLong(value_91id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_90id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_90id.setValue(value_91idTemp);
        String description_93id=  request.getParameter("description351");
            java.lang.String description_93idTemp = null;
        if(!description_93id.equals("")){
         description_93idTemp  = description_93id;
        }
        String code_94id=  request.getParameter("code353");
            java.lang.String code_94idTemp = null;
        if(!code_94id.equals("")){
         code_94idTemp  = code_94id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_92id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_92id.setDescription(description_93idTemp);
        eu1aladdin_project1xsd1SystemParameter_92id.setCode(code_94idTemp);
        String description_96id=  request.getParameter("description357");
            java.lang.String description_96idTemp = null;
        if(!description_96id.equals("")){
         description_96idTemp  = description_96id;
        }
        String code_97id=  request.getParameter("code359");
            java.lang.String code_97idTemp = null;
        if(!code_97id.equals("")){
         code_97idTemp  = code_97id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_95id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_95id.setDescription(description_96idTemp);
        eu1aladdin_project1xsd1SystemParameter_95id.setCode(code_97idTemp);
        String description_99id=  request.getParameter("description363");
            java.lang.String description_99idTemp = null;
        if(!description_99id.equals("")){
         description_99idTemp  = description_99id;
        }
        String code_100id=  request.getParameter("code365");
            java.lang.String code_100idTemp = null;
        if(!code_100id.equals("")){
         code_100idTemp  = code_100id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_98id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_98id.setDescription(description_99idTemp);
        eu1aladdin_project1xsd1SystemParameter_98id.setCode(code_100idTemp);
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SocioDemographicData_87id" scope="session" class="eu.aladdin_project.xsd.SocioDemographicData" />
        <%
        eu1aladdin_project1xsd1SocioDemographicData_87id.setAge(org1apache1axis1types1UnsignedByte_88id);
        eu1aladdin_project1xsd1SocioDemographicData_87id.setChildren(org1apache1axis1types1UnsignedByte_90id);
        eu1aladdin_project1xsd1SocioDemographicData_87id.setMaritalStatus(eu1aladdin_project1xsd1SystemParameter_92id);
        eu1aladdin_project1xsd1SocioDemographicData_87id.setLivingWith(eu1aladdin_project1xsd1SystemParameter_95id);
        eu1aladdin_project1xsd1SocioDemographicData_87id.setGender(eu1aladdin_project1xsd1SystemParameter_98id);
        String iD_101id=  request.getParameter("iD367");
            java.lang.String iD_101idTemp = null;
        if(!iD_101id.equals("")){
         iD_101idTemp  = iD_101id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Carer_83id" scope="session" class="eu.aladdin_project.xsd.Carer" />
        <%
        eu1aladdin_project1xsd1Carer_83id.setPersonData(eu1aladdin_project1xsd1PersonData_84id);
        eu1aladdin_project1xsd1Carer_83id.setSD_Data(eu1aladdin_project1xsd1SocioDemographicData_87id);
        eu1aladdin_project1xsd1Carer_83id.setID(iD_101idTemp);
        String userId_102id=  request.getParameter("userId369");
            java.lang.String userId_102idTemp = null;
        if(!userId_102id.equals("")){
         userId_102idTemp  = userId_102id;
        }
        eu.aladdin_project.xsd.OperationResult updateCarer320mtemp = sampleWSid.updateCarer(eu1aladdin_project1xsd1Carer_83id,userId_102idTemp);
if(updateCarer320mtemp == null){
%>
<%=updateCarer320mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(updateCarer320mtemp != null){
java.lang.String typedescription327 = updateCarer320mtemp.getDescription();
        String tempResultdescription327 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription327));
        %>
        <%= tempResultdescription327 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(updateCarer320mtemp != null){
java.lang.String typecode329 = updateCarer320mtemp.getCode();
        String tempResultcode329 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode329));
        %>
        <%= tempResultcode329 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 371:
        gotMethod = true;
        String id_103id=  request.getParameter("id382");
            java.lang.String id_103idTemp = null;
        if(!id_103id.equals("")){
         id_103idTemp  = id_103id;
        }
        String userId_104id=  request.getParameter("userId384");
            java.lang.String userId_104idTemp = null;
        if(!userId_104id.equals("")){
         userId_104idTemp  = userId_104id;
        }
        eu.aladdin_project.xsd.OperationResult deleteCarer371mtemp = sampleWSid.deleteCarer(id_103idTemp,userId_104idTemp);
if(deleteCarer371mtemp == null){
%>
<%=deleteCarer371mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deleteCarer371mtemp != null){
java.lang.String typedescription378 = deleteCarer371mtemp.getDescription();
        String tempResultdescription378 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription378));
        %>
        <%= tempResultdescription378 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deleteCarer371mtemp != null){
java.lang.String typecode380 = deleteCarer371mtemp.getCode();
        String tempResultcode380 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode380));
        %>
        <%= tempResultcode380 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 386:
        gotMethod = true;
        String id_105id=  request.getParameter("id431");
            java.lang.String id_105idTemp = null;
        if(!id_105id.equals("")){
         id_105idTemp  = id_105id;
        }
        String userId_106id=  request.getParameter("userId433");
            java.lang.String userId_106idTemp = null;
        if(!userId_106id.equals("")){
         userId_106idTemp  = userId_106id;
        }
        eu.aladdin_project.xsd.Carer getCarer386mtemp = sampleWSid.getCarer(id_105idTemp,userId_106idTemp);
if(getCarer386mtemp == null){
%>
<%=getCarer386mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">personData:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getCarer386mtemp.getPersonData();
if(tebece0 != null){
java.lang.String typename391 = tebece0.getName();
        String tempResultname391 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename391));
        %>
        <%= tempResultname391 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">communicationList:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getCarer386mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Communication[] typecommunicationList393 = tebece0.getCommunicationList();
        String tempcommunicationList393 = null;
        if(typecommunicationList393 != null){
        java.util.List listcommunicationList393= java.util.Arrays.asList(typecommunicationList393);
        tempcommunicationList393 = listcommunicationList393.toString();
        }
        %>
        <%=tempcommunicationList393%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">addressList:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getCarer386mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Address[] typeaddressList395 = tebece0.getAddressList();
        String tempaddressList395 = null;
        if(typeaddressList395 != null){
        java.util.List listaddressList395= java.util.Arrays.asList(typeaddressList395);
        tempaddressList395 = listaddressList395.toString();
        }
        %>
        <%=tempaddressList395%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">surname:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getCarer386mtemp.getPersonData();
if(tebece0 != null){
java.lang.String typesurname397 = tebece0.getSurname();
        String tempResultsurname397 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesurname397));
        %>
        <%= tempResultsurname397 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">identifierList:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getCarer386mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Identifier[] typeidentifierList399 = tebece0.getIdentifierList();
        String tempidentifierList399 = null;
        if(typeidentifierList399 != null){
        java.util.List listidentifierList399= java.util.Arrays.asList(typeidentifierList399);
        tempidentifierList399 = listidentifierList399.toString();
        }
        %>
        <%=tempidentifierList399%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sD_Data:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">age:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">children:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">maritalStatus:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">description:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getCarer386mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getMaritalStatus();
if(tebece1 != null){
java.lang.String typedescription413 = tebece1.getDescription();
        String tempResultdescription413 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription413));
        %>
        <%= tempResultdescription413 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">code:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getCarer386mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getMaritalStatus();
if(tebece1 != null){
java.lang.String typecode415 = tebece1.getCode();
        String tempResultcode415 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode415));
        %>
        <%= tempResultcode415 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">livingWith:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">description:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getCarer386mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getLivingWith();
if(tebece1 != null){
java.lang.String typedescription419 = tebece1.getDescription();
        String tempResultdescription419 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription419));
        %>
        <%= tempResultdescription419 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">code:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getCarer386mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getLivingWith();
if(tebece1 != null){
java.lang.String typecode421 = tebece1.getCode();
        String tempResultcode421 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode421));
        %>
        <%= tempResultcode421 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">gender:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">description:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getCarer386mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getGender();
if(tebece1 != null){
java.lang.String typedescription425 = tebece1.getDescription();
        String tempResultdescription425 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription425));
        %>
        <%= tempResultdescription425 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">code:</TD>
<TD>
<%
if(getCarer386mtemp != null){
eu.aladdin_project.xsd.SocioDemographicData tebece0=getCarer386mtemp.getSD_Data();
if(tebece0 != null){
eu.aladdin_project.xsd.SystemParameter tebece1=tebece0.getGender();
if(tebece1 != null){
java.lang.String typecode427 = tebece1.getCode();
        String tempResultcode427 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode427));
        %>
        <%= tempResultcode427 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">iD:</TD>
<TD>
<%
if(getCarer386mtemp != null){
java.lang.String typeiD429 = getCarer386mtemp.getID();
        String tempResultiD429 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeiD429));
        %>
        <%= tempResultiD429 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 435:
        gotMethod = true;
        String name_109id=  request.getParameter("name450");
            java.lang.String name_109idTemp = null;
        if(!name_109id.equals("")){
         name_109idTemp  = name_109id;
        }
        String surname_110id=  request.getParameter("surname452");
            java.lang.String surname_110idTemp = null;
        if(!surname_110id.equals("")){
         surname_110idTemp  = surname_110id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PersonData_108id" scope="session" class="eu.aladdin_project.xsd.PersonData" />
        <%
        eu1aladdin_project1xsd1PersonData_108id.setName(name_109idTemp);
        eu1aladdin_project1xsd1PersonData_108id.setSurname(surname_110idTemp);
        String iD_111id=  request.getParameter("iD454");
            java.lang.String iD_111idTemp = null;
        if(!iD_111id.equals("")){
         iD_111idTemp  = iD_111id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Clinician_107id" scope="session" class="eu.aladdin_project.xsd.Clinician" />
        <%
        eu1aladdin_project1xsd1Clinician_107id.setPersonData(eu1aladdin_project1xsd1PersonData_108id);
        eu1aladdin_project1xsd1Clinician_107id.setID(iD_111idTemp);
        String userId_112id=  request.getParameter("userId456");
            java.lang.String userId_112idTemp = null;
        if(!userId_112id.equals("")){
         userId_112idTemp  = userId_112id;
        }
        eu.aladdin_project.xsd.OperationResult createClinician435mtemp = sampleWSid.createClinician(eu1aladdin_project1xsd1Clinician_107id,userId_112idTemp);
if(createClinician435mtemp == null){
%>
<%=createClinician435mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(createClinician435mtemp != null){
java.lang.String typedescription442 = createClinician435mtemp.getDescription();
        String tempResultdescription442 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription442));
        %>
        <%= tempResultdescription442 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(createClinician435mtemp != null){
java.lang.String typecode444 = createClinician435mtemp.getCode();
        String tempResultcode444 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode444));
        %>
        <%= tempResultcode444 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 458:
        gotMethod = true;
        String name_115id=  request.getParameter("name473");
            java.lang.String name_115idTemp = null;
        if(!name_115id.equals("")){
         name_115idTemp  = name_115id;
        }
        String surname_116id=  request.getParameter("surname475");
            java.lang.String surname_116idTemp = null;
        if(!surname_116id.equals("")){
         surname_116idTemp  = surname_116id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PersonData_114id" scope="session" class="eu.aladdin_project.xsd.PersonData" />
        <%
        eu1aladdin_project1xsd1PersonData_114id.setName(name_115idTemp);
        eu1aladdin_project1xsd1PersonData_114id.setSurname(surname_116idTemp);
        String iD_117id=  request.getParameter("iD477");
            java.lang.String iD_117idTemp = null;
        if(!iD_117id.equals("")){
         iD_117idTemp  = iD_117id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Clinician_113id" scope="session" class="eu.aladdin_project.xsd.Clinician" />
        <%
        eu1aladdin_project1xsd1Clinician_113id.setPersonData(eu1aladdin_project1xsd1PersonData_114id);
        eu1aladdin_project1xsd1Clinician_113id.setID(iD_117idTemp);
        String userId_118id=  request.getParameter("userId479");
            java.lang.String userId_118idTemp = null;
        if(!userId_118id.equals("")){
         userId_118idTemp  = userId_118id;
        }
        eu.aladdin_project.xsd.OperationResult updateClinician458mtemp = sampleWSid.updateClinician(eu1aladdin_project1xsd1Clinician_113id,userId_118idTemp);
if(updateClinician458mtemp == null){
%>
<%=updateClinician458mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(updateClinician458mtemp != null){
java.lang.String typedescription465 = updateClinician458mtemp.getDescription();
        String tempResultdescription465 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription465));
        %>
        <%= tempResultdescription465 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(updateClinician458mtemp != null){
java.lang.String typecode467 = updateClinician458mtemp.getCode();
        String tempResultcode467 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode467));
        %>
        <%= tempResultcode467 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 481:
        gotMethod = true;
        String id_119id=  request.getParameter("id492");
            java.lang.String id_119idTemp = null;
        if(!id_119id.equals("")){
         id_119idTemp  = id_119id;
        }
        String userId_120id=  request.getParameter("userId494");
            java.lang.String userId_120idTemp = null;
        if(!userId_120id.equals("")){
         userId_120idTemp  = userId_120id;
        }
        eu.aladdin_project.xsd.OperationResult deleteClinician481mtemp = sampleWSid.deleteClinician(id_119idTemp,userId_120idTemp);
if(deleteClinician481mtemp == null){
%>
<%=deleteClinician481mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deleteClinician481mtemp != null){
java.lang.String typedescription488 = deleteClinician481mtemp.getDescription();
        String tempResultdescription488 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription488));
        %>
        <%= tempResultdescription488 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deleteClinician481mtemp != null){
java.lang.String typecode490 = deleteClinician481mtemp.getCode();
        String tempResultcode490 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode490));
        %>
        <%= tempResultcode490 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 496:
        gotMethod = true;
        String id_121id=  request.getParameter("id513");
            java.lang.String id_121idTemp = null;
        if(!id_121id.equals("")){
         id_121idTemp  = id_121id;
        }
        String userId_122id=  request.getParameter("userId515");
            java.lang.String userId_122idTemp = null;
        if(!userId_122id.equals("")){
         userId_122idTemp  = userId_122id;
        }
        eu.aladdin_project.xsd.Clinician getClinician496mtemp = sampleWSid.getClinician(id_121idTemp,userId_122idTemp);
if(getClinician496mtemp == null){
%>
<%=getClinician496mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">personData:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getClinician496mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getClinician496mtemp.getPersonData();
if(tebece0 != null){
java.lang.String typename501 = tebece0.getName();
        String tempResultname501 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename501));
        %>
        <%= tempResultname501 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">communicationList:</TD>
<TD>
<%
if(getClinician496mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getClinician496mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Communication[] typecommunicationList503 = tebece0.getCommunicationList();
        String tempcommunicationList503 = null;
        if(typecommunicationList503 != null){
        java.util.List listcommunicationList503= java.util.Arrays.asList(typecommunicationList503);
        tempcommunicationList503 = listcommunicationList503.toString();
        }
        %>
        <%=tempcommunicationList503%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">addressList:</TD>
<TD>
<%
if(getClinician496mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getClinician496mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Address[] typeaddressList505 = tebece0.getAddressList();
        String tempaddressList505 = null;
        if(typeaddressList505 != null){
        java.util.List listaddressList505= java.util.Arrays.asList(typeaddressList505);
        tempaddressList505 = listaddressList505.toString();
        }
        %>
        <%=tempaddressList505%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">surname:</TD>
<TD>
<%
if(getClinician496mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getClinician496mtemp.getPersonData();
if(tebece0 != null){
java.lang.String typesurname507 = tebece0.getSurname();
        String tempResultsurname507 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesurname507));
        %>
        <%= tempResultsurname507 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">identifierList:</TD>
<TD>
<%
if(getClinician496mtemp != null){
eu.aladdin_project.xsd.PersonData tebece0=getClinician496mtemp.getPersonData();
if(tebece0 != null){
eu.aladdin_project.xsd.Identifier[] typeidentifierList509 = tebece0.getIdentifierList();
        String tempidentifierList509 = null;
        if(typeidentifierList509 != null){
        java.util.List listidentifierList509= java.util.Arrays.asList(typeidentifierList509);
        tempidentifierList509 = listidentifierList509.toString();
        }
        %>
        <%=tempidentifierList509%>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">iD:</TD>
<TD>
<%
if(getClinician496mtemp != null){
java.lang.String typeiD511 = getClinician496mtemp.getID();
        String tempResultiD511 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeiD511));
        %>
        <%= tempResultiD511 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 517:
        gotMethod = true;
        String userId_123id=  request.getParameter("userId520");
            java.lang.String userId_123idTemp = null;
        if(!userId_123id.equals("")){
         userId_123idTemp  = userId_123id;
        }
        String fromDate_124id=  request.getParameter("fromDate522");
            java.util.Calendar fromDate_124idTemp = null;
        if(!fromDate_124id.equals("")){
        java.text.DateFormat dateFormatfromDate522 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfromDate522  = dateFormatfromDate522.parse(fromDate_124id);
         fromDate_124idTemp = new java.util.GregorianCalendar();
        fromDate_124idTemp.setTime(dateTempfromDate522);
        }
        String toDate_125id=  request.getParameter("toDate524");
            java.util.Calendar toDate_125idTemp = null;
        if(!toDate_125id.equals("")){
        java.text.DateFormat dateFormattoDate524 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTemptoDate524  = dateFormattoDate524.parse(toDate_125id);
         toDate_125idTemp = new java.util.GregorianCalendar();
        toDate_125idTemp.setTime(dateTemptoDate524);
        }
        String requesterId_126id=  request.getParameter("requesterId526");
            java.lang.String requesterId_126idTemp = null;
        if(!requesterId_126id.equals("")){
         requesterId_126idTemp  = requesterId_126id;
        }
        eu.aladdin_project.xsd.Task[] getUserPlannedTasks517mtemp = sampleWSid.getUserPlannedTasks(userId_123idTemp,fromDate_124idTemp,toDate_125idTemp,requesterId_126idTemp);
if(getUserPlannedTasks517mtemp == null){
%>
<%=getUserPlannedTasks517mtemp %>
<%
}else{
        String tempreturnp518 = null;
        if(getUserPlannedTasks517mtemp != null){
        java.util.List listreturnp518= java.util.Arrays.asList(getUserPlannedTasks517mtemp);
        tempreturnp518 = listreturnp518.toString();
        }
        %>
        <%=tempreturnp518%>
        <%
}
break;
case 528:
        gotMethod = true;
        String patientId_127id=  request.getParameter("patientId531");
            java.lang.String patientId_127idTemp = null;
        if(!patientId_127id.equals("")){
         patientId_127idTemp  = patientId_127id;
        }
        String measurementType_128id=  request.getParameter("measurementType533");
        int measurementType_128idTemp  = Integer.parseInt(measurementType_128id);
        String fromData_129id=  request.getParameter("fromData535");
            java.util.Calendar fromData_129idTemp = null;
        if(!fromData_129id.equals("")){
        java.text.DateFormat dateFormatfromData535 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfromData535  = dateFormatfromData535.parse(fromData_129id);
         fromData_129idTemp = new java.util.GregorianCalendar();
        fromData_129idTemp.setTime(dateTempfromData535);
        }
        String toData_130id=  request.getParameter("toData537");
            java.util.Calendar toData_130idTemp = null;
        if(!toData_130id.equals("")){
        java.text.DateFormat dateFormattoData537 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTemptoData537  = dateFormattoData537.parse(toData_130id);
         toData_130idTemp = new java.util.GregorianCalendar();
        toData_130idTemp.setTime(dateTemptoData537);
        }
        String userId_131id=  request.getParameter("userId539");
            java.lang.String userId_131idTemp = null;
        if(!userId_131id.equals("")){
         userId_131idTemp  = userId_131id;
        }
        eu.aladdin_project.xsd.Measurement[] getPatientMeasurement528mtemp = sampleWSid.getPatientMeasurement(patientId_127idTemp,measurementType_128idTemp,fromData_129idTemp,toData_130idTemp,userId_131idTemp);
if(getPatientMeasurement528mtemp == null){
%>
<%=getPatientMeasurement528mtemp %>
<%
}else{
        String tempreturnp529 = null;
        if(getPatientMeasurement528mtemp != null){
        java.util.List listreturnp529= java.util.Arrays.asList(getPatientMeasurement528mtemp);
        tempreturnp529 = listreturnp529.toString();
        }
        %>
        <%=tempreturnp529%>
        <%
}
break;
case 541:
        gotMethod = true;
        String taskId_132id=  request.getParameter("taskId552");
        int taskId_132idTemp  = Integer.parseInt(taskId_132id);
        String taskStatus_133id=  request.getParameter("taskStatus554");
        int taskStatus_133idTemp  = Integer.parseInt(taskStatus_133id);
        String userId_134id=  request.getParameter("userId556");
            java.lang.String userId_134idTemp = null;
        if(!userId_134id.equals("")){
         userId_134idTemp  = userId_134id;
        }
        eu.aladdin_project.xsd.OperationResult changeTaskStatus541mtemp = sampleWSid.changeTaskStatus(taskId_132idTemp,taskStatus_133idTemp,userId_134idTemp);
if(changeTaskStatus541mtemp == null){
%>
<%=changeTaskStatus541mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(changeTaskStatus541mtemp != null){
java.lang.String typedescription548 = changeTaskStatus541mtemp.getDescription();
        String tempResultdescription548 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription548));
        %>
        <%= tempResultdescription548 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(changeTaskStatus541mtemp != null){
java.lang.String typecode550 = changeTaskStatus541mtemp.getCode();
        String tempResultcode550 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode550));
        %>
        <%= tempResultcode550 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 558:
        gotMethod = true;
        String assignerID_136id=  request.getParameter("assignerID571");
            java.lang.String assignerID_136idTemp = null;
        if(!assignerID_136id.equals("")){
         assignerID_136idTemp  = assignerID_136id;
        }
        String dateTimeFulfilled_137id=  request.getParameter("dateTimeFulfilled573");
            java.util.Calendar dateTimeFulfilled_137idTemp = null;
        if(!dateTimeFulfilled_137id.equals("")){
        java.text.DateFormat dateFormatdateTimeFulfilled573 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempdateTimeFulfilled573  = dateFormatdateTimeFulfilled573.parse(dateTimeFulfilled_137id);
         dateTimeFulfilled_137idTemp = new java.util.GregorianCalendar();
        dateTimeFulfilled_137idTemp.setTime(dateTempdateTimeFulfilled573);
        }
        String objectID_138id=  request.getParameter("objectID575");
            java.lang.String objectID_138idTemp = null;
        if(!objectID_138id.equals("")){
         objectID_138idTemp  = objectID_138id;
        }
        String executorID_139id=  request.getParameter("executorID577");
            java.lang.String executorID_139idTemp = null;
        if(!executorID_139id.equals("")){
         executorID_139idTemp  = executorID_139id;
        }
        String iD_140id=  request.getParameter("iD579");
            java.lang.String iD_140idTemp = null;
        if(!iD_140id.equals("")){
         iD_140idTemp  = iD_140id;
        }
        String uRL_141id=  request.getParameter("uRL581");
            java.lang.String uRL_141idTemp = null;
        if(!uRL_141id.equals("")){
         uRL_141idTemp  = uRL_141id;
        }
        String description_143id=  request.getParameter("description585");
            java.lang.String description_143idTemp = null;
        if(!description_143id.equals("")){
         description_143idTemp  = description_143id;
        }
        String code_144id=  request.getParameter("code587");
            java.lang.String code_144idTemp = null;
        if(!code_144id.equals("")){
         code_144idTemp  = code_144id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_142id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_142id.setDescription(description_143idTemp);
        eu1aladdin_project1xsd1SystemParameter_142id.setCode(code_144idTemp);
        String dateTimeAssigned_145id=  request.getParameter("dateTimeAssigned589");
            java.util.Calendar dateTimeAssigned_145idTemp = null;
        if(!dateTimeAssigned_145id.equals("")){
        java.text.DateFormat dateFormatdateTimeAssigned589 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempdateTimeAssigned589  = dateFormatdateTimeAssigned589.parse(dateTimeAssigned_145id);
         dateTimeAssigned_145idTemp = new java.util.GregorianCalendar();
        dateTimeAssigned_145idTemp.setTime(dateTempdateTimeAssigned589);
        }
        String description_147id=  request.getParameter("description593");
            java.lang.String description_147idTemp = null;
        if(!description_147id.equals("")){
         description_147idTemp  = description_147id;
        }
        String code_148id=  request.getParameter("code595");
            java.lang.String code_148idTemp = null;
        if(!code_148id.equals("")){
         code_148idTemp  = code_148id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_146id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_146id.setDescription(description_147idTemp);
        eu1aladdin_project1xsd1SystemParameter_146id.setCode(code_148idTemp);
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Task_135id" scope="session" class="eu.aladdin_project.xsd.Task" />
        <%
        eu1aladdin_project1xsd1Task_135id.setAssignerID(assignerID_136idTemp);
        eu1aladdin_project1xsd1Task_135id.setDateTimeFulfilled(dateTimeFulfilled_137idTemp);
        eu1aladdin_project1xsd1Task_135id.setObjectID(objectID_138idTemp);
        eu1aladdin_project1xsd1Task_135id.setExecutorID(executorID_139idTemp);
        eu1aladdin_project1xsd1Task_135id.setID(iD_140idTemp);
        eu1aladdin_project1xsd1Task_135id.setURL(uRL_141idTemp);
        eu1aladdin_project1xsd1Task_135id.setTaskStatus(eu1aladdin_project1xsd1SystemParameter_142id);
        eu1aladdin_project1xsd1Task_135id.setDateTimeAssigned(dateTimeAssigned_145idTemp);
        eu1aladdin_project1xsd1Task_135id.setTaskType(eu1aladdin_project1xsd1SystemParameter_146id);
        String userId_149id=  request.getParameter("userId597");
            java.lang.String userId_149idTemp = null;
        if(!userId_149id.equals("")){
         userId_149idTemp  = userId_149id;
        }
        eu.aladdin_project.xsd.OperationResult assignTask558mtemp = sampleWSid.assignTask(eu1aladdin_project1xsd1Task_135id,userId_149idTemp);
if(assignTask558mtemp == null){
%>
<%=assignTask558mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(assignTask558mtemp != null){
java.lang.String typedescription565 = assignTask558mtemp.getDescription();
        String tempResultdescription565 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription565));
        %>
        <%= tempResultdescription565 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(assignTask558mtemp != null){
java.lang.String typecode567 = assignTask558mtemp.getCode();
        String tempResultcode567 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode567));
        %>
        <%= tempResultcode567 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 599:
        gotMethod = true;
        String userType_150id=  request.getParameter("userType602");
        int userType_150idTemp  = Integer.parseInt(userType_150id);
        eu.aladdin_project.xsd.SystemParameter[] listOfPossibleTasks599mtemp = sampleWSid.listOfPossibleTasks(userType_150idTemp);
if(listOfPossibleTasks599mtemp == null){
%>
<%=listOfPossibleTasks599mtemp %>
<%
}else{
        String tempreturnp600 = null;
        if(listOfPossibleTasks599mtemp != null){
        java.util.List listreturnp600= java.util.Arrays.asList(listOfPossibleTasks599mtemp);
        tempreturnp600 = listreturnp600.toString();
        }
        %>
        <%=tempreturnp600%>
        <%
}
break;
case 604:
        gotMethod = true;
        String userId_151id=  request.getParameter("userId607");
            java.lang.String userId_151idTemp = null;
        if(!userId_151id.equals("")){
         userId_151idTemp  = userId_151id;
        }
        eu.aladdin_project.xsd.QuestionnaireInfo[] listOfQuestionnaires604mtemp = sampleWSid.listOfQuestionnaires(userId_151idTemp);
if(listOfQuestionnaires604mtemp == null){
%>
<%=listOfQuestionnaires604mtemp %>
<%
}else{
        String tempreturnp605 = null;
        if(listOfQuestionnaires604mtemp != null){
        java.util.List listreturnp605= java.util.Arrays.asList(listOfQuestionnaires604mtemp);
        tempreturnp605 = listreturnp605.toString();
        }
        %>
        <%=tempreturnp605%>
        <%
}
break;
case 609:
        gotMethod = true;
        String id_152id=  request.getParameter("id612");
            java.lang.String id_152idTemp = null;
        if(!id_152id.equals("")){
         id_152idTemp  = id_152id;
        }
        String userId_153id=  request.getParameter("userId614");
            java.lang.String userId_153idTemp = null;
        if(!userId_153id.equals("")){
         userId_153idTemp  = userId_153id;
        }
        eu.aladdin_project.xsd.QuestionnaireQuestion[] getQuestionnaire609mtemp = sampleWSid.getQuestionnaire(id_152idTemp,userId_153idTemp);
if(getQuestionnaire609mtemp == null){
%>
<%=getQuestionnaire609mtemp %>
<%
}else{
        String tempreturnp610 = null;
        if(getQuestionnaire609mtemp != null){
        java.util.List listreturnp610= java.util.Arrays.asList(getQuestionnaire609mtemp);
        tempreturnp610 = listreturnp610.toString();
        }
        %>
        <%=tempreturnp610%>
        <%
}
break;
case 616:
        gotMethod = true;
        String id_154id=  request.getParameter("id627");
            java.lang.String id_154idTemp = null;
        if(!id_154id.equals("")){
         id_154idTemp  = id_154id;
        }
        String userId_155id=  request.getParameter("userId629");
            java.lang.String userId_155idTemp = null;
        if(!userId_155id.equals("")){
         userId_155idTemp  = userId_155id;
        }
        eu.aladdin_project.xsd.OperationResult deleteQuestionnaire616mtemp = sampleWSid.deleteQuestionnaire(id_154idTemp,userId_155idTemp);
if(deleteQuestionnaire616mtemp == null){
%>
<%=deleteQuestionnaire616mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deleteQuestionnaire616mtemp != null){
java.lang.String typedescription623 = deleteQuestionnaire616mtemp.getDescription();
        String tempResultdescription623 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription623));
        %>
        <%= tempResultdescription623 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deleteQuestionnaire616mtemp != null){
java.lang.String typecode625 = deleteQuestionnaire616mtemp.getCode();
        String tempResultcode625 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode625));
        %>
        <%= tempResultcode625 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 631:
        gotMethod = true;
        String objectId_156id=  request.getParameter("objectId634");
            java.lang.String objectId_156idTemp = null;
        if(!objectId_156id.equals("")){
         objectId_156idTemp  = objectId_156id;
        }
        String fromDate_157id=  request.getParameter("fromDate636");
            java.util.Calendar fromDate_157idTemp = null;
        if(!fromDate_157id.equals("")){
        java.text.DateFormat dateFormatfromDate636 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempfromDate636  = dateFormatfromDate636.parse(fromDate_157id);
         fromDate_157idTemp = new java.util.GregorianCalendar();
        fromDate_157idTemp.setTime(dateTempfromDate636);
        }
        String toDate_158id=  request.getParameter("toDate638");
            java.util.Calendar toDate_158idTemp = null;
        if(!toDate_158id.equals("")){
        java.text.DateFormat dateFormattoDate638 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTemptoDate638  = dateFormattoDate638.parse(toDate_158id);
         toDate_158idTemp = new java.util.GregorianCalendar();
        toDate_158idTemp.setTime(dateTemptoDate638);
        }
        String userId_159id=  request.getParameter("userId640");
            java.lang.String userId_159idTemp = null;
        if(!userId_159id.equals("")){
         userId_159idTemp  = userId_159id;
        }
        eu.aladdin_project.xsd.QuestionnaireAnswer[][] getQuestionnaireAnswers631mtemp = sampleWSid.getQuestionnaireAnswers(objectId_156idTemp,fromDate_157idTemp,toDate_158idTemp,userId_159idTemp);
if(getQuestionnaireAnswers631mtemp == null){
%>
<%=getQuestionnaireAnswers631mtemp %>
<%
}else{
        String tempreturnp632 = null;
        if(getQuestionnaireAnswers631mtemp != null){
        java.util.List listreturnp632= java.util.Arrays.asList(getQuestionnaireAnswers631mtemp);
        tempreturnp632 = listreturnp632.toString();
        }
        %>
        <%=tempreturnp632%>
        <%
}
break;
case 642:
        gotMethod = true;
        String incontinence_161id=  request.getParameter("incontinence655");
            java.lang.Boolean incontinence_161idTemp = null;
        if(!incontinence_161id.equals("")){
         incontinence_161idTemp  = java.lang.Boolean.valueOf(incontinence_161id);
        }
        String comorbidity_162id=  request.getParameter("comorbidity657");
            java.lang.String comorbidity_162idTemp = null;
        if(!comorbidity_162id.equals("")){
         comorbidity_162idTemp  = comorbidity_162id;
        }
        String iD_163id=  request.getParameter("iD659");
            java.lang.String iD_163idTemp = null;
        if(!iD_163id.equals("")){
         iD_163idTemp  = iD_163id;
        }
        String value_165id=  request.getParameter("value663");
        long value_165idTemp  = Long.parseLong(value_165id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_164id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_164id.setValue(value_165idTemp);
        String value_167id=  request.getParameter("value667");
        long value_167idTemp  = Long.parseLong(value_167id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_166id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_166id.setValue(value_167idTemp);
        String falls_168id=  request.getParameter("falls669");
            java.lang.Boolean falls_168idTemp = null;
        if(!falls_168id.equals("")){
         falls_168idTemp  = java.lang.Boolean.valueOf(falls_168id);
        }
        String value_170id=  request.getParameter("value673");
        long value_170idTemp  = Long.parseLong(value_170id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_169id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_169id.setValue(value_170idTemp);
        String patientID_171id=  request.getParameter("patientID675");
            java.lang.String patientID_171idTemp = null;
        if(!patientID_171id.equals("")){
         patientID_171idTemp  = patientID_171id;
        }
        String delirium_172id=  request.getParameter("delirium677");
            java.lang.Boolean delirium_172idTemp = null;
        if(!delirium_172id.equals("")){
         delirium_172idTemp  = java.lang.Boolean.valueOf(delirium_172id);
        }
        String value_174id=  request.getParameter("value681");
        long value_174idTemp  = Long.parseLong(value_174id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_173id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_173id.setValue(value_174idTemp);
        String value_176id=  request.getParameter("value685");
        long value_176idTemp  = Long.parseLong(value_176id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_175id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_175id.setValue(value_176idTemp);
        String description_178id=  request.getParameter("description689");
            java.lang.String description_178idTemp = null;
        if(!description_178id.equals("")){
         description_178idTemp  = description_178id;
        }
        String code_179id=  request.getParameter("code691");
            java.lang.String code_179idTemp = null;
        if(!code_179id.equals("")){
         code_179idTemp  = code_179id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_177id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_177id.setDescription(description_178idTemp);
        eu1aladdin_project1xsd1SystemParameter_177id.setCode(code_179idTemp);
        String sensorialDeficits_180id=  request.getParameter("sensorialDeficits693");
            java.lang.Boolean sensorialDeficits_180idTemp = null;
        if(!sensorialDeficits_180id.equals("")){
         sensorialDeficits_180idTemp  = java.lang.Boolean.valueOf(sensorialDeficits_180id);
        }
        String dateOfAssessment_181id=  request.getParameter("dateOfAssessment695");
            java.util.Calendar dateOfAssessment_181idTemp = null;
        if(!dateOfAssessment_181id.equals("")){
        java.text.DateFormat dateFormatdateOfAssessment695 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempdateOfAssessment695  = dateFormatdateOfAssessment695.parse(dateOfAssessment_181id);
         dateOfAssessment_181idTemp = new java.util.GregorianCalendar();
        dateOfAssessment_181idTemp.setTime(dateTempdateOfAssessment695);
        }
        String value_183id=  request.getParameter("value699");
        long value_183idTemp  = Long.parseLong(value_183id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_182id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_182id.setValue(value_183idTemp);
        String relevantPathologyAntecedents_184id=  request.getParameter("relevantPathologyAntecedents701");
            java.lang.String relevantPathologyAntecedents_184idTemp = null;
        if(!relevantPathologyAntecedents_184id.equals("")){
         relevantPathologyAntecedents_184idTemp  = relevantPathologyAntecedents_184id;
        }
        String value_186id=  request.getParameter("value705");
        long value_186idTemp  = Long.parseLong(value_186id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_185id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_185id.setValue(value_186idTemp);
        String value_188id=  request.getParameter("value709");
        long value_188idTemp  = Long.parseLong(value_188id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_187id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_187id.setValue(value_188idTemp);
        String value_190id=  request.getParameter("value713");
        long value_190idTemp  = Long.parseLong(value_190id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_189id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_189id.setValue(value_190idTemp);
        String value_192id=  request.getParameter("value717");
        long value_192idTemp  = Long.parseLong(value_192id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_191id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_191id.setValue(value_192idTemp);
        String blessedScalePart1_193id=  request.getParameter("blessedScalePart1719");
            java.math.BigDecimal blessedScalePart1_193idTemp = null;
        if(!blessedScalePart1_193id.equals("")){
         blessedScalePart1_193idTemp  = new java.math.BigDecimal(blessedScalePart1_193id);
        }
        String value_195id=  request.getParameter("value723");
        long value_195idTemp  = Long.parseLong(value_195id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_194id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_194id.setValue(value_195idTemp);
        String pharmacologicalTreatment_196id=  request.getParameter("pharmacologicalTreatment725");
            java.lang.String pharmacologicalTreatment_196idTemp = null;
        if(!pharmacologicalTreatment_196id.equals("")){
         pharmacologicalTreatment_196idTemp  = pharmacologicalTreatment_196id;
        }
        String value_198id=  request.getParameter("value729");
        long value_198idTemp  = Long.parseLong(value_198id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_197id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_197id.setValue(value_198idTemp);
        String immobility_199id=  request.getParameter("immobility731");
            java.lang.Boolean immobility_199idTemp = null;
        if(!immobility_199id.equals("")){
         immobility_199idTemp  = java.lang.Boolean.valueOf(immobility_199id);
        }
        String value_201id=  request.getParameter("value735");
        long value_201idTemp  = Long.parseLong(value_201id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_200id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_200id.setValue(value_201idTemp);
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1PatientAssessment_160id" scope="session" class="eu.aladdin_project.xsd.PatientAssessment" />
        <%
        eu1aladdin_project1xsd1PatientAssessment_160id.setIncontinence(incontinence_161idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setComorbidity(comorbidity_162idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setID(iD_163idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setGDS(org1apache1axis1types1UnsignedByte_164id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setChecklistMBP(org1apache1axis1types1UnsignedByte_166id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setFalls(falls_168idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setLawtonIndex(org1apache1axis1types1UnsignedByte_169id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setPatientID(patientID_171idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setDelirium(delirium_172idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setCharlsonComorbidityIndex(org1apache1axis1types1UnsignedByte_173id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setMMSE(org1apache1axis1types1UnsignedByte_175id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setAetology(eu1aladdin_project1xsd1SystemParameter_177id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setSensorialDeficits(sensorialDeficits_180idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setDateOfAssessment(dateOfAssessment_181idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setSeverity(org1apache1axis1types1UnsignedByte_182id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setRelevantPathologyAntecedents(relevantPathologyAntecedents_184idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setBlessedScalePart3(org1apache1axis1types1UnsignedByte_185id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setBlessedScalePart2(org1apache1axis1types1UnsignedByte_187id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setTimeEllapsedSinceDiagnosed(org1apache1axis1types1UnsignedByte_189id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setBarthelIndex(org1apache1axis1types1UnsignedByte_191id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setBlessedScalePart1(blessedScalePart1_193idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setNPQI_Stress(org1apache1axis1types1UnsignedByte_194id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setPharmacologicalTreatment(pharmacologicalTreatment_196idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setNPQI_Severity(org1apache1axis1types1UnsignedByte_197id);
        eu1aladdin_project1xsd1PatientAssessment_160id.setImmobility(immobility_199idTemp);
        eu1aladdin_project1xsd1PatientAssessment_160id.setMDRS(org1apache1axis1types1UnsignedByte_200id);
        String userId_202id=  request.getParameter("userId737");
            java.lang.String userId_202idTemp = null;
        if(!userId_202id.equals("")){
         userId_202idTemp  = userId_202id;
        }
        eu.aladdin_project.xsd.OperationResult savePatientAssessment642mtemp = sampleWSid.savePatientAssessment(eu1aladdin_project1xsd1PatientAssessment_160id,userId_202idTemp);
if(savePatientAssessment642mtemp == null){
%>
<%=savePatientAssessment642mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(savePatientAssessment642mtemp != null){
java.lang.String typedescription649 = savePatientAssessment642mtemp.getDescription();
        String tempResultdescription649 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription649));
        %>
        <%= tempResultdescription649 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(savePatientAssessment642mtemp != null){
java.lang.String typecode651 = savePatientAssessment642mtemp.getCode();
        String tempResultcode651 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode651));
        %>
        <%= tempResultcode651 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 739:
        gotMethod = true;
        String dateOfAssessment_204id=  request.getParameter("dateOfAssessment752");
            java.util.Calendar dateOfAssessment_204idTemp = null;
        if(!dateOfAssessment_204id.equals("")){
        java.text.DateFormat dateFormatdateOfAssessment752 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempdateOfAssessment752  = dateFormatdateOfAssessment752.parse(dateOfAssessment_204id);
         dateOfAssessment_204idTemp = new java.util.GregorianCalendar();
        dateOfAssessment_204idTemp.setTime(dateTempdateOfAssessment752);
        }
        String value_206id=  request.getParameter("value756");
        long value_206idTemp  = Long.parseLong(value_206id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_205id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_205id.setValue(value_206idTemp);
        String value_208id=  request.getParameter("value760");
        long value_208idTemp  = Long.parseLong(value_208id);
        %>
        <jsp:useBean id="org1apache1axis1types1UnsignedByte_207id" scope="session" class="org.apache.axis.types.UnsignedByte" />
        <%
        org1apache1axis1types1UnsignedByte_207id.setValue(value_208idTemp);
        String clinicianID_209id=  request.getParameter("clinicianID762");
            java.lang.String clinicianID_209idTemp = null;
        if(!clinicianID_209id.equals("")){
         clinicianID_209idTemp  = clinicianID_209id;
        }
        String iD_210id=  request.getParameter("iD764");
            java.lang.String iD_210idTemp = null;
        if(!iD_210id.equals("")){
         iD_210idTemp  = iD_210id;
        }
        String relevantHealthProblem_211id=  request.getParameter("relevantHealthProblem766");
            java.lang.String relevantHealthProblem_211idTemp = null;
        if(!relevantHealthProblem_211id.equals("")){
         relevantHealthProblem_211idTemp  = relevantHealthProblem_211id;
        }
        String carerID_212id=  request.getParameter("carerID768");
            java.lang.String carerID_212idTemp = null;
        if(!carerID_212id.equals("")){
         carerID_212idTemp  = carerID_212id;
        }
        String psychoactiveDrugs_213id=  request.getParameter("psychoactiveDrugs770");
            java.lang.String psychoactiveDrugs_213idTemp = null;
        if(!psychoactiveDrugs_213id.equals("")){
         psychoactiveDrugs_213idTemp  = psychoactiveDrugs_213id;
        }
        String emotionalOrMentalDisorders_214id=  request.getParameter("emotionalOrMentalDisorders772");
            java.lang.String emotionalOrMentalDisorders_214idTemp = null;
        if(!emotionalOrMentalDisorders_214id.equals("")){
         emotionalOrMentalDisorders_214idTemp  = emotionalOrMentalDisorders_214id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1CarerAssessment_203id" scope="session" class="eu.aladdin_project.xsd.CarerAssessment" />
        <%
        eu1aladdin_project1xsd1CarerAssessment_203id.setDateOfAssessment(dateOfAssessment_204idTemp);
        eu1aladdin_project1xsd1CarerAssessment_203id.setQualityOfLife(org1apache1axis1types1UnsignedByte_205id);
        eu1aladdin_project1xsd1CarerAssessment_203id.setSeverityOfBurden(org1apache1axis1types1UnsignedByte_207id);
        eu1aladdin_project1xsd1CarerAssessment_203id.setClinicianID(clinicianID_209idTemp);
        eu1aladdin_project1xsd1CarerAssessment_203id.setID(iD_210idTemp);
        eu1aladdin_project1xsd1CarerAssessment_203id.setRelevantHealthProblem(relevantHealthProblem_211idTemp);
        eu1aladdin_project1xsd1CarerAssessment_203id.setCarerID(carerID_212idTemp);
        eu1aladdin_project1xsd1CarerAssessment_203id.setPsychoactiveDrugs(psychoactiveDrugs_213idTemp);
        eu1aladdin_project1xsd1CarerAssessment_203id.setEmotionalOrMentalDisorders(emotionalOrMentalDisorders_214idTemp);
        String userId_215id=  request.getParameter("userId774");
            java.lang.String userId_215idTemp = null;
        if(!userId_215id.equals("")){
         userId_215idTemp  = userId_215id;
        }
        eu.aladdin_project.xsd.OperationResult saveCarerAssessment739mtemp = sampleWSid.saveCarerAssessment(eu1aladdin_project1xsd1CarerAssessment_203id,userId_215idTemp);
if(saveCarerAssessment739mtemp == null){
%>
<%=saveCarerAssessment739mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(saveCarerAssessment739mtemp != null){
java.lang.String typedescription746 = saveCarerAssessment739mtemp.getDescription();
        String tempResultdescription746 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription746));
        %>
        <%= tempResultdescription746 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(saveCarerAssessment739mtemp != null){
java.lang.String typecode748 = saveCarerAssessment739mtemp.getCode();
        String tempResultcode748 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode748));
        %>
        <%= tempResultcode748 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 776:
        gotMethod = true;
        String assessmentId_216id=  request.getParameter("assessmentId787");
            java.lang.String assessmentId_216idTemp = null;
        if(!assessmentId_216id.equals("")){
         assessmentId_216idTemp  = assessmentId_216id;
        }
        String userId_217id=  request.getParameter("userId789");
            java.lang.String userId_217idTemp = null;
        if(!userId_217id.equals("")){
         userId_217idTemp  = userId_217id;
        }
        eu.aladdin_project.xsd.OperationResult deletePatientAssessment776mtemp = sampleWSid.deletePatientAssessment(assessmentId_216idTemp,userId_217idTemp);
if(deletePatientAssessment776mtemp == null){
%>
<%=deletePatientAssessment776mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deletePatientAssessment776mtemp != null){
java.lang.String typedescription783 = deletePatientAssessment776mtemp.getDescription();
        String tempResultdescription783 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription783));
        %>
        <%= tempResultdescription783 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deletePatientAssessment776mtemp != null){
java.lang.String typecode785 = deletePatientAssessment776mtemp.getCode();
        String tempResultcode785 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode785));
        %>
        <%= tempResultcode785 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 791:
        gotMethod = true;
        String assessmentId_218id=  request.getParameter("assessmentId802");
            java.lang.String assessmentId_218idTemp = null;
        if(!assessmentId_218id.equals("")){
         assessmentId_218idTemp  = assessmentId_218id;
        }
        String userId_219id=  request.getParameter("userId804");
            java.lang.String userId_219idTemp = null;
        if(!userId_219id.equals("")){
         userId_219idTemp  = userId_219id;
        }
        eu.aladdin_project.xsd.OperationResult deleteCarerAssessment791mtemp = sampleWSid.deleteCarerAssessment(assessmentId_218idTemp,userId_219idTemp);
if(deleteCarerAssessment791mtemp == null){
%>
<%=deleteCarerAssessment791mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deleteCarerAssessment791mtemp != null){
java.lang.String typedescription798 = deleteCarerAssessment791mtemp.getDescription();
        String tempResultdescription798 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription798));
        %>
        <%= tempResultdescription798 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deleteCarerAssessment791mtemp != null){
java.lang.String typecode800 = deleteCarerAssessment791mtemp.getCode();
        String tempResultcode800 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode800));
        %>
        <%= tempResultcode800 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 806:
        gotMethod = true;
        String patientId_220id=  request.getParameter("patientId809");
            java.lang.String patientId_220idTemp = null;
        if(!patientId_220id.equals("")){
         patientId_220idTemp  = patientId_220id;
        }
        String userId_221id=  request.getParameter("userId811");
            java.lang.String userId_221idTemp = null;
        if(!userId_221id.equals("")){
         userId_221idTemp  = userId_221id;
        }
        eu.aladdin_project.xsd.PatientAssessment[] getPatientAssessments806mtemp = sampleWSid.getPatientAssessments(patientId_220idTemp,userId_221idTemp);
if(getPatientAssessments806mtemp == null){
%>
<%=getPatientAssessments806mtemp %>
<%
}else{
        String tempreturnp807 = null;
        if(getPatientAssessments806mtemp != null){
        java.util.List listreturnp807= java.util.Arrays.asList(getPatientAssessments806mtemp);
        tempreturnp807 = listreturnp807.toString();
        }
        %>
        <%=tempreturnp807%>
        <%
}
break;
case 813:
        gotMethod = true;
        String carerId_222id=  request.getParameter("carerId816");
            java.lang.String carerId_222idTemp = null;
        if(!carerId_222id.equals("")){
         carerId_222idTemp  = carerId_222id;
        }
        String userId_223id=  request.getParameter("userId818");
            java.lang.String userId_223idTemp = null;
        if(!userId_223id.equals("")){
         userId_223idTemp  = userId_223id;
        }
        eu.aladdin_project.xsd.CarerAssessment[] getCarerAssessments813mtemp = sampleWSid.getCarerAssessments(carerId_222idTemp,userId_223idTemp);
if(getCarerAssessments813mtemp == null){
%>
<%=getCarerAssessments813mtemp %>
<%
}else{
        String tempreturnp814 = null;
        if(getCarerAssessments813mtemp != null){
        java.util.List listreturnp814= java.util.Arrays.asList(getCarerAssessments813mtemp);
        tempreturnp814 = listreturnp814.toString();
        }
        %>
        <%=tempreturnp814%>
        <%
}
break;
case 820:
        gotMethod = true;
        String address_225id=  request.getParameter("address833");
            java.lang.String address_225idTemp = null;
        if(!address_225id.equals("")){
         address_225idTemp  = address_225id;
        }
        String description_226id=  request.getParameter("description835");
            java.lang.String description_226idTemp = null;
        if(!description_226id.equals("")){
         description_226idTemp  = description_226id;
        }
        String iD_227id=  request.getParameter("iD837");
            java.lang.String iD_227idTemp = null;
        if(!iD_227id.equals("")){
         iD_227idTemp  = iD_227id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1ExternalService_224id" scope="session" class="eu.aladdin_project.xsd.ExternalService" />
        <%
        eu1aladdin_project1xsd1ExternalService_224id.setAddress(address_225idTemp);
        eu1aladdin_project1xsd1ExternalService_224id.setDescription(description_226idTemp);
        eu1aladdin_project1xsd1ExternalService_224id.setID(iD_227idTemp);
        String userId_228id=  request.getParameter("userId839");
            java.lang.String userId_228idTemp = null;
        if(!userId_228id.equals("")){
         userId_228idTemp  = userId_228id;
        }
        eu.aladdin_project.xsd.OperationResult createExternalService820mtemp = sampleWSid.createExternalService(eu1aladdin_project1xsd1ExternalService_224id,userId_228idTemp);
if(createExternalService820mtemp == null){
%>
<%=createExternalService820mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(createExternalService820mtemp != null){
java.lang.String typedescription827 = createExternalService820mtemp.getDescription();
        String tempResultdescription827 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription827));
        %>
        <%= tempResultdescription827 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(createExternalService820mtemp != null){
java.lang.String typecode829 = createExternalService820mtemp.getCode();
        String tempResultcode829 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode829));
        %>
        <%= tempResultcode829 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 841:
        gotMethod = true;
        String address_230id=  request.getParameter("address854");
            java.lang.String address_230idTemp = null;
        if(!address_230id.equals("")){
         address_230idTemp  = address_230id;
        }
        String description_231id=  request.getParameter("description856");
            java.lang.String description_231idTemp = null;
        if(!description_231id.equals("")){
         description_231idTemp  = description_231id;
        }
        String iD_232id=  request.getParameter("iD858");
            java.lang.String iD_232idTemp = null;
        if(!iD_232id.equals("")){
         iD_232idTemp  = iD_232id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1ExternalService_229id" scope="session" class="eu.aladdin_project.xsd.ExternalService" />
        <%
        eu1aladdin_project1xsd1ExternalService_229id.setAddress(address_230idTemp);
        eu1aladdin_project1xsd1ExternalService_229id.setDescription(description_231idTemp);
        eu1aladdin_project1xsd1ExternalService_229id.setID(iD_232idTemp);
        String userId_233id=  request.getParameter("userId860");
            java.lang.String userId_233idTemp = null;
        if(!userId_233id.equals("")){
         userId_233idTemp  = userId_233id;
        }
        eu.aladdin_project.xsd.OperationResult updateExternalService841mtemp = sampleWSid.updateExternalService(eu1aladdin_project1xsd1ExternalService_229id,userId_233idTemp);
if(updateExternalService841mtemp == null){
%>
<%=updateExternalService841mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(updateExternalService841mtemp != null){
java.lang.String typedescription848 = updateExternalService841mtemp.getDescription();
        String tempResultdescription848 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription848));
        %>
        <%= tempResultdescription848 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(updateExternalService841mtemp != null){
java.lang.String typecode850 = updateExternalService841mtemp.getCode();
        String tempResultcode850 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode850));
        %>
        <%= tempResultcode850 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 862:
        gotMethod = true;
        String id_234id=  request.getParameter("id873");
            java.lang.String id_234idTemp = null;
        if(!id_234id.equals("")){
         id_234idTemp  = id_234id;
        }
        String userId_235id=  request.getParameter("userId875");
            java.lang.String userId_235idTemp = null;
        if(!userId_235id.equals("")){
         userId_235idTemp  = userId_235id;
        }
        eu.aladdin_project.xsd.OperationResult deleteExternalService862mtemp = sampleWSid.deleteExternalService(id_234idTemp,userId_235idTemp);
if(deleteExternalService862mtemp == null){
%>
<%=deleteExternalService862mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deleteExternalService862mtemp != null){
java.lang.String typedescription869 = deleteExternalService862mtemp.getDescription();
        String tempResultdescription869 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription869));
        %>
        <%= tempResultdescription869 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deleteExternalService862mtemp != null){
java.lang.String typecode871 = deleteExternalService862mtemp.getCode();
        String tempResultcode871 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode871));
        %>
        <%= tempResultcode871 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 877:
        gotMethod = true;
        String userId_236id=  request.getParameter("userId880");
            java.lang.String userId_236idTemp = null;
        if(!userId_236id.equals("")){
         userId_236idTemp  = userId_236id;
        }
        eu.aladdin_project.xsd.ExternalService[] getAllExternalServices877mtemp = sampleWSid.getAllExternalServices(userId_236idTemp);
if(getAllExternalServices877mtemp == null){
%>
<%=getAllExternalServices877mtemp %>
<%
}else{
        String tempreturnp878 = null;
        if(getAllExternalServices877mtemp != null){
        java.util.List listreturnp878= java.util.Arrays.asList(getAllExternalServices877mtemp);
        tempreturnp878 = listreturnp878.toString();
        }
        %>
        <%=tempreturnp878%>
        <%
}
break;
case 882:
        gotMethod = true;
        String description_239id=  request.getParameter("description897");
            java.lang.String description_239idTemp = null;
        if(!description_239id.equals("")){
         description_239idTemp  = description_239id;
        }
        String code_240id=  request.getParameter("code899");
            java.lang.String code_240idTemp = null;
        if(!code_240id.equals("")){
         code_240idTemp  = code_240id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_238id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_238id.setDescription(description_239idTemp);
        eu1aladdin_project1xsd1SystemParameter_238id.setCode(code_240idTemp);
        String justificationText_241id=  request.getParameter("justificationText901");
            java.lang.String justificationText_241idTemp = null;
        if(!justificationText_241id.equals("")){
         justificationText_241idTemp  = justificationText_241id;
        }
        String dateTimeOfWarning_242id=  request.getParameter("dateTimeOfWarning903");
            java.util.Calendar dateTimeOfWarning_242idTemp = null;
        if(!dateTimeOfWarning_242id.equals("")){
        java.text.DateFormat dateFormatdateTimeOfWarning903 = java.text.DateFormat.getDateInstance();
        java.util.Date dateTempdateTimeOfWarning903  = dateFormatdateTimeOfWarning903.parse(dateTimeOfWarning_242id);
         dateTimeOfWarning_242idTemp = new java.util.GregorianCalendar();
        dateTimeOfWarning_242idTemp.setTime(dateTempdateTimeOfWarning903);
        }
        String patientID_243id=  request.getParameter("patientID905");
            java.lang.String patientID_243idTemp = null;
        if(!patientID_243id.equals("")){
         patientID_243idTemp  = patientID_243id;
        }
        String delivered_244id=  request.getParameter("delivered907");
        boolean delivered_244idTemp  = Boolean.valueOf(delivered_244id).booleanValue();
        String iD_245id=  request.getParameter("iD909");
            java.lang.String iD_245idTemp = null;
        if(!iD_245id.equals("")){
         iD_245idTemp  = iD_245id;
        }
        String description_247id=  request.getParameter("description913");
            java.lang.String description_247idTemp = null;
        if(!description_247id.equals("")){
         description_247idTemp  = description_247id;
        }
        String code_248id=  request.getParameter("code915");
            java.lang.String code_248idTemp = null;
        if(!code_248id.equals("")){
         code_248idTemp  = code_248id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_246id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_246id.setDescription(description_247idTemp);
        eu1aladdin_project1xsd1SystemParameter_246id.setCode(code_248idTemp);
        String description_250id=  request.getParameter("description919");
            java.lang.String description_250idTemp = null;
        if(!description_250id.equals("")){
         description_250idTemp  = description_250id;
        }
        String code_251id=  request.getParameter("code921");
            java.lang.String code_251idTemp = null;
        if(!code_251id.equals("")){
         code_251idTemp  = code_251id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_249id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_249id.setDescription(description_250idTemp);
        eu1aladdin_project1xsd1SystemParameter_249id.setCode(code_251idTemp);
        String description_253id=  request.getParameter("description925");
            java.lang.String description_253idTemp = null;
        if(!description_253id.equals("")){
         description_253idTemp  = description_253id;
        }
        String code_254id=  request.getParameter("code927");
            java.lang.String code_254idTemp = null;
        if(!code_254id.equals("")){
         code_254idTemp  = code_254id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_252id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_252id.setDescription(description_253idTemp);
        eu1aladdin_project1xsd1SystemParameter_252id.setCode(code_254idTemp);
        String description_256id=  request.getParameter("description931");
            java.lang.String description_256idTemp = null;
        if(!description_256id.equals("")){
         description_256idTemp  = description_256id;
        }
        String code_257id=  request.getParameter("code933");
            java.lang.String code_257idTemp = null;
        if(!code_257id.equals("")){
         code_257idTemp  = code_257id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_255id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_255id.setDescription(description_256idTemp);
        eu1aladdin_project1xsd1SystemParameter_255id.setCode(code_257idTemp);
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1Warning_237id" scope="session" class="eu.aladdin_project.xsd.Warning" />
        <%
        eu1aladdin_project1xsd1Warning_237id.setTypeOfWarning(eu1aladdin_project1xsd1SystemParameter_238id);
        eu1aladdin_project1xsd1Warning_237id.setJustificationText(justificationText_241idTemp);
        eu1aladdin_project1xsd1Warning_237id.setDateTimeOfWarning(dateTimeOfWarning_242idTemp);
        eu1aladdin_project1xsd1Warning_237id.setPatientID(patientID_243idTemp);
        eu1aladdin_project1xsd1Warning_237id.setDelivered(delivered_244idTemp);
        eu1aladdin_project1xsd1Warning_237id.setID(iD_245idTemp);
        eu1aladdin_project1xsd1Warning_237id.setRiskLevel(eu1aladdin_project1xsd1SystemParameter_246id);
        eu1aladdin_project1xsd1Warning_237id.setEmergencyLevel(eu1aladdin_project1xsd1SystemParameter_249id);
        eu1aladdin_project1xsd1Warning_237id.setIndicator(eu1aladdin_project1xsd1SystemParameter_252id);
        eu1aladdin_project1xsd1Warning_237id.setEffect(eu1aladdin_project1xsd1SystemParameter_255id);
        String userId_258id=  request.getParameter("userId935");
            java.lang.String userId_258idTemp = null;
        if(!userId_258id.equals("")){
         userId_258idTemp  = userId_258id;
        }
        eu.aladdin_project.xsd.OperationResult saveWarning882mtemp = sampleWSid.saveWarning(eu1aladdin_project1xsd1Warning_237id,userId_258idTemp);
if(saveWarning882mtemp == null){
%>
<%=saveWarning882mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(saveWarning882mtemp != null){
java.lang.String typedescription889 = saveWarning882mtemp.getDescription();
        String tempResultdescription889 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription889));
        %>
        <%= tempResultdescription889 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(saveWarning882mtemp != null){
java.lang.String typecode891 = saveWarning882mtemp.getCode();
        String tempResultcode891 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode891));
        %>
        <%= tempResultcode891 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 937:
        gotMethod = true;
        String id_259id=  request.getParameter("id948");
            java.lang.String id_259idTemp = null;
        if(!id_259id.equals("")){
         id_259idTemp  = id_259id;
        }
        String userId_260id=  request.getParameter("userId950");
            java.lang.String userId_260idTemp = null;
        if(!userId_260id.equals("")){
         userId_260idTemp  = userId_260id;
        }
        eu.aladdin_project.xsd.OperationResult markWarningAsRead937mtemp = sampleWSid.markWarningAsRead(id_259idTemp,userId_260idTemp);
if(markWarningAsRead937mtemp == null){
%>
<%=markWarningAsRead937mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(markWarningAsRead937mtemp != null){
java.lang.String typedescription944 = markWarningAsRead937mtemp.getDescription();
        String tempResultdescription944 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription944));
        %>
        <%= tempResultdescription944 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(markWarningAsRead937mtemp != null){
java.lang.String typecode946 = markWarningAsRead937mtemp.getCode();
        String tempResultcode946 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode946));
        %>
        <%= tempResultcode946 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 952:
        gotMethod = true;
        String password_262id=  request.getParameter("password965");
            java.lang.String password_262idTemp = null;
        if(!password_262id.equals("")){
         password_262idTemp  = password_262id;
        }
        String personID_263id=  request.getParameter("personID967");
            java.lang.String personID_263idTemp = null;
        if(!personID_263id.equals("")){
         personID_263idTemp  = personID_263id;
        }
        String description_265id=  request.getParameter("description971");
            java.lang.String description_265idTemp = null;
        if(!description_265id.equals("")){
         description_265idTemp  = description_265id;
        }
        String code_266id=  request.getParameter("code973");
            java.lang.String code_266idTemp = null;
        if(!code_266id.equals("")){
         code_266idTemp  = code_266id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_264id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_264id.setDescription(description_265idTemp);
        eu1aladdin_project1xsd1SystemParameter_264id.setCode(code_266idTemp);
        String iD_267id=  request.getParameter("iD975");
            java.lang.String iD_267idTemp = null;
        if(!iD_267id.equals("")){
         iD_267idTemp  = iD_267id;
        }
        String username_268id=  request.getParameter("username977");
            java.lang.String username_268idTemp = null;
        if(!username_268id.equals("")){
         username_268idTemp  = username_268id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1User_261id" scope="session" class="eu.aladdin_project.xsd.User" />
        <%
        eu1aladdin_project1xsd1User_261id.setPassword(password_262idTemp);
        eu1aladdin_project1xsd1User_261id.setPersonID(personID_263idTemp);
        eu1aladdin_project1xsd1User_261id.setType(eu1aladdin_project1xsd1SystemParameter_264id);
        eu1aladdin_project1xsd1User_261id.setID(iD_267idTemp);
        eu1aladdin_project1xsd1User_261id.setUsername(username_268idTemp);
        eu.aladdin_project.xsd.OperationResult createUser952mtemp = sampleWSid.createUser(eu1aladdin_project1xsd1User_261id);
if(createUser952mtemp == null){
%>
<%=createUser952mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(createUser952mtemp != null){
java.lang.String typedescription959 = createUser952mtemp.getDescription();
        String tempResultdescription959 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription959));
        %>
        <%= tempResultdescription959 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(createUser952mtemp != null){
java.lang.String typecode961 = createUser952mtemp.getCode();
        String tempResultcode961 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode961));
        %>
        <%= tempResultcode961 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 979:
        gotMethod = true;
        String id_269id=  request.getParameter("id990");
            java.lang.String id_269idTemp = null;
        if(!id_269id.equals("")){
         id_269idTemp  = id_269id;
        }
        eu.aladdin_project.xsd.OperationResult deleteUser979mtemp = sampleWSid.deleteUser(id_269idTemp);
if(deleteUser979mtemp == null){
%>
<%=deleteUser979mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(deleteUser979mtemp != null){
java.lang.String typedescription986 = deleteUser979mtemp.getDescription();
        String tempResultdescription986 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription986));
        %>
        <%= tempResultdescription986 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(deleteUser979mtemp != null){
java.lang.String typecode988 = deleteUser979mtemp.getCode();
        String tempResultcode988 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode988));
        %>
        <%= tempResultcode988 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 992:
        gotMethod = true;
        String password_271id=  request.getParameter("password1005");
            java.lang.String password_271idTemp = null;
        if(!password_271id.equals("")){
         password_271idTemp  = password_271id;
        }
        String personID_272id=  request.getParameter("personID1007");
            java.lang.String personID_272idTemp = null;
        if(!personID_272id.equals("")){
         personID_272idTemp  = personID_272id;
        }
        String description_274id=  request.getParameter("description1011");
            java.lang.String description_274idTemp = null;
        if(!description_274id.equals("")){
         description_274idTemp  = description_274id;
        }
        String code_275id=  request.getParameter("code1013");
            java.lang.String code_275idTemp = null;
        if(!code_275id.equals("")){
         code_275idTemp  = code_275id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1SystemParameter_273id" scope="session" class="eu.aladdin_project.xsd.SystemParameter" />
        <%
        eu1aladdin_project1xsd1SystemParameter_273id.setDescription(description_274idTemp);
        eu1aladdin_project1xsd1SystemParameter_273id.setCode(code_275idTemp);
        String iD_276id=  request.getParameter("iD1015");
            java.lang.String iD_276idTemp = null;
        if(!iD_276id.equals("")){
         iD_276idTemp  = iD_276id;
        }
        String username_277id=  request.getParameter("username1017");
            java.lang.String username_277idTemp = null;
        if(!username_277id.equals("")){
         username_277idTemp  = username_277id;
        }
        %>
        <jsp:useBean id="eu1aladdin_project1xsd1User_270id" scope="session" class="eu.aladdin_project.xsd.User" />
        <%
        eu1aladdin_project1xsd1User_270id.setPassword(password_271idTemp);
        eu1aladdin_project1xsd1User_270id.setPersonID(personID_272idTemp);
        eu1aladdin_project1xsd1User_270id.setType(eu1aladdin_project1xsd1SystemParameter_273id);
        eu1aladdin_project1xsd1User_270id.setID(iD_276idTemp);
        eu1aladdin_project1xsd1User_270id.setUsername(username_277idTemp);
        eu.aladdin_project.xsd.OperationResult updateUser992mtemp = sampleWSid.updateUser(eu1aladdin_project1xsd1User_270id);
if(updateUser992mtemp == null){
%>
<%=updateUser992mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(updateUser992mtemp != null){
java.lang.String typedescription999 = updateUser992mtemp.getDescription();
        String tempResultdescription999 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription999));
        %>
        <%= tempResultdescription999 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(updateUser992mtemp != null){
java.lang.String typecode1001 = updateUser992mtemp.getCode();
        String tempResultcode1001 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode1001));
        %>
        <%= tempResultcode1001 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1019:
        gotMethod = true;
        String userId_278id=  request.getParameter("userId1030");
            java.lang.String userId_278idTemp = null;
        if(!userId_278id.equals("")){
         userId_278idTemp  = userId_278id;
        }
        String password_279id=  request.getParameter("password1032");
            java.lang.String password_279idTemp = null;
        if(!password_279id.equals("")){
         password_279idTemp  = password_279id;
        }
        String reqId_280id=  request.getParameter("reqId1034");
            java.lang.String reqId_280idTemp = null;
        if(!reqId_280id.equals("")){
         reqId_280idTemp  = reqId_280id;
        }
        eu.aladdin_project.xsd.OperationResult changePassword1019mtemp = sampleWSid.changePassword(userId_278idTemp,password_279idTemp,reqId_280idTemp);
if(changePassword1019mtemp == null){
%>
<%=changePassword1019mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(changePassword1019mtemp != null){
java.lang.String typedescription1026 = changePassword1019mtemp.getDescription();
        String tempResultdescription1026 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription1026));
        %>
        <%= tempResultdescription1026 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(changePassword1019mtemp != null){
java.lang.String typecode1028 = changePassword1019mtemp.getCode();
        String tempResultcode1028 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode1028));
        %>
        <%= tempResultcode1028 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 1036:
        gotMethod = true;
        String login_281id=  request.getParameter("login1047");
            java.lang.String login_281idTemp = null;
        if(!login_281id.equals("")){
         login_281idTemp  = login_281id;
        }
        String password_282id=  request.getParameter("password1049");
            java.lang.String password_282idTemp = null;
        if(!password_282id.equals("")){
         password_282idTemp  = password_282id;
        }
        eu.aladdin_project.xsd.OperationResult auth1036mtemp = sampleWSid.auth(login_281idTemp,password_282idTemp);
if(auth1036mtemp == null){
%>
<%=auth1036mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">status:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(auth1036mtemp != null){
java.lang.String typedescription1043 = auth1036mtemp.getDescription();
        String tempResultdescription1043 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription1043));
        %>
        <%= tempResultdescription1043 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">code:</TD>
<TD>
<%
if(auth1036mtemp != null){
java.lang.String typecode1045 = auth1036mtemp.getCode();
        String tempResultcode1045 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecode1045));
        %>
        <%= tempResultcode1045 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
exception: <%= e %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>