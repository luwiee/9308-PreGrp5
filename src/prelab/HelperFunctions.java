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
            String format = "|%20s|%35s|%20s|%35s|%20s|\n";
            String formatD = "|%20s|%35d|%20d|%35d|%20d|\n";
            String dc = "\t\t"; // Distance
            System.out.format(format, "Total num of Doses", "Individuals with atleast One dose", "Fuilly Vaccinated", "Individuals with booster dose", "Total");

            // TODO need help formatting this properly
            System.out.format(formatD, "A1", VSE.GetVSOfPGAndDT(PGC.A1, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.A1, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.A1, DTC.BOOSTER), VSE.GetVSOfPG(PGC.A1));
            System.out.format(formatD, "A2", VSE.GetVSOfPGAndDT(PGC.A2, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.A2, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.A2, DTC.BOOSTER), VSE.GetVSOfPG(PGC.A2));
            System.out.format(formatD, "A3", VSE.GetVSOfPGAndDT(PGC.A3, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.A3, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.A3, DTC.BOOSTER), VSE.GetVSOfPG(PGC.A3));
            System.out.format(formatD, "A4", VSE.GetVSOfPGAndDT(PGC.A4, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.A4, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.A4, DTC.BOOSTER), VSE.GetVSOfPG(PGC.A4));
            System.out.format(formatD, "A5", VSE.GetVSOfPGAndDT(PGC.A5, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.A5, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.A5, DTC.BOOSTER), VSE.GetVSOfPG(PGC.A5));
            System.out.format(formatD, "ROP", VSE.GetVSOfPGAndDT(PGC.ROP, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.ROP, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.ROP, DTC.BOOSTER), VSE.GetVSOfPG(PGC.ROP));
            System.out.format(formatD, "P.A3", VSE.GetVSOfPGAndDT(PGC.PA3, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.PA3, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.PA3, DTC.BOOSTER), VSE.GetVSOfPG(PGC.PA3));
            System.out.format(formatD, "ROP", VSE.GetVSOfPGAndDT(PGC.ROPP, DTC.ONE_DOSE), VSE.GetVSOfPGAndDT(PGC.ROPP, DTC.FULLY_VACCINATED), VSE.GetVSOfPGAndDT(PGC.ROPP, DTC.BOOSTER), VSE.GetVSOfPG(PGC.ROPP));
        }

        //Test
}
