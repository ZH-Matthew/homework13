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
        return getName() + " : "+
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", magicPower=" + getMagicPower()+
                ", transDistance=" + getTransDistance();
    }

    public static void compare(Hufflepuff name1, Hufflepuff name2){
        int a = name1.diligence + name1.loyalty + name1.honesty + name1.getMagicPower()+ name1.getTransDistance();
        int b = name2.diligence + name2.loyalty + name2.honesty + name2.getMagicPower()+ name2.getTransDistance();
        if (a>b){
            System.out.println(name1.getName() + " - лучший ученик, чем " + name2.getName());
        } else {
            System.out.println(name2.getName() + " - лучший ученик, чем " + name1.getName());
        }
    }
}
