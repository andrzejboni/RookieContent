package com.company.WzorceProjektoweOnceAgain.Strategy;

public class FormatterUpper implements FormatterFont {
    @Override
    public String format(String textToFormat) {
        return textToFormat.toUpperCase();
    }
}
