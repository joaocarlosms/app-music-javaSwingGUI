/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Windows
 */
public class Music {
    private String title;
    private String duration;
    private String artist;
    private double price;
    
    public Music() {
        this.title = " ";
        this.duration = " ";
        this.artist = " ";
        this.price = 0.0;
    }

    public Music(String title, String duration, String artist, double price) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Music(Music orig) {
        this.title = orig.getTitle();
        this.artist = orig.getArtist();
        this.duration = orig.getDuration();
        this.price = orig.getPrice();
    }

    @Override
    public String toString() {
        return "Music{" + "title=" + title + 
                ", duration=" + duration + 
                ", artist=" + artist + 
                ", price=" + price + '}';
    }
    
    public void copy_music(Music other) {
        this.title = other.getTitle();
        this.artist = other.getArtist();
        this.duration = other.getDuration();
        this.price = other.getPrice();
    }
}
