package arrayList;
import java.util.*;

/**
 * This program demonstrates ArrayList
 * @version 1.0
 * @author hanhiver
 */

public class ArrayListTest
{
    public static void main(String[] args)
    {
        // 建立一个ArrayList, 填充一些元素。
        ArrayList<Integer> alist = new ArrayList<>();

        for (Integer i=0; i<10; ++i)
        {
            alist.add(i);
        }

        for (int i=0; i<alist.size(); ++i)
        {
            System.out.printf("%d\t", alist.get(i).intValue());
        }
    }
}