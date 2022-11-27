package animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    protected Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getAge() == animals.getAge() && getName().equals(animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    protected String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.equalsIgnoreCase("газель") ||
                name.equalsIgnoreCase("жираф") ||
                name.equalsIgnoreCase("лошадь") ||
                name.equalsIgnoreCase("гиена") ||
                name.equalsIgnoreCase("тигр") ||
                name.equalsIgnoreCase("медведь") ||
                name.equalsIgnoreCase("лягушка") ||
                name.equalsIgnoreCase("уж пресноводный") ||
                name.equalsIgnoreCase("павлин") ||
                name.equalsIgnoreCase("пингвин") ||
                name.equalsIgnoreCase("птица додо") ||
                name.equalsIgnoreCase("чайка") ||
                name.equalsIgnoreCase("альбатрос") ||
                name.equalsIgnoreCase("сокол")) {
            this.name = name;
        } else {
            this.name = "некорректное животное";
        }
    }

    protected int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 1;
           }

    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();

}
