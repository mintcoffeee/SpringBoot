package person.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;
import person.bean.PersonDTO;
import person.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService personService;

	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/person/writeForm")
	public String writeForm() {
		return "person/writeForm";
	}

	@GetMapping("person/listForm")
	public String listForm() {
		return "person/list";
	}
	
	@PostMapping("person/write")
	@ResponseBody
	public void write(@RequestParam MultipartFile img, 
					  @ModelAttribute PersonDTO personDTO,
					  HttpSession session ) {
		System.out.println(img.getOriginalFilename());
		System.out.println(personDTO.getName() +"," +personDTO.getAge());
		
		//실제폴더
		String filePath = session.getServletContext().getRealPath("/storage");
		String fileName= img.getOriginalFilename();
		System.out.println("실제폴더 = " + filePath); //나중에 Naver cloud 에 올릴 곳 
		
		
		
		File file = new File(filePath, fileName);
		
		try {
			img.transferTo(file);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		
		personDTO.setPhoto(fileName);
		
		personService.write(personDTO);
		
	}
	
	
	@PostMapping("person/getPersonlist")
	@ResponseBody
	public List<PersonDTO> getPersonlist() {
		return personService.getPersonlist();
	}
}
