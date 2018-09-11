package recursao;

public class MetodosRecursivos {

    public int calcularSomaArray(int[] array) {
        int result = this.calcularSomaArray(array, 0);
        return result;
    }

    private int calcularSomaArray(int[] array, int indexFrom) {
        int result = 0;

        if (indexFrom != array.length - 1) {
            result = result + this.calcularSomaArray(array, indexFrom + 1);
        }

        return result;
    }

    public long calcularFatorial(int n) {
        long result = 1;

        if (n == 0) {
        } else {
            result = n * this.calcularFatorial(n - 1);
        }

        System.out.println(n + "! = " + result);

        return result;
    }

    public int calcularFibonacci(int n) {
        int result = 1;

        if (n == 2 || n == 1) {
        } else {
            result = this.calcularFibonacci(n - 1) + this.calcularFibonacci(n - 2);
        }

        return result;
    }

    public int countNotNull(Object[] array) {
        int result = this.countNotNull(array, 0);
        return result;
    }

    private int countNotNull(Object[] array, int indexFrom) {
        int result = 0;

        if (array[indexFrom] != null) {
            result++;
        }

        if (indexFrom != array.length - 1) {
            result = result + this.countNotNull(array, indexFrom + 1);
        }

        return result;
    }

    public long potenciaDe2(int expoente) {
        long result = 1;

        if (expoente == 0) {
        } else {
            result = 2 * this.potenciaDe2(expoente - 1);
        }

        return result;
    }

    public double progressaoAritmetica(double termoInicial, double razao, int n) {
        double result = termoInicial;

        if (n == 1) {}
        else {
            result = this.progressaoAritmetica(termoInicial, razao, n - 1) + razao;
        }

        return result;
    }

    public double progressaoGeometrica(double termoInicial, double razao, int n) {
        double result = termoInicial;

        if (n == 1) {}
        else {
            result = this.progressaoAritmetica(termoInicial, razao, n - 1) * razao;
        }

        return result;
    }


}
