package com.zagoa.grayscale;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (Util.hasPermission(this)) {
            Util.toggleGrayscale(this, !Util.isGrayscaleEnable(this));
            finish();
        } else {
            Dialog dialog = Util.createTipsDialog(this);
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public void onDismiss(DialogInterface dialog) {
                    finish();
                }
            });
            dialog.show();
        }

    }
}
