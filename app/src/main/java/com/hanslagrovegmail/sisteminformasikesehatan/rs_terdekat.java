package com.hanslagrovegmail.sisteminformasikesehatan;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class rs_terdekat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rs_terdekat);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyView);
        daftar_rs.ContentAdapter adapter = new daftar_rs.ContentAdapter(recyclerView.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
//                R.layout.recycler_view, container, false);
//        ContentAdapter adapter = new ContentAdapter(recyclerView.getContext());
//        recyclerView.setAdapter(adapter);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambarRS;
        public TextView namaRS;
        public TextView alamat;
        public TextView jarak1;

        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.fragment_daftar_rs, parent, false));
            gambarRS = (ImageView) itemView.findViewById(R.id.gambarRS);
            namaRS = (TextView) itemView.findViewById(R.id.namaRS);
            alamat = (TextView) itemView.findViewById(R.id.alamatRS);
            jarak1 = (TextView) itemView.findViewById(R.id.jarak1);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Context context = v.getContext();
//                    Intent intent = new Intent(context, DetailActivity.class);
//                    intent.putExtra(DetailActivity.EXTRA_POSITION, getAdapterPosition());
//                    context.startActivity(intent);
                }
            });
        }
    }

    /**
     * Adapter to display recycler view.
     */
    public static class ContentAdapter extends RecyclerView.Adapter<daftar_rs.ViewHolder> {
        // Set numbers of List in RecyclerView.
        private static final int LENGTH = 18;

        private final String[] ALAMATRS;
        private final String[] JARAKRS;
        private final String[] NAMARS;
        private final Drawable[] FOTORS;

        public ContentAdapter(Context context) {
            Resources resources = context.getResources();
            NAMARS = resources.getStringArray(R.array.NAMARS);
            ALAMATRS = resources.getStringArray(R.array.ALAMATRS);
            JARAKRS = resources.getStringArray(R.array.JARAKRS);
            TypedArray a = resources.obtainTypedArray(R.array.FOTORS);
            FOTORS = new Drawable[a.length()];
            for (int i = 0; i < FOTORS.length; i++) {
                FOTORS[i] = a.getDrawable(i);
            }
            a.recycle();
        }
        @Override
        public daftar_rs.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new daftar_rs.ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }

        @Override
        public void onBindViewHolder(daftar_rs.ViewHolder holder, int position) {
            holder.gambarRS.setImageDrawable(FOTORS[position % FOTORS.length]);
            holder.namaRS.setText(NAMARS[position % NAMARS.length]);
            holder.alamat.setText(ALAMATRS[position % ALAMATRS.length]);
            holder.jarak1.setText(JARAKRS[position % JARAKRS.length]);
        }

        @Override
        public int getItemCount() {
            return LENGTH;
        }
    }



    public void ke_daftar_rs(View view){
        Intent next = new Intent(rs_terdekat.this, daftar_rs.class);
        startActivity(next);
    }

    public void ke_menu_rs(View view){
        Intent next = new Intent(rs_terdekat.this, menu_rs.class);
        startActivity(next);
    }

}
