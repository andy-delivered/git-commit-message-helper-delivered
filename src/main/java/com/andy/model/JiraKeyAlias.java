package com.andy.model;

import org.apache.commons.text.StringEscapeUtils;

public class JiraKeyAlias extends DomainObject {

    public String key;


    public String description;

    public JiraKeyAlias() {
    }

    public JiraKeyAlias(String key, String description) {
        this.key =  StringEscapeUtils.escapeJava(key);
        this.description = StringEscapeUtils.escapeJava(description);
    }

    public String getKey() {
        return StringEscapeUtils.unescapeJava(key);
    }

    public void setKey(String key) {
        this.key =  StringEscapeUtils.escapeJava(key);
    }

    public String getDescription() {
        return StringEscapeUtils.unescapeJava(description);
    }

    public void setDescription(String description) {
        this.description = StringEscapeUtils.escapeJava(description);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.getKey(), this.getDescription());
    }
}
