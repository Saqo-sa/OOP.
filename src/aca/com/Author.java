package aca.com;

class Author {

    protected String name;
    protected String email;
    protected char gender;

    public Author() {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGener() {
        return gender;
    }

    public String toString() {
        return ( name + "(" + gender + ")@" + email);
    }
}
