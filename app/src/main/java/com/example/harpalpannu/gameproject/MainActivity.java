package com.example.harpalpannu.gameproject;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TableRow;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    long millis = 0;
    EditText[] editTextArray = new EditText[81];
    int[][] shouldBe = new int[9][9];
    TextView textTimer;
    Timer timer = new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textTimer = findViewById(R.id.timer);


        editTextArray[0] = findViewById(R.id.i0);
        editTextArray[1] = findViewById(R.id.i1);
        editTextArray[2] = findViewById(R.id.i2);
        editTextArray[3] = findViewById(R.id.i3);
        editTextArray[4] = findViewById(R.id.i4);
        editTextArray[5] = findViewById(R.id.i5);
        editTextArray[6] = findViewById(R.id.i6);
        editTextArray[7] = findViewById(R.id.i7);
        editTextArray[8] = findViewById(R.id.i8);
        editTextArray[9] = findViewById(R.id.i9);
        editTextArray[10] = findViewById(R.id.i10);
        editTextArray[11] = findViewById(R.id.i11);
        editTextArray[12] = findViewById(R.id.i12);
        editTextArray[13] = findViewById(R.id.i13);
        editTextArray[14] = findViewById(R.id.i14);
        editTextArray[15] = findViewById(R.id.i15);
        editTextArray[16] = findViewById(R.id.i16);
        editTextArray[17] = findViewById(R.id.i17);
        editTextArray[18] = findViewById(R.id.i18);
        editTextArray[19] = findViewById(R.id.i19);
        editTextArray[20] = findViewById(R.id.i20);
        editTextArray[21] = findViewById(R.id.i21);
        editTextArray[22] = findViewById(R.id.i22);
        editTextArray[23] = findViewById(R.id.i23);
        editTextArray[24] = findViewById(R.id.i24);
        editTextArray[25] = findViewById(R.id.i25);
        editTextArray[26] = findViewById(R.id.i26);
        editTextArray[27] = findViewById(R.id.i27);
        editTextArray[28] = findViewById(R.id.i28);
        editTextArray[29] = findViewById(R.id.i29);
        editTextArray[30] = findViewById(R.id.i30);
        editTextArray[31] = findViewById(R.id.i31);
        editTextArray[32] = findViewById(R.id.i32);
        editTextArray[33] = findViewById(R.id.i33);
        editTextArray[34] = findViewById(R.id.i34);
        editTextArray[35] = findViewById(R.id.i35);
        editTextArray[36] = findViewById(R.id.i36);
        editTextArray[37] = findViewById(R.id.i37);
        editTextArray[38] = findViewById(R.id.i38);
        editTextArray[39] = findViewById(R.id.i39);
        editTextArray[40] = findViewById(R.id.i40);
        editTextArray[41] = findViewById(R.id.i41);
        editTextArray[42] = findViewById(R.id.i42);
        editTextArray[43] = findViewById(R.id.i43);
        editTextArray[44] = findViewById(R.id.i44);
        editTextArray[45] = findViewById(R.id.i45);
        editTextArray[46] = findViewById(R.id.i46);
        editTextArray[47] = findViewById(R.id.i47);
        editTextArray[48] = findViewById(R.id.i48);
        editTextArray[49] = findViewById(R.id.i49);
        editTextArray[50] = findViewById(R.id.i50);
        editTextArray[51] = findViewById(R.id.i51);
        editTextArray[52] = findViewById(R.id.i52);
        editTextArray[53] = findViewById(R.id.i53);
        editTextArray[54] = findViewById(R.id.i54);
        editTextArray[55] = findViewById(R.id.i55);
        editTextArray[56] = findViewById(R.id.i56);
        editTextArray[57] = findViewById(R.id.i57);
        editTextArray[58] = findViewById(R.id.i58);
        editTextArray[59] = findViewById(R.id.i59);
        editTextArray[60] = findViewById(R.id.i60);
        editTextArray[61] = findViewById(R.id.i61);
        editTextArray[62] = findViewById(R.id.i62);
        editTextArray[63] = findViewById(R.id.i63);
        editTextArray[64] = findViewById(R.id.i64);
        editTextArray[65] = findViewById(R.id.i65);
        editTextArray[66] = findViewById(R.id.i66);
        editTextArray[67] = findViewById(R.id.i67);
        editTextArray[68] = findViewById(R.id.i68);
        editTextArray[69] = findViewById(R.id.i69);
        editTextArray[70] = findViewById(R.id.i70);
        editTextArray[71] = findViewById(R.id.i71);
        editTextArray[72] = findViewById(R.id.i72);
        editTextArray[73] = findViewById(R.id.i73);
        editTextArray[74] = findViewById(R.id.i74);
        editTextArray[75] = findViewById(R.id.i75);
        editTextArray[76] = findViewById(R.id.i76);
        editTextArray[77] = findViewById(R.id.i77);
        editTextArray[78] = findViewById(R.id.i78);
        editTextArray[79] = findViewById(R.id.i79);
        editTextArray[80] = findViewById(R.id.i80);

//        verticalLines[0] = findViewById(R.id.line1);
//        verticalLines[1] = findViewById(R.id.line2);
//        verticalLines[2] = findViewById(R.id.line3);
//        verticalLines[3] = findViewById(R.id.line4);
//        verticalLines[4] = findViewById(R.id.line5);
//        verticalLines[5] = findViewById(R.id.line6);
//        verticalLines[6] = findViewById(R.id.line7);
//        verticalLines[7] = findViewById(R.id.line8);
//        verticalLines[8] = findViewById(R.id.line9);
//        verticalLines[9] = findViewById(R.id.line10);
//        verticalLines[10] = findViewById(R.id.line11);
//        verticalLines[11] = findViewById(R.id.line12);
//        verticalLines[12] = findViewById(R.id.line13);
//        verticalLines[13] = findViewById(R.id.line14);
//        verticalLines[14] = findViewById(R.id.line15);
//        verticalLines[15] = findViewById(R.id.line16);
//        verticalLines[16] = findViewById(R.id.line17);
//        verticalLines[17] = findViewById(R.id.line18);
//
//
//        editTextArray[10].measure(0,0);
//
//        int lineHeight = editTextArray[10].getMeasuredHeight();
//        Log.d("Hz",lineHeight + " ");
//
//        for(EditText editText : editTextArray){
//            editText.setTextColor(0xFFFFFF);
//        }

        final android.support.v7.app.AlertDialog.Builder mBuilder = new android.support.v7.app.AlertDialog.Builder(this);
        @SuppressLint("InflateParams")
        final View mView = LayoutInflater.from(this).inflate(R.layout.main, null, false);
        mBuilder.setView(mView);
        final android.support.v7.app.AlertDialog dialog = mBuilder.create();
        Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();

        int[][] hard = {
                {8, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 6, 0, 0, 0, 0, 0},
                {0, 7, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 4, 5, 7, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0},
                {0, 9, 0, 0, 0, 0, 4, 0, 0}
        };

        int[][] medium = {
                {8, 1, 0 ,0 ,0 ,3 ,6 ,0 ,9},
                {0, 0, 3, 6, 8, 0, 0, 7, 0},
                {6 ,7, 0, 0, 0, 1, 2, 0, 3},
                {0 ,5, 4, 2, 3, 0, 0, 9, 0},
                {3 ,0 ,0 ,0 ,4, 5, 7 ,0 ,1},
                {2 ,0, 7, 1, 6, 9, 0, 0, 0},
                {0, 2, 0, 9, 0, 4 ,0 ,6 ,8},
                {4 ,0 ,8 ,0 ,2 ,0 ,9 ,0,7},
                {7 ,0 ,6 ,0 ,1 ,8 ,0 ,5 ,0}
        };

        int[][] easy = {
                {8, 1, 2 ,7 ,5 ,3 ,6 ,0 ,0},
                {9, 4, 3, 6, 8, 0, 0, 7, 5},
                {6 ,7, 5, 0, 0, 1, 2, 8, 3},
                {1 ,0, 0, 2, 3, 7, 8, 9, 6},
                {0 ,0 ,9 ,8 ,4, 5, 7 ,2 ,1},
                {2 ,8, 0, 0, 6, 9, 5, 3, 4},
                {5, 2, 1, 9, 0, 0 ,3 ,6 ,8},
                {4 ,3 ,8 ,5 ,2 ,6 ,0 ,0 ,7},
                {7 ,9 ,6 ,3 ,0 ,0 ,4 ,5 ,2}
        };

        mView.findViewById(R.id.easy).setOnClickListener(view -> {
            setBoardMain(easy);
            AsyncTaskRunner runner = new AsyncTaskRunner();
            MyTaskParams params = new MyTaskParams(false,easy);
            try {
                shouldBe = runner.execute(params).get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            dialog.cancel();
        });

        mView.findViewById(R.id.medium).setOnClickListener(view -> {
            setBoardMain(medium);
            AsyncTaskRunner runner = new AsyncTaskRunner();
            MyTaskParams params = new MyTaskParams(false,medium);
            try {
                shouldBe = runner.execute(params).get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            dialog.cancel();
        });

        mView.findViewById(R.id.hard).setOnClickListener(view -> {
            setBoardMain(hard);
            AsyncTaskRunner runner = new AsyncTaskRunner();
            MyTaskParams params = new MyTaskParams(false,hard);
            try {
                shouldBe = runner.execute(params).get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            dialog.cancel();
        });







        View v = new View(this);
        v.setLayoutParams(new TableRow.LayoutParams(1, TableRow.LayoutParams.MATCH_PARENT));

    }

    public void setBoardMain(int[][] board){
        int counter = 0;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (board[row][column] == 0) {
                    editTextArray[counter].setText(String.valueOf(board[row][column]));
                } else {
                    editTextArray[counter].setText(String.valueOf(board[row][column]));
                    editTextArray[counter].setEnabled(false);
                    editTextArray[counter].setTextColor(Color.parseColor("#FF4081"));
                    editTextArray[counter].setBackgroundResource(R.drawable.border_green);
                }
                counter++;
            }
        }

        long mi = System.currentTimeMillis();

        //Set the schedule function
        timer.scheduleAtFixedRate(new TimerTask() {

                                      @Override
                                      public void run() {
                                          millis  = System.currentTimeMillis() - mi;
                                          Date date = new Date(millis);
                                          @SuppressLint("SimpleDateFormat")
                                          SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");
                                          String formatted = formatter.format(date);
                                          textTimer.setText(formatted);
                                      }
                                  },
                0, 900);

    }

    public void Solve(View view) {

        int[][] multi = new int[9][9];
        int counter = 0;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                multi[row][column] =  Integer.parseInt(editTextArray[counter].getText().toString());
                counter++;
            }
            System.out.println();
        }

        AsyncTaskRunner runner = new AsyncTaskRunner();
        MyTaskParams params = new MyTaskParams(true, multi);
        runner.execute(params);

    }

    public void setBoard(int[][] board){
        int counter = 0;
        Log.d("Hz", Arrays.deepToString(board));
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
               editTextArray[counter].setText(String.valueOf(board[row][column]));
                counter++;
            }
            System.out.println();
        }

    }

    public void Check(View view) {

        int[][] multi = new int[9][9];
        int counter = 0;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                multi[row][column] =  Integer.parseInt(editTextArray[counter].getText().toString());
                counter++;
            }
            System.out.println();
        }
//       int [][] copied = new int[9][9];
//
//        for (int row = 0; row < 9; row++) {
//            for (int column = 0; column < 9; column++) {
//                copied[row][column] = multi[row][column];
//                counter++;
//            }
//            System.out.println();
//        }



        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> green =new ArrayList<>();
         counter = 0;
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
               if(multi[row][column] != shouldBe[row][column]){
                   indexes.add(counter);
                   Log.d("Hz",counter + "");
               }else{
                   green.add(counter);
               }
                counter++;
            }
            System.out.println();
        }
        if(indexes.size() == 0){
            final android.support.v7.app.AlertDialog.Builder mBuilder = new android.support.v7.app.AlertDialog.Builder(this);
            @SuppressLint("InflateParams")
            final View mView = LayoutInflater.from(this).inflate(R.layout.resultdialog, null, false);
            mBuilder.setView(mView);
            final android.support.v7.app.AlertDialog dialog = mBuilder.create();
            Objects.requireNonNull(dialog.getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
            dialog.show();
            Date date = new Date(millis);
            @SuppressLint("SimpleDateFormat")
            SimpleDateFormat formatter = new SimpleDateFormat("mm:ss");
            String formatted = formatter.format(date);
            final TextView finalTime = mView.findViewById(R.id.finalTime);
            finalTime.setText(String.format("Time : %s", formatted));
            timer.cancel();
        }
        for (int temp : indexes) {
           editTextArray[temp].setBackgroundResource(R.drawable.border_red);
        }
        for(int temp : green){
            editTextArray[temp].setBackgroundResource(R.drawable.border_green);
        }
        Log.d("Hz", Arrays.deepToString(indexes.toArray()));
    }

    @SuppressLint("StaticFieldLeak")
    private class AsyncTaskRunner extends AsyncTask<MyTaskParams, String, int[][]> {


        ProgressDialog progressDialog;
        boolean notCheck = true;
        @Override
        protected int[][] doInBackground(MyTaskParams... board) {
            BacktrackingAlgorithm solver = new BacktrackingAlgorithm();
            solver.solve(board[0].board);
            notCheck = board[0].notCheck;
            return board[0].board;
        }
        @Override
        protected void onPostExecute(int[][] result) {

            runOnUiThread(() -> {
                if(notCheck) {
                    setBoard(result);
                }

            });
            progressDialog.dismiss();

        }
        @Override
        protected void onPreExecute() {
            progressDialog = ProgressDialog.show(MainActivity.this,
                    "ProgressDialog",
                    "Wait for  seconds");
        }
    }
    private static class MyTaskParams {
        boolean notCheck;
        int[][] board;

        MyTaskParams(boolean notCheck , int[][] board) {
            this.notCheck = notCheck;
            this.board =  board;
        }
    }
}
