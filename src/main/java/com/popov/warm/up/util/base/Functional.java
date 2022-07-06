package com.popov.warm.up.util.base;

import com.popov.warm.up.util.formatter.StringFormatter;
import com.popov.warm.up.util.input.ScannerUtil;
import org.apache.commons.lang3.time.StopWatch;

public class Functional {
    private final int[] repeatsArray = {1000, 10000, 100000};

    private final StopWatch watch = new StopWatch();
    private final StringFormatter stringFormatter = new StringFormatter();
    private final ScannerUtil scannerUtil = new ScannerUtil();


    public void Invoke() {

        final String line = scannerUtil.getStringFromConsoleInput();

        watch.start();
        for(int i = 0; i <= repeatsArray[0]; i++) {
            String reversedLine = stringFormatter.reverseString(line);
        }
        watch.stop();
        System.out.println("elapsed time for 1000: " + watch.toString());

        watch.reset();
        watch.start();
        for(int i = 0; i <= repeatsArray[1]; i++) {
            String reversedLine = stringFormatter.reverseString(line);
        }
        watch.stop();
        System.out.println("elapsed time for 1000: " + watch.toString());


        watch.reset();
        watch.start();
        for(int i = 0; i <= repeatsArray[2]; i++) {
            String reversedLine = stringFormatter.reverseString(line);
        }
        watch.stop();
        System.out.println("elapsed time for 100000: " + watch.toString() + "\n");




        System.out.println("default line: " + line);
        System.out.println("reversed line: " + stringFormatter.reverseString(line));
    }
}
