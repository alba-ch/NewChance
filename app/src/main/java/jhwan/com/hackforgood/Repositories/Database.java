package jhwan.com.hackforgood.Repositories;


import com.google.firebase.firestore.FirebaseFirestore;

/*
This class will allow us to add and read information from our diferent
database collections.
 */
public class Database {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
}
