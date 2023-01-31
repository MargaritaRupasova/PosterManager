package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.repository.PosterRepository;

import static org.mockito.Mockito.*;

public class PosterManagerTest {

    PosterRepository repo = Mockito.mock(PosterRepository.class);
    PosterManager manager = new PosterManager(repo);

    String film1 = new String("Film I");
    String film2 = new String("Film II");
    String film3 = new String("Film III");

    // String film1 = "Film I";
    // String film2 = "Film II";
    // String film3 = "Film III";


    @Test
    public void addMockitoFilms() {

        String[] films = { film1, film2, film3 };
        // manager.addFilm(film1);
        // manager.addFilm(film2);
        // manager.addFilm(film3);

        doReturn(films).when(repo).findAll();

        String[] expected = { film3, film2, film1 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addedFilm() {

        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";

        PosterManager manager = new PosterManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {film1, film2, film3};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void getLastFilms() {

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

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
