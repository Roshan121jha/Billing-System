package com.initialwebtech.billing.system;

import com.initialwebtech.billing.system.desktop.ui.Login;
import com.initialwebtech.billing.system.desktop.ui.ManageCategory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class BillingSystemApplication extends JFrame{

    public static void main(String[] args) {

        var ctx = new SpringApplicationBuilder(BillingSystemApplication.class)
                .headless(false).run(args);
        var loginCtx = ctx.getBean(ManageCategory.class);

        EventQueue.invokeLater(() -> {
            loginCtx.setVisible(true);
        });
    }
}
