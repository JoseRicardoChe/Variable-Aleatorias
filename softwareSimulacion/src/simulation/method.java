package simulation;

import java.util.ArrayList;

public class method {
    
    public ArrayList<arrayListGetSet> poisson(int days) {
        int count = 1;//<---dias
        double mean = 54.1667;//<---media

        ArrayList<arrayListGetSet> arrayList;
        arrayList = new ArrayList<arrayListGetSet>();
        for (int j = 0; j < days; j++) {
            int n = 0;
            double y = 1.0;
            double v = Math.pow(Math.E, -mean);
            arrayListGetSet fila = new arrayListGetSet();
            fila.setN(count++);
            while (y >= v) {
                y = y * Math.random();
                n = n + 1;
            }
            fila.setPx(n);
            arrayList.add(fila);
        }
        return arrayList;
    }
}
