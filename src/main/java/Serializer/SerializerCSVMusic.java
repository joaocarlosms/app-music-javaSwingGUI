/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializer;

import Manager.ManagerListMusic;
import classes.Music;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows
 */
public class SerializerCSVMusic {
    
    public String toCSV(List<Music> listMusics) {
        String csv = "Titulo;Artista;Duração;Preço\n";
        
        for(Music music : listMusics) {
            csv += music.getTitle() + ";"
                    + music.getArtist() + ";"
                    + music.getDuration() + ";"
                    + music.getPrice() + "\n";
        }
        
        return csv;
    }
    
    public List<Music> fromCSV(String data) {
         List<Music> listMusics = new ArrayList<>();
         
         String[] lines = data.split("\n");
        
        for(int i = 1; i < lines.length; i++) {
            String[] parts = lines[i].split(";");
            
            if(parts.length >= 4) {
                Music music = new Music();
                music.setTitle(parts[0]);
                music.setArtist(parts[1]);
                music.setDuration(parts[2]);
                music.setPrice(Double.parseDouble(parts[3]));
                
                listMusics.add(music);
            }
        }
        return listMusics;
    }
}
