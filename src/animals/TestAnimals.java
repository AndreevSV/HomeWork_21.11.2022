package animals;

public class TestAnimals {
    public static void main(String[] arg) {

        Herbivores gazelle = new Herbivores("газель", 5, "прерии", 97, "растения");
        Herbivores giraffe = new Herbivores("жираф", 2, "прерии", 60, "растения");
        Herbivores horse = new Herbivores("лошадь", 5, "степь", 88, "растения");

        Predators hyena = new Predators("гиена", 1, "савана", 64, "животные");
        Predators tiger = new Predators("тигр", 6, "савана", 65, "животные");
        Predators bear = new Predators("медведь", 10, "лес", 43, "животные");

        Amphibians frog = new Amphibians("лягушка", 1, "болото");
        Amphibians snake = new Amphibians("уж пресноводный", 2, "озеро");

        Flightless peacock = new Flightless("павлин", 5, "на земле", "ходит");
        Flightless penguin = new Flightless("пингвин", 5, "на снегу", "ходит");
        Flightless dodoBird = new Flightless("птица додо", 5, "на земле", "ходит");

        Flying gull = new Flying("чайка", 3, "моря", "летает");
        Flying albatross = new Flying("альбатрос", 7, "океаны", "летает");
        Flying falcon = new Flying("сокол", 10, "степи", "летает");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);

        System.out.println();

        System.out.println(hyena);
        System.out.println(tiger);
        System.out.println(bear);

        System.out.println();
        System.out.println(frog);
        System.out.println(snake);


        System.out.println();
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodoBird);

        System.out.println();
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);

        System.out.println();
        peacock.walk();
        frog.hunt();
        falcon.fly();
        horse.graze();

        System.out.println();

        tiger.getName();
        tiger.hunt();
        tiger.eat();
        tiger.sleep();
        tiger.go();
        tiger.walk();

        System.out.println();

        if (gazelle.equals(giraffe)) {
            System.out.println("Это два одинаковых животных");
        } else {
            System.out.println("Это разные животные");
        }
    }
}
