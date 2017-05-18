package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
@Entity
public class Tag extends Model {
    @Id
    @Column(name="tag_id")
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Product> products;


    public static Finder<Long, Tag> find = new Finder<Long, Tag>(Tag.class);


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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
