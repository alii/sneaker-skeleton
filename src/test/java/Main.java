import me.alii.skeleton.product.GenericProduct;


/**
 * @author Brennan
 * @since 5/5/2021
 **/
public class Main {

    public static void main(String[] args) {
        final GenericProduct product = new GenericProduct();
        product.setName("joe");

        System.out.println(product.getName());
    }

}
