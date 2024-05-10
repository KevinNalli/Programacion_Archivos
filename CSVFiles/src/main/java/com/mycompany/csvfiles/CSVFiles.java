
package com.mycompany.csvfiles;

import com.mycompany.csvfiles.manageFiles.ReadFile;
import com.mycompany.csvfiles.manageFiles.WriteFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class CSVFiles {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner cap = new Scanner(System.in);
        File file = new File("./Base_de_Datos.csv");
        ReadFile readfile = new ReadFile(file);
        List<String> data = readfile.loadData();
        for(String line:data){
            String[] splited = line.split(";");
            System.out.println("Hola " +splited[1] + " " + splited[2] + " tu codigo es: " +splited[0]);
        }
        System.out.println("Escribe un nuevo codigo");
        String[] person = new String[3];
        person[0] = cap.nextLine();
        System.out.println("Escribe un nuevo Nombre");
        person[1] = cap.nextLine();
        System.out.println("Escribe un nuevo Apellido");
        person[2] = cap.nextLine();
        
        WriteFile writer = new WriteFile(file);
        writer.Write(person);
        data = readfile.loadData();
        for(String line:data){
            String[] splited = line.split(";");
            System.out.println("Hola " +splited[1] + " " + splited[2] + " tu codigo es: " +splited[0]);
        }
    }
}
