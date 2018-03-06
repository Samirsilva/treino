package com.example.treino;

import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.classes.Estado;

public class Adaptador extends ArrayAdapter<Estado>{

	public Adaptador(Context context, int resource, List<Estado> objects) {
		super(context, resource, objects);

	}

}
