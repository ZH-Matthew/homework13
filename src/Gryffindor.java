import java.awt.print.Printable;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name ,int magicPower, int transDistance, int nobility, int honor, int courage) {
        super(name,magicPower, transDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return getName() + " : "+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", magicPower=" + getMagicPower()+
                ", transDistance=" + getTransDistance();
    }

    public static void compare(Gryffindor name1, Gryffindor name2){
        int a = name1.courage + name1.honor + name1.nobility + name1.getMagicPower()+ name1.getTransDistance();
        int b = name2.courage + name2.honor + name2.nobility + name2.getMagicPower()+ name2.getTransDistance();
        if (a>b){
            System.out.println(name1.getName() + " - лучший ученик, чем " + name2.getName());
        } else {
            System.out.println(name2.getName() + " - лучший ученик, чем " + name1.getName());
        }
    }
}
