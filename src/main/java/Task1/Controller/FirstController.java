package Task1.Controller;

import Task1.Model.Greeting;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class FirstController{

    @GetMapping("/task1")
    public String greetingForm(Model model){
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/task1")
    public String greetingSubmit(@ModelAttribute Greeting greeting, HttpServletResponse resp){
      ///Сookie cookie=new Cookie("user", greeting.getEmail());
        //cookie.setMaxAge(24 * 60 * 60);

        //resp.addCookie(cookie);

        return "result";
    }
}
