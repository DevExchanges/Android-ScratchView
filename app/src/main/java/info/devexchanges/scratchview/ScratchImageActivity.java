package info.devexchanges.scratchview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.cooltechworks.views.ScratchImageView;

public class ScratchImageActivity extends AppCompatActivity {

    private ScratchImageView scratchImageView;
    private RadioGroup radioGroup;
    private Button btnConfirm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_image);
        btnConfirm = (Button) findViewById(R.id.btn_confirm);
        radioGroup = (RadioGroup) findViewById(R.id.group);
        scratchImageView = (ScratchImageView) findViewById(R.id.sample_image);

        //You must have this listener
        scratchImageView.setRevealListener(new ScratchImageView.IRevealListener() {
            @Override
            public void onRevealed(ScratchImageView scratchImageView) {
                Log.i("Main", "onRevealed");
            }
        });

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!scratchImageView.isRevealed()) {
                    Toast.makeText(ScratchImageActivity.this, "You mus scratch image first", Toast.LENGTH_SHORT).show();
                } else if (radioGroup.getCheckedRadioButtonId() == R.id.nexus) {
                    Toast.makeText(ScratchImageActivity.this, "Confirmed!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ScratchImageActivity.this, "Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
