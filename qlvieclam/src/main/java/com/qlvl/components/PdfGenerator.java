/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.components;

import com.cloudinary.Cloudinary;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.qlvl.pojo.Job;
import com.qlvl.service.JobService;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

/**
 *
 * @author Admin
 */
@Component
@PropertySource("classpath:configs.properties")
public class PdfGenerator {

    @Autowired
    private Cloudinary cloudinary;
    @Autowired
    private JobService jobSer;

    @Autowired
    private Environment env;
    

    public void generatPdf(String filePath) throws DocumentException, FileNotFoundException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();
        List<Job> listJob = this.jobSer.getJob(null);

        document.add(new Paragraph("DANH SACH CONG VIEC"));
        PdfPTable table = new PdfPTable(5);
        table.setWidthPercentage(100.0f);
        table.setWidths(new float[]{1.0f, 2.0f, 2.0f, 2.0f, 3.0f});
        table.setSpacingBefore(10);
        Font font = FontFactory.getFont(FontFactory.HELVETICA);
        font.setColor(BaseColor.WHITE);
        PdfPCell cell = new PdfPCell();
        cell.setBackgroundColor(BaseColor.BLUE);
        cell.setPadding(5);

        // write table header
        cell.setPhrase(new Phrase("ID", font));
        table.addCell(cell);
       
        cell.setPhrase(new Phrase("Name Job", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Salary", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Age", font));
        table.addCell(cell);

        cell.setPhrase(new Phrase("Created Date", font));
        table.addCell(cell);
        for (Job j : listJob) {
            table.addCell(j.getId().toString());
            table.addCell(j.getNameJob());
            table.addCell(j.getSalary());
            table.addCell(j.getAge().toString());
            table.addCell(j.getCreatedDate().toString());
        }
        document.add(table);

        document.close();

    }
}
