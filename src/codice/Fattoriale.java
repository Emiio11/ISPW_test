public class Fattoriale {
    public static int fattoriale (int a){
        int fat = 1;
        do {
            fat = Prodotto.prodotto(fat, a);
            a--;
        } while(a > 0);
        return fat;
    }
}