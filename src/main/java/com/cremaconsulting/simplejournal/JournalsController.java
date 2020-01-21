package com.cremaconsulting.simplejournal;

import com.cremaconsulting.simplejournal.model.Goal;
import com.cremaconsulting.simplejournal.model.Journal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JournalsController {

    @GetMapping("/journals")
    public List<Journal> all() {
        // Load all files
        return List.of(new Journal(
                "Cool message",
                List.of(),
                List.of(),
                List.of(new Goal("Read Bokovski", true), new Goal("Can I get another kiss from you", true)),
                List.of()
        ));
    }

    @PostMapping("/journals")
    public String createJournal() {

        return "redirect:/";
    }

}
