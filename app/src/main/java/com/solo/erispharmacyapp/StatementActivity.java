package com.solo.erispharmacyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StatementActivity extends AppCompatActivity {
    TextView AccountNum, AccountName, LastPaidAmount;
    TextView LastPaidDate, AmountOwed, AccountStatus;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statement);

        AccountNum = findViewById(R.id.account_number);
        AccountName = findViewById(R.id.account_name);
        LastPaidAmount = findViewById(R.id.last_payment_amount);
        LastPaidDate = findViewById(R.id.last_payment_date);
        AmountOwed = findViewById(R.id.amount_owed);
        AccountStatus = findViewById(R.id.account_status);

        progressDialog = new ProgressDialog(StatementActivity.this);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<List<Statement>> call = service.getStatements();
        call.enqueue(new Callback<List<Statement>>() {
            @Override
            public void onResponse(Call<List<Statement>> call, Response<List<Statement>> response) {
                progressDialog.dismiss();
                showResult(response.body());
            }

            @Override
            public void onFailure(Call<List<Statement>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(StatementActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showResult(List<Statement> statementList) {

        Statement statement = statementList.get(0);
        AccountNum.setText(String.valueOf(statement.getId()));
        AccountName.setText(statement.getName());
        LastPaidAmount.setText(String.valueOf(statement.getLast_payment_amount()));
        LastPaidDate.setText((statement.getLast_payment_date()));
        AmountOwed.setText(String.valueOf(statement.getAmount_owed()));
        AccountStatus.setText(statement.getAccount_status());
    }

}
