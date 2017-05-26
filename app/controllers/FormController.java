package controllers;

import com.google.inject.Inject;
import models.Customer;
import models.Project;
import models.User;
import models.Worker;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
public class FormController extends Controller {
    @Inject
    public FormFactory formFactory;
    public Result loginUser(){
        Form<User> loginForm = formFactory.form(User.class);
        return ok(views.html.login.render(loginForm));
    }
    public Result addProject(){
        List<Customer> customerList = Customer.find.all();
        Form<Project> projectForm = formFactory.form(Project.class);
        return ok(views.html.addProject.render(projectForm, customerList));
    }

    public Result addWorker(){
        Form<Worker> workerForm = formFactory.form(Worker.class);
        return ok(views.html.addWorker.render(workerForm));
    }

}
