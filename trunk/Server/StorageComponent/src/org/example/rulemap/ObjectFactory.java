//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.12.17 at 06:51:57 EET 
//


package org.example.rulemap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.rulemap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RuleCollection_QNAME = new QName("http://www.example.org/RuleMap", "RuleCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.rulemap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ruleset }
     * 
     */
    public Ruleset createRuleset() {
        return new Ruleset();
    }

    /**
     * Create an instance of {@link RuleMap }
     * 
     */
    public RuleMap createRuleMap() {
        return new RuleMap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ruleset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/RuleMap", name = "RuleCollection")
    public JAXBElement<Ruleset> createRuleCollection(Ruleset value) {
        return new JAXBElement<Ruleset>(_RuleCollection_QNAME, Ruleset.class, null, value);
    }

}
