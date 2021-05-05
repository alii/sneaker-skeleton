package me.alii.skeleton.site.impl;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Alistair Smith
 * @since 05/05/2021
 **/
class SiteLogger {

    private String timestamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) + " ";
    }

    public void warning(String message) {
        message = Ansi.colorize(message, Attribute.YELLOW_TEXT());
        System.out.println(message);
    }

    public void info(String message) {
        message = Ansi.colorize(message, Attribute.BLUE_TEXT());
        System.out.println(timestamp() + message);
    }

    public void error(String message) {
        message = Ansi.colorize(message, Attribute.RED_TEXT());
        System.out.println(timestamp() + message);
    }
}
