package GameOld;
public class GameEntry_old {
    private String name;
    private int score;
    public GameEntry_old(String n, int s) {name = n;score = s;}
    public void setName(String name) {this.name = name;}
    public void setScore(int name) {this.score = name;}
    public String getName() {return name;}

    public int getScore() {return score;}

    public String toString() {return "(" + name + ", " + score + ")";}
}
