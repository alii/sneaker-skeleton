package me.alii.skeleton.site.impl;

import lombok.Getter;
import me.alii.skeleton.product.GenericProduct;
import me.alii.skeleton.site.Site;

import java.util.HashMap;
import java.util.UUID;

@Getter
public abstract class AbstractSite implements Site {
    private final UUID uuid = UUID.randomUUID();

    protected final String name;
    protected final HashMap<String, GenericProduct> cartCache = new HashMap<>();

    protected AbstractSite(String name) {
        this.name = name;
    }

    @Override
    public UUID getId() {
        return this.uuid;
    }
}
