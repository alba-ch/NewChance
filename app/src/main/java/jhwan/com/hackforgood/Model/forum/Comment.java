package jhwan.com.hackforgood.Model.forum;

/*
This class corresponds to the comments the users will be able to leave under every forum entry.
 */

import java.time.LocalDate;

public class Comment {

    // Atributs
    String idEntry, idUser, text;
    LocalDate date;

    // Constructors
    public Comment (){}
    public Comment(String entry, String user, String text, LocalDate date) {
        this.idEntry = entry;
        this.idUser = user;
        this.text = text;
        this.date = date;
    }

    //Getters i Setters
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
