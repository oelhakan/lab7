package task7;

public class Item {
    private ProductType type;
    private int quantity = 1;
    private String comment = "";
    //DEFINE VARIABLES LISTED ON THE TASK
    public Item(ProductType product, int quantity, String comment){
        this.type = product;
        if (isQuantityValid(quantity))
            this.quantity = quantity;
        this.comment = comment;
    }	//CONSTRTUCTOR TO SET TYPE  - SET COMMENT - IF QUANTITY IS BETWEEN 1 AND 20 SET QUANTITIY

    public Item(ProductType product, int quantity){
        this.type = product;
        if (isQuantityValid(quantity))
            this.quantity = quantity;
    } // CONSTRUCTOR TO SET TYPE AND IF QUANTITY IS BETWEEN 1 AND 20 SET QUANTITIY

    public Item(ProductType product){
        this.type = product;
    }	//	CONSTRUCTOR TO SET TYPE
    
    public ProductType getType(){
        return type;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getComment(){
        return comment;
    }

    public double getTotalWeight() {
        return quantity * type.getWeight();
    }

    private boolean isQuantityValid(int quantity){
        return quantity <= 20 && quantity > 0;
    }

    public boolean addItem(){
        if (quantity < 20){
            quantity++;
            return true;
        }
        return false;
    }

    public boolean addItems(int number){
        if (quantity + number <= 20){
            quantity += number;
            return true;
        }
        return false;
    }

    public boolean remove(int number){
        if (quantity - number > 0){
            quantity -= number;
            return true;
        }
        return false;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void removeComment(){
        comment = "";
    }



    @Override
    public String toString(){
        return "Type: " + type + ", Quantity: " + quantity + ", Comment: \"" + comment + "\";";
    }

    public boolean equals(Item other){
        return type.equals(other.type) && quantity == other.getQuantity();
    }

}
