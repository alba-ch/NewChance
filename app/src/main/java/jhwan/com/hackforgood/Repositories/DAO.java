package jhwan.com.hackforgood.Repositories;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.users.Professional;

public class DAO {

    // Atributes
    private ArrayList<Professional> professionals = new ArrayList<>();

    // Constructor
    public DAO(){
        // Initialize data in professionals list
        intializeProfessionals();
    }

    // Initializers
    private void intializeProfessionals(){
        Professional professional = new Professional("Anna Chicharro", "c/Random Street, 58", "Mon-Fri: from 8:00 to 18:00 \n Sat: from 8:00 to 14:00", "Lawyer");
        professionals.add(professional);
        professional = new Professional("Claudia Blillo", "c/Lemon Street, 24", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00", "Lawyer");
        professionals.add(professional);
        professional = new Professional("Claudia Blillo", "c/Lemon Street, 24", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00", "Lawyer");
        professionals.add(professional);
        professional = new Professional("Claudia Blillo", "c/Lemon Street, 24", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00", "Lawyer");
        professionals.add(professional);
        professional = new Professional("Claudia Blillo", "c/Lemon Street, 24", "Mon-Fri: from 10:00 to 17:00 \n Sat: from 8:00 to 11:00", "Lawyer");
        professionals.add(professional);
    }
    // Getter and setters
    public ArrayList<Professional> getProfessionals(){ return professionals;}
}
