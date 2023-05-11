package user.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("writeForm")
	public String writeForm() {
		return "user/writeForm";
	}
	
	@GetMapping("list")
	public String list() {
		return "user/list";
	}
	
	@PostMapping("write")
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO) {
		userService.write(userDTO);
	}
	@PostMapping("getUserList")
	@ResponseBody
	public List<UserDTO> getUserList() {
		return userService.getUserList();
	}
	
	@PostMapping("isExistId")
	@ResponseBody
	public String isExistId(@RequestParam String id) {
		return userService.isExistId(id);
	}
	
	@PostMapping("search")
	@ResponseBody
//	public List<UserDTO> search(@RequestParam String searchOption, @RequestParam String keyword) {
	public List<UserDTO> search(@RequestParam Map<String, String> map) {
		return userService.search(map);
	}
	
	@GetMapping("updateForm")
	public String updateForm() {
		return "user/updateForm";
	}

	@PostMapping("getUser")
	@ResponseBody
	public Optional<UserDTO> getUser(@RequestParam String id) {
		return userService.getUser(id);
	}
	
	@PostMapping("update")
	@ResponseBody
	public void update(@ModelAttribute UserDTO userDTO) {
		userService.update(userDTO);
	}
	
	@GetMapping("deleteForm")
	public String deleteForm() {
		return "user/deleteForm";
	}
	
	@PostMapping("delete")
	@ResponseBody
	public void delete(@RequestParam String id) {
		userService.delete(id);
	}
}
