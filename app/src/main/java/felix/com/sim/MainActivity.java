package felix.com.sim;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @SuppressLint("MissingPermission")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TelephonyManager tm = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceId(IMEI 0) = ");
        sb.append(tm.getImei(0));
        sb.append("\n");
        sb.append("DeviceId(IMEI 1) = ");
        sb.append(tm.getImei(1));
        sb.append("\n");
        sb.append("DeviceSoftwareVersion = ");
        sb.append(tm.getDeviceSoftwareVersion());
        sb.append("\n");
        sb.append("Line1Number = ");
        sb.append(tm.getLine1Number());
        sb.append("\n");
        sb.append("NetworkCountryIso = ");
        sb.append(tm.getNetworkCountryIso());
        sb.append("\n");
        sb.append("NetworkOperator = ");
        sb.append(tm.getNetworkOperator());
        sb.append("\n");
        sb.append("NetworkOperatorName = ");
        sb.append(tm.getNetworkOperatorName());
        sb.append("\n");
        sb.append("NetworkType = ");
        sb.append(tm.getNetworkType());
        sb.append("\n");
        sb.append("PhoneType = ");
        sb.append(tm.getPhoneType());
        sb.append("\n");
        sb.append("SimCountryIso = ");
        sb.append(tm.getSimCountryIso());
        sb.append("\n");
        sb.append("SimOperator = ");
        sb.append(tm.getSimOperator());
        sb.append("\n");
        sb.append("SimOperatorName = ");
        sb.append(tm.getSimOperatorName());
        sb.append("\n");
        sb.append("SimSerialNumber = ");
        sb.append(tm.getSimSerialNumber());
        sb.append("\n");
        sb.append("SimState = ");
        sb.append(tm.getSimState());
        sb.append("\n");
        sb.append("SubscriberId(IMSI) = ");
        sb.append(tm.getSubscriberId());
        sb.append("\n");
        sb.append("VoiceMailNumber = ");
        sb.append(tm.getVoiceMailNumber());
        sb.append("\n");

        sb.append("\n");
        sb.append("SystemLanguage = ");
        sb.append(Locale.getDefault().getLanguage());//獲取手機的當前系統語言
        sb.append("\n");
        sb.append("SystemCountry = ");
        sb.append(Locale.getDefault().getCountry());//獲取國家代號
        sb.append("\n");
        sb.append("Language = ");
        sb.append(getResources().getConfiguration().locale.getLanguage());
        sb.append("\n");
        sb.append("Country = ");
        sb.append(getResources().getConfiguration().locale.getCountry());
        sb.append("\n");

        sb.append("\n");
        DisplayMetrics dm = getResources().getDisplayMetrics();
        int w = dm.widthPixels;
        int h = dm.heightPixels;
        sb.append("ScreenSize = ");
        sb.append(w + "*" + h);
        sb.append("\n");

        sb.append("\n");
        sb.append("Device = ");
        sb.append(Build.MODEL);//手機型號
        sb.append("\n");
        sb.append("Osver = ");
        sb.append(Build.VERSION.SDK_INT);//手機SDK版本 - level - 4
        sb.append("\n");
        sb.append("Relea = ");
        sb.append(Build.VERSION.RELEASE);//手機SDK版本 1.6
        sb.append("\n");

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(sb);


    }
}
