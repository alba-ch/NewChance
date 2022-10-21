package jhwan.com.hackforgood.Model.location;

/*
This class will contain all the required information of a location or service. Such as Child support
centers, Healthcare centers, educative centers, etc.
 */
public class Location {

    /* Atributes
        id: this atribute will allow us to tell apart different locations in the data base
        name: name of the location or service
        province: Spain's province where the data or service is located
        city: Spain's city where the data or service is located
        adress: street and number where the location or service is
        cp: postal code
        email: if the location has one, email to contact them
        website: if the location has one, the link to their website
        description: brief description of the place, the services it offers, its timetables, etc.
        phonenum: if the location has one, a phone number to contact them
     */
    String id, name, type, province, city, adress, cp, email, website, description;
    int phonenum;

    //Constructors

    public Location() {   }

    public Location(String id, String name, String type, String province, String city, String adress, String cp, String email, String website, String description, int phonenum) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.province = province;
        this.city = city;
        this.adress = adress;
        this.cp = cp;
        this.email = email;
        this.website = website;
        this.description = description;
        this.phonenum = phonenum;
    }

    // Getters and setters

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }
}
