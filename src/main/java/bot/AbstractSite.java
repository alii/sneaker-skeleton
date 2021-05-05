package bot;

import java.util.HashMap;

public abstract class AbstractSite {
    protected final String name;
    protected final HashMap<String, GenericProduct> cartCache;

    protected AbstractSite(String name) {
        this.name = name;
        this.cartCache = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    abstract void start();
    abstract void cartItem(GenericProduct... items);
}
