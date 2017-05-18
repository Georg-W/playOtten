package models;


import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
@Entity
public class Warehouse extends Model {
    @Id
    @Column(name="warehouse_id")
    private Long id;

    private String name;
    private String street;
    private String postalCode;
    private String city;

    @OneToMany(mappedBy = "warehouse")
    private List<StockItem> stock;


    public static Finder<Long, Warehouse> find = new Finder<Long, Warehouse>(Warehouse.class);


    @Override
    public String toString() {
        return String.format("%s - (%s, %s %s)",getName(), getStreet(), getPostalCode(), getCity());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<StockItem> getStock() {
        return stock;
    }

    public void setStock(List<StockItem> stock) {
        this.stock = stock;
    }
}
