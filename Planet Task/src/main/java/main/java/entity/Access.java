package main.java.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Access {
    private User user;
    private Archive archive;
    private Integer permission;
}
