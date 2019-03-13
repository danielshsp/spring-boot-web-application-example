package com.boraji.tutorial.springboot.domain;

import org.springframework.stereotype.Component;
import java.io.File;
import net.sourceforge.tess4j.*;

@Component
public class Customer {
    private String customerId;
    public String getCustomerId() throws TesseractException {
        String filePath = "C:/Users/gkx638/id.PNG";
        Tesseract tesseract = new Tesseract();
        tesseract.setDatapath("C:/Users/gkx638/Tesseract/");
        String text = tesseract.doOCR(new File(filePath));
        customerId = text;
        return customerId;
    }



    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
