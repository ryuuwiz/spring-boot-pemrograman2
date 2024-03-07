package com.kelompok6.latihan.kelompok;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Kelompok {
    private Integer kelompok;
    private String kelas;
    private List<Anggota> anggota;

    public Kelompok(Integer kelompok, String kelas, List<Anggota> anggota) {
        this.kelompok = kelompok;
        this.kelas = kelas;
        this.anggota = anggota;
    }
}

@Getter
@Setter
class Anggota {
    private String nama;
    private String nim;

    public Anggota(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
}
