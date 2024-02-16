public class Inventory {
    ItemShelf[] inventory = null;

    Inventory(int itemCount){
        inventory = new ItemShelf[itemCount];
        intialEmptyInventory();
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }
    public void setInventory(ItemShelf[] inventory){
        this.inventory = inventory;
    }

    public void intialEmptyInventory(){
        int startCode = 101;
        for(int i = 0;i<inventory.length;i++){
            ItemShelf space =  new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(true);
            inventory[i] = space;
            startCode++;
        }
    }

    public  void addItem(Item item, int code) throws Exception{
        for(ItemShelf itemSelf:inventory) {
            if (itemSelf.code == code) {
                if (itemSelf.isSoldOut()) {
                    itemSelf.item = item;
                    itemSelf.setSoldOut(false);
                } else {
                    throw new Exception("Already item present!");
                }
            }
        }
    }

    public Item getItem(int code) throws Exception{
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.isSoldOut()){
                throw new Exception("Item is already sold out!");
            }else{
                return itemShelf.item;
            }
        }
        throw new Exception("Item not found, incorrect code!");
    }

    public  void updateSoldOutItem(int code){
        for(ItemShelf itemShelf:inventory){
            if(itemShelf.code == code){
                itemShelf.setSoldOut(true);
            }
        }
    }
}
