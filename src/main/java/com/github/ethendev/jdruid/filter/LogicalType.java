package com.github.ethendev.jdruid.filter;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * logical expression filter type
 * @author: Ethan
 * @Date: 2018/9/15
 */
public enum LogicalType {
    AND("and"),
    NOT("not"),
    OR("or");

    private String value;

    LogicalType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
