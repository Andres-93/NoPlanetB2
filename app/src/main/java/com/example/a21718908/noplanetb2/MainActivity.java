package com.example.a21718908.noplanetb2;

import android.content.DialogInterface;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private SwipeRefreshLayout swipeLayout;
    RelativeLayout mrelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrelativeLayout =findViewById(R.id.rl_main);
        swipeLayout = findViewById(R.id.swipeTxt);
        swipeLayout.setOnRefreshListener(mOnRefreshListener);
    }

    protected SwipeRefreshLayout.OnRefreshListener mOnRefreshListener = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {

            final RelativeLayout mrelativeLayout = findViewById(R.id.rl_main);

            Snackbar snackbar = Snackbar
                    .make(mrelativeLayout, "Se ha refrescado el texto!!", Snackbar.LENGTH_LONG)
                    .setAction("Cancelar", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Snackbar snackbar1 = Snackbar.make(mrelativeLayout, "Refrescado correctamente", Snackbar.LENGTH_SHORT);
                            snackbar1.show();
                        }
                    });

            snackbar.show();
            swipeLayout.setRefreshing(false);

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.itemMenu) {
            Toast toast = Toast.makeText(this, "Has pulsado el item menu", Toast.LENGTH_LONG);
            toast.show();
        } else if (id == R.id.corazon) {

            showAlertDialogButtonClicked(MainActivity.this);

        }

        return super.onOptionsItemSelected(item);
    }

    public void showAlertDialogButtonClicked(MainActivity view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        builder.setTitle("Boton corazon pulsado");
        builder.setMessage("Elije la opcion que te guste");



        builder.setPositiveButton("Adelante!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

}
