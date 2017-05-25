package controllers;

import models.Project;
import play.mvc.*;

import java.util.List;

/**
 * Created by georg on 21.05.2017.
 */
public class ProjectsController extends Controller{

    List<Project> projectList = Project.find.all();
    public Result index() {
        return ok(views.html.projects.render(projectList));
    }
}
