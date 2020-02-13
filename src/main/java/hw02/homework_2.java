package hw02;

import java.util.Random;
import java.util.Scanner;

public class homework_2 {
    public static void main(String[] args) {
        char[][] arr = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = '-';
            }
        }
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int target_i = rand.nextInt(5);
        int target_j = rand.nextInt(5);
        int pt_i;
        int pt_j;
        int counter = 0;
        boolean end = true;
        System.out.println("All set. Get ready to rumble!");
        System.out.println("0 | 1 | 2 | 3 | 4 | 5 | \n" +
                "1 | - | - | - | - | - | \n" +
                "2 | - | - | - | - | - | \n" +
                "3 | - | - | - | - | - | \n" +
                "4 | - | - | - | - | - | \n" +
                "5 | - | - | - | - | - | \n");
        System.out.println();
        while (end)
        {
            System.out.println("Select your target!");
            while (true) { //entering target
                System.out.println("Horizontal Coordinate (from 1 to 5) i = ");
                pt_i = in.nextInt();
                if (pt_i < 1 || pt_i > 5)
                {
                    System.out.println("Please, enter correct number!");
                }
                else break;
            }
            while (true) { //entering target
                System.out.println("Vertical Coordinate (from 1 to 5) i = ");
                pt_j = in.nextInt();
                if (pt_j < 1 || pt_j > 5)
                {
                    System.out.println("Please, enter correct number!");
                }
                else break;
            }
            counter++;
            if(target_i+1 == pt_i && target_j+1 == pt_j)
            {
                end = false;
                System.out.println("You Have Won! in <" + counter + "> times!");
                System.out.println(" ######  The target was in (" + pt_i + " ; " + pt_j + ")  ######");
                arr[target_i][target_j] = 'X';
            }
            else {
                arr[pt_i - 1][pt_j - 1] = '*';
                end = true;
            }
            for (int i = 0; i <=5; i++) { //only for printing
                for (int j = 0; j <= 5; j++) {
                    if (i == 0 && j == 0) System.out.print(0 + " | ");
                    else if (i == 0) System.out.print((j) + " | ");
                    else if (j == 0) System.out.print((i) + " | ");
                    else System.out.print(arr[i - 1][j - 1] + " | ");
                }
                System.out.println();
            }
        }
    }
}