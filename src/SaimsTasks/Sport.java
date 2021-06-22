package SaimsTasks;

public class Sport {
    String name;
    int numOfPlayers;
    boolean teamBased;

    public void makeSport (String nameOfSport,int players , boolean teams ){
        name = nameOfSport;
        numOfPlayers = players;
        teamBased = teams;

    }
    public String toString (){
        return "the "+ name + "add" + numOfPlayers +" players " + teamBased;
    }

    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("Soccer", 22 ,true);
        System.out.println(soccer);
    }
}
