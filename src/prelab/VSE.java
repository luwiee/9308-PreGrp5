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

    public PGC getPriority_group(){
        return priority_group;
    }
    public DTC getDosage_type(){
        return dosage_type;
    }

    public double getVaccine_count(){
        return vaccine_count;
    }

    public static int GetTotalVaccinationStatus(){
        int total_v_count = 0;

        for (VSE categoryEntry : categoryStatusList){
            total_v_count += categoryEntry.getVaccine_count();
        }

        return total_v_count;
    }

    // Return total Vaccination status of the priority group
    public static int GetVSOfPG(PGC priority_group_filter){
        int total_v_count = 0;

        // Iterate through the category Status list and check if it is of the priority group if so
        // Add it to the total Vaccine count
        for (VSE categoryEntry : categoryStatusList){
            if (categoryEntry.getPriority_group().equals(priority_group_filter)){
                total_v_count += categoryEntry.getVaccine_count();
            }
        }

        return total_v_count;
    }

    // Return vaccination count of VS of PG and Dt
    public static int GetVSOfPGAndDT(PGC priority_group_filter, DTC dosage_filter){
        int total_v_count = 0;

        // Iterate through the category Status list and check if it is of the priority group if so
        // Add it to the total Vaccine count
        for (VSE categoryEntry : categoryStatusList){
            if (categoryEntry.getPriority_group().equals(priority_group_filter)){
                if (categoryEntry.getDosage_type().equals(dosage_filter)){
                    total_v_count += categoryEntry.getVaccine_count();
                }
            }
        }

        return total_v_count;
    }

    // return total vaccine_count of dosage count
    public static int GetVSOfDT(DTC dosage_filter) {
        int total_v_count = 0;

        // Iterate through the category Status list and check if it is of the dosage type if so
        // Add it to the total Vaccine count
        for (VSE categoryEntry : categoryStatusList){
            if (categoryEntry.getDosage_type().equals(dosage_filter)){
                total_v_count += categoryEntry.getVaccine_count();
            }
        }

        return total_v_count;
    }


}
