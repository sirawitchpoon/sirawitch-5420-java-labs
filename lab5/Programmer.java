/**
 * This is Programmer class
 * Class Programmer represents a person who is a computer programmer. 
 * He has one programming language that he is best at. He also has the number of years for his programming experience.
 * 
 * Author:Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec:2
 * Date:7 Ferbuary 2022
 */

package butryojantho.sirawitch.lab5;

public class Programmer extends PersonV2 {

    private String bestProgLang; // a String variable called bestProgLang for the best programming language
    private int yearOfExperience; // an int variable called yearOfExperience for the number of years experience

    public Programmer(String name, double height, double weight, String dob, String bestProgLang,
            int yearOfExperience) { // Programmer(String , double , double , String , String , int) accepts 6
                                    // parameters. The first 4 parameters should be initialized using “super”. The
                                    // last two are String and int which are for bestProgLang and yearOfExperience
                                    // respectively.

        super(name, height, weight, dob);
        this.yearOfExperience = yearOfExperience;
    }

    public String getBestProgLang() { // retrieve the bestProgLang from the object
        return bestProgLang;
    }

    public void setBestProgLand(String bestProgLang) { // set the bestProgLang in the object
        this.bestProgLang = bestProgLang;
    }

    public int getYearOfExperience() { // retrieve the yearOfExperience from the object
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) { // set the yearOfExperience in the object
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public String toString() { // it shows the information of the class Programmer and call toString() of the
                               // superclass PersonV2 to get some of the information.
        return super.toString() + ", Best Programming Language=" + getBestProgLang() + ", Year of Experience ="
                + getYearOfExperience();
    }
}
