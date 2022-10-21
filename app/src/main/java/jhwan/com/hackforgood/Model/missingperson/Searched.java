package jhwan.com.hackforgood.Model.missingperson;

/*
This class will save the data of that person that's beeing searched with the missing person option
*/

public class Searched {

    /* Atributes
        id: this atribute will allow us to tell apart different locations in the data base
        name: Full name of the searched person
        country: country of provenance
        description: brief physical and moral description of the searched person
        age: searched person's age
    */
    String id, name, country, description;
    int age;

    // Constructors

    public Searched() {}

    public Searched(String id, String name, String country, String description, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.description = description;
        this.age = age;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
