package com.example.demo_backend1;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class KompisDAO {

    public KompisDAO() {
    }


        public List<Kompis> getAllKompisar() {

            List<Kompis> kompisList = new ArrayList<>();
            Kompis k1 = new Kompis(1, "Sharlin", "Järfälla", "12345");
            Kompis k2 = new Kompis(2, "Filip", "Huddinge", "23456");
            Kompis k3 = new Kompis(3, "Sofya", "Solna", "34567");
            Kompis k4 = new Kompis(4, "Simon", "Danderyd", "45678");
            Kompis k5 = new Kompis(5, "Ramtin", "Sumpan", "56789");

            kompisList.add(k1);
            kompisList.add(k2);
            kompisList.add(k3);
            kompisList.add(k4);
            kompisList.add(k5);

            return kompisList;

        }
    }

