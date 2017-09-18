import java.util.ArrayList;
public class DemoItemsAndPets {
    public static void main(String[] args) {
        Integer[] InvNum = { 1, 2, 3, 4};
        String[] Description = {"Food", "Dog", "Needles", "Cat"};
        Double[] Price = {20.50, 19.50, 300.50, 5000.00};
        Boolean [] Vaccinated = {true, false};
        Boolean [] Neutered = {true, false};
        Boolean [] HouseTrained = {true, false};
        ArrayList<ItemSold> itemList = new ArrayList<>();

        for(int i = 0; i < InvNum.length; i++) {
            if (i % 2 == 0) {
                ItemSold tempItem = new ItemSold();
                tempItem.setInvoiceNum(InvNum[i]);
                tempItem.setDescription(Description[i]);
                tempItem.setPrice(Price[i]);
                itemList.add(tempItem);
            } else {
                PetSold tempItem = new PetSold();
                tempItem.setInvoiceNum(InvNum[i]);
                tempItem.setDescription(Description[i]);
                tempItem.setPrice(Price[i]);
                tempItem.setVaccinated(Vaccinated[i/2]);
                tempItem.setNeutered(Neutered[i/2]);
                tempItem.setHousebroken(HouseTrained[i/2]);
                itemList.add(tempItem);
            }
        }
        for(ItemSold  item : itemList) {
            System.out.println(item);
        }
    }
}
