package result;

/**
 * Created by patawat on 4/16/15 AD.
 */
public class resultVote {

    private String name;
    private int score;
    private int score2;
    private int score3;
    private int criteria;
    public resultVote(String name,int score,int score2,int score3,int criteria){

        this.name = name;
        this.score = score;
        this.score2 = score2;
        this.score3 = score3;
        this.criteria = criteria;
    }

    public String getname(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    public int getScore2(){
        return this.score2;
    }
    public int getScore3(){
        return this.score3;
    }
    public int getCriteria(){
        return this.criteria;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setScore(int newScore){
        this.score +=newScore;
    }
    public void setScore2(int newScore){
        this.score2 +=newScore;
    }
    public void setScore3(int newScore){
        this.score3 +=newScore;
    }
    public void setCriteria(int newScore){
        this.criteria +=newScore;
    }

}
