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
        return getName() + " : "+
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                ", magicPower=" + getMagicPower()+
                ", transDistance=" + getTransDistance();
    }

    public static void compare(Ravenclaw name1, Ravenclaw name2){
        int a = name1.mind + name1.wisdom + name1.wit +name1.creation+ name1.getMagicPower()+ name1.getTransDistance();
        int b = name2.mind + name2.wisdom + name2.wit +name2.creation+ name2.getMagicPower()+ name2.getTransDistance();
        if (a>b){
            System.out.println(name1.getName() + " - лучший ученик, чем " + name2.getName());
        } else {
            System.out.println(name2.getName() + " - лучший ученик, чем " + name1.getName());
        }
    }
}
