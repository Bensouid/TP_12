package com.example.EX1;

import java.io.File;

public class FileUtils {

    public static boolean exists(String path) {
        return new File(path).exists();
    }
}