package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {
	
	@Autowired
	private MusicService service; 

	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Music> listMusics = service.listAll();
		model.addAttribute("listMusics", listMusics);
		return "index";}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		Music music = new Music();
		model.addAttribute("music", music);
		return "new_music";}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("music") Music music) {
		service.save(music);
		return "redirect:/";}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_music");
		Music music = service.get(id);
		mav.addObject("music", music);
		return mav;}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		service.delete(id);
		return "redirect:/";}
}
