package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
@Entity
public class Product extends Model {
    @Id
    @Column(name="product_id")
    private Long id;

    private String ean;
    private String name;
    private String description;
    private byte[] image;

    @ManyToMany
    public List<Tag> tags;

    @OneToMany(mappedBy = "product")
    private List<StockItem> stockItems;

    public static Finder<Long, Product> find = new Finder<Long, Product>(Product.class);

    @Override
    public String toString() {
        return String.format("%s - %s", getEan(), getName());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<StockItem> getStockItems() {
        return stockItems;
    }

    public void setStockItems(List<StockItem> stockItems) {
        this.stockItems = stockItems;
    }
}
