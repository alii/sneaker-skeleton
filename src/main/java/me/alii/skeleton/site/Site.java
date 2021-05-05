package me.alii.skeleton.site;

import me.alii.skeleton.product.GenericProduct;

import java.util.UUID;

/**
 * @author Brennan
 * @since 5/5/2021
 **/
public interface Site {

    String getName();
    UUID getId();

    void cartItem(GenericProduct... items);

    void start();
}
