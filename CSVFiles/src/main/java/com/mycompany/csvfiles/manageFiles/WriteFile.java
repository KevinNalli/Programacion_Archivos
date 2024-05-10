
package com.mycompany.csvfiles.manageFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private File file;
    private FileWriter writefile;
    private PrintWriter pw;

    public WriteFile(File file) throws IOException {
        this.file = file;
        this.writefile = new FileWriter(file);
        this.pw = new PrintWriter(writefile);
    }
    public void Write(String[] person){
        pw.println(person[0]+";"+person[1]+";"+person[2]);
    }
    
}
