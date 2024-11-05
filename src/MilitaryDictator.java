public class MilitaryDictator extends Leader implements PowerActions {
    String militaryRank;

    public MilitaryDictator(String name, String country, int yearsInPower, String militaryRank) {
        super.name = name;
        super.country = country;
        super.yearsInPower = yearsInPower;
        this.militaryRank = militaryRank;
    }
    @Override
    public String giveSpeech() {
        String speech = (militaryRank + " " + name + " gives a speech promoting the military.");
        return speech;
    }
    @Override
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in power: " + yearsInPower);
        System.out.println("Military Rank: " + militaryRank);
    }

    @Override
    public void implementPolicy(String policy) {
        System.out.println(militaryRank + " " + name + " implements a policy of " + policy);
    }

    @Override
    public void repressOpposition() {
        System.out.println(militaryRank + " " + name + " repressses the opposition through force.");
    }
    @Override
    public void holdParade()
    {
        System.out.println(militaryRank + " " + name + " is holding a military parade");
    }



}
