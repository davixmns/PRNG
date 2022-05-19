package alisson.validacao;

import alisson.LCG;
import alisson.Random;

import java.io.File;
import java.io.FileWriter;

public class Test {
    public static void main(String args[]) {
        Random random = new LCG();
        final int numTest = 1000;

        final String filename = "test_lcg.csv";
        File fileTests = new File(filename);
        long startTime = System.currentTimeMillis();
        try {
            fileTests.createNewFile();
            FileWriter writer = new FileWriter(filename);
            writer.write("number;iteration;\n"); // Header CSV
            for (int i=0; i < 100_000; i++) {
                int number = random.randomInt(1, 60);
                writer.write(number + ";" + i + ";\n");
            }
            writer.close();
            System.out.printf("Se passaram: %d ms", System.currentTimeMillis() - startTime);
        }catch (Exception exp) {
            System.err.println(exp.getMessage());
            exp.printStackTrace();
        }
    }
}
