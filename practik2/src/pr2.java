
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class pr2 {
    public static void main(String[] args) {
        Autor A1 = new Autor("Tom","Tomison@gmail.com", 'M');
        System.out.println(A1);

        Autor A2 = new Autor("Alice","Aliceison@gmail.com", 'F');
        System.out.println(A2);
    }

}
class Autor{
    String name;
    String email;
    char gender;
    public Autor(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void SetEmail(String email){
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return name+ " ("+gender+") "+"at "+ email;
    }
}

class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(){}
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}
