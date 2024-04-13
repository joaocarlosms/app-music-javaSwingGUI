/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import classes.Music;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Windows
 */
public class ManagerListMusic {
    private List<Music> listMusics;
    
    public ManagerListMusic() {
        this.listMusics = new ArrayList<>();
    }

    public List<Music> getListMusics() {
        return listMusics;
    }

    public void setListMusics(List<Music> listMusics) {
        this.listMusics = listMusics;
    }
    
    public void addNewMusics(Music newMusic) {
        this.listMusics.add(newMusic);
    }
    
    public boolean removeMusic(String name_wanted) {
        for(Music music : listMusics) {
            if(music.getTitle().equals(name_wanted)) {
                this.listMusics.remove(music);
                
                System.out.println("Musica removida com sucesso!");
                return true;
            }
        }
        return false;
    }
    
    public Music findMusic(String name_wanted) {
        for(Music music : listMusics) {
            if(music.getTitle().equals(name_wanted)) {
                System.out.println("Musica: "+ music.getTitle() +" encontrada");
                
                return music;
            }
        }
        return null;
    }
    
    public void attMusic(String titleMusic, String newTitleMusic) {
        for(Music music : listMusics) {
            if(music.getTitle().equals(titleMusic)) {
                music.setTitle(newTitleMusic);
                System.out.println("Musica atualizada com sucesso!");
            }
        }
    }

    @Override
    public String toString() {
        return "ManagerListMusic{" + "listMusics=" + listMusics + '}';
    }
    
    // method save file{}
    
    
    //method load file{}
}
