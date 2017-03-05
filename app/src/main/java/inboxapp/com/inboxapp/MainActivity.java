package inboxapp.com.inboxapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcvEmailList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvEmailList = (RecyclerView) findViewById(R.id.email_list);

        ArrayList<Email> emails = new ArrayList<>();

        emails.add(new Email(
                "Snoop Dogg",
                "Show de Rap",
                "Cara, estou te mandando tickets para o meu próximo show. Melhor vir.",
                R.drawable.snoop_dogg
        ));

        emails.add(new Email(
                "Britney Spears",
                "Camarim",
                "Estou te convidando pro camarim. Vem no próximo show.",
                R.drawable.britney_spears));

        emails.add(new Email(
                "Eminem",
                "Show",
                "Hey, só estou avisando que mandei os convites VIP para meu próximo show.",
                R.drawable.eminem));

        emails.add(new Email(
                "Connor McGregor",
                "Convite para luta",
                "Estou te convidando para a minha próxima luta na Irlanda.",
                R.drawable.mcgregor));

        emails.add(new Email(
                "Johnny Depp",
                "Participação em filme.",
                "Oi, estou precisando de alguém para participar no meu próximo filme.",
                R.drawable.johnny_depp));

        emails.add(new Email(
                "Sylvester Stallone",
                "Festa na próxima sexta-feira.",
                "Olá, vc está convidado para a minha festa na próxima semana. ",
                R.drawable.sylvester_stallone));

        EmailAdapter emailAdapter = new EmailAdapter(getApplicationContext(), emails);

        rcvEmailList.setAdapter(emailAdapter);
        rcvEmailList.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rcvEmailList.setVisibility(View.VISIBLE);
    }
}
