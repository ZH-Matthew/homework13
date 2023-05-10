public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name,int magicPower, int transDistance, int diligence, int loyalty, int honesty) {
        super(name,magicPower, transDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString()+
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty ;
    }

    @Override
    public int calculateSpecificRating() {
        int sum = diligence + loyalty + honesty + getMagicPower()+ getTransDistance();
        return sum;
    }
}
