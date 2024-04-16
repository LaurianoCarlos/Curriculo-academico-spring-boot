package br.com.curriculo.controller;

import br.com.curriculo.model.Curriculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController {
    @GetMapping
    public ModelAndView home( ){
        Curriculo cr = new Curriculo(
                "Lauriano Carlos",
                "16/03/2000",
                "Estou em um processo de transição de carreira, cursando" +
                        " Análise e" +
                        " Desenvolvimento de Sistemas. Nos últimos 8 meses, tenho" +
                        " trabalhado como " +
                        "desenvolvedor WordPress, onde adquiri experiência em " +
                        "desenvolvimento web. Além " +
                        "disso, tenho conhecimentos em Java, Php, CSS, " +
                        "JavaScript e MySQL.");

        ModelAndView mv = new ModelAndView("home");
        mv.addObject("curriculo",cr);

        return mv;
    }
}
