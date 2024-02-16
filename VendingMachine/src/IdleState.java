import java.util.ArrayList;
import java.util.List;

public class IdleState implements  State{
    public IdleState(){
        System.out.println("The Vending machine is in Idle State!");
    }

    public  IdleState(VendingMachine machine){

        System.out.println("The Vending machine is in Idle State!");
        machine.setCoins(new ArrayList<>());
    }

    public void StartInsertCoinButton(VendingMachine machine) throws Exception{
        machine.setVendingMachineState(new HasMoney());
    }
    public void StartProductSelectionButton(VendingMachine machine) throws Exception{
        throw new Exception("First you need to Start Insert coin button!");
    }
    public void InsertCoin(VendingMachine machine, Coin coin) throws  Exception{
        throw new Exception("First you need to Start Insert coin button!");
    }
    public void chooseProduct(VendingMachine machine, int code) throws  Exception{
        throw new Exception("First you need to Start Insert coin button!");
    }
    public int getChange(int returnMoney) throws  Exception{
        throw new Exception("First you need to Start Insert coin button!");
    }
    public List<Coin> refundMoney(VendingMachine machine) throws Exception{
        throw new Exception("First you need to Start Insert coin button!");
    }
    public Item dispenseProduct(VendingMachine machine,int code) throws  Exception{
        throw new Exception("First you need to Start Insert coin button!");
    }
    public void updateInventory(VendingMachine machine,Item item,int code) throws  Exception{
        throw new Exception("First you need to Start Insert coin button!");
    }
}
