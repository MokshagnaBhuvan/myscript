import java.util.Date;
import java.time.LocalTime;

public class time {
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d);
        LocalTime l = LocalTime.now();
        System.out.print(l);
    }

}
