package com.pluralsight.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pluralsight.model.Goal;

@Controller
@SessionAttributes("goal")
public class GoalController {

	@RequestMapping(value="/addGoal", method= RequestMethod.GET)
	public String addGoal(Model model)
	{
		Goal goal = new Goal(10);
		model.addAttribute("goal", goal);   
//		System.out.println(goal.hashCode());// the same object
		return "addGoal";
	}
	
	@RequestMapping(value="/addGoal", method= RequestMethod.POST)
	public String addGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result)
	{
		System.out.println("Binding Result has errors: "+ result.hasErrors());
		System.out.println("Goal minutes is "+ goal.getMinutes());
//		System.out.println(goal.hashCode());  // the same object
		if(result.hasErrors()) // if the input is not valid, stay in this page
		{
			return "addGoal";  
		}
		return "redirect:addM";
	}
}
