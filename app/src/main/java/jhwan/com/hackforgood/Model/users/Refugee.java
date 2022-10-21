package jhwan.com.hackforgood.Model.users;

/*
This class will inherit from User and will contain the information that's charactheristic only for
refugee's profiles
 */
public class Refugee extends User{

    /*Atributes
        procedence: country of provenance
        resdience: user's current Spain's province of residence
    */
    String provenance, residence;

    // Constructor

    public Refugee() {
    }

    public Refugee(String id, String name, String sex, String age, String password, String img, String documention_img, String email, Boolean verified, String provenance, String residence) {
        super(id, name, sex, age, password, img, documention_img, email, verified);
        this.provenance = provenance;
        this.residence = residence;
    }

    // Getters i setters

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }
}
