package general;

import org.junit.Assert;
import org.junit.Test;

import static com.google.common.math.DoubleMath.fuzzyEquals;

public class Java_Refactoring {

    @Test
    public void extractMethod() throws Exception {

    }

    @Test
    public void extractConstant() throws Exception {

    }

    @Test
    public void extractVariable() throws Exception {
        double result = percent(12d, 36d);
        Assert.assertTrue(fuzzyEquals(33.333333d,result,1e-3));

    }

    //inline
    // extract Parameter
    // extract Parameter a.getX() if param a exists already


    // Multiline edit :-o :-) the best


    double percent(double nr, double of) {

        if (fuzzyEquals(0d, of, 1e-8)) {
            return 0;
        } else {
            double v = nr / of * 100;
            return v;
        }
    }
}
