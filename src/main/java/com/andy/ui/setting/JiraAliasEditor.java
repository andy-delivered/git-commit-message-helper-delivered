package com.andy.ui.setting;

import com.andy.localization.PluginBundle;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JiraAliasEditor extends DialogWrapper {
    private JPanel myPanel;
    private JTextField keyField;

    private JTextField descriptionField;
    private JLabel keyFieldLabel;

    private JLabel descriptionFieldLabel;


    public interface Validator {
        boolean isOK(String name, String value);
    }

    public JiraAliasEditor(String title, String macroName, String value) {
        super(true);
        setTitle(title);
        keyFieldLabel.setText(PluginBundle.get("setting.jira.alias.field.key"));
        keyField.setText(macroName);
        descriptionFieldLabel.setText(PluginBundle.get("setting.alias.field.description"));
        descriptionField.setText(value);

        init();
    }

    public String getKey() {
        return keyField.getText().trim();
    }

    public String getDescription() {
        return descriptionField.getText().trim();
    }


    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return myPanel;
    }

}
