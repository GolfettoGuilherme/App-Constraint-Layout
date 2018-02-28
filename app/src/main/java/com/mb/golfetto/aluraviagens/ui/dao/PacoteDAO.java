package com.mb.golfetto.aluraviagens.ui.dao;

import com.mb.golfetto.aluraviagens.ui.model.Pacote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PacoteDAO {

    public List<Pacote> lista(){
        List<Pacote> pacotes = new ArrayList<>(Arrays.asList(
                new Pacote("São Paulo","sao_paulo_sp", 2,new BigDecimal(234.99)),
                new Pacote("Belo Horizonte", "belo_horizonte_mg", 3,new BigDecimal(421.50)),
                new Pacote("Recife", "recife_pe",4,new BigDecimal(754.20)),
                new Pacote("Rio de Janeiro", "rio_de_janeiro_rj",5, new BigDecimal(666.00))
        ));
        return pacotes;
    }
}
