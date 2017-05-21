package controllers;

import play.mvc.*;

/**
 * Created by georg on 21.05.2017.
 */
public class WorkersController extends Controller {
    public Result index() {
        return ok(views.html.workers.render());
    }
}
