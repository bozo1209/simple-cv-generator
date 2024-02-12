package com.bozo;

import com.bozo.converter.Converter;
import com.bozo.utils.Properties;

public class Main {

    public static void main(String[] args) {

        String htmlName = "sample";
        String pdfName = "sample";

        Converter converter = new Converter();
//        converter.convert(htmlName, pdfName);

        converter.convert(htmlName, pdfName, Properties.getDefaultConverterProperties());

    }
}