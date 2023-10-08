package com.company.vehicles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

     public static void main(String[] args) {
         // write your code here

         try (FileWriter fileWriter = new FileWriter("out.txt")) {
             fileWriter.write("папа\nазиза\nжопа\nтот\n");
         } catch (IOException ex) {
             System.out.println(ex.getMessage());

         }
         String str;
         StringBuilder sb = new StringBuilder();
         StringBuilder sb2 = new StringBuilder();
         try (BufferedReader fileReader = new BufferedReader(new FileReader("out2.txt"))) {

             while ((str=fileReader.readLine()) != null) {
                     sb.append(str);
                     sb.reverse();
                    if (sb.toString().equals(str)) {
                         System.out.println(sb);
                         sb2.append(str+"\n");
                    }
                     sb.delete(0,sb.length());
             }
         }
            catch (IOException ex){
                System.out.println(ex.getMessage());
         }
         try (FileWriter fileWriter = new FileWriter("out3.txt")) {
             fileWriter.write(String.valueOf(sb2));
         } catch (IOException ex) {
             System.out.println(ex.getMessage());

         }



    }
}
