package Contollers;

import Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/todo")
    public class TodoController {
    @Autowired
    private TodoRepository todoRepository;


@RequestMapping(value={"/", "/list"})
public String list(Model model){

return "This is my first Todo";

}
}
