
package com.mycompany.csvfiles.manageFiles;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile{
    private File file;
    private FileWriter writefile;
    private PrintWriter pw;

    public WriteFile(String url) throws IOException,FileNotFoundException {
        this.file = new File(url);
        this.writefile = new FileWriter(file, true);
        this.pw = new PrintWriter(writefile);
    }
    public void Write(String[] person) throws IOException{
        pw.println(person[0]+";"+person[1]+";"+person[2]);
        try{
            if(writefile != null){
                    writefile.close();
                }
        }catch(IOException e){
            System.out.println("No se cerro el escritor");
        }
    }
    
}
