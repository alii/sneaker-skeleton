import me.alii.skeleton.product.GenericProduct;
import me.alii.skeleton.product.impl.Variant;
import me.alii.skeleton.site.Site;


/**
 * @author Brennan
 * @since 5/5/2021
 **/
public class Main {

    public static void main(String[] args) {
        final GenericProduct product = new GenericProduct();
        product.setName("joe");

        System.out.println(product.getName());

        final Variant variant = new Variant();
        variant.setName("momma");
        product.addVariant(variant);

        product.getVariants().forEach(variant1 -> System.out.println(variant.getName()));

        final Site site = new TestSite();
        site.cartItem(product);

        System.out.println(site.getName());
    }

}
