package com.bozo.converter;

import com.bozo.utils.Properties;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;

import java.io.File;
import java.io.IOException;

public class Converter {
    private static final String MAIN_PATH = "src\\main\\resources\\sample\\";

    private static final String PDF_PATH = MAIN_PATH + "\\pdf\\";

    private static final String HTML_PATH = MAIN_PATH + "\\html\\";


    public void convert(String htmlName, String pdfName){
        convert(htmlName, pdfName, Properties.getDefaultConverterProperties());
    }

    public void convert(String htmlName, String pdfName, ConverterProperties properties){
        String html = HTML_PATH + htmlName + ".html";
        String pdf = PDF_PATH + pdfName + ".pdf";

        try {
            HtmlConverter.convertToPdf(new File(html), new File(pdf), properties);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
