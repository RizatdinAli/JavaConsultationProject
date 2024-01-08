package ru.innopolis.java.homework08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MyFileWriter {

    public final String path = "C:/Users/Ali/Documents/JavaConsultationProject/src/ru/innopolis/java/homework08/output.txt";

    public MyFileWriter() {
    }

    public void writeFromLine(List<String> line) throws IOException {
        Path outPath = Paths.get(path);
        Files.write(outPath, line);
    }
}
