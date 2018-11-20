package co.apilab.famouslab;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.apilab.famouslab.model.Complete;
import co.apilab.famouslab.model.Tiny;


@Controller
public class ApiController {
	private static final String List = null;
	@Autowired 
	private ApiService apiService;
	
	@RequestMapping("/")
	public ModelAndView home() {
	return new ModelAndView("index");
	}
	
	@RequestMapping("/complete")
	public ModelAndView showCompleteList() {
	ArrayList<Complete> complete = (ArrayList<Complete>) apiService.showCompleteList();
	return new ModelAndView("complete","complete", complete);
	}
	@RequestMapping("/tiny")
	public ModelAndView showTinyList() {
		ArrayList<Tiny> tiny = (ArrayList<Tiny>) apiService.showTinyList();
		return new ModelAndView("tiny", "tiny", tiny);
		}
	
}
