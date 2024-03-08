package com.kelompok6.latihan.kelompok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class KelompokController {

    @Autowired
    private final KelompokService kelompokService;

    public KelompokController(KelompokService kelompokService) {
        this.kelompokService = kelompokService;
    }

    @GetMapping("/kelompok")
    public List<Kelompok> getKelompok() {
        return kelompokService.getKelompok();
    }

}
