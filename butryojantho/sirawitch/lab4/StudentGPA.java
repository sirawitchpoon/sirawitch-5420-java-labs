/**
* This is StudenGPA program.
* This program accepts information about courses and grades then calculates GPA.
* The details are as follows: 
* "MAX_NUM_COURSES" is an int variable for the maximum number of courses a student can register.
* "semesters" is an array of int. It stores the terms of the courses. Terms can be 1 for the first term, 2 for the second term, and so on
* "courses" is an array of String. It stores the names of the courses. The names of the course stored will be the course codes.
* "units" is an array of int that will store the numbers of units of the corresponding courses.
* "grades" is an array of String that will store grades of the courses. Grades can be A, B+, B, C+, C, D+, D and F.
* "numCourses" is the number of courses that the student has registered and recorded. This can be used to run a loop to get values from all the arrays.
* The method readGrades() accepts the information of each course which includes semester,  course,  grade, and the number of units.
* The program loops to read in the data until 0 is entered
* After the program calls the method printGrades(), then the program will call the method showGPAs() and show the choices that the user can type.
* In the function, displayStats(), for each evaluated category, 
* These choices are ‘a’ to see the accumulated GPA, ‘s’ to see the specified semester GPA, or ‘q’ to quit
*
*
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 2
* Date: January 25, 2022
*
**/
import java.util.Scanner;

public class StudentGPA {
    static int MAX_NUM_COURSES = 100;
    static int[] semesters = new int[MAX_NUM_COURSES];
    static String[] courses = new String[MAX_NUM_COURSES];
    static String[] grades = new String[MAX_NUM_COURSES];
    static int[] units = new int[MAX_NUM_COURSES];
    static int numCourses = 0;

    public static void main(String[] args) {
        readGrades();
        printGrades();
        showGPAs();
    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grades of student (semester course grade unit): ");
        System.out.println("Type 0 for the semester to quit");
        while (true) { // loop while with condition "true" to keep looping
            String info = sc.nextLine(); // user input String
            if (info.equals("0")) {
                break; // if user input 0 while loop will stop
            } else { // otherwise if you didn't input 0
                String[] arr = {}; // empty Array
                arr = info.split("\\s+");// split user input (String) into arr (Array) sort the order with "spacebar"
                semesters[numCourses] = Integer.parseInt(arr[0]); // change arr[0] type to Int and equals to
                                                                  // semesters[numCourses]
                courses[numCourses] = arr[1]; // arr[1] equals to cousers[numCoureses]
                grades[numCourses] = arr[2]; // arr[2] euqals to grades[numCoureses]
                units[numCourses] = Integer.parseInt(arr[3]); // change arr[3] type to Int and equals to
                                                              // semesters[numCourses]
                numCourses++; // the value of numCourses incresead by 1 for the next set of infomation
            }
        }
    }

    public static void printGrades() {
        System.out.println("You have entered these following grades:");
        for (int i = 0; i < numCourses; i++) {
            System.out.println(semesters[i] + " " + courses[i] + " " + grades[i] + " " + units[i]); // display every
                                                                                                    // information that
                                                                                                    // user input by
                                                                                                    // using loop for
        }
        for (int a = 0; a < numCourses; a++) {
            grades[a] = grades[a].toLowerCase(); // use loop for to lowerCase every element in grades[]
        }
    }

    public static void showGPAs() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Type 'a' for accumulated GPA, 's' for GPA for specific semester, and 'q' to quit");
            String choice = scan.nextLine(); // user input string
            double totalScores = 0.00; // to set totalScores to 0 for manytimes this loop go on
            double totalUnits = 0.00; // to set totalUnits to 0 for manytimes this loop go on
            switch (choice) {
                case "a":
                    for (int i = 0; i < numCourses; i++) { // to calculate every elenment in grades[]
                        if (grades[i].equals("a")) {
                            totalScores = totalScores + 4.00 * units[i];
                            totalUnits = totalUnits + units[i];
                        } else if (grades[i].equals("b")) {
                            totalScores = totalScores + 3.00 * units[i];
                            totalUnits = totalUnits + units[i];
                        } else if (grades[i].equals("c")) {
                            totalScores = totalScores + 2.00 * units[i];
                            totalUnits = totalUnits + units[i];
                        } else if (grades[i].equals("d")) {
                            totalScores = totalScores + 1.00 * units[i];
                            totalUnits = totalUnits + units[i];
                        } else if (grades[i].equals("b+")) {
                            totalScores = totalScores + 3.50 * units[i];
                            totalUnits = totalUnits + units[i];
                        } else if (grades[i].equals("c+")) {
                            totalScores = totalScores + 2.50 * units[i];
                            totalUnits = totalUnits + units[i];
                        } else if (grades[i].equals("d+")) {
                            totalScores = totalScores + 1.50 * units[i];
                            totalUnits = totalUnits + units[i];
                        } else if (grades[i].equals("f")) {
                            totalUnits = totalUnits + units[i];
                        }
                    }
                    System.out.println("Accumulated GPA is " + String.format("%.2f", totalScores / totalUnits)); // print
                                                                                                                 // Accumulated
                                                                                                                 // GPA
                                                                                                                 // and
                                                                                                                 // make
                                                                                                                 // two
                                                                                                                 // decimal
                                                                                                                 // places
                    break; // break this case and go back to loop while
                case "s":
                    System.out.println("Enter the semester that you want to see:");
                    int sem = scan.nextInt(); // user input integer for which semester they want
                    if (sem == 1) {
                        for (int j = 0; j < numCourses; j++) {
                            while (semesters[j] == 1) { // find every element that is 1 semester
                                if (grades[j].equals("a")) { // calculate totalScores and units for those on semester 1
                                    totalScores = totalScores + 4.00 * units[j];
                                    totalUnits = totalUnits + units[j];
                                    break;
                                } else if (grades[j].equals("b")) {
                                    totalScores = totalScores + 3.00 * units[j];
                                    totalUnits = totalUnits + units[j];
                                    break;
                                } else if (grades[j].equals("c")) {
                                    totalScores = totalScores + 2.00 * units[j];
                                    totalUnits = totalUnits + units[j];
                                    break;
                                } else if (grades[j].equals("d")) {
                                    totalScores = totalScores + 1.00 * units[j];
                                    totalUnits = totalUnits + units[j];
                                    break;
                                } else if (grades[j].equals("b+")) {
                                    totalScores = totalScores + 3.50 * units[j];
                                    totalUnits = totalUnits + units[j];
                                    break;
                                } else if (grades[j].equals("c+")) {
                                    totalScores = totalScores + 2.50 * units[j];
                                    totalUnits = totalUnits + units[j];
                                    break;
                                } else if (grades[j].equals("d+")) {
                                    totalScores = totalScores + 1.50 * units[j];
                                    totalUnits = totalUnits + units[j];
                                    break;
                                } else if (grades[j].equals("f")) {
                                    totalUnits = totalUnits + units[j];
                                    break;
                                }
                            }
                        }
                        System.out.println("The GPA of the semester " + sem + " is "
                                + String.format("%.2f", totalScores / totalUnits)); // print Accumulated GPA and make
                                                                                    // two decimal places
                        break;
                    } else if (sem == 2) {
                        for (int k = 0; k < numCourses; k++) {
                            while (semesters[k] == 2) { // find every element that is 2 semester
                                if (grades[k].equals("a")) { // calculate totalScores and units for those on semester 2
                                    totalScores = totalScores + 4.00 * units[k];
                                    totalUnits = totalUnits + units[k];
                                    break;
                                } else if (grades[k].equals("b")) {
                                    totalScores = totalScores + 3.00 * units[k];
                                    totalUnits = totalUnits + units[k];
                                    break;
                                } else if (grades[k].equals("c")) {
                                    totalScores = totalScores + 2.00 * units[k];
                                    totalUnits = totalUnits + units[k];
                                    break;
                                } else if (grades[k].equals("d")) {
                                    totalScores = totalScores + 1.00 * units[k];
                                    totalUnits = totalUnits + units[k];
                                    break;
                                } else if (grades[k].equals("b+")) {
                                    totalScores = totalScores + 3.50 * units[k];
                                    totalUnits = totalUnits + units[k];
                                    break;
                                } else if (grades[k].equals("c+")) {
                                    totalScores = totalScores + 2.50 * units[k];
                                    totalUnits = totalUnits + units[k];
                                    break;
                                } else if (grades[k].equals("d+")) {
                                    totalScores = totalScores + 1.50 * units[k];
                                    totalUnits = totalUnits + units[k];
                                    break;
                                } else if (grades[k].equals("f")) {
                                    totalUnits = totalUnits + units[k];
                                    break;
                                }
                            }
                        }
                        System.out.println("The GPA of the semester " + sem + " is "
                                + String.format("%.2f", totalScores / totalUnits)); // print Accumulated GPA and make
                                                                                    // two decimal places
                        break;
                    }
                case "q":
                    System.exit(0); // input q to exit program
            }
        }
    }
}