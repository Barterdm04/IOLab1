/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopractice;

import java.io.*;

/**
 *
 * @author DB7
 */
public class IOPractice {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        boolean append = true;
        //File data = new File(File.separatorChar + "temp" + File.separatorChar 
         //               + "lab1.txt");
        //File location from laptop
        //File data = new File("C:\\temp\\lab1.txt");
        
        //File location from external drive
        File data = new File("E:\\School\\Fall 2014\\Advanced Java\\lab1.txt");
        
        System.out.println("Absolute Path: " + data.getAbsolutePath());
        System.out.println("");
        BufferedReader in = null;
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
        out.println("");
        out.println("Bill Clinton");
        out.println("123 White House Ln.");
        out.println("Washington DC, USA");
	
        out.close();  // be sure you close your streams when done!!
	
	System.out.println("Wrote file to: " + data.getAbsolutePath());
        
        
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    }
    
}
