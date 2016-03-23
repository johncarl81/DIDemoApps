package com.nimbledroid.demo.transfuse;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.nimbledroid.demo.transfuse.manager.TestManager;
import com.nimbledroid.demo.transfuse.manager.TestManager10;
import com.nimbledroid.demo.transfuse.manager.TestManager11;
import com.nimbledroid.demo.transfuse.manager.TestManager12;
import com.nimbledroid.demo.transfuse.manager.TestManager13;
import com.nimbledroid.demo.transfuse.manager.TestManager14;
import com.nimbledroid.demo.transfuse.manager.TestManager15;
import com.nimbledroid.demo.transfuse.manager.TestManager2;
import com.nimbledroid.demo.transfuse.manager.TestManager3;
import com.nimbledroid.demo.transfuse.manager.TestManager4;
import com.nimbledroid.demo.transfuse.manager.TestManager5;
import com.nimbledroid.demo.transfuse.manager.TestManager6;
import com.nimbledroid.demo.transfuse.manager.TestManager7;
import com.nimbledroid.demo.transfuse.manager.TestManager8;
import com.nimbledroid.demo.transfuse.manager.TestManager9;
import com.nimbledroid.demo.transfuse.test.Test1;
import com.nimbledroid.demo.transfuse.test.Test10;
import com.nimbledroid.demo.transfuse.test.Test11;
import com.nimbledroid.demo.transfuse.test.Test12;
import com.nimbledroid.demo.transfuse.test.Test13;
import com.nimbledroid.demo.transfuse.test.Test14;
import com.nimbledroid.demo.transfuse.test.Test15;
import com.nimbledroid.demo.transfuse.test.Test16;
import com.nimbledroid.demo.transfuse.test.Test17;
import com.nimbledroid.demo.transfuse.test.Test18;
import com.nimbledroid.demo.transfuse.test.Test19;
import com.nimbledroid.demo.transfuse.test.Test2;
import com.nimbledroid.demo.transfuse.test.Test20;
import com.nimbledroid.demo.transfuse.test.Test21;
import com.nimbledroid.demo.transfuse.test.Test22;
import com.nimbledroid.demo.transfuse.test.Test23;
import com.nimbledroid.demo.transfuse.test.Test24;
import com.nimbledroid.demo.transfuse.test.Test25;
import com.nimbledroid.demo.transfuse.test.Test26;
import com.nimbledroid.demo.transfuse.test.Test27;
import com.nimbledroid.demo.transfuse.test.Test28;
import com.nimbledroid.demo.transfuse.test.Test29;
import com.nimbledroid.demo.transfuse.test.Test3;
import com.nimbledroid.demo.transfuse.test.Test30;
import com.nimbledroid.demo.transfuse.test.Test31;
import com.nimbledroid.demo.transfuse.test.Test32;
import com.nimbledroid.demo.transfuse.test.Test33;
import com.nimbledroid.demo.transfuse.test.Test34;
import com.nimbledroid.demo.transfuse.test.Test35;
import com.nimbledroid.demo.transfuse.test.Test36;
import com.nimbledroid.demo.transfuse.test.Test37;
import com.nimbledroid.demo.transfuse.test.Test38;
import com.nimbledroid.demo.transfuse.test.Test39;
import com.nimbledroid.demo.transfuse.test.Test4;
import com.nimbledroid.demo.transfuse.test.Test40;
import com.nimbledroid.demo.transfuse.test.Test5;
import com.nimbledroid.demo.transfuse.test.Test6;
import com.nimbledroid.demo.transfuse.test.Test7;
import com.nimbledroid.demo.transfuse.test.Test8;
import com.nimbledroid.demo.transfuse.test.Test9;
import org.androidtransfuse.annotations.Activity;
import org.androidtransfuse.annotations.Intent;
import org.androidtransfuse.annotations.IntentFilter;
import org.androidtransfuse.annotations.IntentType;
import org.androidtransfuse.annotations.Layout;
import org.androidtransfuse.annotations.OnCreate;

import javax.inject.Inject;

@Activity(type = AppCompatActivity.class)
@Layout(R.layout.activity_main)
@IntentFilter({
        @Intent(type = IntentType.ACTION, name = android.content.Intent.ACTION_MAIN),
        @Intent(type = IntentType.CATEGORY, name = android.content.Intent.CATEGORY_LAUNCHER)
})
public class MainActivity  {

    @Inject Test1 mTest1;
    @Inject Test2 mTest2;
    @Inject Test3 mTest3;
    @Inject Test4 mTest4;
    @Inject Test5 mTest5;
    @Inject Test6 mTest6;
    @Inject Test7 mTest7;
    @Inject Test8 mTest8;
    @Inject Test9 mTest9;
    @Inject Test10 mTest10;
    @Inject Test11 mTest11;
    @Inject Test12 mTest12;
    @Inject Test13 mTest13;
    @Inject Test14 mTest14;
    @Inject Test15 mTest15;
    @Inject Test16 mTest16;
    @Inject Test17 mTest17;
    @Inject Test18 mTest18;
    @Inject Test19 mTest19;
    @Inject Test20 mTest20;
    @Inject Test21 mTest21;
    @Inject Test22 mTest22;
    @Inject Test23 mTest23;
    @Inject Test24 mTest24;
    @Inject Test25 mTest25;
    @Inject Test26 mTest26;
    @Inject Test27 mTest27;
    @Inject Test28 mTest28;
    @Inject Test29 mTest29;
    @Inject Test30 mTest30;
    @Inject Test31 mTest31;
    @Inject Test32 mTest32;
    @Inject Test33 mTest33;
    @Inject Test34 mTest34;
    @Inject Test35 mTest35;
    @Inject Test36 mTest36;
    @Inject Test37 mTest37;
    @Inject Test38 mTest38;
    @Inject Test39 mTest39;
    @Inject Test40 mTest40;

    @Inject TestManager mTestManager;
    @Inject TestManager2 mTestManager2;
    @Inject TestManager3 mTestManager3;
    @Inject TestManager4 mTestManager4;
    @Inject TestManager5 mTestManager5;
    @Inject TestManager6 mTestManager6;
    @Inject TestManager7 mTestManager7;
    @Inject TestManager8 mTestManager8;
    @Inject TestManager9 mTestManager9;
    @Inject TestManager10 mTestManager10;
    @Inject TestManager11 mTestManager11;
    @Inject TestManager12 mTestManager12;
    @Inject TestManager13 mTestManager13;
    @Inject TestManager14 mTestManager14;
    @Inject TestManager15 mTestManager15;

    @OnCreate
    protected void onCreate() {

        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest1.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest2.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest3.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest4.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest5.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest6.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest7.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest8.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest9.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest10.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest11.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest12.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest13.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest14.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest15.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest16.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest17.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest18.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest19.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest20.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest21.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest22.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest23.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest24.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest25.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest26.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest27.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest28.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest29.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest30.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest31.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest32.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest33.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest34.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest35.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest36.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest37.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest38.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest39.toString());
        Log.d(MainActivity.class.getSimpleName(), "onCreate(): " + mTest40.toString());

        mTestManager.start();
        mTestManager2.start();
        mTestManager3.start();
        mTestManager4.start();
        mTestManager5.start();
        mTestManager6.start();
        mTestManager7.start();
        mTestManager8.start();
        mTestManager9.start();
        mTestManager10.start();
        mTestManager11.start();
        mTestManager12.start();
        mTestManager13.start();
        mTestManager14.start();
        mTestManager15.start();

    }
}
