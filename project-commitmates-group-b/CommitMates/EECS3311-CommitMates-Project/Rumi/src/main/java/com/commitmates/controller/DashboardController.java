package com.commitmates.controller;

import com.commitmates.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @Autowired
    private HabitService habitService;

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("habits", habitService.getAllHabits());
        return "dashboard";
    }
}
