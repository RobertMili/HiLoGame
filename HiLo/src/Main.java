import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        int choice;
        int max;
        int answer;
        int guess;
        int guessTime = 0;



            System.out.println("Welcome to HiLo!");
            System.out.println("What difficult do you choose? ");
            System.out.println("1. Easy (1 - 10)");
            System.out.println("2. Average 1 - 100");
            System.out.println("3. Hard 1 - 1000");


            choice = sc.nextInt();

            if (choice == 1){
                answer= playGame(10);// this hold the random number and difficult choice
                // System.out.println(answer); testing random number
                do{
                    System.out.println("Guess number between 1 and 10");
                    guess = sc.nextInt();


                    giveReaponse(answer,guess);
                    guessTime++; // counting how much time gues

                }while(guess != answer);
                    System.out.println("Absolutely right!!! " + ANSI_RED + answer + ANSI_RESET+ " its right answer!");
                    System.out.println("You did succeed from " + ANSI_RED
                        + guessTime
                        + ANSI_RESET+ " try");


            } else if (choice == 2) {
                answer= playGame(100);// this hold the random number and which difficult choice
               // System.out.println(answer); testing random number

                do{
                    System.out.println("Guess number between 1 and 100");
                    guess = sc.nextInt();

                    giveReaponse(answer,guess);
                    guessTime++; // counting how much time gues

                }while(guess != answer);
                    System.out.println("Absolutely right! " + ANSI_RED + answer + ANSI_RESET+ " its right answer!");
                    System.out.println("You did succeed from " + ANSI_RED
                        + guessTime
                        + ANSI_RESET+ " try");


            } else if (choice == 3) {
                answer= playGame(1000);// this hold the random number and which dificult choice
                // System.out.println(answer); testing random number
                System.out.println(answer);
                do{
                    System.out.println("Guess number between 1 and 100");
                    guess = sc.nextInt();

                    giveReaponse(answer,guess);
                    guessTime++; // counting how much time gues

                }while(guess != answer);
                    System.out.println("Absolutely right!!! " + ANSI_RED + answer + ANSI_RESET+ " its right answer!");
                    System.out.println("You did succeed from " + ANSI_RED
                        + guessTime
                        + ANSI_RESET+ " try");



            }


    }
    public static int playGame(int maxNumber){

        int max = maxNumber;
        int numbers = (int)(Math.random() * max)+1; // random number

        return numbers;
    }
    public static void giveReaponse (int answer,int guess) {

        if (guess > answer) {
            System.out.println("Guess was too hight! Try again");

        } else if (guess < answer) {
            System.out.println("Guess was too low! Try again");
        } else if (guess > answer) {
            System.out.println("Guess was too high! Try again");
            }
        }

    }


