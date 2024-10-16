package shop.samdul.greeting.controller;
import java.util.Stack;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    private Stack<People> nameStack = new Stack<>();
    private Stack<String> names = new Stack<>();
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name",required = false, defaultValue = "HI")String name, Model model){
        names.push(name);
        model.addAttribute("names", names);
        return "greeting";
    }
  

    @GetMapping("/people")	
    public String people(@RequestParam(name="name", required=false, defaultValue="HI") String name, Model model) {
        People p = new People();
        if (!nameStack.isEmpty()) {
            People pp = nameStack.peek();
            p.setNum(pp.getNum() + 1);
        } else {
              p.setNum(1);
        }
        p.setName(name.toLowerCase());
        nameStack.push(p);
        model.addAttribute("nameStack", nameStack);
        
        return "greeting2";
    }
    
}

