package com.initialwebtech.billing.system;

import com.initialwebtech.billing.system.desktop.ui.Splash;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SplashRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        Splash splash = new Splash();
        splash.setVisible(true);

        try{
            for(int  i = 0; i <= 25 ; i++)
            {
                Thread.sleep(100);
                splash.progressBar1.setValue(i*4);
                splash.label3.setText(Integer.valueOf(i*4)+"%");
            }
        }catch(Exception e)
        {
            System.out.println("******");
        }
        splash.dispose();
    }
}
