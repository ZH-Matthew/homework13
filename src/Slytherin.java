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
        return getName() + " : "+
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", magicPower=" + getMagicPower()+
                ", transDistance=" + getTransDistance();
    }

    public static void compare(Slytherin name1, Slytherin name2){
        int a = name1.cunning + name1.determination + name1.ambition + name1.resourcefulness+ name1.lustForPower + name1.getMagicPower()+ name1.getTransDistance();
        int b = name2.cunning + name2.determination + name2.ambition + name2.resourcefulness+ name2.lustForPower + name2.getMagicPower()+ name2.getTransDistance();
        if (a>b){
            System.out.println(name1.getName() + " - лучший ученик, чем " + name2.getName());
        } else {
            System.out.println(name2.getName() + " - лучший ученик, чем " + name1.getName());
        }
    }

    public static void avadakedavra(){
        System.out.println("Не смей поворачиваться ко мне спиной. Я хочу видеть как померкнет свет в твоих глазах!");
        String pain = "Боль";
        String agony = "ААААААВАДАКЕДАВРААА!!";
        int i = 0;
        while(true) {
            String morePain = pain + pain;
            pain = morePain + pain;
            if (i%1000==0){
                System.out.println(agony);
            }
            i++;
        }
    }
}
