package GameNew;

public class GameEntry_new {
    private String playerName;
    private int score;

    public GameEntry_new(String name, int score) {
        this.playerName = name;
        this.score = score;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return this.playerName;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return "(" + this.playerName + ", " + this.score + ")";
    }
}

