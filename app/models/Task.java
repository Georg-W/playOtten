package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by georg on 21.05.2017.
 */
@Entity
public class Task extends Model {

    @Id
    @Column(name = "task_id")

    private Long id;
    private String name;
    private Project project;
    private Worker worker;
    private Otte otte;
    private int duration;

    public Task(Long id, String name, Project project, Worker worker, Otte otte, int duration) {
        this.id = id;
        this.name = name;
        this.project = project;
        this.worker = worker;
        this.otte = otte;
        this.duration = duration;
    }

    public static Finder<Long, Task> find = new Finder<Long, Task>(Task.class);

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

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Otte getOtte() {
        return otte;
    }

    public void setOtte(Otte otte) {
        this.otte = otte;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
