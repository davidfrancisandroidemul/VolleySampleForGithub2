package com.example.volleysampleforgithub;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HttpStack;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.Volley;

import org.junit.Test;
import org.mockito.Mockito;

public class NetworkCallSampleJavaTest {

    // Doesn't cause any problems
    //interface Tempy extends HttpStack {
    //
    //}

    /**
     * Simple test to reproduce error:
     *   java.lang.NoClassDefFoundError: org/apache/http/StatusLine
     */
    @Test
    public void simpleVolleyTest() {

        //Context context = Mockito.mock(Context.class);

        // These lines dont cause any issues
        Class cls1 = HurlStack.class;
        Class cls2 = Volley.class;
        Class cls3 = HttpStack.class;

        // The following line causes the error: java.lang.NoClassDefFoundError: org/apache/http/StatusLine
        // See also: https://stackoverflow.com/questions/50705527/volley-1-1-dependency-on-org-apache-http
        HurlStack hurlStack = new HurlStack();

        // Don't need this to cause the error
        //RequestQueue queue = Volley.newRequestQueue(context, hurlStack);
    }
}
