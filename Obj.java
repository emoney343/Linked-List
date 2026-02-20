public class Obj {
    
    private String name;
    private String phone;



    public Obj(String name, String phone) {
        
        this.name = name;
        this.phone = phone;

        name.toString();
        phone.toString();





    }

    public String getName() { return name; }
    public String getPhone() { return phone; }

    public void setName(String name) { this.name = name; }
    public void setPhone(String phone) { this.phone = phone; }

    @Override
    public String toString() {
        return name + ": " + phone;
    }

    }

