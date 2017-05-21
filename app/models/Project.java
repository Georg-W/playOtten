package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Id;
/**
 * Created by georg on 21.05.2017.
 */
public class Project extends Model{
    @Id
    @Column(name="project_id")

    private Long id;
    private String name;
    private Task[] tasks;
    private Customer customer;
    private int duration;

    public Project(Long id, String name, Task[] tasks, Customer customer, int duration) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
        this.customer = customer;
        this.duration = duration;
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

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
