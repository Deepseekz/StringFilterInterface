package classes;

import interfaces.StringFilter;

public class PrefixStringFilter implements StringFilter
{
    int index;

    public PrefixStringFilter(int index)
    {
        this.index = index;
    }

    @Override
    public String filter(String string) {
        return string.substring(0, index);
    }
}
