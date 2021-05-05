package me.alii.skeleton.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.alii.skeleton.product.impl.Variant;

import java.io.Serializable;
import java.util.*;

@Getter
@Setter
@NoArgsConstructor
public class GenericProduct implements Serializable {
    private String id, image, name;
    private int price;

    private Set<Variant> variants = new LinkedHashSet<>();

    public GenericProduct(String id) {
        this.id = id;
    }

    public void addVariant(Variant... variants) {
        this.variants.addAll(Arrays.asList(variants));
    }

}
