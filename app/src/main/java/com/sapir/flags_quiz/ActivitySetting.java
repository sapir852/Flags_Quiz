package com.sapir.flags_quiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.io.IOException;
import java.io.InputStream;

public class ActivitySetting extends AppCompatActivity {
    private ImageButton setting_btn_back;
    private MaterialButton privacy_policy_BTN,TermsOfUse_BTN,about_BTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        findViews();
        initViews();
    }

    private void findViews() {
        setting_btn_back = findViewById(R.id.setting_btn_back);
        privacy_policy_BTN = findViewById(R.id.privacy_policy_BTN);
        TermsOfUse_BTN = findViewById(R.id.TermsOfUse_BTN);
        about_BTN = findViewById(R.id.about_BTN);



    }

    private void initViews() {
        setting_btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        privacy_policy_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHtmlTextDialog(ActivitySetting.this, "privacy_policy.html");
            }
        });
        TermsOfUse_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHtmlTextDialog(ActivitySetting.this, "Terms_of_use.html");
            }
        });
        about_BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openHtmlTextDialog(ActivitySetting.this, "about.html");
            }
        });

    }
    public static void openHtmlTextDialog(Activity activity, String fileNameInAssets) {
        String str = "";
        InputStream is = null;

        try {
            is = activity.getAssets().open(fileNameInAssets);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            str = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(activity);
        materialAlertDialogBuilder.setPositiveButton("Close", null);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            materialAlertDialogBuilder.setMessage(Html.fromHtml(str, Html.FROM_HTML_MODE_LEGACY));
        } else {
            materialAlertDialogBuilder.setMessage(Html.fromHtml(str));
        }

        AlertDialog al = materialAlertDialogBuilder.show();
        TextView alertTextView = al.findViewById(android.R.id.message);
        alertTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}