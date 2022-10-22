package jhwan.com.hackforgood.ViewModel;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.location.Location;
import jhwan.com.hackforgood.Model.users.Professional;
import jhwan.com.hackforgood.Model.users.Refugee;
import jhwan.com.hackforgood.Repositories.Database;

public class LocationViewModel {
    // Atributes
    private Database db = Database.getInstance();
    private ArrayList<Location> locations;
    private ArrayList<Refugee> refugees;

    //Constructor
    public  LocationViewModel(){
        locations =  db.getLocations();
    }

    // Methods
    public ArrayList<Location> getLocationsByType(String type){
        ArrayList<Location> typeList = new ArrayList<>();
        for (int i = 0; i < locations.size(); i++){
            if (locations.get(i).getType().equals(type)){
                typeList.add(locations.get(i));
            }
        }
        return typeList;
    }

}
