package bot;

import com.sun.istack.internal.Nullable;

import java.io.Serializable;

public abstract class GenericProduct implements Serializable {

    @Nullable
    private String image;
    private String name;
    private String id;
    private int price;

    public GenericProduct() {}

    public GenericProduct(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
