package com.company.vehicles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

     public static void main(String[] args) throws IOException{
         // write your code here

         try (FileWriter fileWriter = new FileWriter("out.txt")) {
             StringBuffer text = new StringBuffer("привет\nазиза\nжопа\nтот\n");
             fileWriter.write(text.toString());
         } catch (IOException ex) {
             System.out.println(ex.getMessage());

         }

         try (BufferedReader fileReader = new BufferedReader(new FileReader("out.txt"))) {
             StringBuffer str = new StringBuffer();
             while ((str=fileReader.readLine()) != null) {
                 if (str.toString() == str.reverce)
                 System.out.println(str);

             }
         }

            catch (IOException ex){
                System.out.println(ex.getMessage());
         }



    }
}
