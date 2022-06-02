package org.zeq;

public class ConvertSeconds {
    public static void main(String[] args) {

                int sec = 86399;
                int x = sec % 60;
                int y = sec / 60;
                int z = y % 60;
                y = y / 60;
                System.out.print( y + ":" + z + ":" + x);



            }
        }

