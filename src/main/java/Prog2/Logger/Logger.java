package Prog2.Logger;

import java.io.*;
import java.security.Timestamp;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


    public class Logger  implements  Loggable{
        private final static String PATH= "C:\\git\\Rookie77\\src\\main\\java\\Prog2\\Logger\\txt";
        private final static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        private final static LocalDateTime now = LocalDateTime.now();

        private String text;

        public Logger() {

        }

        @Override
        public void log(){

            Scanner input = new Scanner(System.in);

            System.out.println("Log in:");

            text = input.next();

            try ( PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(PATH)))) {
                out.println(now.format(FORMATTER)+" "+text);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }