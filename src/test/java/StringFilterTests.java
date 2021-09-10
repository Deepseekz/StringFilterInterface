import classes.*;
import interfaces.StringFilter;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFilterTests
{
    @Test
    public void testUpperCaseStringFilter()
    {
        String input = "louder";
        StringFilter filter = new UpperCaseStringFilter();

        assertEquals("LOUDER", filter.filter(input));
    }

    @Test
    public void testLowerCaseStringFilter()
    {
        String input = "SOFTER";
        StringFilter filter = new LowerCaseStringFilter();

        assertEquals("softer", filter.filter(input));
    }

    @Test
    public void testPrefixStringFilter()
    {
        String input = "HelloWorld";
        StringFilter filter = new PrefixStringFilter(5);

        assertEquals("Hello", filter.filter(input));
    }

    @Test
    public void testPostfixStringFilter()
    {
        String input = "HelloWorld";
        StringFilter filter = new PostfixStringFilter(5);

        assertEquals("World", filter.filter(input));
    }

    @Test
    public void testAsciiStringFilter()
    {
        String input = "baka馬鹿!";
        StringFilter filter = new AsciiStringFilter();

        assertEquals("baka!", filter.filter(input));
    }

    @Test
    public void testArrayStringFilter()
    {
        String[] input = {"harder", "better", "faster"};

        StringFilter filter = new UpperCaseStringFilter();
        String[] output = {"HARDER", "BETTER", "FASTER"};

        Assert.assertArrayEquals(output, StringFilter.filter(input, filter));
    }

    @Test
    public void testCompositeStringFilter()
    {
        String input = "helloworld";
        StringFilter[] filters = {new UpperCaseStringFilter(), new PrefixStringFilter(5)};
        StringFilter compositeFilter = new CompositeStringFilter(filters);

        Assert.assertEquals("HELLO", compositeFilter.filter(input));
    }
}
