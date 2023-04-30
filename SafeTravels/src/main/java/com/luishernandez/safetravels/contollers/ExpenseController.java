package com.luishernandez.safetravels.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.luishernandez.safetravels.models.Expense;
import com.luishernandez.safetravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;

	// redirects to home
	@GetMapping("/")
	public String index() {
		return "redirect:/expenses";
	}

	// shows all
	@GetMapping("/expenses")
	public String home(@ModelAttribute("expense") Expense expense, Model model) {
		List<Expense> expenses = expenseService.allExpenses();
		model.addAttribute("expenses", expenses);
		return "index.jsp";
	}

	// show individual id
	@GetMapping("/expenses/{id}")
	public String index(Model model, @PathVariable("id") Long id) {
//		Expense expense = expenseService.findExpense(expenseId);
		model.addAttribute("expense", expenseService.findExpense(id));
		return "show.jsp";
	}

	// create new
	@PostMapping("/expenses/new")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			expenseService.createExpense(expense);
			return "redirect:/expenses";
		}
	}

	// update
	@RequestMapping("/expenses/edit/{id}")
	public String edit(@Valid @PathVariable("id") Long id, Model model) {
		// Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expenseService.findExpense(id));
		return "edit.jsp";
	}

	@RequestMapping(value = "/expenses/edit/{id}", method = RequestMethod.PUT)
	public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model,
			@PathVariable("id") Long id) {
		if (result.hasErrors()) {
			for (ObjectError error: result.getAllErrors()) {
				System.out.println(error);
			}
			//Expense expense1 = expenseService.findExpense(id);
			model.addAttribute("expense", expense);
			return "edit.jsp";
		} else {
			expenseService.updateExpense(expense);
			return "redirect:/expenses";
		}
	}

//    @RequestMapping(value="/expenses/{id}", method=RequestMethod.DELETE)
//    public String destroy(@PathVariable("id") Long id) {   	
//    	expenseService.deleteExpense(id);
//    	return "redirect:/expenses";
//    }

	// Delete
	@GetMapping("/expenses/delete/{id}")
	public String destroy(@PathVariable("id") Long id) {
//    	expenseService.deleteExpense(id);
		this.expenseService.deleteExpense(id);
		return "redirect:/expenses";
	}
}
