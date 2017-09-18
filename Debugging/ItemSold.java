public class ItemSold {
    protected Integer invoiceNum;
    protected String description;
    protected Double price;
    public void setInvoiceNum(Integer invoiceNum) {
        this.invoiceNum = invoiceNum;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getInvoiceNum() {
        return invoiceNum;
    }
    public String getDescription() {
        return description;
    }
    public Double getPrice() {
        return price;
    }
    public String toString() {
        return("InvNum: " + getInvoiceNum() + ", Description: "
                + getDescription() + ", Price: " + getPrice() + ".");
    }
}
