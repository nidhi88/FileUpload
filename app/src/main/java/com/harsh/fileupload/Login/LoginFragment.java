package com.harsh.fileupload.Login;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.harsh.fileupload.R;

/**
 * Created by harsh on 3/1/17.
 */

public class LoginFragment extends Fragment {

    public static final String TAG = LoginFragment.class.getName();
    CallBacksLoginFragment mCallBackListener;
    public LoginFragment() {
        super();
    }

    /**
     * Called when a fragment is first attached to its context.
     * {@link #onCreate(Bundle)} will be called after this.
     *
     * @param context
     */
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG,"ATTACHING LOGIN FRAGMENT");
        try {
            mCallBackListener = (CallBacksLoginFragment)context;
        }
        catch (ClassCastException castException){

        }
    }

    /**
     * @param activity
     * @deprecated Use {@link #onAttach(Context)} instead.
     */
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d(TAG,"ATTACHING LOGIN FRAGMENT");
        try {
            mCallBackListener = (CallBacksLoginFragment)activity;
        }
        catch (ClassCastException castException){

        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View loginLayout = inflater.inflate(R.layout.login_screen,container,false);
        Button btnSignUp = (Button)loginLayout.findViewById(R.id.signUpButton);
        btnSignUp.setOnClickListener(new ClickHandler());
        return loginLayout;

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }



    @Override
    public void onResume() {
        super.onResume();
    }

    public interface CallBacksLoginFragment {
        public void showSignup();
    }
    class ClickHandler implements View.OnClickListener {

        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.signUpButton:
                    if (mCallBackListener != null){
                        mCallBackListener.showSignup();
                    }
                    break;
                default:
                    return;
            }

        }
    }

}
