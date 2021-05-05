import me.alii.skeleton.product.GenericProduct;
import me.alii.skeleton.site.impl.AbstractSite;
import me.alii.skeleton.utils.Logger;

/**
 * @author Brennan
 * @since 5/5/2021
 **/
public class TestSite extends AbstractSite {

    protected TestSite() {
        super("JoeShop");
    }

    @Override
    public void start() {
        Logger.info("test");
    }

    @Override
    public void cartItem(GenericProduct... items) {

    }
}
