package me.alii.skeleton.product;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class GenericProduct implements Serializable {
    private String id, image, name;
    private int price;

    public GenericProduct(String id) {
        this.id = id;
    }
}
