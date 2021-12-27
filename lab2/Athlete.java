/**
* This is Athlete program.
* The output show the your favourite athlete, the sport that your favourite athlete play and the nationality your favourite athelete has.
* It accept three arguments you have to put it inorder
* First: athlete name
* Second: the sport name that athlete plays
* Last: the nationality of that athlete.  
*
* Author: Sirawitch Butryojantho
* ID: 643040542-0
* Sec: 1
* Date: December 24, 2021
*
**/

public class Athlete {
    public static void main(String[] args) {
        int numArgs = args.length;
        if (numArgs != 3) {
            System.out.println("Athlete <athlete_name> <sport> <athlete_nationality>");
            System.exit(0);
        }
        String athlete_name = args[0];
        String sport_name = args[1];
        String athlete_nationality = args[2];
        System.out.println("My favourite athlete is"+ athlete_name + " who play" + sport_name + " and has nationality as " + athlete_nationality + ".");
    }
}