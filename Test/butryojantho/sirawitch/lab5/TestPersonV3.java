/**
* This is TestPersonV3 class.
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: January 21, 2022
*
**/

package butryojantho.sirawitch.lab5;

public class TestPersonV3 {
    public static void main(String[] args) {
        Programmer mark = new Programmer("Mark Zuckerberg", 185, 80, "1998-07-07", "Python", 20); // Create a Programmer
                                                                                                  // object, call "mark"
                                                                                                  // and add data to
                                                                                                  // each parameter.
        Footballer pele = new Footballer("Pele", 185, 85, "1984-05-14", "Brazil", "Forward"); // Create a Footballer
                                                                                              // object, call "pele" and
                                                                                              // add data to each
                                                                                              // parameter.
        System.out.println(mark); // print out "mark" infomation
        System.out.println(pele); // print out "pele" infomation
        mark.howOld(); // prints out how old an instance is.
        pele.howOld(); // prints out how old an instance is.
        System.out.println(Person.getNumberOfPerson() + " persons have been created");
        PersonV2 mickey = new PersonV2("Mickey Mouse", 60, 25, "1982-01-01");
        System.out.println(mickey); // print out "mickey" infomation
        mickey = new Footballer("Mickey mouse", 60, 25, "1982-01-01", "Disney", "Miidfield");
        System.out.println(mickey); // print out "mickey" infomation (now mickey is a Footballer)
        System.out.println(Person.getNumberOfPerson() + " persons have been created"); // print out the number of person
                                                                                       // created in this class
        mickey.compareAge(pele); // compare the age of an instance and that of an instance in the parameter. The
                                 // method outputs who is older.
    }
}
