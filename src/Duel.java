/**
 * Created by jeffreydorney on 8/5/16.
 */
public class Duel {

    public boolean wonDuel = false;

    public Duel(String firstHeroName, boolean firstHeroUlti, String secondHeroName, boolean secondHeroUlti){
        if((firstHeroUlti == true) && (secondHeroUlti == true)){
            System.out.println( firstHeroName + " and " + secondHeroName + " both have their ultimates.");
            wonDuel = false;
            //return 2;
        } else if((firstHeroUlti == true) && (secondHeroUlti == false)){
            System.out.println( firstHeroName + " has his ultimate ready and will defeat " + secondHeroName + ".");
            wonDuel = true;
            //return wonDuel;
        } else if((firstHeroUlti == false) && (secondHeroUlti == false)){
            System.out.println( "Neither " + firstHeroName + " nor " + secondHeroName + " has their ultimate ready.");
            wonDuel = false;
            //return wonDuel;
        }else {
            System.out.println( firstHeroName + " doesn't has his ultimate ready, but " + secondHeroName + " does, so " + secondHeroName + " will win.");
            wonDuel = false;
            //return wonDuel;
        }

        public boolean whoWillWin()
    }
}
