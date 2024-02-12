package com.bozo.utils;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.layout.font.FontProvider;

import java.util.List;

public class Properties {

    /**
     *
     * uses system fonts
     *
     */
    public static ConverterProperties getDefaultConverterProperties(){
        ConverterProperties converterProperties = new ConverterProperties();
        FontProvider fontProvider = new FontProvider();
        fontProvider.addSystemFonts();
        converterProperties.setFontProvider(fontProvider);
        return converterProperties;
    }

    /**
     *
     * you need to provide font directory on your system
     *
     */
    public static ConverterProperties getCustomConverterProperties(String fontDirectory){
        ConverterProperties converterProperties = new ConverterProperties();
        FontProvider fontProvider = new FontProvider();
        fontProvider.addDirectory(fontDirectory);
        converterProperties.setFontProvider(fontProvider);
        return converterProperties;
    }

    /**
     *
     * you need to provide list with fonts directories on your system
     *
     */
    public static ConverterProperties getCustomConverterProperties(List<String> fontDirectories){
        ConverterProperties converterProperties = new ConverterProperties();
        FontProvider fontProvider = new FontProvider();
        fontDirectories.forEach(fontProvider::addDirectory);
        converterProperties.setFontProvider(fontProvider);
        return converterProperties;
    }
}
