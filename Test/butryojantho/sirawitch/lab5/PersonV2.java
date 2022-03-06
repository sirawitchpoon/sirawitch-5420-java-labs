package butryojantho.sirawitch.lab5;

import java.time.LocalDate;
import java.time.Period;

public class PersonV2 extends Person {

    private LocalDate dob; // a LocalDate variable called dob for the date of birth

    public PersonV2(String name, double height, double weight, String dob) { // PersonV2(String, dboule, double, String)
                                                                             // that accepts 4 parameters. The first
                                                                             // string will be used to set the name, the
                                                                             // first double will be for the height and
                                                                             // the second one
                                                                             // will be for the weight. second String
                                                                             // will be for the dateofbirth
        super(name, height, weight); // use super(parameters) to invoke the immediate parent class constructor
        this.dob = LocalDate.parse(dob);
    }

    public LocalDate getDOB() { // retrieve the dob from the object
        return dob;
    }

    public void setDOB(LocalDate dob) { // set the dob in the object
        this.dob = dob;
    }

    public void isBirthday() { // check if today is an instance’s birthday. then print it out
        LocalDate today = LocalDate.now();
        if (today.equals(this.dob)) {
            System.out.println("Today is " + this.getName() + "'s Birthday.");
        } else {
            System.out.println("Today is NOT " + this.getName() + "'s Birthday.");
        }
    }

    public void howOld() { // prints out how old an instance is.
        LocalDate today = LocalDate.now();
        Period period = Period.between(this.dob, today);
        System.out.printf(this.getName() + " is %d years %d months and %d days old.", period.getYears(),
                period.getMonths(),
                period.getDays());
        System.out.println("");
    }

    public void compareAge(PersonV2 personV2) { // compare the age of an instance and that of an instance in the
                                                // parameter. The method outputs who is older.

        int compareValue = this.dob.compareTo(personV2.dob);
        if (compareValue > 0) {
            System.out.printf(personV2.getName() + " is " + personV2.dob.until(dob).getYears() + " years "
                    + personV2.dob.until(dob).getMonths() + " months and "
                    + personV2.dob.until(dob).getDays() + " days older than " + this.getName());
            System.out.println("");
        } else if (compareValue < 0) {
            System.out.printf(this.getName() + " is " + dob.until(personV2.dob).getYears() + " years "
                    + dob.until(personV2.dob).getMonths() + " months and "
                    + dob.until(personV2.dob).getDays() + " days older than " + personV2.getName());
            System.out.println("");
        } else {
            System.out.println(this.getName() + "'s age is equal to " + personV2.getName());
        }
    }

    @Override
    public String toString() { // returns String that is the detail of the class PersonV2 and Person. The
                               // detail of Person from the method toString() in class Person. Use
                               // the keyword “super” to get the wanted String.
        return super.toString() + ", Birthday=" + this.getDOB();
    }

}