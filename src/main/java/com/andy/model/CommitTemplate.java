package com.andy.model;

/**
 * @program: git-commit-message-helper
 * @author: fulin
 * @create: 2019-12-08 11:36
 **/
public class CommitTemplate {

    private String jiraKey;

    private String jiraKeyNumber;
    private String type;
    private String subject;
    private String body;
    private String changes;
    private String closes;
    private String skipCi;

    public String getJiraKey() {
        return jiraKey;
    }

    public void setJiraKey(String jiraKey) {
        this.jiraKey = jiraKey;
    }

    public String getJiraKeyNumber() {
        return jiraKeyNumber;
    }

    public void setJiraKeyNumber(String jiraKeyNumber) {
        this.jiraKeyNumber = jiraKeyNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }

    public String getCloses() {
        return closes;
    }

    public void setCloses(String closes) {
        this.closes = closes;
    }

    public String getSkipCi() {
        return skipCi;
    }

    public void setSkipCi(String skipCi) {
        this.skipCi = skipCi;
    }
}
