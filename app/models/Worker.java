package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by georg on 21.05.2017.
 */
public class Worker extends Model{

    @Id
    @Column(name="worker_id")

    private Long id;
    private Task[] tasks;
    private String prename;
    private String lastname;

    public static Finder<Long, Worker> find = new Finder<Long, Worker>(Worker.class);

    public Worker(Long id, Task[] tasks, String prename, String lastname) {
        this.id = id;
        this.tasks = tasks;
        this.prename = prename;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
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
}
