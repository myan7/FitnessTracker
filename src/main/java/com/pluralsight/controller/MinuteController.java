package com.pluralsight.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.model.Activity;
import com.pluralsight.model.Exercise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class MinuteController {

	@RequestMapping("/addM")
	public String addMinute(@ModelAttribute("exercise") Exercise exercise)
	{
		System.out.println("exercise: "+ exercise.getMinutes());
		return "addMinutes";
		
//		return "forward:addMM";
//		http://localhost:8585/FitnessTracker/addM	
//		return "redirect:addMM";
//		http://localhost:8585/FitnessTracker/addMM
	}
	
//	@RequestMapping("/addMM")
//	public String addMoreMinute(@ModelAttribute("exercise") Exercise exercise)
//	{
//		System.out.println("exercise: "+ exercise.getMinutes());
//		return "addMinutes";
//	}
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities()
	{
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity("Bike");
		activities.add(bike);
		
		Activity swim = new Activity("Swim");
		activities.add(swim);
		
		return activities;
	}
}
