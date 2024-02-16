import java.util.List;

public interface State {
    public void StartInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void StartProductSelectionButton(VendingMachine vendingMachine) throws Exception;
    public void InsertCoin(VendingMachine vendingMachine, Coin coin) throws  Exception;
    public void chooseProduct(VendingMachine vendingMachine, int code) throws  Exception;
    public int getChange(int returnMoney) throws  Exception;
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine,int code) throws  Exception;
    public void updateInventory(VendingMachine vendingMachine,Item item,int code) throws  Exception;
}
