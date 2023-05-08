public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Gryffindor hermioneGranger = new Gryffindor("Гермиона", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Gryffindor ronWeasley = new Gryffindor("Рон", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Slytherin dracoMalfoy = new Slytherin("Драко", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Slytherin grahamMontagu = new Slytherin("Грэхэм", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Slytherin gregoryGoyle = new Slytherin("Грегори", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Hufflepuff zachariasSmith = new Hufflepuff("Захария", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Ravenclaw zhouChang = new Ravenclaw("Джоу", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Ravenclaw padmaPatil = new Ravenclaw("Падма", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        Ravenclaw marcusBelby = new Ravenclaw("Маркус", (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));

        System.out.println(harryPotter);
        Gryffindor.compare(hermioneGranger, ronWeasley);
        Slytherin.compare(dracoMalfoy, gregoryGoyle);
        Hufflepuff.compare(zachariasSmith, cedricDiggory);
        Ravenclaw.compare(padmaPatil, marcusBelby);
        Hogwarts.compare(harryPotter, dracoMalfoy);
        //Slytherin.avadakedavra(); //Мальчик, который выжил... Пришел умереть.
    }
}