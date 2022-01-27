package prelab;

import java.util.Scanner;

    public class HelperFunctions {
        // HELPER FUNCTIONS
        // Function that gets a single digit input from the user
        static int getUserMenuSingleDigitInput(){
            Scanner my_scanner = new Scanner(System.in);
            System.out.print("Select menu number: ");
            Integer input = Integer.parseInt(String.valueOf(my_scanner.next().charAt(0)));
            System.out.println();
            return input;
        }
        // Bubble sort for the sorting parts
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        static void displayData(){
            String format = "|%1$-10s|%2$-10s|%3$-20s|%4$-20s|%5$-20s\n";
            String formatD = "|%1$-10s|%2$-10d|%3$-20d|%4$-20d|%5$-20d\n";
            String dc = "\t\t\t"; // Distance
            System.out.format(format, "Total num of Doses" + dc, "Individuals with atleast One dose", "Fuilly Vaccinated", "Individuals with booster dose", "Total");
            System.out.format(formatD, "A1"+dc, VSE.GetVSOfPGAndDT(PGC.A1, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.A1, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.A1, DTC.BOOSTER), VSE.GetVSOfPG(PGC.A1));
        }

        //Test
}
