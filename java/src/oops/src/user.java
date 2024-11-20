import java.util.Objects;
import java.util.Scanner;

public class user extends server{
    String UserName;
    static double distance;
    static String destinationLocation;
    static String location;
    static int passengers;
    Scanner sc = new Scanner(System.in);
    void getPassengers(){
        System.out.println("Enter the no of passengers");
        user.passengers=sc.nextInt();
    }
void getCurrentlocation(){
    System.out.println("ESpecify your location");
    user.location = sc.next();
    //a-b=10km
    //b-c=23km;
    //c-a=14km;
    switch(user.location){
        case "a":
            System.out.println("Enter your destination");
            user.destinationLocation = sc.next();
            if(Objects.equals(user.destinationLocation,"b")){
                user.distance=10;
            } else if (Objects.equals(user.destinationLocation, "c")) {
                user.distance=14;
            }
            break;
        case "b":
            System.out.println("Enter your destination");
            user.destinationLocation = sc.next();
            if(Objects.equals(user.destinationLocation, "a")){
                user.distance=10;
            } else if (Objects.equals(user.destinationLocation, "c")) {
                user.distance=23;
            }
            break;
        case "c":
            System.out.println("Enter your destination");
            user.destinationLocation = sc.next();
            if(Objects.equals(user.destinationLocation, "b")){
                user.distance=23;
            } else if (Objects.equals(user.destinationLocation, "a")) {
                user.distance=14;
            }
            break;
        default:
            throw new IllegalStateException("Unexpected value: " + user.location);
    }
}
}
