
package tuan2_luongnhapxuat.helper;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import tuan2_luongnhapxuat.PhanSo;

public class PhanSoHelper {
    
    public static int MAX = 1000;
    public static int MIN = -1000;
    
    public static PhanSo autoGen(){
        int tu = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        int mau = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
        return new PhanSo(tu, mau);
    }
    
    public static ArrayList<PhanSo> autoGenList(int n){
        ArrayList<PhanSo> ls = new ArrayList<PhanSo>();
        for (int i = 0; i < n; i++) {
            ls.add(autoGen());
        }
        return ls;
    }
    
    public static boolean checkSNT(int n){
        if (n <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
    }
}
