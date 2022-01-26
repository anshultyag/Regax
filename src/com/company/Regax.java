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
       public static boolean mobileNum( String mobileNo) {
          return mobileNo.matches( "91\\s[0-9]{10}$" );
         }
       public static boolean password(String pass){
        return pass.matches("^[A-Za-z]{8,}$");
        }
       public static boolean passwordUpperCase(String upperCase) {
        return upperCase.matches("^(?=.*[A-Z])[A-Za-z]{8,}$");
        }
       public static boolean passwordOneNumeric(String numeric) {
         return numeric.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Za-z\\d]{8,}$");
        }
       public static boolean passwordSpecialCharacter(String specialCharacter) {
          return specialCharacter.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z\\d]{8,}");
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

            System.out.println(mobileNum("91 9919819801"));

            System.out.println(password("absolute"));
            System.out.println(passwordUpperCase("Absolute"));
            System.out.println(passwordOneNumeric("Absolute778"));
            System.out.println(passwordSpecialCharacter("Absolute778@"));
        }
    }