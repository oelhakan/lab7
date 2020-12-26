package task7;

public enum ProductType {
    BREAD (3.5), MILK(2.2), TEA(15.0), BUTTER(7.5), OTHER(0.0);	//WE SET VARIABLE WEIGHT FOR OUR CONSTANTS
    private double weight;
    public static ProductType fromString(String s) {
        s=s.toLowerCase().trim();	//WE TAKE WHITE SPACES FROM THE INPUT VARIABLE AND MAKE IT LOWERCASE
        switch(s) {
            case "bread": return BREAD;
            case "milk": return MILK;
            case "tea": return TEA;
            case "butter": return BUTTER;
            default: return OTHER;
        }
    }
    private ProductType(double weight) {
        this.weight=weight;
    }
    public double getWeight() {
        return weight;
    }
    public String show() {
        String s = this + " [" + weight + "]";
        return s.toLowerCase();
    }
    public static void testMe() {
        ProductType p1 = ProductType.BREAD;
        System.out.println(p1);	//RETURNS BREAD
        p1 = ProductType.fromString("tea");
        System.out.println(p1);	//RETURNS TEA
        for (ProductType p : ProductType.values()) {
            System.out.println(p.show()); //RETURNS bread[3.5] milk[2.2] tea[15.0] butter[7.5] other[0.0]
        }
    }
}
