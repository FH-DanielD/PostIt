package com.SuperGlue.PostIt.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SuperGlue.PostIt.Model.PostItMessage;
import com.SuperGlue.PostIt.Repository.PostItMessageRepository;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Controller that maps the URL to the index.html file
 * and initialized the view using thymeleaf
 * 
 * For further information on thymelead: https://www.thymeleaf.org/
 * @author Daniel Dornhof
 *
 */
@Controller
public class PostItController {
	
	
	@Autowired
	private PostItMessageRepository messageRepository;
	
	
	/**
	 * Implements the handler for a GET-Request on "/index"
	 * @param model Holds the model-attributes, used by thymeleaf, as a Map
	 * @return The view of the index-page
	 */
	@GetMapping("/index")
	public String showMainPage(Model model) {
		model.addAttribute("message", new PostItMessage());       		//Add empty message to initialize form fields
		model.addAttribute("messages", messageRepository.findAll());	//Gather messages to print them on screen
		return "index";
	}
	
	
	/**
	 * Implements the handler for a POST-Request on "/index" and saves the created message in the database
	 * @param message Message-Object that gets created by using the form input and saved in the database
	 * @param model Holds the model-attributes, used by thymeleaf, as a Map
	 * @return A redirection to the view index-page (Redirection to prevent resending the message by refreshing)
	 */
	@PostMapping("/index")
	public String postMessage(@ModelAttribute PostItMessage message, Model model) {
		messageRepository.save(message);
//		model.addAttribute("message", new PostItMessage());
//		model.addAttribute("messages", messageRepository.findAll());
		return "redirect:index";
	}
}
