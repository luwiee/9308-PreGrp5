package prelab;

import java.util.HashMap;
import java.util.Scanner;

    public class HelperFunctions {
        // HELPER FUNCTIONS
        // Function that gets a single digit input from the user
        static int getUserMenuSingleDigitInput(){
            Scanner my_scanner = new Scanner(System.in);
            System.out.print("\nSelect option number: ");
            Integer input = Integer.parseInt(String.valueOf(my_scanner.next().charAt(0)));
            System.out.println();
            return input;
        }

        static boolean AskIfDoAgain() {
            System.out.println("\nDo you want to continue the program? ");
            System.out.println("1: Yes");
            System.out.println("2: No");

            return (getUserMenuSingleDigitInput() == 1);
        }

        static int getIntInput(){
            Scanner my_scanner = new Scanner(System.in);
            Integer input = Integer.parseInt(my_scanner.next());
            return input;
        }
        // Bubble sort for the sorting parts and returns sorted index array
        static int[] bubbleSort(int[] arr) {
            int n = arr.length;
            int[] index_array = new int[arr.length];
            for (int i=0; i<arr.length; i++){
                index_array[i] = i;
            }
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] < arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];

                        arr[j] = temp;

                        temp = index_array[j-1];
                        index_array[j-1] = index_array[j];
                        index_array[j] = temp;
                    }
                }
            }

            return index_array;
        }

        // Bubble sort for the sorting parts
        static int[] bubbleSortAscending(int[] arr) {
            int n = arr.length;
            int[] index_array = new int[arr.length];
            for (int i=0; i<arr.length; i++){
                index_array[i] = i;
            }
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];

                        arr[j] = temp;

                        temp = index_array[j-1];
                        index_array[j-1] = index_array[j];
                        index_array[j] = temp;
                    }
                }
            }

            return index_array;
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
        //Test
        static void InitializeData(){
            // A1
            new VSE(PGC.A1, DTC.ONE_DOSE, 25826-10);
            new VSE(PGC.A1, DTC.ONE_DOSE, 10, true);

            new VSE(PGC.A1, DTC.FULLY_VACCINATED, 24698-10);
            new VSE(PGC.A1, DTC.FULLY_VACCINATED, 10, true);

            new VSE(PGC.A1, DTC.BOOSTER, 11155-110);
            new VSE(PGC.A1, DTC.BOOSTER, 110, true);


            //
            // A2
            new VSE(PGC.A2, DTC.ONE_DOSE, 32812-10);
            new VSE(PGC.A2, DTC.ONE_DOSE, 10,true);

            new VSE(PGC.A2, DTC.FULLY_VACCINATED, 31801-10);
            new VSE(PGC.A2, DTC.FULLY_VACCINATED, 10, true);

            new VSE(PGC.A2, DTC.BOOSTER, 14839-110);
            new VSE(PGC.A2, DTC.BOOSTER, 108, true);


            //
            // A3
            new VSE(PGC.A3, DTC.ONE_DOSE, 55572-16);
            new VSE(PGC.A3, DTC.ONE_DOSE, 16,true);

            new VSE(PGC.A3, DTC.FULLY_VACCINATED, 54260-17);
            new VSE(PGC.A3, DTC.FULLY_VACCINATED, 17, true);

            new VSE(PGC.A3, DTC.BOOSTER, 18747-410);
            new VSE(PGC.A3, DTC.BOOSTER, 410, true);


            //
            // A4
            new VSE(PGC.A4, DTC.ONE_DOSE, 122152-40);
            new VSE(PGC.A4, DTC.ONE_DOSE, 40, true);

            new VSE(PGC.A4, DTC.FULLY_VACCINATED, 113085-40);
            new VSE(PGC.A4, DTC.FULLY_VACCINATED, 40, true);

            new VSE(PGC.A4, DTC.BOOSTER, 12935-756);
            new VSE(PGC.A4, DTC.BOOSTER, 756, true);


            //
            // A5
            new VSE(PGC.A5, DTC.ONE_DOSE, 22536-11);
            new VSE(PGC.A5, DTC.ONE_DOSE, 11, true);

            new VSE(PGC.A5, DTC.FULLY_VACCINATED, 20558-10);
            new VSE(PGC.A5, DTC.FULLY_VACCINATED, 10, true);

            new VSE(PGC.A5, DTC.BOOSTER, 1520-80);
            new VSE(PGC.A5, DTC.BOOSTER, 80, true);


            //
            // ROP
            new VSE(PGC.ROP, DTC.ONE_DOSE, 28676-12);
            new VSE(PGC.ROP, DTC.ONE_DOSE, 12, true);

            new VSE(PGC.ROP, DTC.FULLY_VACCINATED, 22821-13);
            new VSE(PGC.ROP, DTC.FULLY_VACCINATED, 13,true);

            new VSE(PGC.ROP, DTC.BOOSTER, 926-240);
            new VSE(PGC.ROP, DTC.BOOSTER, 240, true);


            //
            // P.A3
            new VSE(PGC.PA3, DTC.ONE_DOSE, 4803);
            new VSE(PGC.PA3, DTC.FULLY_VACCINATED, 3995);
            new VSE(PGC.PA3, DTC.BOOSTER, 0);


            //
            // ROPP
            new VSE(PGC.ROPP, DTC.ONE_DOSE, 28256);
            new VSE(PGC.ROPP, DTC.FULLY_VACCINATED, 25727);
            new VSE(PGC.ROPP, DTC.BOOSTER, 0);
        }




        static String PriorityGroupStringOnIndex(int i){
            String priority_group;
            switch(i){
                case 0 -> priority_group="A1";
                case 1 -> priority_group="A2";
                case 2 -> priority_group="A3";
                case 3 -> priority_group="A4";
                case 4 -> priority_group="A5";
                case 5 -> priority_group="ROP";
                case 6 -> priority_group="P.A3";
                case 7 -> priority_group="ROPP";
                default -> throw new IllegalStateException("Unexpected value: " + i);
            }

            return priority_group;
        }

        static void PrintDescendingPriorityGroupData(){
            int[] priority_group_data = new int[]{
                    VSE.GetVSOfPG(PGC.A1), VSE.GetVSOfPG(PGC.A2), VSE.GetVSOfPG(PGC.A3),
                    VSE.GetVSOfPG(PGC.A4), VSE.GetVSOfPG(PGC.A5), VSE.GetVSOfPG(PGC.ROP),
                    VSE.GetVSOfPG(PGC.PA3), VSE.GetVSOfPG(PGC.ROPP)};

            int[] indexArr = bubbleSort(priority_group_data); // Sort the array and get the sequence of the sorted arr

            for (int i = 0; i < indexArr.length; i++){
                System.out.printf("%d. %s : %d\n",i+1,PriorityGroupStringOnIndex(indexArr[i]), priority_group_data[i]);
            }
        }

        static void PrintAscendingPriorityGroupData(){
            int[] priority_group_data = new int[]{
                    VSE.GetVSOfPG(PGC.A1), VSE.GetVSOfPG(PGC.A2), VSE.GetVSOfPG(PGC.A3),
                    VSE.GetVSOfPG(PGC.A4), VSE.GetVSOfPG(PGC.A5), VSE.GetVSOfPG(PGC.ROP),
                    VSE.GetVSOfPG(PGC.PA3), VSE.GetVSOfPG(PGC.ROPP)};

            int[] indexArr = bubbleSortAscending(priority_group_data); // Sort the array and get the sequence of the sorted arr

            for (int i = 0; i < indexArr.length; i++){
                System.out.printf("%d. %s : %d\n",i+1,PriorityGroupStringOnIndex(indexArr[i]), priority_group_data[i]);
            }
        }


}
