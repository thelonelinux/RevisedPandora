package com.example.taskroom;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TaskDatabase taskDatabase = Room.databaseBuilder(
                this,
                TaskDatabase.class,
                "task_db")
//                .addMigrations(new Migration(1, 3) {
//                    @Override
//                    public void migrate(@NonNull SupportSQLiteDatabase database) {
//
//                    }
//                }, new Migration(2,3) {
//                    @Override
//                    public void migrate(@NonNull SupportSQLiteDatabase database) {
//
//                    }
//                })
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();

        final TaskDao taskDao = taskDatabase.getTaskDao();

        Button btnInsert = findViewById(R.id.btnInsert);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Insert something to the database
                Task task = new Task("The time is ",
                        String.valueOf(System.currentTimeMillis()),
                        false);

                taskDao.insertTask(task);

                Log.e("TAG" , "onlick :" + taskDao.getAllTasks().size());
            }
        });


    }
}

