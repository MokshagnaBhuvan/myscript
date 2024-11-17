public class car {
    String model;
   static String company = "Hyundai1";
    car(String model){
//        this.company=company;
        this.model = model;
    }
    void printDetails(){
        System.out.println("Yep that's "+company +" "+model);
    }

}
