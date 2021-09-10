package classes;

import interfaces.StringFilter;

public class PostfixStringFilter implements StringFilter
{
    int index;

    public PostfixStringFilter(int index)
    {
        this.index = index;
    }

    @Override
    public String filter(String string) {
        return string.substring(string.length()-index);
    }
}
