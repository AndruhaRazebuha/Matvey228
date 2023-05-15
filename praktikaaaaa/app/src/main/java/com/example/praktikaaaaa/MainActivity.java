package com.example.praktikaaaaa;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.Fragment;
        import androidx.fragment.app.FragmentTransaction;

        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.FrameLayout;
        import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton list_button, profile_button;
    private FrameLayout frameLayout;
    private OrderWindow orderWindow = new OrderWindow();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_button = findViewById(R.id.uniquelist);
        profile_button = findViewById(R.id.uniqueprofile);

        setNewFragment(orderWindow);

        list_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewFragment(orderWindow);
                Log.d("TAG", "Кнопка нажата");
            }
        });
        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OurProfile ourProfile1 = new OurProfile();
                setNewFragment(ourProfile1);
                Log.d("TAG", "Кнопка нажата");
            }
        });
    }
    private void setNewFragment(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.uniquelayout, fragment);
        ft.commit();
    }
}