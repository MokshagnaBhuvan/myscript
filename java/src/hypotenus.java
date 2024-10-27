import java.util.Scanner;

public class hypotenus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets cook mensurations for some time!");
        System.out.println("Lets look out for TRIANGLES!!!");

        double a, b, c, area;
        a = 0;
        b = 0;
        c = 0;
        try {
            if (a == 0 || b == 0 || c == 0) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Missing third side value hmmm sus?!");
                Thread.sleep(2000);
            } else {
                System.out.println(
                        "We got some values here!\n Value for a goes like" + a + "and b is" + b + "last one for c is"
                                + c);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }

        try {
            System.out.println("Its right angeled or not :/");
            boolean hyotenusOrNot = sc.nextBoolean();
            if (hyotenusOrNot) {
                Thread.sleep(1000);
                System.out.println("Then its pythagorus time ^-^");
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                double perimeter = a + b + c;
                Thread.sleep(1000);
                System.out.println("So the perimeter of your input based triangle is " + perimeter);
            } else {
                System.out.println("Sorry bro heheh this is dumbest code :)");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}