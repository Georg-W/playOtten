package controllers;

import com.sun.org.apache.regexp.internal.RE;
import models.Product;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;

/**
 * Created by martinschipflinger on 09.05.17.
 */
public class ProductController extends Controller {

    public Result list(){
        List<Product> productList = Product.find.all();
        return ok(views.html.product.render(productList));
    }

    public Result show(Long id){
        return ok();
    }

    public Result create(){
        return ok();
    }

}
