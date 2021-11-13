//import java.math.MathContext;

//import com.sun.security.jgss.GSSUtil;

public class Practik1 {
    public static void main(String[] args) {
        Mex M1 = new Mex();
        M1.displayInfo();

        Mex M2 = new Mex("Paththainder");
        M2.displayInfo();

        Mex M3 = new Mex("deths door", 12, "in battle");
        M3.displayInfo();

        Mex M4 = new Mex("Red hood", 15);
        M4.displayInfo();

        Mex M5 = new Mex("Alert in heart", 2, "repeiring");
        M5.displayInfo();
    }
}

class Mex {
    String name;
    String status;
    double mexs_number;

    Mex(){
        this.name = "JustCreated";
        this.mexs_number = 0;
        this.status = "sleep";
    }
    Mex(String a){
        this.name = a;
        this.mexs_number = 0; //0 + (int) (Math.random() * 10000);
        this.status = "sleep";
    }
    Mex(String a, double n){
        this. name = a;
        this.mexs_number = n;
        this.status = "sleep";
    }
    Mex(String a, double n, String c){
        this.name = a;
        this.mexs_number = n;
        this.status = c;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tMexs Number: %f \tMexs Status: %s\t\n", name, mexs_number, status);
    }
}
