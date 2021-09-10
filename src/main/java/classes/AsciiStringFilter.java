package classes;

import interfaces.StringFilter;

public class AsciiStringFilter implements StringFilter
{
    @Override
    public String filter(String string) {
        return string.replaceAll("[^\\x00-\\x7F]", "");
    }
}
