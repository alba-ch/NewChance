package jhwan.com.hackforgood.Model.forum;

/*
This class corresponds to the comments the users will be able to leave under every forum's entry.
 */

import java.time.LocalDate;

public class Comment {

    /*Atributs
        idEntry: id of the forum's entry that the comment's refers to
        idUser: id of the user that created the comment
        text: text that the user wrote
        date: date when the comment was created
        anonymous: this boolean will allow us to know if the user want the message to be published
                    anonymously or not

     */
    String idEntry, idUser, text;
    LocalDate date;
    boolean anonymous;

    // Constructors
    public Comment (){}
    public Comment(String entry, String user, String text, LocalDate date, boolean anonymous) {
        this.idEntry = entry;
        this.idUser = user;
        this.text = text;
        this.date = date;
        this.anonymous = anonymous;
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

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }
}
