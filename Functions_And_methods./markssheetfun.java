package Functions_and_methods;

import java.util.Scanner;

public class markssheetfun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();
        grade(marks);

    }
    static void grade(int marks)
    {
        switch (marks/10){
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");

            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            case 4:
                System.out.println("D--");
                break;
            default:
                System.out.println("Fail");

        }
    }



}


//using if-else statements
//static void grade(int marks){
//    if(marks >= 91 && marks <= 100 ){
//        System.out.println("AA");
//    }
//    if(marks >= 81 && marks <= 90 ){
//            System.out.println("AA");
//        }
//    if(marks >= 71 && marks <= 80 ){
//            System.out.println("AB");
//        }
//    if(marks >= 61 && marks <= 70 ){
//            System.out.println("BB");
//        }
//    if(marks >= 51 && marks <= 60 ){
//            System.out.println("BC");
//        }
//    if(marks >= 51 && marks <= 60 ){
//            System.out.println("CD");
//        }
//        if(marks <= 40){
//            System.out.println("Fail");
//        }