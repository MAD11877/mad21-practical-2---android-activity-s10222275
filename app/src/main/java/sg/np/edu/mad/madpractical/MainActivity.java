package sg.np.edu.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User u1 = new User("Hello World","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",1,false);
        TextView v = findViewById(R.id.textView2);
        TextView username = findViewById(R.id.username);
        v.setText(u1.getDescription());
        username.setText(u1.getName());
        Button button = findViewById(R.id.button6);
        if (u1.getFollowed() == false) {
            button.setText("Follow");
        } else {
            button.setText("Unfollow");
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClick(button,u1);
            }
        });
    }
    public void OnClick(Button button,User u1){
        boolean followstatus = u1.getFollowed();
        if (followstatus == false) {
            button.setText("Unfollow");
            u1.setFollowed(true);
        } else {
            button.setText("Follow");
            u1.setFollowed(false);
        }

    }


}