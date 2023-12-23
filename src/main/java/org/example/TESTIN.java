package org.example;

public class TESTIN {
    public static boolean nameTest(String FirstName) {
        boolean flag = true;
        FirstName = FirstName.toUpperCase();

        if (FirstName.length() > 0) {
            for (int i = 0; i < FirstName.length(); i++) {
                if (Character.isDigit(FirstName.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag==true)return true;
        else return false;
    }

    public static boolean lastTest(String LastName) {
        boolean flag = true;
        LastName = LastName.toUpperCase();

        if (LastName.length() > 0) {
            for (int i = 0; i < LastName.length(); i++) {
                if (Character.isDigit(LastName.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag==true)return true;
        else return false;
    }


    public static boolean ageTest(String age) {
        boolean flag = true;
        if (age.length() > 0) {
            for (int i = 0; i < age.length(); i++) {
                if ( !Character.isDigit(age.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) return true;
        else return false;
    }

    public static boolean PhoneNumberlastTest(String PhoneNumber) {

        boolean flag = true;
        if (PhoneNumber.length() > 0) {
            for (int i = 0; i < PhoneNumber.length(); i++) {
                if (!Character.isDigit(PhoneNumber.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true) return true;
        else return false;
    }

    public static boolean CityNameTest(String CityName) {
        boolean flag = true;
        CityName = CityName.toUpperCase();

        if (CityName.length() > 0) {
            for (int i = 0; i < CityName.length(); i++) {
                if (Character.isDigit(CityName.charAt(i))) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag==true)return true;
        else return false;
    }


    public static boolean GmailTest(String Gmail) {
        if (Character.isDigit(Gmail.charAt(0)) || Gmail.length() < 17) return false;
        else {
            boolean flag = false;
            for (int i = 1; i < Gmail.length(); i++) {
                if (Gmail.charAt(i) == '@') flag = true;
            }
            if (flag == false) return false;
            else return true;
        }
    }

    public static boolean PasswordTest(String Password) {
        if (Password.length()<10) return false;
        else {
            boolean flag1 = false, flag2= false , flag3= false ;
            for (int i=0; i<Password.length(); i++){
                if (Character.isLowerCase(Password.charAt(i)))flag1 = true;
                else if (Character.isUpperCase(Password.charAt(i)))flag2 = true;
                if (Character.isDigit(Password.charAt(i)))flag3 = true;
            }
            if (flag1== true&& flag2 == true && flag3 == true) return true;
            else return false;
        }
    }
}










