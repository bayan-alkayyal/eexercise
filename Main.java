package org.example;
import java.util.Scanner ;
import java.util.Locale;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

   /* System.out.println("please enter the weight in kg : ");
    Scanner input = new Scanner(System.in);
    double weight = input.nextDouble();

    System.out.println("please enter the height in meter : ");
    double height = input.nextDouble();

    double bmi = weight/(height*height) ;
    System.out.println("the BMI is : " + bmi);

    */
        //exercise 1 that calculate the BMI by taking weight and height from the user


    /*
    System.out.println("Enter the obtained mark : ");
    Scanner input = new Scanner(System.in);
    double obtainedMark = input.nextDouble();

    System.out.println("Enter the total mark : ");
    int totalMark = input.nextInt();

    double percentage = (obtainedMark/totalMark)*100 ;
    System.out.println("percentage = " + percentage + "%");
*/
        //exercise 2 : calculate the percentage

        /*
    System.out.println("amount in USD : ");
    Scanner input = new Scanner(System.in) ;
    input.useLocale(Locale.US); //عشان يقبل ان المستخدم يدخل عدد عشري
    double amount = input.nextDouble();

    System.out.println("exchange rate (USD to EUR) : ");
    double exchangeRate = input.nextDouble();

    double exchange = amount*exchangeRate ;
    System.out.println("amount in EUR = " + exchange);
*/
        //exercise 3 : convert the amount of money from one currency to another based on exchage rate


    /* Scanner input = new Scanner(System.in) ;
     System.out.println("Enter the text: ");
     String sentence = input.nextLine();

     StringBuilder stringBuilder = new StringBuilder(sentence);
     stringBuilder.reverse();
     System.out.println("the length of string : " + sentence.length() + " and reversed string : " + stringBuilder );
*/
        // exercise 4 : taking string input from the user , calculate its length and reverse it

        /*
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the sentence : ");
        String sentence = input.nextLine();

        System.out.println("Enter the fisrt index : ");
        int findex = input.nextInt();

        System.out.println("Enter the second index : ");
        int sindex = input.nextInt();


        System.out.println(sentence.substring(findex , sindex));

*/
        //exercise 5 : apply subString method on sentence and index from the user

/*
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the sentence : ");
        String sentence = input.nextLine();


        System.out.println("Enter the keyword : ");
        String keyword = input.nextLine();

        if(sentence.contains(keyword)){
        System.out.println("keyword " + keyword + " is present in the sentence");
        }

        else{
        System.out.println("keyword is not present ");
        }

*/
        //exercise 6 : take sentence and keyword from the user and check it the keyword present in the sentence or not

/*
        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter the sentence : ");
        String sentence = input.nextLine();


        System.out.println("Enter word to replace : ");
        String wordToReplace = input.nextLine();


        System.out.println("Enter the replacement word : ");
        String replacementWord = input.nextLine();

        System.out.println(sentence.replace(wordToReplace,replacementWord));

*/
        //exercise 7 : raplce word by another based on user input

/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the frist string : ");
        String string1 = input.nextLine();
        System.out.println("Enter the second string : ");
        String string2 = input.nextLine();


        if (string1.equalsIgnoreCase(string2)) {
            System.out.println("Strings are equal (ignoring case).");
        }
        else {
            System.out.println("Strings are not equal.");

        }
        */
        //exercise 8 : compare 2 string with ignore th case







        }
}