package com.tutacode.mylibrary;

import android.content.Context;

/**
 * Created by lucas.saavedra on 31/07/2015.
 */
public class MainClass {
    public String SayHello(Context ctx, String name){
        return String.format(ctx.getString(R.string.helloTemplate),ctx.getString(R.string.helloValue),name);
    }
}
