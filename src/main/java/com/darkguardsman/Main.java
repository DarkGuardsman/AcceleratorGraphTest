package com.darkguardsman;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 12/12/18.
 */
public class Main {

    public static void main(String... args) throws IOException {
        final String fileString = args[0];

        //Output read args
        System.out.println("File: " + fileString);


        //Read file
        System.out.println("\nReading File: ");
        List<String> lines = Files.lines(new File(fileString).toPath()).collect(Collectors.toList());
        System.out.println("\t" + lines.size());

        //Get line size
        System.out.println("\nSizing grid: ");
        final int sizeY = lines.size();
        final int sizeX = lines.stream().max(Comparator.comparingInt(line -> line.trim().length())).get().trim().length();
        System.out.println("\tSize X: " + sizeX);
        System.out.println("\tSize Y: " + sizeY);

        //Generate grid and parse data
        System.out.println("\nParsing: ");
        final Grid grid = new Grid(sizeX, sizeY);

        int y = 0;
        for(String line : lines)
        {
            line = line.trim();
            if(line.contains(","))
            {
                String[] split = line.split(",");

            }
            y++;
        }
    }
}
