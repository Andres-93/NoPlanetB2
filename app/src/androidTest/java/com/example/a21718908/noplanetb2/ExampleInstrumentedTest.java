package com.example.a21718908.noplanetb2;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<BLogin> {

    private Button mloginbutton;
    private TextInputEditText etext1;
    private TextInputEditText etext2;

    public ExampleInstrumentedTest() {
        super(BLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        BLogin actividad = getActivity();
        etext1 = actividad.findViewById(R.id.txtNombre);
        etext2 = actividad.findViewById(R.id.txtPass);
        mloginbutton = actividad.findViewById(R.id.btnLogin);

    }

    public void testLoginSignup() {
        TouchUtils.tapView(this, etext1);
        getInstrumentation().sendStringSync("ANDRES");

        TouchUtils.tapView(this, etext2);
        getInstrumentation().sendStringSync("123456789");

        TouchUtils.tapView(this, mloginbutton);

    }


}

