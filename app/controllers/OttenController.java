package controllers;

import models.Otte;
import play.mvc.*;

import java.util.List;

/**
 * Created by georg on 21.05.2017.
 */
public class OttenController extends Controller{
    List<Otte> ottenList = Otte.find.all();
    public Result index() {
        return ok(views.html.otten.render(ottenList));
    }
}
