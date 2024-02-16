public class ItemShelf {
    int code;
    Item item;
    boolean soldOut;

    public int getCode(){
        return code;
    }

    public void setCode(int code){
        this.code = code;
    }

    public void setItem(Item item){
        this.item = item;
    }

    public Item getItem(){
        return item;
    }

    public  boolean isSoldOut(){
        return soldOut;
    }

    public void setSoldOut(boolean soldOut){
        this.soldOut = soldOut;
    }
}

