package main.java.com.yiyeguhu.example.antivy;

/**
 * Created by tamao on 10/21/15.
 */

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class DateUtils {
    public static void main(String[] args) {

        System.out.println(getLocalCurrentDate());

        String someWhiteSpace = "    \t  \n";
        boolean result = StringUtils.isBlank(someWhiteSpace);
        System.out.println(result);

    }

    private static Date getLocalCurrentDate() {
        return new Date();
    }
}
