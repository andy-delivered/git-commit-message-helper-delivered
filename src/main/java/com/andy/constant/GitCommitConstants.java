package com.andy.constant;

/**
 * @program: git-commit-message-helper
 * @author: fulin
 * @create: 2019-12-08 11:37
 **/
public class GitCommitConstants {

    public static final String ACTION_PREFIX = "$APP_CONFIG$/GitCommitMessageHelperDeliveredSettings";

    public static final String DEFAULT_TEMPLATE = "#if($jiraKey && $jiraKeyNumber)${jiraKey}-${jiraKeyNumber} #end" +
            "#if($type)${type}#end #if($subject)${subject}#end\n" +
            "#if($body)${newline}${newline}${body}#end\n" +
            "#if($changes)${newline}${newline}BREAKING CHANGE: ${changes}#end\n" +
            "#if($closes)${newline}${newline}Closes ${closes}#end\n" +
            "#if($skipCi)${newline}${newline}${skipCi}#end";
}
