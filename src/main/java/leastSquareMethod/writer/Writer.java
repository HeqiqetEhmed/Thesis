package leastSquareMethod.writer;
import org.apache.commons.lang3.RandomStringUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static leastSquareMethod.utils.Constants.RESULT_PATH;

public	 class	 Writer 	{
    public	 void 	writeFile(double[] 	x, double[]	 y, double a, double 	b) 	{
        String xLine= "Deyer Х = " + Arrays.toString(x);
        String yLine= "Deyer y = " + Arrays.toString(y);
        String aLine= "Hesablanmis deyer a = " + a;
        String bLine= "Hesablanmis  deyer b = " + b;
        String result = xLine + "\n" + yLine + "\n" + aLine + "\n" + bLine;

        try {
            Files.write(Paths.get(
                    RESULT_PATH + " (version" + RandomStringUtils.randomNumeric(5) + ").txt"),
                    result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
