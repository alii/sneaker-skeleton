package me.alii.skeleton.site;

import me.alii.skeleton.product.GenericProduct;

/**
 * @author Brennan
 * @since 5/5/2021
 **/
public interface Site {

    String getName();

    void cartItem(GenericProduct... items);

    void start();
}
