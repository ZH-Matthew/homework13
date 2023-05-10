public abstract class Hogwarts {
    private String name;
    private int magicPower ;
    private int transDistance;

    public Hogwarts(String name,int magicPower, int transDistance) {
        this.magicPower = magicPower;
        this.transDistance = transDistance;
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransDistance() {
        return transDistance;
    }

    public void setTransDistance(int transDistance) {
        this.transDistance = transDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transDistance=" + transDistance +
                ", ";
    }

    public static void compareGeneral(Hogwarts name1, Hogwarts name2){
        int a = name1.magicPower + name1.transDistance;
        int b = name2.magicPower + name2.transDistance;
        if (a>b){
            System.out.println(name1.name + " обладает бОльшей мощностью магии, чем " + name2.name);
        } else {
            System.out.println(name2.name + " обладает бОльшей мощностью магии, чем " + name1.name);
        }
    }

    public abstract int calculateSpecificRating();

    public static void compareSpecific(Hogwarts name1, Hogwarts name2){
        int a = name1.calculateSpecificRating();
        int b = name2.calculateSpecificRating();
        if (a>b){
            System.out.println(name1.getName() + " - лучший ученик, чем " + name2.getName());
        } else {
            System.out.println(name2.getName() + " - лучший ученик, чем " + name1.getName());
        }
    }


}
