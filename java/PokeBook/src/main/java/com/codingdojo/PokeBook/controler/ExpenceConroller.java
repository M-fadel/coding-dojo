package com.codingdojo.PokeBook.controler;
import java.util.List;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.codingdojo.PokeBook.model.Expense;
import com.codingdojo.PokeBook.services.PokeService;

@Controller
public class ExpenceConroller {
	@Autowired
	PokeService poke;
	
	@RequestMapping("/")
public String index(Model model ,@ModelAttribute("Expense") Expense e) {
	List<Expense> allExpenses =poke.allExpenses();
	model.addAttribute("allExpenses",allExpenses);
	return "index.jsp";
}
@RequestMapping(value ="/add",method =RequestMethod.POST)
public String add(@Valid @ModelAttribute("Expense") Expense e, BindingResult result) {
    if (result.hasErrors()) {
        return "index.jsp";
    } else {
        poke.createPoke(e);
        return "redirect:/";
    }
	
}
@RequestMapping("/edit/{id}")
public String edit(@PathVariable("id") Long id,Model model) {
	Expense e = poke.findExpenseById(id);
	model.addAttribute("e",e);
	return"edit.jsp";
}

@RequestMapping(value="/update/{id}",method=RequestMethod.POST)
public String update(@Valid @ModelAttribute("Expense") Expense e, BindingResult result, @PathVariable("id") Long id,Model model) {
	if(result.hasErrors()) {
		Expense ex=poke.findExpenseById(id);
		model.addAttribute("e",ex);
		return"edit.jsp";
	} else {
		poke.updatd(id, e);
		
		return "redirect:/";
	}
}
@RequestMapping(value="/delete/{id}",method=RequestMethod.POST)
public String delete(@PathVariable("id") Long id) {
	poke.Delete(id);	
	return "redirect:/";
}
@RequestMapping("/show/{id}")
public String show(@PathVariable("id")Long id,Model model) {
	Expense e = poke.findExpenseById(id);
	model.addAttribute("e" ,e);
	return"show.jsp";
}
//@RequestMapping(value ="/add" ,method=RequestMethod.POST)
//public String add(@RequestParam("Name")String name
//		,@RequestParam("Vendor")String ven,@RequestParam("Amount")int amount
//		,@RequestParam("des")String des) {
//	Expense e = new Expense( name, ven, des, amount);
//	poke.createPoke(e);
//	return "redirect:/";
//}
}
