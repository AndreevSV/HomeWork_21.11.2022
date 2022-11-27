package animals;

import java.util.Objects;

public class Predators extends Mummals {
    private String food;

    protected Predators(String name, int age, String area, int speed, String food) {
        super(name, age, area, speed);
        setFood(food);
    }

    private String getFood() {
        return food;
    }

    private void setFood(String food) {
        if (food.equalsIgnoreCase("животные")) {
            this.food = food;
        } else {
            this.food = "некорректное значение";
        }
    }

    protected void hunt() {
        System.out.println(getName() + " охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predators)) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return getFood().equals(predators.getFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFood());
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    public void go() {
        System.out.println(getName() + " перемещается со скоростью " + getSpeed() + " км/ч");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " сейчас гуляет");
    }

    @Override
    public String toString() {
        return "Predators{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", area='" + getArea() + '\'' +
                ", food='" + getFood() + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }
}
