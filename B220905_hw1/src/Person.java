public class Person {
    private String fName;
    private String lName;
    private String email;

    public Person(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
    public String getlNameF() {
        return lName+" "+fName.substring(0,1)+".";
    }

    public String getEmail() {
        return email;
    }

}
