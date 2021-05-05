package bot;

import com.sun.istack.internal.Nullable;

import java.io.Serializable;

public abstract class GenericProduct implements Serializable {

    @Nullable
    public String image;
    public String name;
    public String id;
    public int price;

    public GenericProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
