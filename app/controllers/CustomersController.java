package controllers;

import models.Customer;
import play.mvc.*;

import java.util.List;

/**
 * Created by georg on 21.05.2017.
 */
public class CustomersController extends Controller{
    public Result index() {
        List<Customer> customerList = Customer.find.all();
        return ok(views.html.customers.render(customerList));
    }
}
