package classes;

import interfaces.StringFilter;

public class CompositeStringFilter implements StringFilter
{
    StringFilter[] filters;

    public CompositeStringFilter(StringFilter[] filters)
    {
        this.filters = filters;
    }

    @Override
    public String filter(String string)
    {
        String result = string;

        for (StringFilter filter : this.filters)
        {
            result = filter.filter(result);
        }

        return result;
    }
}
