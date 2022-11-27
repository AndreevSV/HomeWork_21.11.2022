package animals;

import java.util.Objects;

public class Flightless extends Birds{
    private String moveType;

    protected Flightless(String name, int age, String area, String moveType) {
        super(name, age, area);
        setMoveType(moveType);
    }

    private String getMoveType() {
        return moveType;
    }

    private void setMoveType(String moveType) {
        if (moveType.equalsIgnoreCase("") || moveType.equalsIgnoreCase(null) || moveType.equalsIgnoreCase("ходит")) {
            this.moveType = "ходит";
        } else {
            this.moveType = "не корректно";
        }
    }

    protected void walk () {
        System.out.println(getName() + " гуляет");
    }



    @Override
    public int hashCode() {
        return Objects.hash(moveType);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест.");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " спит.");
    }

    @Override
    public void go() {
        System.out.println(getName() + " " + getMoveType());
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " охотится.");
    }

    @Override
    public String toString() {
        return "Flightless{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", area='" + getArea() + '\'' +
                ", moveType='" + getMoveType() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return getMoveType().equals(that.getMoveType());
    }
}
