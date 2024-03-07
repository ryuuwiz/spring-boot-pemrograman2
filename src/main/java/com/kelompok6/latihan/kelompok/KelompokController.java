package com.kelompok6.latihan.kelompok;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class KelompokController {

    private final KelompokService kelompokService;

    public KelompokController(KelompokService kelompokService) {
        this.kelompokService = kelompokService;
    }

    @GetMapping
    public List<Kelompok> getKelompok() {
        return kelompokService.getKelompok();
    }

}
