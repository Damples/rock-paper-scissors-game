import java.util.Scanner;

public class rps_game {
    public static void main(String[] args) {
        String again;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome the rock paper scissors game\n***********************************************************************************\n");
            int raund_user_counter = 0;
            int raund_computer_counter = 0;
            int choice;

            while (raund_computer_counter < 5 || raund_user_counter < 5) {
                int computer = (int) (Math.random() * 3 + 1);
                System.out.println("For choose the rock press 1, the paper press 2, the scissors press 3.\nMake your choice.");
                choice = input.nextInt();{
                    if (choice == computer) {
                        System.out.println("your and computer's choice is same. Deal. No point for anybody");
                        System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                    }
                    else if (choice == 1) {
                        if (computer == 2) {
                            System.out.println("You choose rock and computer choose paper. You lose.");
                            raund_computer_counter++;
                            System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                        }
                        else if (computer == 3) {
                            System.out.println("You choose rock and computer choose scissors. You win.");
                            raund_user_counter++;
                            System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                        }
                    }
                    else if (choice == 2) {
                        if (computer == 1) {
                            System.out.println("You choose paper and computer choose rock. You won.");
                            raund_user_counter++;
                            System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                        }
                        else if (computer == 3) {
                            System.out.println("You choose paper and computer choose scissors. You lose.");
                            raund_computer_counter++;
                            System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                        }
                    }
                    else if (choice == 3) {
                        if (computer == 1) {
                            System.out.println("You choose scissors and computer choose rock. You lose.");
                            raund_computer_counter++;
                            System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                        }
                        else if (computer == 2) {
                            System.out.println("You choose scissors and computer choose paper. You win");
                            raund_user_counter++;
                            System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                        }
                    }
                    else
                        System.out.println("Please choose 1, 2 or 3.");
                }
                System.out.println("***********************************************************************************\n");
                if (raund_computer_counter == 5) {
                    System.out.println("Winner is computer.");
                    System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                    System.out.println("***********************************************************************************");
                    break;
                }
                if (raund_user_counter == 5) {
                    System.out.println("Winner is you.");
                    System.out.println("Your score is " + raund_user_counter + " and computer's score is " + raund_computer_counter);
                    System.out.println("***********************************************************************************");
                    break;
                }
            }
            System.out.println("Dou you want try again?");
            again = "a";
            while (!again.equals("y") || !again.equals("n")) {
                System.out.println("Please press y or n.");
                again = input.next();
                if (again.equals("y"))
                    break;
                else if (again.equals("n"))
                    break;
            }
        }
        while (again.equals("y") || !again.equals("n"));
        System.out.println("Goodbye user. We will play again.");
    }
}