package com.andy.model.enums;

public enum JiraKeyDisplayStyleEnum {
    CHECKBOX("Checkbox");

    private final String name;


    JiraKeyDisplayStyleEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
