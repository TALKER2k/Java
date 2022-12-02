import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input number of items = ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Container mas = new Container(n);
        mas.print_arr(n);
        System.out.println("Element for delete = ");
        int del = in.nextInt();
        mas.delete_el(n, del);
        mas.print_arr(n);
        System.out.println("Element for add = ");
        int el = in.nextInt();
        mas.add_el(n, el);
        mas.print_arr(n);
        System.out.println("Element's index for extract = ");
        int index = in.nextInt();
        mas.extract_el(n,index);
        mas.print_arr(n);
    }
}