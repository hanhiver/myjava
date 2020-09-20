package basic.reflection;

public class getClass
{
    public static void main(String[] args)
    {
        Integer a = new Integer(1);
        // getClass() 会返回a的类型。
        System.out.println(a.getClass());
        // a的类型调用getName()会得到类型的名称。
        System.out.println(a.getClass().getName());

        String class_name = a.getClass().getName();
        try
        {
            Class cl = Class.forName(class_name);
            System.out.println("Done. ");
        }
        catch (Exception e)
        {
            System.out.println("Exception cought! ");
            e.printStackTrace();
        }
    }
}
