/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Tue May 29 09:06:51 BST 2018
 */
package org.wildfly.camel.test.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Active__c
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Account_ActiveEnum {

    // No
    NO("No"),
    // Yes
    YES("Yes");

    final String value;

    private Account_ActiveEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Account_ActiveEnum fromValue(String value) {
        for (Account_ActiveEnum e : Account_ActiveEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
