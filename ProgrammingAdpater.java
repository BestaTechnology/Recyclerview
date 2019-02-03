package voice_to_text.sandy148101.com.recyclerviewjson;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingAdpater extends RecyclerView.Adapter<ProgrammingAdpater.ProgrammingViewHolder> {



    private String[] data;

    ProgrammingAdpater(String[] data)
    {

        this.data=data;
    }

    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.list_item_layout,parent,false);
        return new ProgrammingViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder holder, int position) {


        String title = data[position];
        holder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ProgrammingViewHolder extends RecyclerView.ViewHolder {

        ImageView imageIcon;
        TextView txtTitle;


        public ProgrammingViewHolder(View itemView) {

            super(itemView);

            imageIcon = (ImageView)itemView.findViewById(R.id.imageview_id);
            txtTitle = (TextView)itemView.findViewById(R.id.textname_id);

        }
    }
}
