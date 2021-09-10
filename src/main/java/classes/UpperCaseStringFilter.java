package classes;

import interfaces.StringFilter;

import java.util.Locale;

public class UpperCaseStringFilter implements StringFilter
{
    @Override
    public String filter(String string) {
        return string.toUpperCase();
    }
}
