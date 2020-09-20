package basic.MultiArgs;

public class MultipleArgs
{
    public static double max(double value, double... values)
    {
        double largest = value;
        for (double v : values)
        {
            if (v > largest)
            {
                largest = v;
            }
        }
        return largest;
    }

    public static void main(String[] args)
    {
        System.out.println(max(1.0));
        System.out.println(max(1.2, 3.4, 3.1, 2.0, -1));
    }
}
