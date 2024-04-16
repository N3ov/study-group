package cc.example.demo.version.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCompare {

    public static void main(String[] args) throws IOException {
        Path pathA = Files.createFile(Paths.get("a.txt"));
        Path pathB = Files.createFile(Paths.get("b.txt"));

        Files.write(pathA,"abc".getBytes(), StandardOpenOption.WRITE);
        Files.write(pathB,"abc".getBytes(), StandardOpenOption.WRITE);
        long mismatch = Files.mismatch(pathA, pathB);
        System.out.println(mismatch);

        Files.write(pathA,"123".getBytes(), StandardOpenOption.APPEND);
        Files.write(pathB,"321".getBytes(), StandardOpenOption.APPEND);
        mismatch = Files.mismatch(pathA, pathB);
        System.out.println(mismatch);

        pathA.toFile().deleteOnExit();
        pathB.toFile().deleteOnExit();
    }
}
