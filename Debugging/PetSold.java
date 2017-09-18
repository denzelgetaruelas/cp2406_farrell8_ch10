public class PetSold extends ItemSold {
    private Boolean vaccinated;
    private Boolean neutered;
    private Boolean housebroken;
    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    public void setNeutered(Boolean neutered) {
        this.neutered = neutered;
    }
    public void setHousebroken(Boolean housebroken) {
        this.housebroken = housebroken;
    }
    public Boolean getVaccinated() {
        return vaccinated;
    }
    public Boolean getNeutered() {
        return neutered;
    }
    public Boolean getHousebroken() {
        return housebroken;
    }
    public String toString() {
        return(super.toString() + " "
                + (getVaccinated() ? "Vaccinated" : "Not vaccinated") + ", "
                + (getNeutered() ? "Neutered" : "Not neutered") + ", "
                + (getHousebroken() ? "Housebroken" : "Not housebroken") );
            }
}
