package com.example.xuke.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by xuke on 2015/8/21.
 */
public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
