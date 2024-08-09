package phb.group.phb.dev.employ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import phb.group.phb.dev.employ.entity.AnimalFeed;
import phb.group.phb.dev.employ.service.AnimalFeedService;

@Controller
public class AnimalFeedController {
	
	@Autowired
	private AnimalFeedService animalFeedService;
	
	@GetMapping("/")
    public String index(Model model) {
        List<AnimalFeed> animalFeeds = animalFeedService.findAll();
        model.addAttribute("animalFeeds", animalFeeds);
        model.addAttribute("message", ""); // Thêm thông báo nếu cần
        return "index"; // Trả về trang index.jsp
    }
	
	@PostMapping("/addAnimalFeed")
    public String addAnimalFeed(
            @RequestParam String name,
            @RequestParam String address,
            @RequestParam Double costPrice,
            @RequestParam(required = false) String type,
            @RequestParam String supplier,
            Model model) {

        AnimalFeed animalFeed = new AnimalFeed(name, address, costPrice, type, supplier);
        System.out.println("animalFeed = " + animalFeed);
        animalFeedService.save(animalFeed);

        List<AnimalFeed> animalFeeds = animalFeedService.findAll();
        model.addAttribute("animalFeeds", animalFeeds);
        model.addAttribute("message", "Thức ăn chăn nuôi đã được thêm thành công!");
        return "index"; // Trả về trang index.jsp với thông báo
    }
	
	@RequestMapping("/deleteAnimalFeed")
    public String deleteAnimalFeed(@RequestParam Long id, Model model) {
        animalFeedService.deleteById(id);

        List<AnimalFeed> animalFeeds = animalFeedService.findAll();
        model.addAttribute("animalFeeds", animalFeeds);
        model.addAttribute("message", "Thức ăn chăn nuôi đã được xóa thành công!");
        return "index"; // Trả về trang index.jsp với thông báo
    }
	
	@GetMapping("/updateAnimalFeed")
    public String updateAnimalFeed(@RequestParam Long id, Model model) {
        AnimalFeed animalFeed = animalFeedService.findById(id);
        model.addAttribute("animalFeed", animalFeed);
        return "update";
    }

    @PostMapping("/updateAnimalFeed")
    public String updateAnimalFeed(
            @RequestParam Long id,
            @RequestParam String name,
            @RequestParam String address,
            @RequestParam Double costPrice,
            @RequestParam(required = false) String type,
            @RequestParam String supplier,
            Model model) {

        AnimalFeed animalFeed = new AnimalFeed(id, name, address, costPrice, type, supplier);
        animalFeedService.save(animalFeed);

        List<AnimalFeed> animalFeeds = animalFeedService.findAll();
        model.addAttribute("animalFeeds", animalFeeds);
        model.addAttribute("message", "Thức ăn chăn nuôi đã được cập nhật thành công!");
        return "index";
    }
}
