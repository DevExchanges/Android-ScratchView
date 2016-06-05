package info.devexchanges.scratchview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.cooltechworks.views.ScratchImageView;

public class ScratchImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_image);
        ScratchImageView scratchImageView = (ScratchImageView)findViewById (R.id.sample_image);

        assert scratchImageView != null;
        scratchImageView.setRevealListener(new ScratchImageView.IRevealListener() {
            @Override
            public void onRevealed(ScratchImageView tv) {
                Toast.makeText(ScratchImageActivity.this, "ghgjh", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
