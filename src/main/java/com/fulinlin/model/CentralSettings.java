package com.fulinlin.model;

import com.fulinlin.model.enums.TypeDisplayStyleEnum;

public class CentralSettings {

    private TypeDisplayStyleEnum typeDisplayStyle;

    private Integer typeDisplayNum;

    private String skipCiDefaultValue;

    private Boolean skipCiDefaultChecked;

    private Boolean skipCiSelectionEnable;

    private Hidden hidden;


    public TypeDisplayStyleEnum getTypeDisplayStyle() {
        return typeDisplayStyle;
    }

    public void setTypeDisplayStyle(TypeDisplayStyleEnum typeDisplayStyle) {
        this.typeDisplayStyle = typeDisplayStyle;
    }

    public Integer getTypeDisplayNum() {
        return typeDisplayNum;
    }

    public void setTypeDisplayNum(Integer typeDisplayNum) {
        this.typeDisplayNum = typeDisplayNum;
    }

    public String getSkipCiDefaultValue() {
        return skipCiDefaultValue;
    }

    public void setSkipCiDefaultValue(String skipCiDefaultValue) {
        this.skipCiDefaultValue = skipCiDefaultValue;
    }

    public Boolean getSkipCiDefaultChecked() {
        return skipCiDefaultChecked;
    }

    public void setSkipCiDefaultChecked(Boolean skipCiDefaultChecked) {
        this.skipCiDefaultChecked = skipCiDefaultChecked;
    }

    public Boolean getSkipCiSelectionEnable() {
        return skipCiSelectionEnable;
    }

    public void setSkipCiSelectionEnable(Boolean skipCiSelectionEnable) {
        this.skipCiSelectionEnable = skipCiSelectionEnable;
    }

    public Hidden getHidden() {
        return hidden;
    }

    public void setHidden(Hidden hidden) {
        this.hidden = hidden;
    }

    public static class Hidden {
        private Boolean type;
        private Boolean scope;
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

        public Boolean getScope() {
            return scope;
        }

        public void setScope(Boolean scope) {
            this.scope = scope;
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
