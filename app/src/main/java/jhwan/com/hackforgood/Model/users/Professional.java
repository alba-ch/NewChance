package jhwan.com.hackforgood.Model.users;

/*
This class will inherit from User and will contain the information that's charactheristic only for
professional volunter's profiles. Such as psychologists, lawyeres, etc.
 */

public class Professional extends User{

    /* Atributes
        profession: this will specify the carrear or subject of the proffessional. The able options
                    are: - Psychologist (psychologist)
                         - Doctor/Nurse (health)
                         - Social Worker (social)
                         - Lawyer (lawyer)
                         - Translator or language teacher (language)
        accreditation_img: if they want to be verified, they will need to adjunt a picture of
                           their studies titulation. With this we will be able to detect
                           possible imposters o scamers
        description: brief descrition of the professionals carreer, services and motivations to help
                     the refugees.
        status: if the professinal has a Ciclo Superior title, an university degree, a master,
                a doctorate or is a collage student doing practices.
        price: price per hour. This can be 0€.
        email: email address so the users can contact them
        phonenum: phone number so the users can contact hem

    */
    String profession, accrediation_img, description, status, price, email;
    int phonenum;

    // Constructors


    public Professional() {

    }

    public Professional(String id, String name, String sex, String age, String password, String img, String documention_img, String email, Boolean verified, String profession, String accrediation_img, String description, String status, String price, String email1, int phonenum) {
        super(id, name, sex, age, password, img, documention_img, email, verified);
        this.profession = profession;
        this.accrediation_img = accrediation_img;
        this.description = description;
        this.status = status;
        this.price = price;
        this.email = email1;
        this.phonenum = phonenum;
    }

    // Getters i setters

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAccrediation_img() {
        return accrediation_img;
    }

    public void setAccrediation_img(String accrediation_img) {
        this.accrediation_img = accrediation_img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }
}
