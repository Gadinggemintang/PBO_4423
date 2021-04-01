public class MatrixAksi {
    public static void main(String[] args) {
        System.out.println();
        Matrix A = Matrix.random(3,3);
        System.out.println("Matrix Random A");
        //A.swap(1, 2);
        A.show();

        System.out.println();

        // shouldn't be equal since AB != BA in general
        Matrix B = A.transpose();
        System.out.println("Matrix Random B = transpose(Matrix Random A)");
        B.show();

        System.out.println();

        Matrix C = Matrix.identity(3);
        System.out.println("Matrix Identitas C (3x3)");
        C.show();

        System.out.println();

        Matrix AtambahB = A.plus(B);
        System.out.println("Matrix A + Matrix B");
        AtambahB.show();

        System.out.println();

        Matrix BkaliA = B.times(A);
        System.out.println("Matrix B * Matrix A");
        BkaliA.show();
    }
}
