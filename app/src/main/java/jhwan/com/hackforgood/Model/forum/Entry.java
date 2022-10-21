package jhwan.com.hackforgood.Model.forum;

import java.time.LocalDate;

import jhwan.com.hackforgood.Model.lists.List;

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
    String idEntry, idUser, message, type;
    boolean anonymous;
    LocalDate date;
    List<Comment> comments;

    // Constructors

    public Entry() {   }

    public Entry(String idEntry, String idUser, String message, String type, boolean anonymous, LocalDate date, List<Comment> comments) {
        this.idEntry = idEntry;
        this.idUser = idUser;
        this.message = message;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
