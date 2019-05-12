package com.example.graphics;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class circle extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(new MyView(this));//creating your own view
    }
    public class MyView extends View{
        public MyView(Context context){//setting the context that holds evry thg
super(context);
        }
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Path path=new Path();
            int x=getWidth();
            int y=getHeight();
            int radius;
            radius=100;
            Paint paint=new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.WHITE);
            canvas.drawPaint(paint);
            paint.setColor(Color.parseColor("#da4747"));
            canvas.drawCircle(x/2,y/2,radius,paint);//location by the centre

            //rectangle
            paint.setColor(Color.parseColor("#FF0000"));
            canvas.drawRect(100,50,300,300,paint);

            //triangle
            Point a=new Point(350,50);
            Point b=new Point(350,50);
            Point c=new Point(550,60);

            path.setFillType(Path.FillType.EVEN_ODD);

            path.lineTo(a.x,a.y);
            path.lineTo(b.x,a.y);
            path.lineTo(c.x,a.y);
            path.lineTo(a.x,a.y);
            path.close();

            canvas.drawPath(path,paint);

        }
    }

    }

