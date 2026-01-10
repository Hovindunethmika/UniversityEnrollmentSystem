package universityenrollmentsystem;

public class Alumni extends Person{
    private int graduationYear;
    private String degreeTitle;
    private String currentEmployer;

    // Constructor that takes name and surname and calls parent constructor
    public Alumni(String name, String surname){
        super(name, surname);
    }

    // Getter and Setter for graduationYear
    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    // Getter and Setter for degreeTitle
    public String getDegreeTitle() {
        return degreeTitle;
    }

    public void setDegreeTitle(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

    // Getter and Setter for currentEmployer
    public String getCurrentEmployer() {
        return currentEmployer;
    }

    public void setCurrentEmployer(String currentEmployer) {
        this.currentEmployer = currentEmployer;
    }

    @Override
    public String toString(){
        return super.toString() + " Alumni - Graduation Year: " + graduationYear
                + ", Degree Title: " + degreeTitle + ", Current Employer: " + currentEmployer;
    }
}