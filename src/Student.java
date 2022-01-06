public class Student {
    private String firstName;
    private String lastName;
    private String pantherId;
    private double gpa;
    public Student(String firstName, String lastName, String pantherId, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pantherId = pantherId;
        this.gpa = gpa;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPantherId() {
        return pantherId;
    }
    public void setPantherId(String pantherId) {
        this.pantherId = pantherId;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString() {
        return firstName + " " + lastName + " || " + " Panther ID: " +  pantherId + " || " + "GPA: "
                + gpa;
    }
}