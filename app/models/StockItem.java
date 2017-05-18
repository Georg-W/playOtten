package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by martinschipflinger on 09.05.17.
 */
@Entity
public class StockItem extends Model {
    @Id
    @Column(name="stockitem_id")
    private Long id;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Product product;
    private Long quantity;


    public static Finder<Long, StockItem> find = new Finder<Long, StockItem>(StockItem.class);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
