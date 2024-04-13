/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class FilePersistence {
    
    public void saveToFile(String text, String pathFile) throws IOException {
        FileWriter arq = new FileWriter(pathFile);
        PrintWriter saveArq = new PrintWriter(arq);
        saveArq.print(text);
        arq.close();
    }
    
    public String loadFromFile(String filePath) throws FileNotFoundException {
        String contextWrite = " ";
        
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        
        scanner.useDelimiter("\\Z");
        while(scanner.hasNext()) {
            contextWrite += scanner.next();
        }
        
        return contextWrite;
    }
}
