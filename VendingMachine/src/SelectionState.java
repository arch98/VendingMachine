import java.util.List;

public class SelectionState implements State{

    public  SelectionState(){
        System.out.println("VendingMachine is in SelectionState!");
    }

    public void StartInsertCoinButton(VendingMachine vendingMachine) throws Exception{
            return;
    }
    public void StartProductSelectionButton(VendingMachine vendingMachine) throws Exception{
        return;
    }
    public void InsertCoin(VendingMachine vendingMachine, Coin coin) throws  Exception{
        return;
    }
    public void chooseProduct(VendingMachine machine, int code) throws  Exception{
        Item item = machine.getInventory().getItem(code);

        int paidByUser = 0;

        for(Coin coin:machine.getCoins()){
            paidByUser = paidByUser + coin.value;
        }

        if(paidByUser < item.getPrice()){
            System.out.println("Insufficient amount!");
            refundMoney(machine);
            throw new Exception("insufficent amount!");
        }else if(paidByUser >= item.getPrice()){
            if(paidByUser > item.getPrice()){
                getChange(paidByUser-item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine,code));
        }
    }
    public int getChange(int returnMoney) throws  Exception{
        System.out.println("Getting your change ready");
        return returnMoney;
    }
    public List<Coin> refundMoney(VendingMachine machine) throws Exception{
        System.out.println("Refunding your money!");
        machine.setVendingMachineState(new IdleState(machine));
        return machine.getCoins();
    }
    public Item dispenseProduct(VendingMachine vendingMachine,int code) throws  Exception{
        throw new Exception("We dont dispense product in Selection state");
    }
    public void updateInventory(VendingMachine vendingMachine,Item item,int code) throws  Exception{
        throw  new Exception("We dont update inventory in Selection state!");
    }
}
