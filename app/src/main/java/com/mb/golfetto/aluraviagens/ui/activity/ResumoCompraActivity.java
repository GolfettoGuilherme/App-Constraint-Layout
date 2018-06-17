package com.mb.golfetto.aluraviagens.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.mb.golfetto.aluraviagens.R;
import com.mb.golfetto.aluraviagens.ui.model.Pacote;
import com.mb.golfetto.aluraviagens.ui.utils.DataUtil;
import com.mb.golfetto.aluraviagens.ui.utils.MoedaUtil;
import com.mb.golfetto.aluraviagens.ui.utils.ResourceUtil;


import static com.mb.golfetto.aluraviagens.ui.activity.PacoteActivityConstantes.CHAVE_PACOTE;

public class ResumoCompraActivity extends AppCompatActivity {

    public static final String TITULO_APP_NAR = "Resumo da compra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_compra);

        setTitle(TITULO_APP_NAR);
        carregaPacoteRecebido();

    }

    private void carregaPacoteRecebido() {
        if (getIntent().hasExtra(CHAVE_PACOTE)) {
            final Pacote pacote = (Pacote) getIntent().getSerializableExtra(CHAVE_PACOTE);
            iniciaComponentes(pacote);
        }
    }

    private void iniciaComponentes(Pacote pacote) {
        ImageView imagem = findViewById(R.id.resumo_compra_imagem_pacote);
        TextView local = findViewById(R.id.resumo_compra_local_pacote);
        TextView data = findViewById(R.id.resumo_compra_data_pacote);
        TextView preco = findViewById(R.id.resumo_compra_preco_pacote);


        imagem.setImageDrawable(ResourceUtil.devolveDrawable(this, pacote));
        local.setText(pacote.getLocal());
        data.setText(DataUtil.periodoEmTexto(pacote.getDias()));
        preco.setText(MoedaUtil.formataParaBrasileiro(pacote));
    }
}
