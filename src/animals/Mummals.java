package animals;

import java.util.Objects;

public abstract class Mummals extends Animals {
    private String area;
    private int speed;

    Mummals(String name, int age, String area, int speed) {
        super(name, age);
        setArea(area);
        setSpeed(speed);
    }

    protected String getArea() {
        return area;
    }

    protected void setArea(String area) {
        if (area.equalsIgnoreCase("савана") ||
                area.equalsIgnoreCase("степь") ||
                area.equalsIgnoreCase("лес")) {

            this.area = area;
        } else {
            this.area = "некорректное значение";
        }
    }

    protected int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mummals)) return false;
        if (!super.equals(o)) return false;
        Mummals mummals = (Mummals) o;
        return getSpeed() == mummals.getSpeed() && getArea().equals(mummals.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArea(), getSpeed());
    }

    @Override
    public String toString() {
        return "Mummals{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", area='" + getArea() + '\'' +
                ", speed=" + getSpeed() +
                '}';
    }

    public abstract void walk();
}
