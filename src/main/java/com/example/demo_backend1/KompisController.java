package com.example.demo_backend1;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class KompisController {


    KompisDAO kompisDAO = new KompisDAO();
    Kompis kompis = new Kompis(1, "Sharlin", "Järfälla", "12345");
    List<Kompis> kompisList = kompisDAO.getAllKompisar();

    @RequestMapping("/kompisar")
    public List<Kompis> index() {
        return kompisList;
    }

    @RequestMapping("/kompis/{id}")
    public Kompis getFriendById(@PathVariable int id) {
        for (Kompis kompis:kompisList
             ) {
            if (kompis.getId() == id)
                return kompis;

        }
        return null;
    }

    @PostMapping("/kompis/add")
    public Response addKompis(@RequestBody Kompis k) {
        Response res = new Response("Kompis tillagd", Boolean.FALSE);
        kompisList.add(k);
        res.setStatus(Boolean.TRUE);
        return res;
    }

}











