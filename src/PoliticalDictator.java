public class PoliticalDictator extends Leader implements PowerActions {
    String partyName;

    public PoliticalDictator(String name, String country, int yearsInPower, String partyName)
    {
        super.name = name;
        super.country = country;
        super.yearsInPower = yearsInPower;
        this.partyName = partyName;
    }

    @Override
    public String giveSpeech() {
        String speech = (partyName + " " + name + " gives a speech promoting the party's agenda.");
        return speech;
    }

    @Override
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in power: " + yearsInPower);
        System.out.println("Political party: " + partyName);
    }

    @Override
    public void implementPolicy(String policy) {
        System.out.println(partyName + " " + name + " implements a policy of " + policy);
    }

    @Override
    public void repressOpposition() {
        System.out.println(partyName + " " + name + " repressses the opposition through political means.");
    }

    @Override
    public void holdParade() {
        System.out.println(partyName + " " + name + " is holding a political parade.");
    }


}
