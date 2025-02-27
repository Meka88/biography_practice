import java.util.ArrayList;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */
     public Author(){

    }

    //Create 6 args custom constructor here
    //YOUR CODE HERE

    public Author(String firstName, String lastName, String country, boolean isAlive, int age, ArrayList<Book> listOfBooks){
         this.firstName = firstName;
         this.lastName = lastName;
         this.country = country;
         this.isAlive = isAlive;
         this.age = age;
         this.listOfBooks = listOfBooks;
    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE

    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public ArrayList<Book> listOfBooks = new ArrayList<Book>();

    public Author(String firstName, String lastName, String country, boolean isAlive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
    }

    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                '}';
    }
}
