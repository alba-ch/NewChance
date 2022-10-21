package jhwan.com.hackforgood.Model.users;

/*
This is the mother class of all the users. It will contain all the common data between all the different
kinds of users.
 */
public class User {

    /* Atributes
        id: each user will have a different identificator. This will allow them to log in into the app
            and will allow us to difference them in the data base. They will be able to choose their
            own id while doing the register process
        name: name of the user
        sex: sex of the user
        age: age of the user
        password: this will allow the user to log in into the app

        Note: all this data may be used in a future implementation where recommendators will be included
              on different options of the app.
        documentation_img: if they want to be verified, they will need to adjunt a picture of
                            their passport or any official documentation. With this we will be able to detect
                            possible imposters o scamers
        email: email to contact the user
        verified: this boolean will allow the other users to know if this user is verified. They will be
                  be able to trust the verified accounts
    */
    String id, name, sex, age, password, img, documention_img, email;
    Boolean verified;

    // Constructor
    public User() {
    }

    public User(String id, String name, String sex, String age, String password, String img, String documention_img, String email, Boolean verified) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.password = password;
        this.img = img;
        this.documention_img = documention_img;
        this.email = email;
        this.verified = verified;
    }

    // Getters i setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDocumention_img() {
        return documention_img;
    }

    public void setDocumention_img(String documention_img) {
        this.documention_img = documention_img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }
}
