public class RaceHorse extends Horse {
    private Integer numRaces;
    public Integer getNumRaces() {
        return numRaces;
    }
    public void setNumRaces(Integer numRaces) {
        this.numRaces = numRaces;
    }
    public String toString() {
        return(super.toString() + " Number of races: " + getNumRaces());
    }
}
