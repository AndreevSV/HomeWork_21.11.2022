package animals;

import java.util.Objects;

public abstract class Birds extends Animals {
    private String area;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(getArea(), birds.getArea());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArea());
    }

    public Birds(String name, int age, String area) {
        super(name, age);
        setArea(area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if (area.equalsIgnoreCase("на земле") ||
            area.equalsIgnoreCase("на деревьях") ||
            area.equalsIgnoreCase("на воде") ||
            area.equalsIgnoreCase("на снегу") ||
            area.equalsIgnoreCase("моря") ||
            area.equalsIgnoreCase("океаны") ||
            area.equalsIgnoreCase("степи"))  {

            this.area = area;
        }
    }

    public abstract void hunt();


}
