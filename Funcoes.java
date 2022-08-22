public class Funcoes {

    public int fa(int n) { // O(n)
        int cont = 0;
        for (int i = 0; i < n; i++) {
            cont++;
        }
        return cont;
    }

    public int fb(int n) { // O(n^2)
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cont++;
            }
        }
        return cont;
    }

    public int fc(int n) { // O(n^2)
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < 2 * i; j++) {
                cont++;
            }
        }
        return cont;
    }

    public int fd(int n) { // O(log n)
        int cont = 0;
        for (int i = 1; i < n; i = i + i) {
            cont++;
        }
        return cont;
    }

    public int fe(int n) {
        int cont = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j = j + j) {
                cont++;
            }
        }
        return cont;
    }

}
