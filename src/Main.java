public class Main {
    public static void main(String[] args){
        Hero mcCree = new Hero("McCree", 35, 20, 10);
        Hero soldier76 = new Hero("Soldier 76", 20, 25, 10);

        if(mcCree.longRange > soldier76.longRange){
            System.out.println( mcCree.heroName + " engages " + soldier76.heroName + " at long range and wins.");
        } else if(mcCree.mediumRange > soldier76.mediumRange){
            System.out.println( mcCree.heroName + " engages " + soldier76.heroName + " at medium range and wins.");
        } else if(mcCree.shortRange > soldier76.shortRange){
            System.out.println( mcCree.heroName + " engages " + soldier76.heroName + " at short range and wins.");
        } else System.out.println( mcCree.heroName + " engages " + soldier76.heroName + " and loses at all ranges.");


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