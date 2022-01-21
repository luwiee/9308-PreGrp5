//Just tried if git commit and git push works
package prelab;

import static prelab.HelperFunctions.*; // Import the helper functions class

public class Main {

    public static void main(String[] args) {
        // Main Function Should only call the functions
        Introduction();
        do {
            mainMenu();

        } while(AskIfDoAgain());
    }

    static void Introduction() {
        System.out.println("“Baguio City Covid-19 Vaccination Status”.");
    }

    static boolean AskIfDoAgain() {
        System.out.println("Do you want to continue the program? ");
        System.out.println("1: Yes");
        System.out.println("2: No");

        return (getUserMenuSingleDigitInput() == 1);
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
        System.out.println("~ Vaccination Status ~");
    }

    // SHOW VACCINATION STATUS PER PRIORITY GROUP
    static void showVaccinationStatusPriorityGroup(){
        System.out.println("~ Vaccination Status Per Priority Group ~");
    }

    // SHOW VACCINATION STATUS DOSE
    static void showVaccinationStatusDose(){
        System.out.println("~ Vaccination Status Per Dose~");
        System.out.println("1: One Dose");
        System.out.println("2: Fully Vaccinated");
        System.out.println("3: With Booster");
        System.out.println("4: Main Menu");

        switch (getUserMenuSingleDigitInput()) {
            case 1: break; //TODO One Dose
            case 2: break; //TODO Fully Vaccinated
            case 3: break; //TODO With Booster
            case 4: mainMenu(); break;
        }
    }

    // UPDATE VACCINATION STATUS
    static void updateVaccinationStatus(){
        System.out.println("~ Update Vaccination Status~");
        //TODO This method shall ask the user to enter what category, classification of dose as well as the current
        //      number of vaccines administered.
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
            case 1 -> sortAndDisplayOptions_MostVaccines();
            case 2 -> sortAndDisplayOptions_LeastVaccines();
            case 3 -> sortAndDisplayOptions_TotalVaccinesDay();
            case 4 -> sortAndDisplayOptions_TotalVaccines();
            case 5 -> mainMenu();
        }
    }

    static void sortAndDisplayOptions_MostVaccines(){
        //TODO GET DATA
        //TODO SORT DATA
        //TODO SHOW DATA
    }

    static void sortAndDisplayOptions_LeastVaccines(){
        //TODO GET DATA
        //TODO SORT DATA
        //TODO SHOW DATA
    }

    static void sortAndDisplayOptions_TotalVaccinesDay(){
        //TODO GET DATA
        //TODO SORT DATA
        //TODO SHOW DATA
    }

    static void sortAndDisplayOptions_TotalVaccines(){
        //TODO GET DATA
        //TODO SORT DATA
        //TODO SHOW DATA
    }
}
