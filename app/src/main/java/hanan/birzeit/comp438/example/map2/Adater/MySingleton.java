package hanan.birzeit.comp438.example.map2.Adater;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MySingleton {
    private static MySingleton myInstance ;
    private RequestQueue requestQueue;
    private static Context context;

    public MySingleton(Context context) {
        this.context=context;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue(){

        if (requestQueue==null){
            requestQueue= Volley.newRequestQueue(context.getApplicationContext());
        }
        return requestQueue;
    }

    public static synchronized MySingleton getInstance(Context context){
        if (myInstance==null){
            myInstance=new MySingleton(context);
        }
        return  myInstance;
    }

    public<T> void addToRequistQueue(Request<T> request){
        requestQueue.add(request);
    }
}
