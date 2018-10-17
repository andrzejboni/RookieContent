package com.company.WzorceProjektoweOnceAgain.Strategy;

public class FormatterToLower implements FormatterFont {
    @Override
    public String format(String textToFormat) {
        return textToFormat.toLowerCase();
    }
}
