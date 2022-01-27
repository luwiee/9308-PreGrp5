package prelab;

import java.util.HashMap;
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
        static HashMap<String, Integer> adultPopulationData(){
            HashMap<String, Integer> data = new HashMap<String, Integer>();
            data.put("one", 287574);
            data.put("oneToday", 185);
            data.put("full", 267223);
            data.put("fullToday", 286);
            data.put("booster", 60122);
            data.put("boosterToday", 1359);
            data.put("total", 654989);
            return data;
        }

        static HashMap<String, Integer> pediatricPopulationData(){
            HashMap<String, Integer> data = new HashMap<String, Integer>();
            data.put("one", 33059);
            data.put("oneToday", 45);
            data.put("full", 29722);
            data.put("fullToday", 49);
            data.put("booster", 60122);
            data.put("totalToday", 102);
            data.put("a3Pedia", 13);
            data.put("ropp", 89);
            return data;
        }

        static HashMap<String, Integer> adultByPriorityData(){
            HashMap<String, Integer> data = new HashMap<String, Integer>();
            data.put("a1", 130);
            data.put("a2", 130);
            data.put("a3", 443);
            data.put("a4", 836);
            data.put("a5", 101);
            data.put("roap", 265);
            data.put("totalToday", 1905);
            return data;
        }

        static HashMap<String, HashMap<String, Integer>> populationByPriorityData(){
            HashMap<String, HashMap<String, Integer>> data = new HashMap<String, HashMap<String, Integer>>();
            HashMap<String, Integer> innerData = new HashMap<String, Integer>();
            innerData.put("one", 25826);
            innerData.put("full", 24296);
            innerData.put("booster", 11155);
            innerData.put("total", 60278);
            data.put("a1", innerData);

            innerData.clear();
            innerData.put("one", 32812);
            innerData.put("full", 31801);
            innerData.put("booster", 14839);
            innerData.put("total", 73887);
            data.put("a2", innerData);

            innerData.clear();
            innerData.put("one", 55572);
            innerData.put("full", 54260);
            innerData.put("booster", 14839);
            innerData.put("total", 73887);
            data.put("a3", innerData);

            innerData.clear();
            innerData.put("one", 122152);
            innerData.put("full", 113085);
            innerData.put("booster", 12935);
            innerData.put("total", 247760);
            data.put("a4", innerData);

            innerData.clear();
            innerData.put("one", 22536);
            innerData.put("full", 20558);
            innerData.put("booster", 1520);
            innerData.put("total", 43896);
            data.put("a5", innerData);

            innerData.clear();
            innerData.put("one", 28676);
            innerData.put("full", 22821);
            innerData.put("booster", 926);
            innerData.put("total", 51342);
            data.put("rop", innerData);

            innerData.clear();
            innerData.put("one", 4803);
            innerData.put("full", 3995);
            innerData.put("booster", 11155);
            innerData.put("total", 8798);
            data.put("p.a3", innerData);

            innerData.clear();
            innerData.put("one", 28256);
            innerData.put("full", 25727);
            innerData.put("booster", 11155);
            innerData.put("total", 53983);
            data.put("ropp", innerData);

            return data;
        }
}
