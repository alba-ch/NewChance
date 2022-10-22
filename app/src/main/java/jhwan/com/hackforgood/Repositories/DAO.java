package jhwan.com.hackforgood.Repositories;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.location.Location;
import jhwan.com.hackforgood.Model.users.Professional;

public class DAO {

    // Atributes
    private ArrayList<Professional> professionals = new ArrayList<>();
    private ArrayList<Location> locations = new ArrayList<>();

    // Constructor
    public DAO(){
        // Initialize data in professionals list
        intializeProfessionals();
        initializeLocations();
    }

    // Initializers
    private void intializeProfessionals(){
        Professional professional = new Professional("Anna Chicharro", "c/Random Street, 58", "Mon-Fri: from 8:00 to 18:00 \n Sat: from 8:00 to 14:00", "Lawyer");
        professionals.add(professional);
        professional = new Professional("Claudia Blillo", "c/Lemon Street, 24", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00", "Lawyer");
        professionals.add(professional);
        professional = new Professional("Sara Donga", "c/Lemon Street, 24", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00", "Lawyer");
        professionals.add(professional);
        professional = new Professional("Jhwan Cheng", "c/Lemon Street, 24", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00", "Lawyer");
        professionals.add(professional);
        professional = new Professional("Abu David", "c/Lemon Street, 24", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00", "Lawyer");
        professionals.add(professional);
    }

    private void initializeLocations(){
        Location location = new Location("Roquetas Assylium", "Barcelona", "Barcelona", "c/Lemon Steet, 56", "08036", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00",937758451,"Assylium");
        locations.add(location);
        location = new Location("Barceloneta Assylium", "Barcelona", "Barcelona", "c/The Beach, 56", "08036", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00",937758451,"Assylium");
        locations.add(location);
        location = new Location("Croquetas Assylium", "Barcelona", "Barcelona", "c/Croqueta Steet, 56", "08036", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00",937758451,"Assylium");
        locations.add(location);
        location = new Location("Croquetas Assylium", "Barcelona", "Barcelona", "c/Croqueta Steet, 56", "08036", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00",937758451,"Assylium");
        locations.add(location);
        location = new Location("Croquetas Assylium", "Barcelona", "Barcelona", "c/Croqueta Steet, 56", "08036", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00",937758451,"Assylium");
        locations.add(location);
        location = new Location("Croquetas Assylium", "Barcelona", "Barcelona", "c/Croqueta Steet, 56", "08036", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00",937758451,"Assylium");
        locations.add(location);
    }
    // Getter and setters
    public ArrayList<Professional> getProfessionals(){ return professionals;}
    public ArrayList<Location> getLocations(){ return locations;}

}
