package com.example.demo_backend1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController

// Lucky You 1A

public class LuckyYou {

    @RequestMapping("/randomNumber")
    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(10 - 1 + 1) + 1;
    }

    @RequestMapping("/randomAnimal")

    public String randomAnimal() {
        switch ((int) (Math.random() * 4)) {
            case 0:
                return "Ko";
            case 1:
                return "Hund";
            case 2:
                return "Spindel";
            default:
                return "Zebra";
        }
    }

    // Lucky You 1B

    @RequestMapping("/luckyyou1b")

    public String ly(@RequestParam String type) {
        if (type.equalsIgnoreCase("animal")) {
            return randomAnimal();
        } else if (type.equalsIgnoreCase("number")) {
            return String.valueOf(randomNumber());
        } else return "I don't understand";

    }

    // Lucky You 1C

    @RequestMapping("/luckyyou1c")

    public String lyc(@RequestParam String type,
                      @RequestParam(required = false) String firstname,
                      @RequestParam(required = false) String lastname) {

        String f = "";
        String l = "";
        if (firstname != null) {
            f = firstname;
        }
        if (lastname != null) {
            l = lastname;
        }
        if (type.equalsIgnoreCase("animal")) {
            return f + " " + l + " Ditt favoritdjur:" + " " + randomAnimal();

        } else if (type.equalsIgnoreCase("number")) {
            return f + " " + l + " Ditt lyckotal" + " " + randomNumber();
        } else return "I don't understand";

    }

    // Lucky You 1D
    @RequestMapping("/luckyyou1d")
    public String lyd(@RequestParam String type,
                      @RequestParam(required = false, defaultValue = "PIPPI") String firstname,
                      @RequestParam(required = false, defaultValue = "långstrump") String lastname) {

        String f = "";
        String l = "";
        if (firstname != null) {
            f = firstname;
        }
        if (lastname != null) {
            l = lastname;
        }
        if (type.equalsIgnoreCase("animal")) {
            return f + " " + l + " Ditt favoritdjur:" + " " + randomAnimal();

        } else if (type.equalsIgnoreCase("number")) {
            return f + " " + l + " Ditt lyckotal" + " " + randomNumber();
        } else return "I don't understand";
    }

    // Lucky You 1E
    @RequestMapping("/luckyyou1e")
    public String lye(@RequestParam String type,
                      @RequestParam List<Integer> unlucky) {

      /*  if (type.equalsIgnoreCase("animal")) {
            return randomAnimal(); */
        if (type.equalsIgnoreCase("number")) {

            boolean b = true;
            int nr = 0;
            while (b) {
                nr = randomNumber();
                if (!unlucky.contains(nr)) {
                    b = false;
                }
            }
            return String.valueOf(nr);
        } else return "I don't understand";
    }


    //Lucky You 1F

    @RequestMapping("/luckyyou1f")
    public List<String> lyf(@RequestParam String type,
                            @RequestParam List<Integer> unlucky) {
        List<String> res = new LinkedList<>();
        if (type.equalsIgnoreCase("animal")) {
            res.add(randomAnimal());

        } else if (type.equalsIgnoreCase("number")) {
            for (int i = 1; i < 11; i++) {
                if (!unlucky.contains(i)) {
                    res.add(String.valueOf(i));
                }
            }
        } return res;
    }

    //------------------------------------------------------------------------------------
    //uppg1g
    @RequestMapping("/luckyyou1G/{type}")
    // Pathen type blir slash -> luckyyou1g/number eller animal

    public String lyg(@PathVariable String type) {
        if (type.equalsIgnoreCase("animal")) {
            return randomAnimal();
        } else if (type.equalsIgnoreCase("number")) {
            return String.valueOf(randomNumber());
        } else return "I don't understand";
    }

    /*uppg1g
    @RequestMapping(value = "/luckyYouHTML")
    public String hejhtml() {
        return "<html><head></head><body><h1>hej</h1> på er</body></html>";
    }*/

}











