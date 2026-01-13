package universityenrollmentsystem;

public interface EnrollmentManager {

    boolean runMenu(); // Run Menu - main function

    void addPerson(); // Add a person (Student or Staff)

    void printPersonList(); // Print list of all people

    void runGUI(); // Run main GUI

    void searchPeopleByNameFragment();

    void printListSortedByID(); // Added semicolon - TASK 03

    void searchPeopleByIDPrefix(); // TASK 02
}