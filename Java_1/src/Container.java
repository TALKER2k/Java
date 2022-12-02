import java.util.Scanner;

public class Container  {
    int[] array;

    Container(int n)
    {
        array = new int[n];
        System.out.println("Input items = ");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++)
        {
            array[i] = in.nextInt();
        }
    }

    public void delete_el(int n, int del)
    {
        for(int i = 0; i< n; i++)
            if(array[i] == del)
                array[i] = 0;
    }

    public void add_el(int n, int el)
    {
        int c =0;
        for(int i =0; i < n; i++)
        {
            if (0 == array[i]){
                array[i] = el;
                break;
            } else c=c+1;
        }
        if (c==n)
            System.out.println("Array already full!"); else System.out.println("You added element!");
    }

    public void extract_el(int n, int i_i)
    {
        if(i_i<n)
        {
            System.out.println("Your item = ");
            System.out.println(array[i_i]);
        }
        else System.out.println("Your index is not volatile");
    }

    public void print_arr(int n)
    {
        System.out.println("Output of items: ");
        for (int i = 0; i < n; i++)
            System.out.println(array[i]);
    }
}
