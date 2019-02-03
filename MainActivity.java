package voice_to_text.sandy148101.com.recyclerviewjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView programminglist = (RecyclerView)findViewById(R.id.Programminglist);

        programminglist.setLayoutManager(new LinearLayoutManager(this));

        String [] languages = {"java","oops","Pyathon","Anchal","Gurwinder","Komal","Pratibha","Krishan","Rupali"};

        programminglist.setAdapter(new ProgrammingAdpater(languages));


    }
}
