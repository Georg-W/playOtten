package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by georg on 21.05.2017.
 */
public class Customer extends Model{

    @Id
    @Column(name="customer_id")

    private Long id;
    private String prename;
    private String lastname;
    private String address;
    private String email;
    private Project[] projects;

    public Customer(Long id, String prename, String lastname, String address, String email, Project[] projects) {
        this.id = id;
        this.prename = prename;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.projects = projects;
    }

    public static Finder<Long, Customer> find = new Finder<Long, Customer>(Customer.class);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }
}
