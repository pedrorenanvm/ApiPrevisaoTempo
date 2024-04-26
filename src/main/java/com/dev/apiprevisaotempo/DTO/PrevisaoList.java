package com.dev.apiprevisaotempo.DTO;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PrevisaoList {
    private List<Previsao> previsaoList;
    public PrevisaoList() {
        previsaoList = new ArrayList<Previsao>();
    }
}
