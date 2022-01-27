package prelab;

import java.util.ArrayList;

// Vaccination Status Entry

// Store Each Individual's Vaccination Status in each
public class VSE {
    private final PGC priority_group;
    private final DTC dosage_type;
    private final int vaccine_count;

    private static ArrayList<VSE> categoryStatusList = new ArrayList<>();

    public VSE(PGC p_group, DTC d_type, int v_count){
        priority_group = p_group;
        dosage_type = d_type;
        vaccine_count = v_count;

        categoryStatusList.add(this);
    }

    public PGC GetPriority_group(){
        return priority_group;
    }
    public DTC GetDosage_type(){
        return dosage_type;
    }

    public double GetVaccine_count(){
        return vaccine_count;
    }

    public static int GetTotalVaccinationStatus(){
        int total_v_count = 0;

        for (VSE categoryEntry : categoryStatusList){
            total_v_count += categoryEntry.vaccine_count;
        }

        return total_v_count;
    }

    public static int GetVSOfPG(PGC priority_group_filter){
        int total_v_count = 0;

        // Iterate through the category Status list and check if it is of the priority group if so
        // Add it to the total Vaccine count
        for (VSE categoryEntry : categoryStatusList){
            if (categoryEntry.priority_group == priority_group_filter){
                total_v_count += categoryEntry.vaccine_count;
            }
        }

        return total_v_count;
    }

    // return vaccine_count of dosage count
    public static int GetVSOfDT(DTC dosage_filter) {
        int total_v_count = 0;

        // Iterate through the category Status list and check if it is of the dosage type if so
        // Add it to the total Vaccine count
        for (VSE categoryEntry : categoryStatusList){
            if (categoryEntry.dosage_type == dosage_filter){
                total_v_count += categoryEntry.vaccine_count;
            }
        }

        return total_v_count;
    }


}
