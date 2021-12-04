import java.io.*;

public class pr8
{

    static void One(String str) throws IOException
    {
        FileWriter FilR = new FileWriter("Text.txt", false);
        FilR.write (str);
        FilR.flush();
    }

    static void Two() throws IOException
    {
        FileReader FilR = new FileReader("Text.txt");
        int c;
        while((c = FilR.read()) > 0)
        {
            System.out.println((char) c);
        }
    }

    static void Four(String str) throws IOException
    {
        FileWriter FilR = new FileWriter("Text.txt", true);
        FilR.write(str);
        FilR.close();
    }

    public static void main (String[]args) throws IOException
    {
        InputStreamReader ir = new InputStreamReader((System.in));
        BufferedReader br = new BufferedReader((ir));
        System.out.println("Введите строку:");
        String str = br.readLine();
        One(str);
        System.out.println("Работаю");
        Two();
        System.out.println("Введите строку:");
        str = br.readLine();
        Four(str);
        Two();

    }
}