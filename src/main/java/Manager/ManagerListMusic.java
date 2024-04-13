/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import Serializer.FilePersistence;
import Serializer.SerializerCSVMusic;
import classes.Music;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    
    public void saveInFile(String pathFile) throws IOException {
        SerializerCSVMusic serializer = new SerializerCSVMusic();
        String csvData = serializer.toCSV(listMusics);
        
        FilePersistence filePersistence = new FilePersistence();
        filePersistence.saveToFile(csvData, pathFile);
        System.out.println("Musicas salvas com sucesso em"+ pathFile);
    }   
    
    public void loadOfFile(String pathFile) throws FileNotFoundException {
        FilePersistence filePersistence = new FilePersistence();
        String csvData = filePersistence.loadFromFile(pathFile);
        
        SerializerCSVMusic serializer = new SerializerCSVMusic();
        this.listMusics = serializer.fromCSV(csvData);
        
        System.out.println("Musicas carregadas com sucesso de "+ pathFile);
    }
}
