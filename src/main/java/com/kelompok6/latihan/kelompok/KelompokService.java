package com.kelompok6.latihan.kelompok;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KelompokService {
    public List<Kelompok> getKelompok() {
        return List.of(
                new Kelompok(6, "05TPLP003", getAnggota()));
    }

    public List<Anggota> getAnggota() {
        return List.of(
                new Anggota("Ryu Kurnianto Putra", "211011450106"),
                new Anggota("Wahyu Ramadhan", "211011450533"),
                new Anggota("Rizal Wahyudin", "181011450048"),
                new Anggota("Tira", "211011450105"),
                new Anggota("Wahyu Reza Habibi", "211011450144"));
    }
}
