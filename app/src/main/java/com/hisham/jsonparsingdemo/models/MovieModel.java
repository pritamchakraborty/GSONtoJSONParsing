package com.hisham.jsonparsingdemo.models;

/**
 * Created by pritam on 9/6/2015.
 */
public class MovieModel {
    private int id;
    private String title;
    private float vote_average;
    private String release_date;
    private String poster_path;

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    private String overview;

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getVote_average() {
        return vote_average;
    }

    public void setVote_average(float vote_average) {
        this.vote_average = vote_average;
    }
    public String getPoster_path() {
        return ("http://image.tmdb.org/t/p/w185" +poster_path);
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

}