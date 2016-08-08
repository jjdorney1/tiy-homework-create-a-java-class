public class Main {
    public static void main(String[] args){
        Hero mcCree = new Hero("McCree", false, 10, 20, 35);
        Hero soldier76 = new Hero("Soldier 76", true, 10, 25, 25);

        if(mcCree.longRange > soldier76.longRange){
            System.out.println( mcCree.heroName + " engages " + soldier76.heroName + " at long range and wins.");
        } else if(mcCree.mediumRange > soldier76.mediumRange){
            System.out.println( mcCree.heroName + " engages " + soldier76.heroName + " at medium range and wins.");
        } else if(mcCree.shortRange > soldier76.shortRange){
            System.out.println( mcCree.heroName + " engages " + soldier76.heroName + " at short range and wins.");
        } else System.out.println( mcCree.heroName + " engages " + soldier76.heroName + " and loses at all ranges.");

        Duel mcCreeEngage = new Duel(mcCree.heroName, mcCree.ultimateReady, soldier76.heroName, soldier76.ultimateReady);

        System.out.println(" ");

        if(soldier76.longRange > mcCree.longRange){
            System.out.println( soldier76.heroName + " engages " + mcCree.heroName + " at long range and wins.");
        } else if(soldier76.mediumRange > mcCree.mediumRange){
            System.out.println( soldier76.heroName + " engages " + mcCree.heroName + " at medium range and wins.");
        } else if(soldier76.shortRange > mcCree.shortRange){
            System.out.println( soldier76.heroName + " engages " + mcCree.heroName + " at short range and wins.");
        } else System.out.println( soldier76.heroName + " engages " + mcCree.heroName + " and loses at all ranges.");

        Duel soldierEngage = new Duel(soldier76.heroName, soldier76.ultimateReady, mcCree.heroName, mcCree.ultimateReady);


        //Lines following this were not working so I just commented them out.
        /*System.out.println( String.format("%s engages %s",
                mcCree.heroName,
                soldier76.engagement(mcCree.longRange, soldier76.longRange)));
        System.out.println( String.format("%s says: ",
                soldier76.heroName,
                mcCree.engagement(soldier76.longRange, mcCree.longRange)));
*/
        //String description = heroName.toString();

        //System.out.println(description);
    }
}