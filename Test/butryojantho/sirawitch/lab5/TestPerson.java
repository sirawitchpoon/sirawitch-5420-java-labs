/**
* This is TestPerson class.
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: January 21, 2022
*
**/

package butryojantho.sirawitch.lab5;

public class TestPerson {
    public static void main(String[] args) {
        Person unknown = new Person(); // Create a Person object, call "unknow" that have no data.
        System.out.println(unknown); // print out "unknown" infomation
        System.out.println(Person.getNumberOfPerson() + " person has been created."); // print out the number of person
                                                                                      // created in this class
        Person ronaldo = new Person("Ronaldo"); // Create a Person object, call "ronaldo" and add data to each
                                                // parameter.
        Person messi = new Person("Messi", 167, 63); // Create a Person object, call "messi" and add data to each
                                                     // parameter.
        System.out.println(ronaldo); // print out "ronaldo" infomation
        System.out.println(messi); // print out "messi" infomation
        Person pele = new Person("Pele", 185, 85); // Create a Person object, call "pele" and add data to each
                                                   // parameter.
        System.out.println(pele); // print out "pele" infomation
        System.out.println(messi.getName() + "'s BMI is " + messi.getBMI()); // calculate messi's BMI then print it
        System.out.println(pele.getName() + "'s BMI is " + pele.getBMI()); // calculate pele's BMI then print it
        pele.setWeight(72); // set pele weight to 72
        System.out.println(pele.getName() + "'s BMI is " + pele.getBMI()); // calculate pele's BMI then print it
        System.out.println(Person.getNumberOfPerson() + " persons have been created"); // print out the number of person
                                                                                       // created in this class
    }
}

class Person {
    private String name; // a String variable called name for the name of person
    private double height; // a double variable called height for the height of person
    private double weight; // a double variable called weight for the weight of person

    protected static int numberOfPerson = 0; // a static int variable called numberOfPerson for the number of person
                                             // that created in any class

    public Person() { // Person() takes no parameters. It initializes name to “unknown”, weight
        name = "unknown";
        numberOfPerson++;
    }

    public Person(String name) { // Person(String) accepts a String which will be used to initialize name. weight
                                 // and height will be initialized to 0.0, and numberOfPerson will be incremented
                                 // by 1.
        this.name = name;
        numberOfPerson++;

    }

    public Person(String name, double height, double weight) { // Person(String, double, double) accepts 3 parameters.
                                                               // The first string will be used to set the name, the
                                                               // first double will be for the height and the second one
                                                               // will be for the weight. numberOfPerson will be
                                                               // incremented by 1.
        this.name = name;
        this.height = height;
        this.weight = weight;
        numberOfPerson++;
    }

    public String getName() { // retrieve the name from the object
        return name;
    }

    public void setName(String name) { // set the name in the object
        this.name = name;
    }

    public double getHeight() { // retrieve the height from the object
        return height;
    }

    public void setHeight(double height) { // set the height in the object
        this.height = height;
    }

    public double getWeight() { // retrieve the weight from the object
        return weight;
    }

    public void setWeight(double weight) { // set the weight in the object
        this.weight = weight;
    }

    @Override
    public String toString() { // returns a string description of this instance.
        return "name=" + this.name + ", height=" + String.format("%.2f", this.height) + " cm., weight= "
                + String.format("%.2f", this.weight) + " kg.";
    }

    public String getBMI() { // calculate the BMI
        String BMI = String.format("%.2f", this.weight / ((this.height / 100) * (this.height / 100)));
        return BMI;
    }

    public static int getNumberOfPerson() { // retrieve the numberOfPerson from the object
        return numberOfPerson;
    }

}
