package com.mb.golfetto.aluraviagens.ui.utils;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Guilherme on 18/03/2018.
 *
 */

public class DiasUtil {

    public static void mostraTexto(View viewCriada, int item_pacote_local, String local2) {
        TextView local = viewCriada.findViewById(item_pacote_local);
        local.setText(local2);
    }

}
