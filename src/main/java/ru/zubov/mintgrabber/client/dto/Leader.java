package ru.zubov.mintgrabber.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Leader {
    private int id;
    private int treeId;
    private String address;
    private String ens;
    private int amount;
    private String role;
    private int rank;
}
