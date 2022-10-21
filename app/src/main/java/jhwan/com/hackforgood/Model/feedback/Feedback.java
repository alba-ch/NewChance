package jhwan.com.hackforgood.Model.feedback;

import java.time.LocalDate;


/*
This class will save all the feedback messages and requests that the app recives from the users
 */
public class Feedback {

    /*
    Atributes
        id: identifier of the feedback message, each message will have a unique one. Necessary to
            store them in the data base.
        message: the texted writed by the user suggestin new implementations, improvements, etc.
        date: the date where the message was send
    */
    String id, message;
    LocalDate date;

    // Constructors

    public Feedback() {
    }

    public Feedback(String id, String message, LocalDate date) {
        this.id = id;
        this.message = message;
        this.date = date;
    }

    // Getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
