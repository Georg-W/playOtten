package controllers;

import models.User;
import play.data.*;
import play.mvc.*;

import javax.inject.Inject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import static play.mvc.Controller.request;
import static play.mvc.Results.redirect;

/**
 * Created by georg on 25.05.2017.
 */
public class UserController {

    @Inject
    public FormFactory formFactory;

    public Result create(){
        Form<User> loginForm = formFactory.form(User.class);
        User user = loginForm.bindFromRequest().get();
        Http.MultipartFormData body = request().body().asMultipartFormData();

        user.save();
        return  redirect(routes.HomeController.index());
    }
}
