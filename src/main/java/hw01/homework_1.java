package hw01;

import java.util.Random;
import java.util.Scanner;

public class homework_1 {
    public static void main(String[] args) {
        String [][] results = new String[2][100];
        String [][] info = new String[2][5];
        info[0][0] = "What is the mean of 'Hello' in the Azerbaijan language?";
        info[1][0] = "Salam";
        info[0][1] = "What is the mean of 'OK' in the Azerbaijan language?";
        info[1][1] = "Yaxsi";
        info[0][2] = "What is the mean of 'Good-bye' in the Azerbaijan language?";
        info[1][2] = "Helelik";
        info[0][3] = "What is the mean of 'God-willing' in the Azerbaijan language?";
        info[1][3] = "Sukur Allaha";
        info[0][4] = "What is the mean of 'Bless-you' in the Azerbaijan language?";
        info[1][4] = "Saglam ol";
        int user_queue = 0;
        Random rand = new Random();
        int info_rand_digit = rand.nextInt(5);
        while (true)
        {
            System.out.println("------- Be carefully, That is your question -------");
            System.out.println("#####  " + info[0][info_rand_digit] + "  #####");
            int user_try = 0;
            Scanner in = new Scanner(System.in);
            String name;
            int user_digit;
            int x = rand.nextInt(101);
            System.out.println("Enter Your Name: ");
            name = in.nextLine();
            System.out.println("Let the game begin!");
            System.out.println("Enter a digit between 1 and 100 to find out my secret digit!");
            while(true)
            {
                user_digit = in.nextInt();
                if(user_digit>100 || user_digit<0)
                {
                    System.out.println("You can only enter a number between 0 and 100 \n  ----- Enter Again! -----");
                    continue;
                }
                user_try++;
                if(user_digit < x) System.out.println("Your number is too small. Please, try again.");
                else if(user_digit > x) System.out.println("Your number is too big. Please, try again.");
                else {
                    System.out.println("Congratulations, " + name + "!" + "\n");
                    System.out.println("You found out the secret digit in < " + user_try + " > time(s)! \n");
                    System.out.println("#####  The answer of your question is < '" + info[1][info_rand_digit] + "' >  ##### \n");
                    results[0][user_queue] = name;
                    results[1][user_queue] = Integer.toString(user_try);
                    break;
                }
            }
            boolean a;
            char yes_no;
            System.out.println("Play Again!");
            System.out.println("Yes (Y or y)       No (N or n)");
            while(true) {
                yes_no = in.next().charAt(0);
                if (yes_no == 'Y' || yes_no == 'y'){
                    a = true;
                    user_queue++;
                    break;
                }
                else if(yes_no == 'N' || yes_no == 'n') {
                    a = false;
                    System.out.println("   ##### PLAYER LIST #####   ");
                    for (int i=1; i<=user_queue; i++) //sort results array
                    {
                        for (int j = 0; j<user_queue; j++)
                        {
                            if(Integer.parseInt(results[1][i]) < Integer.parseInt(results[1][j]))
                            {
                                String str = results[1][i];
                                String str1 = results[0][i];
                                results[1][i] = results[1][j];
                                results[0][i] = results[0][j];
                                results[1][j] = str;
                                results[0][j] = str1;
                            }
                        }
                    }
                    for (int i = 0; i<=user_queue; i++)
                        System.out.println(results[0][i] + "  ---  " + results[1][i] + " Time(s)");
                    break;
                }
                else System.out.println("Please, enter correct characters! (Your Choice is wrong!)");
            }
            if (!a) {
                System.out.println("Thanks for trying");
                break;
            }
        }
    }
}