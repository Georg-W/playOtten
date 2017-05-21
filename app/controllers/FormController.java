package controllers;

import com.google.inject.Inject;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

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
}
