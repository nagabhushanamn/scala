
class JProduct {

    public static int count = 0; // class variable
    private String name; // instance variable

    private JProduct(String name) {
        this.name = name;
    }

    // class methods
    public static JProduct getproduct(String name) {
        count++;
        return new JProduct(name);
    }
}

public class App {
    public static void main(String[] args) {

        JProduct p1 = JProduct.getproduct("product1");

    }
}
