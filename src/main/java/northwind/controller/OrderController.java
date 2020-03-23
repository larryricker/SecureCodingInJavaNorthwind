package northwind.controller;

import javax.validation.Valid;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.validation.BindingResult;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;

import northwind.entity.Orders;  
  
@Controller  
public class OrderController {  
  
    @RequestMapping("/order")  
    public String display(Model m)  
    {  
        m.addAttribute("ord", new Orders(0l, "", null, null, null, null, null, null, "", null, null, null, null, null));  
        return "viewpage";  
    }  
    @RequestMapping("/ordersearch")  
    public String submitForm(@Valid @ModelAttribute("ord") Orders order, BindingResult br)  
    {  
        if(br.hasErrors())  
        {  
            return "ordersearch";  
        }  
        else  
        {  
        return "ordersearchresults";  
        }  
    }  
}  