package com.example.annaqin.fiska;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageView;
        import android.widget.LinearLayout;
        import android.widget.TextView;

        import java.util.Random;

public class onePersonActivity extends AppCompatActivity {

    ImageView b1, b2, b3, b4, b5, b6, b7, b8, b9;
    int t1, t2, t3, t4, t5, t6, t7, t8, t9;
    TextView winnerMsg;
    Button playA;
    //int turn;
    int activePlayer;
    int point1;
    int point2;
    boolean end;
    int[] position = {t1, t2, t3, t4, t5, t6, t7, t8, t9};
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_twoperson);
        b1 = (ImageView) findViewById(R.id.imag1);
        b2 = (ImageView) findViewById(R.id.imag2);
        b3 = (ImageView) findViewById(R.id.imag3);
        b4 = (ImageView) findViewById(R.id.imag4);
        b5 = (ImageView) findViewById(R.id.imag5);
        b6 = (ImageView) findViewById(R.id.imag6);
        b7 = (ImageView) findViewById(R.id.imag7);
        b8 = (ImageView) findViewById(R.id.imag8);
        b9 = (ImageView) findViewById(R.id.imag9);

        t1 = Integer.parseInt(b1.getTag().toString());
        t2 = Integer.parseInt(b2.getTag().toString());
        t3 = Integer.parseInt(b3.getTag().toString());
        t4 = Integer.parseInt(b4.getTag().toString());
        t5 = Integer.parseInt(b5.getTag().toString());
        t6 = Integer.parseInt(b6.getTag().toString());
        t7 = Integer.parseInt(b7.getTag().toString());
        t8 = Integer.parseInt(b8.getTag().toString());
        t9 = Integer.parseInt(b9.getTag().toString());

        playA = (Button) findViewById(R.id.playA);
        winnerMsg = (TextView) findViewById(R.id.winnerMsg);
        //turn = 1;
        point1 = 0;
        point2 = 0;
        end = false;
        activePlayer =1;
        intent=getIntent();


        LinearLayout winnerLayout = (LinearLayout) findViewById(R.id.winnerLayout);
        winnerLayout.setVisibility(View.INVISIBLE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1 == 1) {
                    if (activePlayer == 1) {
                        activePlayer=2;
                        System.out.println("qinzhi");
                        b1.setImageResource(R.drawable.blufish);
                        b1.setTag(0);

                        while (true) {
                            computerPlay1();

                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b1.setImageResource(R.drawable.redfish);
                        b1.setTag(10);

                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();

            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t2 == 2) {
                    if (activePlayer == 1) {
                        activePlayer = 2;
                        b2.setImageResource(R.drawable.blufish);
                        activePlayer = 1;
                        b2.setTag(0);
                        while (true) {
                            computerPlay1();
                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b2.setImageResource(R.drawable.redfish);
                        b2.setTag(10);
                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();
            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t3 == 3) {
                    if (activePlayer == 1) {
                        activePlayer = 2;
                        b3.setImageResource(R.drawable.blufish);
                        b3.setTag(0);
                        while (true) {
                            computerPlay1();
                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b3.setImageResource(R.drawable.redfish);
                        b3.setTag(10);
                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t4 == 4) {
                    if (activePlayer == 1) {
                        activePlayer = 2;
                        b4.setImageResource(R.drawable.blufish);
                        b4.setTag(0);
                        while (true) {
                            computerPlay1();
                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b4.setImageResource(R.drawable.redfish);
                        b4.setTag(10);
                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();
            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t5 == 5) {
                    if (activePlayer == 1) {
                        activePlayer = 2;
                        b5.setImageResource(R.drawable.blufish);
                        b5.setTag(0);
                        while (true) {
                            computerPlay1();
                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b5.setImageResource(R.drawable.redfish);
                        b5.setTag(10);
                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();
            }

        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t6 == 6) {
                    if (activePlayer == 1) {
                        activePlayer = 2;
                        b6.setImageResource(R.drawable.blufish);
                        b6.setTag(0);
                        while (true) {
                            computerPlay1();
                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b6.setImageResource(R.drawable.redfish);
                        b6.setTag(10);
                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();
            }

        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t7 == 7) {
                    if (activePlayer == 1) {
                        activePlayer = 2;
                        b7.setImageResource(R.drawable.blufish);
                        b7.setTag(0);
                        while (true) {
                            computerPlay1();
                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b7.setImageResource(R.drawable.redfish);
                        b7.setTag(10);
                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();
            }

        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t8 == 8) {
                    if (activePlayer == 1) {
                        activePlayer = 2;
                        b8.setImageResource(R.drawable.blufish);
                        b8.setTag(0);
                        while (true) {
                            computerPlay1();
                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b8.setImageResource(R.drawable.redfish);
                        b8.setTag(10);
                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();
            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t9 == 9) {
                    if (activePlayer == 1) {
                        activePlayer = 2;
                        b9.setImageResource(R.drawable.blufish);
                        b9.setTag(0);
                        while (true) {
                            computerPlay1();
                        }
                    } else if (activePlayer == 2) {
                        activePlayer = 1;
                        b9.setImageResource(R.drawable.redfish);
                        b9.setTag(10);
                        while (true) {
                            computerPlay2();
                        }
                    }

                }
                endGame();
            }

        });

        playA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAgain(v);
            }
        });

    }


    public void endGame() {

        if (ifWinner() == 0) {
            blueWinner();
        }

        if (ifWinner() == 10) {
            redWinner();
        }

        if (ifWinner() == -1) {
            if (fullBoard()) {
                end = true;
                String msgFull=getResources().getString(R.string.fullBoard);
                winnerMsg.setText(msgFull);
            }
        }

        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            LinearLayout winnerLayout = (LinearLayout) findViewById(R.id.winnerLayout);
            winnerLayout.setVisibility(View.VISIBLE);
        }
    }


    public void blueWinner() {

        //Toast.makeText(MainActivity.this, "Winner Bluefish!", Toast.LENGTH_LONG).show();
        end = true;
        point1++;
        String msgBlu = getResources().getString(R.string.winnerBlue) + point1;
        winnerMsg.setText(msgBlu);
    }

    public void redWinner() {
        //String msg="Winner Redfish!";
        //winnerMsg.setText(msg);
        //Toast.makeText(MainActivity.this, "Winner Redfish!", Toast.LENGTH_LONG).show();
        end = true;
        point2++;
        String msgRed = getResources().getString(R.string.winnerRed)+ point2;
        winnerMsg.setText(msgRed);
    }

    public void playAgain(View view) {
        LinearLayout winnerLayout = (LinearLayout) findViewById(R.id.winnerLayout);
        winnerLayout.setVisibility(View.INVISIBLE);
        b1.setImageResource(R.drawable.fiska);
        b2.setImageResource(R.drawable.fiska);
        b3.setImageResource(R.drawable.fiska);
        b4.setImageResource(R.drawable.fiska);
        b5.setImageResource(R.drawable.fiska);
        b6.setImageResource(R.drawable.fiska);
        b7.setImageResource(R.drawable.fiska);
        b8.setImageResource(R.drawable.fiska);
        b9.setImageResource(R.drawable.fiska);
        b1.setTag(1);
        b2.setTag(2);
        b3.setTag(3);
        b4.setTag(4);
        b5.setTag(5);
        b6.setTag(6);
        b7.setTag(7);
        b8.setTag(8);
        b9.setTag(9);
        end = false;
        activePlayer = 1;
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

    }

    public boolean fullBoard() {

        for (int i = 0; i < 9; i++)
            if (position[i] != 0 && position[i] != 10)
                return false;

        return true;
    }


    public int ifWinner() {
        String t1, t2, t3, t4, t5, t6, t7, t8, t9;
        t1 = b1.getTag().toString();
        t2 = b2.getTag().toString();
        t3 = b3.getTag().toString();
        t4 = b4.getTag().toString();
        t5 = b5.getTag().toString();
        t6 = b6.getTag().toString();
        t7 = b7.getTag().toString();
        t8 = b8.getTag().toString();
        t9 = b9.getTag().toString();

        if (t1.equals("0") && t2.equals("0") && t3.equals("0"))
            return 0;

        else if (t4.equals("0") && t5.equals("0") && t6.equals("0"))
            return 0;

        else if (t7.equals("0") && t8.equals("0") && t9.equals("0"))
            return 0;

        else if (t1.equals("0") && t4.equals("0") && t7.equals("0"))
            return 0;

        else if (t2.equals("0") && t5.equals("0") && t8.equals("0"))
            return 0;

        else if (t3.equals("0") && t6.equals("0") && t9.equals("0"))
            return 0;

        else if (t1.equals("0") && t5.equals("0") && t9.equals("0"))
            return 0;

        else if (t3.equals("0") && t5.equals("0") && t7.equals("0"))
            return 0;

        else if (t1.equals("10") && t2.equals("10") && t3.equals("10"))
            return 10;

        else if (t4.equals("10") && t5.equals("10") && t6.equals("10"))
            return 10;

        else if (t7.equals("10") && t8.equals("10") && t9.equals("10"))
            return 10;

        else if (t1.equals("10") && t4.equals("10") && t7.equals("10"))
            return 10;

        else if (t2.equals("10") && t5.equals("10") && t8.equals("10"))
            return 10;

        else if (t3.equals("10") && t6.equals("10") && t9.equals("10"))
            return 10;

        else if (t1.equals("10") && t5.equals("10") && t9.equals("10"))
            return 10;

        else if (t3.equals("10") && t5.equals("10") && t7.equals("10"))
            return 10;
        else
            return -1;
    }

    public void computerPlay1() {

        Random ranComp = new Random();
        int i = ranComp.nextInt(9);
        System.out.println("hello");
        if (position[i] != 0 && position[i] != 10) {
            switch (i) {
                case 0:
                    b1.setImageResource(R.drawable.redfish);
                    b1.setTag(10);
                    break;
                case 1:
                    b2.setImageResource(R.drawable.redfish);
                    b2.setTag(10);
                    break;
                case 2:
                    b3.setImageResource(R.drawable.redfish);
                    b3.setTag(10);
                    break;
                case 3:
                    b4.setImageResource(R.drawable.redfish);
                    b4.setTag(10);
                    break;
                case 4:
                    b5.setImageResource(R.drawable.redfish);
                    b5.setTag(10);
                    break;
                case 5:
                    b6.setImageResource(R.drawable.redfish);
                    b6.setTag(10);
                    break;
                case 6:
                    b7.setImageResource(R.drawable.redfish);
                    b7.setTag(10);
                    break;
                case 7:
                    b8.setImageResource(R.drawable.redfish);
                    b8.setTag(10);
                    break;
                case 8:
                    b9.setImageResource(R.drawable.redfish);
                    b9.setTag(10);
                    break;
                default:
            }
        }
    }

    public void computerPlay2() {

        Random ranComp = new Random();
        int i = ranComp.nextInt(9);
        System.out.println(i);
        if (position[i] != 0 && position[i] != 10) {
            switch (i) {
                case 0:
                    b1.setImageResource(R.drawable.blufish);
                    b1.setTag(0);
                    break;
                case 1:
                    b2.setImageResource(R.drawable.blufish);
                    b2.setTag(0);
                    break;
                case 2:
                    b3.setImageResource(R.drawable.blufish);
                    b3.setTag(0);
                    break;
                case 3:
                    b4.setImageResource(R.drawable.blufish);
                    b4.setTag(0);
                    break;
                case 4:
                    b5.setImageResource(R.drawable.blufish);
                    b5.setTag(0);
                    break;
                case 5:
                    b6.setImageResource(R.drawable.blufish);
                    b6.setTag(0);
                    break;
                case 6:
                    b7.setImageResource(R.drawable.blufish);
                    b7.setTag(0);
                    break;
                case 7:
                    b8.setImageResource(R.drawable.blufish);
                    b8.setTag(0);
                    break;
                case 8:
                    b9.setImageResource(R.drawable.blufish);
                    b9.setTag(0);
                    break;
                default:

            }

        }
    }
}









