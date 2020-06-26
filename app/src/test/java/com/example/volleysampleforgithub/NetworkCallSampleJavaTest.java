package com.example.volleysampleforgithub;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;

import org.junit.Test;
import org.mockito.Mockito;

public class NetworkCallSampleJavaTest {

    interface Tempy extends HttpStack {

    }

    @Test
    public void simpleVolleyTest() {

        // v0.2
        // Simplest test I can imagine
        Context context = Mockito.mock(Context.class);

        Class cls1 = HurlStack.class;
        Class cls2 = Volley.class;
        Class cls3 = HttpStack.class;

        RequestQueue queue = Volley.newRequestQueue(context, new HurlStack());
    }
}
