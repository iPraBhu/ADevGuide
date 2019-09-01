package com.adevguide.java.simpleproject;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
String s="<?xml version='1.0' encoding='utf-8'?><soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSc\r\n" + 
        "hema-instance\"><soap:Body><PostLead xmlns=\"http://ws.fahw.com/\"><lead>&lt;FahbpLead>&lt;FirstName>Sam&lt;/FirstName>&lt;LastName>Dave&lt;/LastName>&lt;Address>sam daejf&lt;/Address>&lt;City>GLENDALE&lt;/City>&lt;State>85305&lt;/State>&lt;Zip>85305&lt\r\n" + 
        ";/Zip>&lt;Phone>8082957338&lt;/Phone>&lt;EmailAddress>gpgffhawlah11@icloud.com&lt;/EmailAddress>&lt;SourceOfOrder>BM232&lt;/SourceOfOrder>&lt;PropertyType>&lt;/PropertyType>&lt;AltPhone>&lt;/AltPhone >&lt;SourceID>20647026023&lt;/SourceID >&lt;SubVen\r\n" + 
        "dor>&lt;/SubVendor>&lt;ScheduledApptDT>&lt;/ScheduledApptDT>&lt;/FahbpLead></lead></PostLead></soap:Body></soap:Envelope>";

String requestObject=s.replaceAll("&lt;","<");

System.out.println(requestObject);

    }
}
