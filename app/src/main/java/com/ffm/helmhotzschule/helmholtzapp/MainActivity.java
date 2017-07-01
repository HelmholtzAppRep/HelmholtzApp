package com.ffm.helmhotzschule.helmholtzapp;
//EMail: eren2000@hotmail.de
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//EMail: eren2000@hotmail.de
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.InputStream;
import java.io.IOException;
//EMail: eren2000@hotmail.de
public class MainActivity extends AppCompatActivity{
    //EMail: eren2000@hotmail.de
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    /*
        try {
            URL website = new URL("httsp://www.liebigmensaservice.de/speiseplan/sspl-asbhelmholtz-262017.pdf");
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
        File file = new File("C:\\Users\\schueler\\lol.pdf");




        URL website = null;
        try {
            website = new URL("httsp://www.liebigmensaservice.de/speiseplan/sspl-asbhelmholtz-262017.pdf");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        ReadableByteChannel rbc = null;
        try {
            rbc = Channels.newChannel(website.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("lol.pdf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
        URL website = null;
        try {
            website = new URL("httsp://www.liebigmensaservice.de/speiseplan/sspl-asbhelmholtz-262017.pdf");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        InputStream in = null;
        try {
            in = website.openStream();Path target = Paths.get("/lol.pdf");
            Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    }

