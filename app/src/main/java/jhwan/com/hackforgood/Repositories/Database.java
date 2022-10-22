package jhwan.com.hackforgood.Repositories;


import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.location.Location;
import jhwan.com.hackforgood.Model.users.Professional;

/*
This class will allow us to add and read information from our diferent
database collections.
 */
public class Database {

    private static final Database uniqueInstance = new Database();

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    // Normally we will get all the data grom the database, but since this an alpha version we
    // will be using DAO
    DAO dao = new DAO();

    // Constructor
    private Database(){

    }

    public static Database getInstance(){
        return uniqueInstance;
    }

    // Methods to get inforamtion from data base
    public ArrayList<Professional> getProfessionals(){
        return dao.getProfessionals();
    }

    public ArrayList<Location> getLocations(){return  dao.getLocations();}
}
