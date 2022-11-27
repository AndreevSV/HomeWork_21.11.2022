package animals;

import java.util.Objects;

public class Amphibians extends Animals {
    private String area;

    Amphibians amphibians;

    protected Amphibians(String name, int age, String area) {
        super(name, age);
        setArea(area);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibians)) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return getArea().equals(that.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArea());
    }

    private String getArea() {
        return area;
    }

    private void setArea(String area) {
        if (area.equalsIgnoreCase("болото") ||
            area.equalsIgnoreCase("река")  ||
            area.equalsIgnoreCase("озеро")  ||
            area.equalsIgnoreCase("пруд") ||
            area.equalsIgnoreCase("берег")) {
            this.area = area;
        } else if (area == "" || area == null) {
            this.area = "болото";
        } else {
            this.area = "не корректно";
        }
    }

    protected void hunt() {
        System.out.println(getName() + " охотится, место охоты " + getArea() + ". ");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит");
    }

    @Override
    public void go() {
        System.out.println(getName() + " прыгает");
    }

    @Override
    public String toString() {
        return "Amphibians{" +
                "name='" + getName() + '\'' +
                ", area='" + getArea() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
