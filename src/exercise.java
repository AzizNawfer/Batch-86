
import java.util.Scanner;

class exercise {
    public static void main(String[] args) {

        Scanner obj2 = new Scanner(System.in);

        String Name;
        String Lname;
        int mk1;
        int mk2;
        int mk3;
        int total;
        int avg;

        System.out.println("Enter your name");
        Name = obj2.next();
        System.out.println("Enter your Last name");
        Lname = obj2.next();
        System.out.println("Enter Mark 1");
        mk1 = obj2.nextInt();
        System.out.println("Enter Mark 2");
        mk2 = obj2.nextInt();
        System.out.println("Enter Mark 3");
        mk3 = obj2.nextInt();

        total = mk1 + mk2 + mk3;
        avg = total/3;

        System.out.println("Name = "+Name+ Lname);
        System.out.println("Mark 01 ="+mk1);
        System.out.println("Mark 02 ="+mk2);
        System.out.println("Mark 03 ="+mk3);
        System.out.println("TOTAL ="+total);
        System.out.println("Average ="+avg);

    }
}
