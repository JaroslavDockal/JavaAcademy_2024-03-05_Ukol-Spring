package com.engeto.ja.spring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {
    public static String loadFile(String path) {
        try {
            return Files.readString(Paths.get(path));
        } catch (IOException e) {
            return "404! Soubor není!";
        }

    }
}
