public class Horse {
    private String name;
    private String colour;
    private Integer birthday;
    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getBirthday() {
        return birthday;
    }
    public String getColour() {
        return colour;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return("Birthday: " + getBirthday() + ", Colour: "
                + getColour() + ", Name: " + getName() + ".");
    }
}
