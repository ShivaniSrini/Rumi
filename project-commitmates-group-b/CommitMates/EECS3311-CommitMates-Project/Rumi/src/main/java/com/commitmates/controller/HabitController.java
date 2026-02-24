package com.commitmates.controller;

import com.commitmates.model.Habit;
import com.commitmates.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/habits")
public class HabitController {

    @Autowired
    private HabitService habitService;

    @GetMapping
    public String showHabits(Model model) {
        model.addAttribute("habits", habitService.getAllHabits());
        return "habits";
    }

    @PostMapping("/save")
    public String saveHabit(@ModelAttribute Habit habit) {
        habitService.saveHabit(habit);
        return "redirect:/habits";
    }

    @PostMapping("/new")
    public String createHabit(@RequestParam String title,
                              @RequestParam String description,
                              @RequestParam int hours,
                              @RequestParam int minutes) {
        Habit habit = new Habit(title, description, hours, minutes);
        habitService.saveHabit(habit);
        // redirect to dashboard (handled by DashboardController)
        return "redirect:/dashboard";
    }

    @GetMapping("/delete/{id}")
    public String deleteHabit(@PathVariable Long id) {
        habitService.deleteHabit(id);
        return "redirect:/habits";
    }

    @GetMapping("/edit/{id}")
    public String editHabit(@PathVariable Long id, Model model) {
        Habit habit = habitService.getHabitById(id);
        if (habit != null) {
            model.addAttribute("habit", habit);
            return "edit-habit";
        } else {
            return "redirect:/dashboard";
        }
    }
}
