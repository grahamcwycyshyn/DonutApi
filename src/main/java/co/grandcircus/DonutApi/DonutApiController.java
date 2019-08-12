package co.grandcircus.DonutApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.DonutApi.entity.Details;
import co.grandcircus.DonutApi.entity.Result;
import co.grandcircus.DonutApi.service.ApiService;

@RestController
public class DonutApiController {

	@Autowired
	private ApiService service;
	
	@RequestMapping("/")
	public ModelAndView listDonuts() {
		ModelAndView m = new ModelAndView("index");
		List<Result> list = service.getResults();
		m.addObject("list", list);
		return m;
	}
	
	@RequestMapping("/details")
	public ModelAndView donutDetails(@RequestParam(value="id") Long id) {
		ModelAndView m = new ModelAndView("details");
		Details details = service.getDetails(id);
		m.addObject("details", details);
		return m;
	}
}
