package com.cremaconsulting.simplejournal;

import org.springframework.web.bind.annotation.GetMapping;

public class MessageController {

    @GetMapping("/messages/random")
    public String randomMessage() {
        // Quotes, messages, words of the day.
        return "This is a boring quote.";
    }

}
