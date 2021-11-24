
import static com.ilfidev.Classes.pr5.ChangeInt;
import static com.ilfidev.Classes.pr5.NoZero;
import static com.ilfidev.Classes.pr5.Pallindrom;

public class Main {
    public static void main(String[] args) {
        String str = "It's a string; ";
        System.out.println(str + Pallindrom(0,str.length() - 1, str));
        str = "lukaIsCoolFilm; ";
        System.out.println(str + Pallindrom(0,str.length() - 1, str));
        System.out.println(NoZero(1, 2 ));
        ChangeInt(173738);
        System.out.println("\n"+"Yep im working nice");
    }
}

