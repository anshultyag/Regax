package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regax {
        public static boolean isValidUsername(String fname){
            String regex = "^[A-Z][a-z]{2,}$";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(fname);
            return m.matches();
          }
       public static boolean isValidEmail(String email) {
        String regex = "^abc[.a-z]+@bl[.]co[.a-z]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return m.matches();
         }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your First name : ");
            String str1 = sc.nextLine();
            System.out.println("Please enter your Last name : ");
            String str2 = sc.nextLine();
            System.out.println(isValidUsername(str1));
            System.out.println(isValidUsername(str2));

            System.out.println("Please enter your Email : ");
            String str3 = sc.nextLine();
            System.out.println(isValidEmail(str1));
        }
    }