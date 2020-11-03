package main.java.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Archive {
    private String archiveId;
    private String archiveName;
    private Date creationDate;
    private String adminId;
    private Integer licensingMode;
    private List<Document> documents;
}
