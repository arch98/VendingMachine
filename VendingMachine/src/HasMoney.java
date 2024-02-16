import java.util.List;

public class HasMoney implements  State{

    public HasMoney() {
        System.out.println("Vending machine is in HasMoneyState!");
    }
    public void StartInsertCoinButton(VendingMachine vendingMachine) throws Exception {
       return;
    }
    public void StartProductSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
    }
    public void InsertCoin(VendingMachine vendingMachine, Coin coin) throws  Exception {

    }
    public void chooseProduct(VendingMachine vendingMachine, int code) throws  Exception {
        throw  new Exception("You need to click on product selection first!");
    }
    public int getChange(int returnMoney) throws  Exception {
        throw new Exception("You cannot get change in HasMoney state!");
    }
    public List<Coin> refundMoney(VendingMachine machine) throws Exception {
        System.out.println("You will get your full money back!");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoins();
    }
    public Item dispenseProduct(VendingMachine vendingMachine,int code) throws  Exception {
        throw new Exception("You need to choose the product first!");
    }
    public void updateInventory(VendingMachine vendingMachine,Item item,int code) throws  Exception {
        throw new Exception("Cant update money in HasMoney State!");
    }
}

