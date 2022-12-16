import com.opencsv.*;
import java.util.*;
import java.lang.*;
import java.io.*;

class People {
        int id;
        String name;
        String gender;
        String date;
        Subdivision subdivision = new Subdivision(1);
        int salary;

        @Override
        public String toString() {
                return "People [id=" + this.id + ", Name=" + this.name + ", Gender=" + this.gender + ", Date=" + this.date +", Devision [Id=" + this.subdivision.id +", Name=" + this.subdivision.name+"]"+", Salary=" + this.salary + "]";
        }
}

class Subdivision{
        int id;
        String name;

        public Subdivision(int id) {
                this.id=id;
        }
        @Override
        public String toString() {
                return "Devision [Id=" + this.id +", Name=" + this.name+"]";
        }
}


public class ReadCSVExample2 {
        public static void main(String[] args) {
                ArrayList<People> people2 = new ArrayList<People>();
                String line = "";
                String splitBy = ";";
                try {
                        BufferedReader br = new BufferedReader(new FileReader("D:/java/forjava.csv"));
                        while ((line = br.readLine()) != null) {
                                People people = new People();
                                String[] employee = line.split(splitBy);
                                people.id = Integer.parseInt(employee[0]);
                                people.date = employee[3];
                                people.gender = employee[2];
                                people.name = employee[1];
                                people.salary = Integer.parseInt(employee[5]);
                                Subdivision subs = new Subdivision((int) (Math.random() * 10000));
                                subs.name=employee[4];
                                people.subdivision.name=subs.name;
                                people.subdivision.id=subs.id;
                                people2.add(people);
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }
                System.out.println(people2);
        }
}
