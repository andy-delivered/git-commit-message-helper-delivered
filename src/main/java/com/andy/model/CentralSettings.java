package com.andy.model;

import com.andy.model.enums.JiraKeyDisplayStyleEnum;
import com.andy.model.enums.TypeDisplayStyleEnum;

public class CentralSettings {

    private JiraKeyDisplayStyleEnum jiraKeyDisplayStyle;

    private Integer jiraKeyDisplayNumber;

    private String jiraKeyNumberDefaultValue;

    private TypeDisplayStyleEnum typeDisplayStyle;

    private Integer typeDisplayNumber;

    private String skipCiDefaultValue;

    private Boolean skipCiDefaultApprove;

    private Boolean skipCiComboboxEnable;

    private Hidden hidden;

    public JiraKeyDisplayStyleEnum getJiraKeyDisplayStyle() {
        return jiraKeyDisplayStyle;
    }

    public Integer getJiraKeyDisplayNumber() {
        return jiraKeyDisplayNumber;
    }

    public void setJiraKeyDisplayNumber(Integer jiraKeyDisplayNumber) {
        this.jiraKeyDisplayNumber = jiraKeyDisplayNumber;
    }

    public void setJiraKeyDisplayStyle(JiraKeyDisplayStyleEnum jiraKeyDisplayStyle) {
        this.jiraKeyDisplayStyle = jiraKeyDisplayStyle;
    }


    public TypeDisplayStyleEnum getTypeDisplayStyle() {
        return typeDisplayStyle;
    }

    public void setTypeDisplayStyle(TypeDisplayStyleEnum typeDisplayStyle) {
        this.typeDisplayStyle = typeDisplayStyle;
    }

    public Integer getTypeDisplayNumber() {
        return typeDisplayNumber;
    }

    public void setTypeDisplayNumber(Integer typeDisplayNumber) {
        this.typeDisplayNumber = typeDisplayNumber;
    }

    public String getJiraKeyNumberDefaultValue() {
        return jiraKeyNumberDefaultValue;
    }

    public void setJiraKeyNumberDefaultValue(String jiraKeyNumberDefaultValue) {
        this.jiraKeyNumberDefaultValue = jiraKeyNumberDefaultValue;
    }

    public String getSkipCiDefaultValue() {
        return skipCiDefaultValue;
    }

    public void setSkipCiDefaultValue(String skipCiDefaultValue) {
        this.skipCiDefaultValue = skipCiDefaultValue;
    }

    public Boolean getSkipCiDefaultApprove() {
        return skipCiDefaultApprove;
    }

    public void setSkipCiDefaultApprove(Boolean skipCiDefaultApprove) {
        this.skipCiDefaultApprove = skipCiDefaultApprove;
    }

    public Boolean getSkipCiComboboxEnable() {
        return skipCiComboboxEnable;
    }

    public void setSkipCiComboboxEnable(Boolean skipCiComboboxEnable) {
        this.skipCiComboboxEnable = skipCiComboboxEnable;
    }

    public Hidden getHidden() {
        return hidden;
    }

    public void setHidden(Hidden hidden) {
        this.hidden = hidden;
    }

    public static class Hidden {

        private Boolean jiraKey;
        private Boolean jiraKeyNumber;
        private Boolean type;
        private Boolean subject;
        private Boolean body;
        private Boolean changes;
        private Boolean closed;
        private Boolean skipCi;

        public Boolean getType() {
            return type;
        }

        public void setType(Boolean type) {
            this.type = type;
        }

        public Boolean getJiraKey() {
            return jiraKey;
        }

        public void setJiraKey(Boolean jiraKey) {
            this.jiraKey = jiraKey;
        }

        public Boolean getJiraKeyNumber() {
            return jiraKeyNumber;
        }

        public void setJiraKeyNumber(Boolean jiraKeyNumber) {
            this.jiraKeyNumber = jiraKeyNumber;
        }

        public Boolean getSubject() {
            return subject;
        }

        public void setSubject(Boolean subject) {
            this.subject = subject;
        }

        public Boolean getBody() {
            return body;
        }

        public void setBody(Boolean body) {
            this.body = body;
        }

        public Boolean getChanges() {
            return changes;
        }

        public void setChanges(Boolean changes) {
            this.changes = changes;
        }

        public Boolean getClosed() {
            return closed;
        }

        public void setClosed(Boolean closed) {
            this.closed = closed;
        }

        public Boolean getSkipCi() {
            return skipCi;
        }

        public void setSkipCi(Boolean skipCi) {
            this.skipCi = skipCi;
        }
    }

}
