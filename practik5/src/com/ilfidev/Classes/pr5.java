package com.ilfidev.Classes;

public class pr5 {
    public static boolean Pallindrom(int start, int end, String str){
        if (str.charAt(start) != str.charAt(end))
        {
            return false;
        }
        else if ((start == end) || (start < end)){
            return true;

        }
        else
        {
            return Pallindrom(start + 1, end - 1, str);
        }

    }
    public static int NoZero(int zero, int one){
        if(zero > one + 1) {
            return 0;
        }
        if(zero == 0 || one == 0){
            return 1;
        }
        return NoZero(zero, one -1) + NoZero(zero - 1, one - 1);
    }

    public static void ChangeInt(int a){
        if(a <= 0){
            return;
        }
        System.out.print(a%10);
        ChangeInt(a/10);
        return;
    }

}
