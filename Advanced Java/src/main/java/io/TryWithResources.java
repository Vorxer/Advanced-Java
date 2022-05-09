package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResources {


    public static void main(String[] args) {

        //anything that implements auto closeable are resources
        //lookup auto closeable
        try(
                BufferedReader br = new BufferedReader(new StringReader("Hello World"));
                StringWriter sw = new StringWriter();
        ){
            sw.write(br.readLine());
            System.out.println(sw.toString());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }
}
