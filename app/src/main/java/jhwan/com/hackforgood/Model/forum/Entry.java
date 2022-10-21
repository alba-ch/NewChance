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

}
