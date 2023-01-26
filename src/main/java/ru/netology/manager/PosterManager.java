package ru.netology.manager;

public class PosterManager {

    private String[] films = new String[0];
    private int limit;

    // добавление фильма

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    // вывод всех фильмов

    public String[] findAll() {
        return films;
    }

    // вывод макс лимита последних добавленных фильмов в обратном порядке

    // конструкторы
    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[resultLength - 1 - i];
        }
        return tmp;
    }

}
