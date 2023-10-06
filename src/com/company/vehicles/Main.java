package com.company.vehicles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

     public static void main(String[] args){
         // write your code here

         try (FileWriter fileWriter = new FileWriter("out.txt")) {
             fileWriter.write("поп\nазиза\nжопа\nтот\n");
         } catch (IOException ex) {
             System.out.println(ex.getMessage());

         }
         String str;
         StringBuilder sb = new StringBuilder();
         StringBuilder sb2 = new StringBuilder();
         try (BufferedReader fileReader = new BufferedReader(new FileReader("out.txt"))) {
             while ((str=fileReader.readLine()) != null) {
                     sb.append(str);
                     sb2.append(sb.reverse());
                     sb.reverse();
                     if (sb == sb2) {
                         System.out.println(sb);
                     }
                     sb.delete(0,sb.length());
                     sb2.delete(0,sb2.length());
             }
         }
            catch (IOException ex){
                System.out.println(ex.getMessage());
         }



    }
}
