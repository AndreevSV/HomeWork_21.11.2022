package animals;

import java.util.Objects;

public class Flying extends Birds{
    private String moveType;

    protected Flying(String name, int age, String area, String moveType) {
        super(name, age, area);
        setMoveType(moveType);
    }

    private String getMoveType() {
        return moveType;
    }

    private void setMoveType(String moveType) {
        if (moveType.equalsIgnoreCase("") || moveType.equalsIgnoreCase(null) || moveType.equalsIgnoreCase("летает")) {
            this.moveType = "летает";
        } else {
            this.moveType = "не корректно";
        }
    }

    protected void fly() {
        System.out.println(getName() + " летает");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return getMoveType().equals(flying.getMoveType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMoveType());
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
        return "Flying{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", area='" + getArea() + '\'' +
                ", moveType='" + getMoveType() + '\'' +
                '}';
    }
}
