package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    String film1 = "Film I";
    String film2 = "Film II";
    String film3 = "Film III";
    String film4 = "Film IV";
    String film5 = "Film V";
    String film6 = "Film VI";
    String film7 = "Film VII";
    String film8 = "Film VIII";
    String film9 = "Film IX";
    String film10 = "Film X";
    String film11 = "Film XI";
    String film12 = "Film XII";

    PosterManager manager = new PosterManager();

    @BeforeEach
    public void setup() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);
    }

    @Test
    public void addedFilm() {

        String[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10, film11, film12};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void getLastFilmsNotLimit() {

        String[] expected = { film12, film11, film10, film9, film8, film7, film6, film5, film4, film3 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastFilmsLimit9() {
        PosterManager manager = new PosterManager(9);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = { film12, film11, film10, film9, film8, film7, film6, film5, film4 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastFilmsLimit10() {
        PosterManager manager = new PosterManager(10);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = { film12, film11, film10, film9, film8, film7, film6, film5, film4, film3 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastFilmsLimit11() {
        PosterManager manager = new PosterManager(11);
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = { film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
