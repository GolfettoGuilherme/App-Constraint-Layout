package com.mb.golfetto.aluraviagens.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mb.golfetto.aluraviagens.R;
import com.mb.golfetto.aluraviagens.ui.model.Pacote;
import com.mb.golfetto.aluraviagens.ui.utils.MoedaUtil;

import java.math.BigDecimal;

public class PagamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        setTitle("Pagamento");

        Pacote pacoteSaoPaulo = new Pacote("São Paulo", "sao_paulo_sp", 2, new BigDecimal("243.99"));

        TextView preco = findViewById(R.id.pagamento_preco_pacote);
        preco.setText(MoedaUtil.formataParaBrasileiro(pacoteSaoPaulo));

    }
}
