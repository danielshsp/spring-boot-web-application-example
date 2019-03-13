package com.boraji.tutorial.springboot;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@SpringBootApplication
@ComponentScan(basePackages = {"com.boraji.tutorial.springboot"})
public class MainApp {
   public static void main(String[] args) throws TesseractException {
       String filePath = "C:/Users/gkx638/id.PNG";
       Tesseract tesseract = new Tesseract();
       tesseract.setDatapath("C:/Users/gkx638/Tesseract/");
       String text = tesseract.doOCR(new File(filePath));
       System.out.println(text);
       SpringApplication.run(MainApp.class, args);
   }
}
