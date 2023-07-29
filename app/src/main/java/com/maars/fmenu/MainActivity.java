package com.maars.fmenu;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TestMenu();
    }

    /* This code is only for testing purposes */
    /* Make sure to comment/remove this code before building the app to
     * reduce the dex size of the app
     * */
    private void TestMenu() {
        Menu menu = new Menu(this);
        menu.attach();

        menu.Category("Category 1");
        menu.InputNum("InputNum 1", PInteger.of(0));
        menu.InputText("InputText 1", PString.of("Hello World"));
        menu.Button("Button 1", PBoolean.of(false));
        menu.CheckBox("CheckBox 1", PBoolean.of(false));
        menu.Switch("Switch 1", PBoolean.of(false));
        menu.ButtonOnOff("Button 2", PBoolean.of(false));
        menu.SeekBar("SeekBar 1", PInteger.of(0), 0, 100, 5);
        menu.CheckBox("CheckBox 2", PBoolean.of(false));
        menu.ButtonLink("External Link &nearr;", "https://youtu.be/dQw4w9WgXcQ");
        menu.SeekBar("SeekBar 2", PInteger.of(0), -50, 100, 5);
        menu.SeekBar("SeekBar 3", PInteger.of(0), 0, 5);
        menu.RadioButton("Radio Button 1", new String[]{"Option 1", "Option 2", "Option 3"}, PInteger.of(0));

        menu.startCollapse("Collapse 1");

        menu.ButtonAction("Button 3", () -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Alert");
            builder.setMessage("This is an alert");
            builder.setPositiveButton("OK", null);
            builder.show();
        });

        menu.ButtonLink("External Link &nearr;", "https://youtu.be/dQw4w9WgXcQ");
        menu.SeekBar("SeekBar 2", PInteger.of(0), -50, 100, 5);
        menu.SeekBar("SeekBar 3", PInteger.of(0), 0, 5);
        menu.Switch("Switch 1", PBoolean.of(false));

        menu.endCollapse();

        menu.TextView("This is a TextView not fully html supported. <b>bold</b> <i>italic</i> <u>underline</u> <s>strikethrough</s> <font color='red'>color</font> <font size='20'>size</font> <font face='monospace'>face</font> <a href='https://www.google.com'>link</a>");

        menu.SeekBar("SeekBar 2", PInteger.of(0), -50, 100, 5);

        menu.WebTextView("<html><head><style>body{color: white;}</style></head><body>" + "This is WebView, with REAL HTML support!" + "<div style=\"background-color: darkblue; text-align: center;\">Support CSS</div>" + "<marquee style=\"color: green; font-weight:bold;\" direction=\"left\" scrollamount=\"5\" behavior=\"scroll\">This is <u>scrollable</u> text</marquee>" + "</body></html>");

        menu.SeekBar("SeekBar 3", PInteger.of(0), 0, 5);
        menu.RadioButton("Radio Button 1", new String[]{"Option 1", "Option 2", "Option 3"}, PInteger.of(0));
    }
}
