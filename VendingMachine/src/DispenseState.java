import java.util.List;

public class DispenseState implements State {
    public DispenseState(VendingMachine machine,int code) throws  Exception{
        dispenseProduct(machine,code);
    }
    public void StartInsertCoinButton(VendingMachine vendingMachine) throws Exception{
        return;
    }
    public void StartProductSelectionButton(VendingMachine vendingMachine) throws Exception{
        return;
    }
    public void InsertCoin(VendingMachine vendingMachine, Coin coin) throws  Exception{
        throw new Exception("Cant insert coin in dispense state");
    }
    public void chooseProduct(VendingMachine vendingMachine, int code) throws  Exception{
        throw new Exception("Cant insert coin in dispense state");
    }
    public int getChange(int returnMoney) throws  Exception{
        throw new Exception("Cant insert coin in dispense state");
    }
    public List<Coin> refundMoney(VendingMachine vendingMachine) throws Exception{
        throw new Exception("Cant insert coin in dispense state");
    }
    public Item dispenseProduct(VendingMachine machine,int code) throws  Exception{
        Item item = machine.getInventory().getItem(code);
        machine.getInventory().updateSoldOutItem(code);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }
    public void updateInventory(VendingMachine vendingMachine,Item item,int code) throws  Exception{
        throw new Exception("Cant insert coin in dispense state");
    }
}
