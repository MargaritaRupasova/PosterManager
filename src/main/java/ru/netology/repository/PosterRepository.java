package ru.netology.repository;

public class PosterRepository {

    private String[] films = new String[0];
    private int id;
    private String removeFilm;

    public String[] findAll() {

        return films;
    }

    public void save(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String findById(int id) {
        for (String film : films) {
            if (film.equals(id)) {
                return film;
            }
        }
        return null;
    }


    public void removeById(int id) {
        String[] tmp = new String[films.length - 1];
        int copyToIndex = 0;
        for (String film : films) {
            if (!film.equals(removeFilm)) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        String[] tmp = new String[0];
        films = tmp;
    }
}