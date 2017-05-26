package controllers;

import models.Worker;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by georg on 21.05.2017.
 */
public class WorkersController extends Controller {
    public Result index() {
        List<Worker> workerList = Worker.find.all();
        return ok(views.html.workers.render(workerList));
    }
    @Inject
    public FormFactory formFactory;

    public Result create(){
        Form<Worker> workerForm = formFactory.form(Worker.class);
        Worker worker = workerForm.bindFromRequest().get();
        worker.save();
        return  redirect(routes.WorkersController.index());
    }
}
