package ru.week15.springfirstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/daysOfWeek")
    public String daysOfWeek(@RequestParam(value = "day", defaultValue = "день") String day) {
        switch (day) {
            case "monday" -> day = "понедельник";
            case "tuesday" -> day = "вторник";
            case "wednesday" -> day = "среда";
            case "thursday" -> day = "четверг";
            case "friday" -> day = "пятница";
            case "saturday" -> day = "суббота";
            case "sunday" -> day = "воскресенье";
        }

        return String.format("Сегодня %s!", day);
    }
}
