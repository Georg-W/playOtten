package controllers;

import models.Worker;
import play.mvc.*;

import java.util.List;

/**
 * Created by georg on 21.05.2017.
 */
public class WorkersController extends Controller {
    public Result index() {
        List<Worker> workerList = Worker.find.all();
        return ok(views.html.workers.render(workerList));
    }
}
