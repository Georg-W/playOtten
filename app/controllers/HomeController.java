package controllers;

import models.Customer;
import models.Otte;
import models.Project;
import models.Worker;
import play.mvc.*;

import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        List<Project> projectList = Project.find.all();
        List<Otte> ottenList = Otte.find.all();
        List<Worker> workerList = Worker.find.all();
        List<Customer> customerList = Customer.find.all();

        return ok(views.html.index.render()
        );
    }

}
