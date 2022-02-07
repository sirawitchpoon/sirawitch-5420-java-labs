/**
 * This is TestPersonV2 class
 * 
 * Author: Sirawitch Butryojantho
 * ID: 643040542-0
 * Sec: 2
 * Date: 7 Febuary 2022
 * 
 */

package butryojantho.sirawitch.lab5;

public class TestPersonV2 {

    public static void main(String[] args) {
        PersonV2 mark = new PersonV2("Mark Zuckerberg", 171, 80, "1984-05-14"); // Create a PersonV2 object, call "mark"
                                                                                // and add data to each parameter.
        PersonV2 bill = new PersonV2("Bill Gate", 177, 85, "1955-10-28"); // Create a PersonV2 object, call "bill" and
                                                                          // add data to each parameter.
        System.out.println(mark); // print out "mark" infomation
        System.out.println(bill); // print out "bill" infomation
        mark.howOld(); // prints out how old an instance is.
        bill.howOld(); // prints out how old an instance is.
        mark.compareAge(bill); // compare the age of an instance and that of an instance in the parameter. The
                               // method outputs who is older.
        bill.compareAge(mark); // compare the age of an instance and that of an instance in the parameter. The
                               // method outputs who is older.
        mark.isBirthday(); // check if today is an instance’s birthday.
        bill.isBirthday(); // check if today is an instance’s birthday.
        System.out.println(Person.getNumberOfPerson() + " persons have been created"); // print out the number of person
                                                                                       // created in this class
    }

}
