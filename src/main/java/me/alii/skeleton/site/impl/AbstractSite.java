package me.alii.skeleton.site.impl;

import lombok.Getter;
import me.alii.skeleton.product.GenericProduct;
import me.alii.skeleton.site.Site;

import java.util.HashMap;

@Getter
public abstract class AbstractSite implements Site {
    protected final String name;
    protected final HashMap<String, GenericProduct> cartCache;

    protected AbstractSite(String name) {
        this.name = name;
        this.cartCache = new HashMap<>();
    }
}
