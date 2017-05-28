
public class Factorial {
    public static long factorial(long n) {
        {
            long ret = 1l;
            for (int i = 1; i <= n; ++i) ret *= i;
            return ret;
        }

    }
}

