package simple;


import java.util.*;


public class Movie {
    private int id;
    private String title;
    private String genre;
    private int duration;
    private String[] showTimings;

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getGenre()
     {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    public int getDuration()
    {
        return duration;
    }

    public void setDuration(int duration) 
    {
        this.duration = duration;
    }

    public String[] getShowTimings()
    {
        return showTimings;
    }

    public void setShowTimings(String[] showTimings) 
    {
        this.showTimings = showTimings;
    }

    public Movie(int id, String title, String genre, int duration, String[] showTimings)
    {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.showTimings = showTimings;
    }
}
