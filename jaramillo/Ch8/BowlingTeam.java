package jaramillo.Ch8;

public class BowlingTeam {

    // creating field and array
    private String teamName;
    private String[] members = new String[4];

    // teamName get set methods
    public void setTeamName(String setTeamName) {
        teamName = setTeamName;
    }
    public String getTeamName(){
        return teamName;
    }
    public void setMember(int number, String name) {
        members[number] = name;
    }
    public String getMember(int number) {
        return members[number];
    }
    
}
