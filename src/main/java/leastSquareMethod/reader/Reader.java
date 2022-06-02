package	leastSquareMethod.reader;

import	org.apache.commons.lang3.ArrayUtils;

import	java.io.IOException;
import	java.nio.file.Files;
import	java.nio.file.Paths;

public  class Reader	 {
    public 	double[]  readFile(String  filePath)	 {
        try	 {
            return	 ArrayUtils.toPrimitive(Files.lines(Paths.get(filePath))
                    .map(Double::parseDouble).toArray(Double[]::new));
        }  catch (IOException e)	 {
            e.printStackTrace();
        }
        return  new	 double[0];
    }
}
