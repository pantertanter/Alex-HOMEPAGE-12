package business.entities;

public class User {
    private int id; // just used to demo retrieval of autogen keys in UserMapper
    private String email;
    private String password; // Should be hashed and secured
    private String address;
    private int phone;
    private String role;

    public User(String email, String password, String address, int phone, String role) {
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
        this.role = role;
    }

    public User(String email, String password, String address, int phone) {
        this.email = email;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

