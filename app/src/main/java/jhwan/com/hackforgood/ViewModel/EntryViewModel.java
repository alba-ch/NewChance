package jhwan.com.hackforgood.ViewModel;

import java.util.ArrayList;

import jhwan.com.hackforgood.Model.forum.Entry;
import jhwan.com.hackforgood.Model.location.Location;
import jhwan.com.hackforgood.Model.users.Refugee;
import jhwan.com.hackforgood.Repositories.Database;

public class EntryViewModel {
    // Atributes
    private Database db = Database.getInstance();
    private ArrayList<Entry> entries;

    //Constructor
    public  EntryViewModel(){
        entries =  db.getEntries();
    }

    // Methods

    public ArrayList<Entry> getEntries() {
        return entries;
    }

    public ArrayList<Entry> getEntriesbyType(String type) {
        ArrayList<Entry> typeList = new ArrayList<>();
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getType().equals(type)) {
                typeList.add(entries.get(i));
            }
        }
        return typeList;
    }
}
