package hanan.birzeit.comp438.example.map2.Adater;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import hanan.birzeit.comp438.example.map2.Models.CarModel;

public class BackgroundTask {
    ArrayList<CarModel> carModels = new ArrayList<>();
    Context context;
    String URL = "https://my-json-server.typicode.com/HusseinShukri/demo/Cars";

    public  BackgroundTask(Context context){
        this.context=context;
    }

    public ArrayList<CarModel> getList(){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, URL, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i=0;i<response.length();i++){
                            try{
                                JSONObject jsonObject = response.getJSONObject(i);

                                String brand=jsonObject.getString("Brand");
                                String type=jsonObject.getString("Type");
                                String color=jsonObject.getString("Color");
                                String price=jsonObject.getString("Price");
                                String image=jsonObject.getString("image");

                                carModels.add(new CarModel(brand,type,color,price,image));

                            }catch (JSONException e){
                                e.printStackTrace();
                            }
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context,"Some Erorr",Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        });
        MySingleton.getInstance(context).addToRequistQueue(jsonArrayRequest);
        return  carModels;
    }
}
