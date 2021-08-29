package com.gomathy.learningspring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gomathy.learningspring.business.service.GuestsViewService;

@Controller
@RequestMapping("/guestsByName")
public class GuestsWebController {
    private final GuestsViewService guestsViewService;

    @Autowired
    public GuestsWebController(GuestsViewService guestsViewService) {
        this.guestsViewService = guestsViewService;
    }

    @GetMapping
    public String getAllGuests(Model model){
        model.addAttribute("guestsView", guestsViewService.getAllGuests());
        return "guests";
    }
}
