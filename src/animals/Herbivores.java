package animals;

import java.util.Objects;

public class Herbivores extends Mummals {
    private String food;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(getFood(), that.getFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFood());
    }

    protected Herbivores(String name, int age, String area, int speed, String food) {
        super(name, age, area, speed);
        setFood(food);
    }


    private String getFood() {
        return food;
    }

    private void setFood(String food) {
        if (food.equalsIgnoreCase("растения")) {
            this.food = food;
        } else {
           this.food = "некорректное значение";
        }
    }

    protected void graze() {
        System.out.println(getName() + " пасется, место выпаса - " + getArea() );
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
        return "Herbivores{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", area='" + getArea() + '\'' +
                ", food='" + getFood() + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }
}
