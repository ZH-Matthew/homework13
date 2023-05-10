public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name,int magicPower, int transDistance, int mind, int wisdom, int wit, int creation) {
        super(name,magicPower, transDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString()+
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation ;
    }

    @Override
    public int calculateSpecificRating() {
        int sum = mind + wisdom + wit +creation+ getMagicPower()+ getTransDistance();
        return sum;
    }
}
