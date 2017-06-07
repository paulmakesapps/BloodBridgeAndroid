package DialogElement;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.paulmakesapps.paul.bloodbridge.Main;
import com.paulmakesapps.paul.bloodbridge.NamingOpen;

/**
 * Created by Paul on 6/6/2017.
 */
public class DialogTextBox extends NamingOpen {
    public DialogTextBox(){

    }

    public Button playerBtn(String text){
        final Button btn= new Button(this);
        btn.setText("No, it was a Wolf");
        btn.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        btn.setTextSize(24);
        // Set click listener for button
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(DialogTextBox.this, Main.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

                //cut to wolf fight
            }
        });
        return btn;
    }

}
