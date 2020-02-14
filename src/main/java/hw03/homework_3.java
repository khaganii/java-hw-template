package hw03;
import java.util.Scanner;
public class homework_3 {
    public static void main(String[] args) {
        String [][] sedule = new String[7][2];
        Scanner in = new Scanner(System.in);
        sedule[0][0] = "Monday";
        sedule[0][1] = "studying at home and doing course";
        sedule[1][0] = "Tuesday";
        sedule[1][1] = "cooking meals and doing homework";
        sedule[2][0] = "Wednesday";
        sedule[2][1] = "going to university and doing course";
        sedule[3][0] = "Thursday";
        sedule[3][1] = "going to university and watching films";
        sedule[4][0] = "Friday";
        sedule[4][1] = "relaxing and doing course";
        sedule[5][0] = "Saturday";
        sedule[5][1] = "cocking meals and doing homework";
        sedule[6][0] = "Sunday";
        sedule[6][1] = "studying at home and doing homework";
        boolean exit = true;
        while (exit){
            System.out.println("Please, Enter the day of the week: ");
            boolean change = false;
            String changable_day = "";
            String choise = in.nextLine().trim().toLowerCase(); //all letters to lowercase
            if(choise.length() > 0) {
                choise = capital(choise);
                if (choise.length() > 10 && (choise.substring(0, 6).equals("Change") || choise.substring(0, 10).equals("Reschedule"))) {
                    String[] words = choise.split(" ");
                    for (String word : words) {
                        for (int j = 0; j < 7; j++) {
                            if (capital(word).equals(sedule[j][0])) {
                                changable_day = capital(word);
                                change = true;
                                break;
                            }
                        }
                    }
                }
                if (change) choise = "change";
            }
            switch (choise){
                case "Monday":
                    System.out.println("Your task for " + sedule[0][0] + ": " + sedule[0][1]);
                    break;
                case "Tuesday":
                    System.out.println("Your task for " + sedule[1][0] + ": " + sedule[1][1]);
                    break;
                case "Wednesday":
                    System.out.println("Your task for " + sedule[2][0] + ": " + sedule[2][1]);
                    break;
                case "Thursday":
                    System.out.println("Your task for " + sedule[3][0] + ": " + sedule[3][1]);
                    break;
                case "Friday":
                    System.out.println("Your task for " + sedule[4][0] + ": " + sedule[4][1]);
                    break;
                case "Saturday":
                    System.out.println("Your task for " + sedule[5][0] + ": " + sedule[5][1]);
                    break;
                case "Sunday":
                    System.out.println("Your task for " + sedule[6][0] + ": " + sedule[6][1]);
                    break;
                case "Exit":
                    exit = false;
                    break;
                case "change": //reschedule or change
                    System.out.println("Change task of " + capital(changable_day) + ":");
                    System.out.print("Enter new task for " + capital(changable_day) + ": ");
                    for (int i = 0; i < 7; i++) {
                        if (sedule[i][0].equals(changable_day))
                            sedule[i][1] = in.nextLine();
                    }
                    System.out.println("######  Your task has changed! ######");
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again! ");
            }
      }
    }
    public static String capital(String choise)
    {
        char ch = choise.charAt(0);  //
        String first = String.valueOf(ch).toUpperCase();
        char[] arx = choise.toCharArray();
        arx[0] = first.charAt(0);
        choise = String.copyValueOf(arx);
        return choise;
    }
}
