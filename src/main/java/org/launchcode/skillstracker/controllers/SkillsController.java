package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class SkillsController {

    @GetMapping()
    @ResponseBody
    public String skillsTracker() {
        return "<html>" +
                "<body>" +
                "<header>" +
                "<h1> Skills Tracker\n</h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list!\n</h2>" +
                "<ul>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ul>" +
                "</header>" +
                "</body>" +
                "</html>";

    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='skills' method='post' >" +
                "<label for='name'></p>Name:</p></label>" +
                "<input type='text' name='name'>" +

                "<label for='favoriteLanguage'><p>My favorite language:</p></label>" +
                "<select id='favoriteLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +

                "<label for='secondLanguage'><p>My second favorite language:</p></label>" +
                "<select id='secondLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +

                "<label for='thirdLanguage'></p>My third language:</p></label>" +
                "<select id='thirdLanguage'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +

                "</p><input type='submit' value='Submit!'></p>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String skillTrackerWithParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
