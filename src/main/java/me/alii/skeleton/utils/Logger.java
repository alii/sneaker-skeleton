package me.alii.skeleton.utils;

import com.diogonunes.jcolor.Ansi;
import com.diogonunes.jcolor.Attribute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Alistair Smith
 * @since 05/05/2021
 **/
public class Logger {
    private static String timestamp() {
        String time = new SimpleDateFormat("[HH:mm:ss]").format(new Date());
        return Ansi.colorize(time, Attribute.BOLD()) + " ";
    }

    public static void warning(String message) {
        message = Ansi.colorize(message, Attribute.YELLOW_TEXT());
        System.out.println(message);
    }

    public static void info(String message) {
        message = Ansi.colorize(message, Attribute.BLUE_TEXT());
        System.out.println(timestamp() + message);
    }

    public static void error(String message) {
        message = Ansi.colorize(message, Attribute.RED_TEXT());
        System.out.println(timestamp() + message);
    }
}
