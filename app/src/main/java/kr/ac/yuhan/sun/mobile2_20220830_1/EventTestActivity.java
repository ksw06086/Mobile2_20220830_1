package kr.ac.yuhan.sun.mobile2_20220830_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EventTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_test);

        //xml에서 설정된 id에 의해서 메인메모리에서 View(Button) 객체를 찾아서 주소값을 반환하는 메소드
        Button btn = findViewById(R.id.btn);
        TextView t2 = findViewById(R.id.text2);
        t2.setText(R.string.btn);

        // class listener implements OnClickListener{
        //      public void onClick(View v){
        //
        //      }
        // }  ==> 인터페이스를 클래스에 넣어서 하는 방법

        // new OnClickListener{
        //      public void onClick(View v){
        //
        //      }
        // } ==> 익명으로 인터페이스 사용

        // this가 안되는 이유 -> this를 부르면 OnClickListener를 부르게 되기에 이벤트테스트액티비티.this로 해야한다.
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast tm = Toast.makeText(EventTestActivity.this, "오늘은 9월 6일 화요일입니다.", Toast.LENGTH_LONG);
                tm.show();
            }
        });

    }
}