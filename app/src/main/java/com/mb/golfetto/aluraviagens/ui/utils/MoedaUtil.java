package com.mb.golfetto.aluraviagens.ui.utils;


import com.mb.golfetto.aluraviagens.ui.model.Pacote;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static String formataParaBrasileiro(Pacote pacote) {
        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(new Locale("pt", "br"));
        return formatoBrasileiro.format(pacote.getPreco()).replace("R$", "R$ ");
    }

}
