package me.alii.skeleton.product.impl;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Brennan
 * @since 5/5/2021
 **/
@Getter
@Setter
@NoArgsConstructor
public class Variant {
    private String id, name, size, color;

    public Variant(String id) {
        this.id = id;
    }
}
