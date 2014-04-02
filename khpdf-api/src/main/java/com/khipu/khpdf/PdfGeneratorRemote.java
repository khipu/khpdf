package com.khipu.khpdf;

import javax.ejb.Remote;
import java.util.Map;

@Remote
public interface PdfGeneratorRemote {

    public byte[] pdfFromHtml(byte[] html, Map<PdfFields,String> fields) throws DocumentGenerationException;
    public byte[] pdfFromHtmlAndPdf417(byte[] html, Map<PdfFields,String> fields, PDF417Data pdf417data) throws DocumentGenerationException;


}
