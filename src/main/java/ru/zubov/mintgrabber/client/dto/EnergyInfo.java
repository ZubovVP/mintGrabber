package ru.zubov.mintgrabber.client.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class EnergyInfo {
    private int code;
    private ArrayList<Energy> result;
}
