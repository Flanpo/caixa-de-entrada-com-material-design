package inboxapp.com.inboxapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Jelsafa on 03/03/2017.
 */

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailViewHolder>{

    private ArrayList<Email> emails;
    private Context context;

    public EmailAdapter(Context context, ArrayList<Email> emails){
        this.emails = emails;
        this.context = context;
    }

    @Override
    public EmailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.email_item, parent, false);
        EmailViewHolder emailViewHolder = new EmailViewHolder(view);
        return emailViewHolder;
    }

    @Override
    public void onBindViewHolder(EmailViewHolder holder, int position) {
        Email email = emails.get(position);

        holder.txtRemetente.setText(email.getRemetente());
        holder.txtCorpo.setText(email.getCorpo());
        holder.txtTitulo.setText(email.getTitulo());
        holder.imgPerfil.setImageResource(email.getPerfil());
    }

    @Override
    public int getItemCount() {
        return (null != emails ? emails.size() : 0);
    }

    public class EmailViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgPerfil;
        private TextView txtTitulo, txtRemetente, txtCorpo;

        public EmailViewHolder(View itemView) {
            super(itemView);

            this.txtTitulo = (TextView) itemView.findViewById(R.id.email_item_titulo);
            this.txtCorpo = (TextView) itemView.findViewById(R.id.email_item_corpo);
            this.txtRemetente = (TextView) itemView.findViewById(R.id.email_item_remetente);
            this.imgPerfil = (ImageView) itemView.findViewById(R.id.email_item_perfil);

            itemView.setOnClickListener(new EmailOnClickListener());
        }
    }

    class EmailOnClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            RecyclerView parent = (RecyclerView) v.getParent();

            while (parent == null){
                parent = (RecyclerView) parent.getParent();
            }

            int position = parent.getChildAdapterPosition(v);

            Email email = emails.get(position);

            Toast.makeText(context, email.getRemetente(), Toast.LENGTH_SHORT).show();
        }
    }
}
