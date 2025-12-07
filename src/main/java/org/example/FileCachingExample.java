package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCachingExample {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("example.txt");

        // Ensure the file exists and write some content
        Files.writeString(filePath, "This is a test file.");

        long startTime, endTime;

        // First read: Likely reads from disk
        startTime = System.nanoTime();
        String content = Files.readString(filePath);
        endTime = System.nanoTime();
        System.out.println("First Read (likely from disk): " + (endTime - startTime) + " ns");

        // Second read: Likely reads from the OS memory cache
        startTime = System.nanoTime();
        content = Files.readString(filePath);
        endTime = System.nanoTime();
        System.out.println("Second Read (likely from memory): " + (endTime - startTime) + " ns");

        // Clean up
        Files.delete(filePath);
    }
}
