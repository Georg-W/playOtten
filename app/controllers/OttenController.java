package controllers;

import models.Otte;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by georg on 21.05.2017.
 */
public class OttenController extends Controller{
    List<Otte> ottenList = Otte.find.all();
    public Result index() {
        return ok(views.html.otten.render(ottenList));
    }

    @Inject
    public FormFactory formFactory;

    public Result create(){
        Form<Otte> projectForm = formFactory.form(Otte.class);
        Otte project = projectForm.bindFromRequest().get();
     //   project.setOtte(Otte.find.byId(Long.parseLong(project.getTmpOtte())));
        project.save();
        return  redirect(routes.ProjectsController.index());
    }
}
