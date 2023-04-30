package com.luishernandez.safetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luishernandez.safetravels.models.Expense;
import com.luishernandez.safetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	// adding Expense repository as dependency
	private final ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	// returns all expense
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}
	// creates an expense
	public Expense createExpense(Expense e) {
		return expenseRepository.save(e);
	}
	// retrieves an expense
	public Expense findExpense(Long id) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if(optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	// updates an expense
	public Expense updateExpense(Expense e) {
		return expenseRepository.save(e);
	}
	// deletes an expense
	
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
}
