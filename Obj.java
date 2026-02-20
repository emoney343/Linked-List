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

    @Override
    public String toString() {
        return name + ": " + phone;
    }

    }

