package ru.zubov.mintgrabber.client.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Leaders {
    private String code;
    private ArrayList<Leader> result;
    private String msg;
}
