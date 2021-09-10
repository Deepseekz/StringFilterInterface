package interfaces;

public interface StringFilter
{

    String filter(String string);

    static String[] filter(String[] strings, StringFilter filter)
    {

        String[] result = strings;

        for (int i=0 ; i<result.length ; i++)
        {
            result[i] = filter.filter(result[i]);
        }

        return result;

    }

}
