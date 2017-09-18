public class Poem {
    protected String name;
    protected Integer lines;
    public Poem(String name, Integer lines) {
        this.name = name;
        this.lines = lines;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLines(Integer lines) {
        this.lines = lines;
    }
    public String getName() {
        return name;
    }
    public Integer getLines() {
        return lines;
    }
    public String toString() {
        return( name + " " + lines);
    }
}
