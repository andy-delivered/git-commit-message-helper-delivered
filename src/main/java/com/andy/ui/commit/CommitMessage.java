package com.andy.ui.commit;

import com.andy.model.CommitTemplate;
import com.andy.model.JiraKeyAlias;
import com.andy.model.TypeAlias;
import com.andy.storage.GitCommitMessageHelperSettings;
import com.andy.utils.VelocityUtils;
import org.apache.commons.lang3.StringUtils;


/**
 * @author fulin
 */
public class CommitMessage {

    private final String content;

    public CommitMessage(GitCommitMessageHelperSettings settings,
                         JiraKeyAlias jiraKeyAlias,
                         String jiraKeyNumber,
                         TypeAlias typeAlias,
                         String shortDescription,
                         String longDescription,
                         String closedIssues,
                         String breakingChanges,
                         String skipCi
    ) {
        this.content = buildContent(
                settings,
                jiraKeyAlias,
                jiraKeyNumber,
                typeAlias,
                shortDescription,
                longDescription,
                breakingChanges,
                closedIssues,
                skipCi
        );
    }

    private String buildContent(GitCommitMessageHelperSettings settings,
                                JiraKeyAlias jiraKeyAlias,
                                String jiraKeyNumber,
                                TypeAlias typeAlias,
                                String shortDescription,
                                String longDescription,
                                String breakingChanges,
                                String closedIssues,
                                String skipCi
    ) {

        CommitTemplate commitTemplate = new CommitTemplate();

        if (jiraKeyAlias != null) {
            if (StringUtils.isNotBlank(jiraKeyAlias.getKey())) {
                commitTemplate.setJiraKey(jiraKeyAlias.getKey());
            }
        }

        if (StringUtils.isNotBlank(jiraKeyNumber)) {
            commitTemplate.setJiraKeyNumber(jiraKeyNumber);
        }

        if (typeAlias != null) {
            if (StringUtils.isNotBlank(typeAlias.getTitle())) {
                commitTemplate.setType(typeAlias.getTitle());
            }
        }

        if (StringUtils.isNotBlank(shortDescription)) {
            commitTemplate.setSubject(shortDescription);
        }
        if (StringUtils.isNotBlank(longDescription)) {
            commitTemplate.setBody(longDescription);
        }
        if (StringUtils.isNotBlank(breakingChanges)) {
            commitTemplate.setChanges(breakingChanges);
        }
        if (StringUtils.isNotBlank(closedIssues)) {
            commitTemplate.setCloses(closedIssues);
        }
        if (StringUtils.isNotBlank(skipCi)) {
            commitTemplate.setSkipCi(skipCi);
        }
        String template = settings.getDateSettings().getTemplate().replaceAll("\\n", "");
        return VelocityUtils.convert(template, commitTemplate);
    }

    @Override
    public String toString() {
        return content;
    }
}
