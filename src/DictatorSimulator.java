public class DictatorSimulator {
    public static void main(String[] args) {

        MilitaryDictator militaryDictator = new MilitaryDictator("Zod","Krypton",15,"General");
        PoliticalDictator politicalDictator = new PoliticalDictator("Chancellor Palpatine", "Galactic Empire", 20, "Sith Party");

        militaryDictator.printDetails();
        System.out.println(militaryDictator.giveSpeech());
        militaryDictator.implementPolicy("banning pink clothes in public.");
        militaryDictator.repressOpposition();
        militaryDictator.holdParade();
        System.out.println();

        politicalDictator.printDetails();
        System.out.println(politicalDictator.giveSpeech());
        politicalDictator.implementPolicy("banning annoying lids that don't come off the bottle.");
        politicalDictator.repressOpposition();
        politicalDictator.holdParade();
        System.out.println();


        // En anden måde at printe det ud ved hjælp af instance of
        Leader[] leaders = {militaryDictator, politicalDictator};
        for(Leader leader : leaders)
        {
            leader.printDetails();
            System.out.println(leader.giveSpeech());
            if (leader instanceof PowerActions)
            {
                ((PowerActions) leader).implementPolicy("Whatever");
                ((PowerActions) leader).repressOpposition();
                ((PowerActions) leader).holdParade();

            }
        }

    }
}
