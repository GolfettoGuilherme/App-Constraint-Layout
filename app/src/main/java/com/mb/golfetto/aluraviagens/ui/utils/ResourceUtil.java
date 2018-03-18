package com.mb.golfetto.aluraviagens.ui.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import com.mb.golfetto.aluraviagens.ui.model.Pacote;

/**
 * Created by Guilherme on 18/03/2018.
 *
 */

public class ResourceUtil {


    public static Drawable devolveDrawable(Context context,Pacote pacote) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(pacote.getImagem(), "drawable", context.getPackageName());
        return resources.getDrawable(idDoDrawable);
    }
}
