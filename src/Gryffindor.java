public class Gryffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int courage;

    public Gryffindor(String name ,int magicPower, int transDistance, int nobility, int honor, int courage) {
        super(name,magicPower, transDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString()+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage;
    }

    @Override
    public int calculateSpecificRating() {
        int sum = courage + honor + nobility + getMagicPower()+ getTransDistance();
        return sum;
    }
}
