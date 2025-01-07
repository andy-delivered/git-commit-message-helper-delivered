package com.andy.model;

import java.util.List;

/**
 * @program: git-commit-message-helper
 * @author: fulin
 * @create: 2019-12-05 21:22
 **/
public class DataSettings {
    private String template;

    private List<JiraKeyAlias> jiraKeyAliases;
    private List<TypeAlias> typeAliases;
    private List<String> skipCis;

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public List<JiraKeyAlias> getJiraKeyAliases() {
        return jiraKeyAliases;
    }

    public void setJiraKeyAliases(List<JiraKeyAlias> jiraKeyAliases) {
        this.jiraKeyAliases = jiraKeyAliases;
    }

    public List<TypeAlias> getTypeAliases() {
        return typeAliases;
    }

    public void setTypeAliases(List<TypeAlias> typeAliases) {
        this.typeAliases = typeAliases;
    }

    public List<String> getSkipCis() {
        return skipCis;
    }

    public void setSkipCis(List<String> skipCis) {
        this.skipCis = skipCis;
    }
}
