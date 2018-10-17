package com.company.WzorceProjektoweOnceAgain.Strategy;

public class FormatterTrim implements FormatterFont {
    @Override
    public String format(String textToFormat) {
        return textToFormat.trim();
    } // usuwa białe znaki z początku i z końca

}
