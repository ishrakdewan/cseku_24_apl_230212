package GameOld;
public class Scoreboard_old {
    private int numEntries = 0;
    private GameEntry_old[] board;

    public Scoreboard_old(int capacity) {board = new GameEntry_old[capacity];}
    public void add1(GameEntry_old e) {int newScore = e.getScore();
        if(numEntries < board.length || newScore > board[numEntries - 1].getScore()) {if(numEntries < board.length) {
                numEntries++;
        }
        int j = numEntries - 1;while(j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
        }
        board[j] = e;}
    }


    public void add(GameEntry_old e) {
        int newScore = e.getScore();
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {numEntries++;}
               int idx = numEntries-1;
            board[idx] = e;
            for(int i = idx;i>0;i--){
                if(board[i-1].getScore()<board[i].getScore()) {
                    GameEntry_old temp = board[i-1];
                    board[i-1] = board[i];
                    board[i] = temp;}}}}

    public void remove(int i) throws Exception {
        if(i < 0 || i >= numEntries) {throw new Exception("Invalid index: " + i);}
        for(int j = i; j < numEntries - 1; j++) {board[j] = board[j + 1];}
        numEntries--;
    }
    public void updateName(int index, String newName) throws Exception {
        if (index < 0 || index >= numEntries) {throw new Exception("Invalid index: " + index);}
        board[index].setName(newName);}
    public void updateScore(int index, int newScore) throws Exception {
        if (index < 0 || index >= numEntries) {throw new Exception("Invalid index: " + index);}
        board[index].setScore(newScore);
        GameEntry_old updatedEntry = board[index];
        remove(index);
        add(updatedEntry);}

    public void show()
    {for(int i = 0; i < numEntries; i++) {
            System.out.println(i + 1 + ". Name: " + board[i].getName() + ", Score: " + board[i].getScore());
    }
    }
}