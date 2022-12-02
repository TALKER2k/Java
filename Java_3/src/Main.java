import java.util.*;

public class Main {
    public static long Time(long m){
        return System.currentTimeMillis()-m;
    }
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        int coutnMetods = 20000;
        long m = System.currentTimeMillis();

        //Метод add()
        for (int i = 0; i < coutnMetods; i++) {
            list.add(i+1);
        }
        long resAddList = Time(m);
        m = System.currentTimeMillis();

        //Метод get()
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long resGetList = Time(m);
        m = System.currentTimeMillis();

        //Метод remove()
        for (int i = 0; i < coutnMetods; i++) {
            list.remove(0);
        }
        long resRemoveList = Time(m);
        m = System.currentTimeMillis();

        //Метод add(*,*)
        for (int i = 0; i < coutnMetods; i++) {
            list.add(i,i);
        }
        long resAdd_List = Time(m);
        m = System.currentTimeMillis();

        //Метод indexOf()
        for (int i = 0; i < coutnMetods; i++) {
            list.indexOf(i);
        }
        long resIndexOfList = Time(m);
        m = System.currentTimeMillis();

        //Метод set()
        for (int i = 0; i < coutnMetods; i++) {
            list.set(i,i*i);
        }
        long resSetList = Time(m);
        System.out.println("+----------+---------+--------+");
        System.out.println("|           ArrayList         |");
        System.out.println("+----------+---------+--------+");
        System.out.println("|  Metod   |  Count  |  Time  |");
        System.out.println("+----------+---------+--------+");
        System.out.println("|  add()   |  "+coutnMetods+"  |  "+resAddList+"ms   |");
        System.out.println("+----------+---------+--------+");
        System.out.println("| remove() |  "+coutnMetods+"  |  "+resRemoveList+"ms  |");
        System.out.println("+----------+---------+--------+");
        System.out.println("|   set()  |  "+coutnMetods+"  |  "+resSetList+"ms   |");
        System.out.println("+----------+---------+--------+");
        System.out.println("| indexOf()|  "+coutnMetods+"  | "+resIndexOfList+"ms  |");
        System.out.println("+----------+---------+--------+");
        System.out.println("| add(*,*) |  "+coutnMetods+"  |  "+resAdd_List+"ms   |");
        System.out.println("+----------+---------+--------+");
        System.out.println("|   get()  |  "+coutnMetods+"  |  "+resGetList+"ms   |");
        System.out.println("+----------+---------+--------+");

        //LinkedList
        List<Integer> listL = new LinkedList<Integer>();
        m = System.currentTimeMillis();

        //Метод add()
        for (int i = 0; i < coutnMetods; i++) {
            listL.add(i+1);
        }
        resAddList = Time(m);
        m = System.currentTimeMillis();

        //Метод get()
        for (int i = 0; i < list.size(); i++) {
            listL.get(i);
        }
        resGetList = Time(m);
        m = System.currentTimeMillis();

        //Метод remove()
        for (int i = 0; i < coutnMetods; i++) {
            listL.remove(0);
        }
        resRemoveList = Time(m);
        m = System.currentTimeMillis();

        //Метод add(*,*)
        for (int i = 0; i < coutnMetods; i++) {
            listL.add(i,i);
        }
        resAdd_List = Time(m);
        m = System.currentTimeMillis();

        //Метод indexOf()
        for (int i = 0; i < coutnMetods; i++) {
            listL.indexOf(i);
        }
        resIndexOfList = Time(m);
        m = System.currentTimeMillis();

        //Метод set()
        for (int i = 0; i < coutnMetods; i++) {
            listL.set(i,i*i);
        }
        resSetList = Time(m);
        System.out.println("\n\n+----------+---------+--------+");
        System.out.println("|          LinkedList         |");
        System.out.println("+----------+---------+--------+");
        System.out.println("|  Metod   |  Count  |  Time  |");
        System.out.println("+----------+---------+--------+");
        System.out.println("|  add()   |  "+coutnMetods+"  |  "+resAddList+"ms   |");
        System.out.println("+----------+---------+--------+");
        System.out.println("| remove() |  "+coutnMetods+"  |  "+resRemoveList+"ms   |");
        System.out.println("+----------+---------+--------+");
        System.out.println("|   set()  |  "+coutnMetods+"  | "+resSetList+"ms  |");
        System.out.println("+----------+---------+--------+");
        System.out.println("| indexOf()|  "+coutnMetods+"  | "+resIndexOfList+"ms  |");
        System.out.println("+----------+---------+--------+");
        System.out.println("| add(*,*) |  "+coutnMetods+"  |  "+resAdd_List+"ms   |");
        System.out.println("+----------+---------+--------+");
        System.out.println("|   get()  |  "+coutnMetods+"  | "+resGetList+"ms  |");
        System.out.println("+----------+---------+--------+");
    }
}