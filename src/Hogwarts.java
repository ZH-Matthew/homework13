public class Hogwarts {
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

    public static void compare(Hogwarts name1, Hogwarts name2){
        int a = name1.magicPower + name1.transDistance;
        int b = name2.magicPower + name2.transDistance;
        if (a>b){
            System.out.println(name1.name + " обладает бОльшей мощностью магии, чем " + name2.name);
        } else {
            System.out.println(name2.name + " обладает бОльшей мощностью магии, чем " + name1.name);
        }
    }
}
