package com.example.digitalhousefoods;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.digitalhousefoods.adapters.CreditCardAdapter;
import com.example.digitalhousefoods.entidades.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class CreditCardsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_cards);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Credit Cards");

        List<CreditCard> listaCreditCard = new ArrayList<>();
        CreditCard creditCard1 = new CreditCard();
        creditCard1.setNome("MasterCard");
        creditCard1.setNumero("1234  5676  22332  7766");
        listaCreditCard.add(creditCard1);

        CreditCard creditCard2 = new CreditCard();
        creditCard2.setNome("Visa");
        creditCard2.setNumero("2343  6754  3245  0987");
        listaCreditCard.add(creditCard2);

        CreditCard creditCard3 = new CreditCard();
        creditCard3.setNome("RedCard");
        creditCard3.setNumero("8323  8844  2345  9904");
        listaCreditCard.add(creditCard3);

        CreditCard creditCard4 = new CreditCard();
        creditCard4.setNome("BlackCard");
        creditCard4.setNumero("0099  8839  9922  0948");
        listaCreditCard.add(creditCard4);


        listaCreditCard.add(creditCard1);
        listaCreditCard.add(creditCard2);
        listaCreditCard.add(creditCard3);
        listaCreditCard.add(creditCard4);
        listaCreditCard.add(creditCard1);
        listaCreditCard.add(creditCard2);
        listaCreditCard.add(creditCard3);
        listaCreditCard.add(creditCard4);

        CreditCardAdapter creditCardAdapter = new CreditCardAdapter(listaCreditCard, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = findViewById(R.id.credit_card_recycler_view);
        recyclerView.setAdapter(creditCardAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, ProfileActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }
}
