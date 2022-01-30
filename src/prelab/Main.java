package prelab;

import static prelab.HelperFunctions.*; // Import the helper functions class

public class Main {

    public static void main(String[] args) {
        // Initialize Data
        InitializeData();

        // Main Function Should only call the functions
        Introduction();
        do {
            mainMenu();

        } while(AskIfDoAgain());
    }

    static void Introduction() {
        System.out.println("“Baguio City Covid-19 Vaccination Status”.");
    }



    // MAIN-MENU
    // Main Menu Function - Prints the options and have a switch that gets input from the helper getInputFunction
    static void mainMenu(){
        System.out.println("Main Menu");
        System.out.println("1: Show Vaccination Status");
        System.out.println("2: Show Vaccination Status per Priority Group");
        System.out.println("3: Show Vaccination Status per Doses");
        System.out.println("4: Update Vaccination Status");
        System.out.println("5: Sort and Display Options");
        System.out.println("6: Quit");

        // Get the input from user and run the functions that pertain to that input
        switch (getUserMenuSingleDigitInput()) {
            case 1 -> showVaccinationStatus();
            case 2 -> showVaccinationStatusPriorityGroup();
            case 3 -> showVaccinationStatusDose();
            case 4 -> updateVaccinationStatus();
            case 5 -> sortAndDisplayOptions();
            case 6 -> System.exit(0);
        }
    }

    // SHOW VACCINATION STATUS
    static void showVaccinationStatus(){
        System.out.println("\t\t ~ Vaccination Status ~");
        String[] label = { "With First Dose", "Fully Vaccinated", "With Booster", "Total Administered" };
        int[] items = { VSE.GetVSOfDT(DTC.ONE_DOSE), VSE.GetVSOfDT(DTC.FULLY_VACCINATED), VSE.GetVSOfDT(DTC.BOOSTER), VSE.GetTotalVaccinationStatus() };
        for (int i = 0; i < label.length; i++) {
            System.out.printf("%22s: %10d%n", label[i], items[i]);
        }
    }



    // SHOW VACCINATION STATUS PER PRIORITY GROUP
    static void showVaccinationStatusPriorityGroup(){
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t~ Vaccination Status Per Priority Group ~");

        displayData();
    }
    //

    // SHOW VACCINATION STATUS DOSE
    static void showVaccinationStatusDose(){
        System.out.println("~ Vaccination Status Per Dose~");
        System.out.println("1: One Dose");
        System.out.println("2: Fully Vaccinated");
        System.out.println("3: With Booster");
        System.out.println("4: Main Menu");

        switch (getUserMenuSingleDigitInput()) {
            case 1 -> System.out.println(VSE.GetVSOfDT(DTC.ONE_DOSE) + " Vaccines administered");
            case 2 -> System.out.println(VSE.GetVSOfDT(DTC.FULLY_VACCINATED) + " Vaccines administered");
            case 3 -> System.out.println(VSE.GetVSOfDT(DTC.BOOSTER) + " Vaccines administered");
            case 4 -> mainMenu();
        }
    }

    // UPDATE VACCINATION STATUS
    static void updateVaccinationStatus(){
        PGC priority_group_input;
        DTC dosage_classification_input = null;
        int vaccine_count_input;
        System.out.println("~ Update Vaccination Status~");
        System.out.println("Select Priority Group:");
        System.out.println("1: A1");
        System.out.println("2: A2");
        System.out.println("3: A3");
        System.out.println("4: A4");
        System.out.println("5: A5");
        System.out.println("6: ROP");
        System.out.println("7: P.A3");
        System.out.println("8: ROPP");

        switch (getUserMenuSingleDigitInput()) {
            case 1 -> priority_group_input = PGC.A1;
            case 2 -> priority_group_input = PGC.A2;
            case 3 -> priority_group_input = PGC.A3;
            case 4 -> priority_group_input = PGC.A4;
            case 5 -> priority_group_input = PGC.A5;
            case 6 -> priority_group_input = PGC.ROP;
            case 7 -> priority_group_input = PGC.PA3;
            case 8 -> priority_group_input = PGC.ROPP;
            default -> throw new IllegalStateException("Unexpected value: " + getUserMenuSingleDigitInput());
        }

        System.out.println("Select Dosage Type:");
        System.out.println("1: One Dose");
        System.out.println("2: Fully Vaccinated");
        System.out.println("3: Booster");

        switch (getUserMenuSingleDigitInput()){
            case 1 -> dosage_classification_input = DTC.ONE_DOSE;
            case 2 -> dosage_classification_input = DTC.FULLY_VACCINATED;
            case 3 -> dosage_classification_input = DTC.BOOSTER;
        }

        System.out.print("Vaccination Count:");
        vaccine_count_input = getIntInput();

        new VSE(priority_group_input, dosage_classification_input, vaccine_count_input, true);

    }
    // SORT AND DISPLAY OPTIONS
    static void sortAndDisplayOptions(){
        System.out.println("~ Sort and Display Options ~");

        System.out.println("1: Priority group that has the most vaccines administered");
        System.out.println("2: Priority group that has the least vaccines administered");
        System.out.println("3: Total vaccines for the day");
        System.out.println("4: Total vaccines administered");
        System.out.println("5: Main Menu");


        switch (getUserMenuSingleDigitInput()) {
            case 1 -> PrintDescendingPriorityGroupData();
            case 2 -> PrintAscendingPriorityGroupData();
            case 3 -> System.out.println(VSE.GetTotalDay() + " Total Vaccines for the day!");
            case 4 -> System.out.println(VSE.GetTotalVaccinationStatus() + "Total Vaccines Administered");
            case 5 -> mainMenu();
        }

    }



}
