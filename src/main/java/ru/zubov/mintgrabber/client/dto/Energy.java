package ru.zubov.mintgrabber.client.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Energy {
    private ArrayList<String> uid;
    private int amount;
    private ArrayList<String> includes;
    private String type;
    private boolean freeze;
    private boolean stealable;
}
