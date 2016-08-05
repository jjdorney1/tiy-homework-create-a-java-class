/**
 * Created by jeffreydorney on 8/4/16.
 */
public class Hero {

    public String heroName;
    public int shortRange;
    public int mediumRange;
    public int longRange;

    public Hero(String heroName, int shortRange, int mediumRange, int longRange) {
        this.heroName = heroName;
        this.shortRange = shortRange;
        this.mediumRange = mediumRange;
        this.longRange = longRange;
    }
}

/*public class Hero {

    String heroName;
    int shortRange;
    int mediumRange;
    int longRange;
    String heroOne;
    String heroTwo;


    public Hero(String heroName, int shortRange, int mediumRange, int longRange){
        this.heroName = heroName;
        this.shortRange = shortRange;
        this.mediumRange = mediumRange;
        this.longRange = longRange;
        //if(heroOne = null){
        //    heroOne = heroName;
        //} else { heroTwo = heroName;}
    }

    public int engagement(int heroOne, int heroTwo){

        if(this.longRange > this.longRange){
            return " and wins the long range fight.";
        } else return " and loses the long range fight.";}


            /*if(this.mediumRange > mediumRange){
            return " and wins the medium range fight.";
        } else if(this.shortRange > shortRange){
            return " and wins the short range fight.";
        } else return " and loses all the fights.";}
*/
        //this.winner = !this.faceUp;


    /*public String toString(){
        return this.value + " of " + this.suit;
    }
}
*/