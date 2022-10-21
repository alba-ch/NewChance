package jhwan.com.hackforgood.Model.missingperson;

/*
This class will save the data of that person that's requesting searching a missing person.
*/
public class Searcher {

    /* Atributes
        idUser: id of the user that created this entry
        image: the user will be able to adjunt a picture of him or herself so the searched
               person will be able to reconize them
        reason: explanation of why is the user searching this person
        email: email to contact the user in case a center has found a similiar person to the one
               in the description
        phone: phone number to contact the user in case a center has found a similiar person to the one
               in the description
    */
    String idUser, image, reason, email;
    int phone;

    // Constructors

    public Searcher() {
    }

    public Searcher(String idUser, String image, String reason, String email, int phone) {
        this.idUser = idUser;
        this.image = image;
        this.reason = reason;
        this.email = email;
        this.phone = phone;
    }

    // Getters and setters


    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
