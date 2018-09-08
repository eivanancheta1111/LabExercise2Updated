package iics.ancheta.jeanroy.labexer3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);
        //setContentView(R.layout.linear_layout);
        //setContentView(R.layout.linear_layout);

        Button ConstraintButton = (Button)findViewById(R.id.buttonConstraint);
        Button LinearButton = (Button)findViewById(R.id.buttonLinear);
        Button RelativeButton = (Button)findViewById(R.id.buttonRelative);


        ConstraintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveConstraint = new Intent (getApplicationContext(), constraint_layout.class);
                startActivity(moveConstraint);
            }
        });

        LinearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveLinear= new Intent (getApplicationContext(), linear_layout.class);
                startActivity(moveLinear);
            }
        });

        RelativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveRelative = new Intent (getApplicationContext(), relative_layout.class);
                startActivity(moveRelative);
            }
        });
    }
}
