package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class controladorPrincipal 
{
    @RequestMapping(value="index.htm", method=RequestMethod.GET)
    public ModelAndView mosrarIndex()
    {
        ModelAndView mav=new ModelAndView("index");
        return mav;
    }
    
}