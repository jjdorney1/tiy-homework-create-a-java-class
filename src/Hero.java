/**
 * Created by jeffreydorney on 8/4/16.
 */
public class Hero { //defines object Hero

    public String heroName;     //created string name variable
    public boolean ultimateReady;   //created ultimate attack int
    public int shortRange;      //created short attack int
    public int mediumRange;     //created medium attack int
    public int longRange;       //created long attack in

    public Hero(String heroName, boolean ultimateReady, int longRange, int mediumRange, int shortRange) {
        this.heroName = heroName;       //sets this hero name property
        this.ultimateReady = ultimateReady; //sets this hero ultimate property
        this.longRange = longRange;     //sets this hero long attack property
        this.mediumRange = mediumRange; //sets this hero medium attack property
        this.shortRange = shortRange;   //sets this hero short attack property

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