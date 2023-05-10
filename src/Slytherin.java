public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name,int magicPower, int transDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name,magicPower, transDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString()+
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower ;
    }

    @Override
    public int calculateSpecificRating() {
        int sum = cunning + determination + ambition +resourcefulness+lustForPower+ getMagicPower()+ getTransDistance();
        return sum;
    }
}
