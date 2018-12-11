package com.birgulayaz.yemektariflerijson;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.birgulayaz.yemektariflerijson.Model.Yemek;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    HttpHandler httpHandler;
    ProgressDialog progressDialog;
    ArrayList<Yemek> yemekArrayList;

    private static String URL = "https://github.com/birgullayaz/Yemek-Tarifleri/blob/master/yemekler.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yemekArrayList = new ArrayList<>();

        new getRecipe().execute();
    }

    private class getRecipe extends AsyncTask<Void,Void,Void>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setMessage("Lütfen bekleyiniz ...");
            progressDialog.setCancelable(false);
            progressDialog.show();

            /*
            İşlem başladığında
             */


        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            if(progressDialog.isShowing()){
                progressDialog.dismiss();
            }

            /*
             İşlem tamamlandığında

             */


        }

        @Override
        protected Void doInBackground(Void... params) {

            httpHandler = new HttpHandler();

            String jsonString = httpHandler.makeServiceCall(URL);

            Log.d("JSON_RESPONSE",jsonString);


           if(jsonString !=null){


               try{

                   JSONObject jsonObject= new JSONObject(jsonString);
                   JSONArray yemekler = jsonObject.getJSONArray("yemekler");

                   for (int i =0; i<yemekler.length(); i++){
                       JSONObject yemek = yemekler.getJSONObject(i);
                       int yemekId = yemek.getInt("yemekId");
                       String yemekAdi = yemek.getString("yemek_adi");
                       String yemekAciklama = yemek.getString("yemek_aciklama");
                       String yemekTur = yemek.getString("yemek_tur");
                       String yemekPisirmeSuresi = yemek.getString("yemek_pisirme_suresi");
                       String yemekHazirlamaSuresi = yemek.getString("yemek_hazirlama_suresi");
                       String yemekKisiSayisi = yemek.getString("yemek_kisi_sayisi");
                       String yemekResim = yemek.getString("yemek_resim");
                       String yemekMalzemeler = yemek.getString("yemek_malzemeler");


                       Yemek ymk = new Yemek(
                           yemekId,
                           yemekAdi,
                           yemekAciklama,
                           yemekTur,
                           yemekPisirmeSuresi,
                           yemekHazirlamaSuresi,
                           yemekKisiSayisi,
                           yemekResim,
                           yemekMalzemeler

                       );


                       yemekArrayList.add(ymk);
                   }


               }catch(Exception e) {}

           }
           else{
               Log.d("JSON_RESPONSE","Sayfa kaynağı boş");

           }


            return null;
            /*
            İşlem gerçekleştirilme zamanında
             */
        }
    }


}
