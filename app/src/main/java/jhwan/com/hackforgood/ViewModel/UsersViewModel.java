package jhwan.com.hackforgood.ViewModel;

import android.provider.ContactsContract;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.users.Professional;
import jhwan.com.hackforgood.Model.users.Refugee;
import jhwan.com.hackforgood.Model.users.User;
import jhwan.com.hackforgood.Repositories.Database;

public class UsersViewModel {
    // Atributes
    private Database db = new Database();
    private ArrayList<Professional> professionals;
    private ArrayList<Refugee> refugees;

    //Constructor
    public  UsersViewModel(){
        professionals =  db.getProfessionals();
    }

    // Methods
    public ArrayList<Professional> getProByType(String type){
        ArrayList<Professional> typeList = new ArrayList<>();
        for (int i = 0; i < professionals.size(); i++){
            if (professionals.get(i).getProfession().equals(type)){
                typeList.add(professionals.get(i));
            }
        }
        return typeList;
    }

}
