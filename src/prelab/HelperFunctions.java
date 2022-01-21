package prelab;

import java.util.Scanner;

    public class HelperFunctions {
        // HELPER FUNCTIONS
        // Function that gets a single digit input from the user
        static int getUserMenuSingleDigitInput(){
            Scanner my_scanner = new Scanner(System.in);
            System.out.print("Select menu number: ");
            return Integer.parseInt(String.valueOf(my_scanner.next().charAt(0)));
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
            System.out.format(format, "Total num of Doses  ", "  Individuals with atleast One dose  ", "Fuilly Vaccinated ", "  Individuals with booster dose  ", "  Total");
            System.out.format(format, "A1                  ", "  25,826                             ", "24,698            ", "  11,155                         ", "  60,278");

            System.out.format(format, "A2                  ", "  32,812                             ", "31,801            ", "  14,839                         ", "  73,887");
            //cool table
            System.out.format(format, "A3                  ", "  55,572                             ", "54,260            ", "  14,839                         ", "  73,887");
            System.out.format(format, "A4                  ", "  122,152                            ", "113,085           ", "  12,935                         ", "  247,760");
            System.out.format(format, "A5                  ", "  22,536                             ", "20,558            ", "  1,520                          ", "  43, 896");
            System.out.format(format, "ROP                 ", "  28,676                             ", "22,821            ", "  926                            ", "  51,342");
            System.out.format(format, "P.A3                ", "  4,803                              ", "3,995             ", "  11,155                         ", "  8,798");
            System.out.format(format, "ROPP                ", "  28,256                             ", "25,727            ", "  11,155                         ", "  53, 983");
        }

        //Test
}
