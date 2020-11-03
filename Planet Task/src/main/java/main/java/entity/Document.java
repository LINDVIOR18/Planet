package main.java.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Document {
    private String documentId;
    private String documentName;
    private Date archivedDate;
    private Integer documentSize;
    private Archive archive;
}
