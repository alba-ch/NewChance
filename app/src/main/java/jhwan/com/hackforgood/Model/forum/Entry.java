package jhwan.com.hackforgood.Model.forum;

import java.time.LocalDate;
import java.util.ArrayList;

/*
This class will contain all the data and functions of an entry in any kind of forum
*/
public class Entry {

    /*Atributes
        idEntry: value that will allow us to identify different entries in the data base
        idUser: id of the user that created this entry
        message: content of the entry
        type: this atribute will allow us to identy to which kind of forum the entry will belong to
              We will distint 4 different types: - Children's attention (child)
                                                 - Laboral help (job)
                                                 - Advice  (advice)
                                                 - Psychological support (pyschological)
                                                 - Language support (language)
        anonymous: this will allow us to know if the user wants to publish the entry anonymously or not
        date: date when the entry was created
        comments:  list that contains all the comments associated to this entry


    */
    String idEntry, idUser, message, title, type;
    boolean anonymous;
    LocalDate date;
    ArrayList<Comment> comments;

    // Constructors

    public Entry() {   }

    public Entry(String title, String type, String message){
        this.message = message;
        this.title = title;
        this.type = type;
        comments = new ArrayList<>();
    }

    public Entry(String idEntry, String idUser, String message, String title, String type, boolean anonymous, LocalDate date, ArrayList<Comment> comments) {
        this.idEntry = idEntry;
        this.idUser = idUser;
        this.message = message;
        this.title = title;
        this.type = type;
        this.anonymous = anonymous;
        this.date = date;
        this.comments = comments;
    }
    // Getters and setters

    public String getIdEntry() {
        return idEntry;
    }

    public void setIdEntry(String idEntry) {
        this.idEntry = idEntry;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
}
