public class Obj {
    
    private String name;
    private String phone;
    private String street;
    private String city;
    private String zip;




    public Obj(String name, String phone, String street, String city, String zip) {
        
        this.name = name;
        this.phone = phone;
        this.street = street;
        this.city = city;
        this.zip = zip;



    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getZip() { return zip; }

    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setStreet(String street) { this.street = street; }
    public void setCity(String city) { this.city = city; }
    public void setZip(String zip) { this.zip = zip; }
    


    @Override
    public String toString() {
        return name + " | " + phone + " | " + street + " | " + city + " | " + zip;
    }

    }

