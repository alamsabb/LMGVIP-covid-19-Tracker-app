package com.example.trackit_covid19tracking;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {
    TextView casses,recoverd,death,statenam,active;
    public myviewholder(@NonNull View itemView) {
        super(itemView);
        statenam=(TextView) itemView.findViewById(R.id.StateName);
        casses=(TextView) itemView.findViewById(R.id.cases);
        recoverd=(TextView) itemView.findViewById(R.id.recoverd);
        death=(TextView) itemView.findViewById(R.id.death);
        active=(TextView) itemView.findViewById(R.id.active);

    }
}
