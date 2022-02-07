package butryojantho.sirawitch.lab5;

public class Footballer extends PersonV2 {

    private String team; // a String variable called team for the footballer's team
    private String position; // a String variable called position for the his position

    // a constructor that accepts 6 parameters. The first 4 parameters should be
    // initialized using “super”. The last two parameters are String and String
    // which are for the footballer’s team and position respectively.
    public Footballer(String name, double height, double weight, String dob, String team, String position) {
        super(name, height, weight, dob);
        this.team = team;
        this.position = position;
    }

    public String getTeam() { // retrieve the team from the object
        return team;
    }

    public void setTeam(String team) {  // set the team in the object
        this.team = team;
    }

    public String getPosition() { // retrieve the position from the object
        return position;
    }

    public void setPosition(String position) { // set the position in the object
        this.position = position;
    }

    @Override
    public String toString() { // it shows the information of the class Footballer and toString() of the
                               // superclass PersonV2 to get some of the information.
        return super.toString() + ", Team=" + getTeam() + ", Position =" + getPosition();
    }

}
