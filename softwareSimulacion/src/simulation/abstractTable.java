package simulation;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class abstractTable extends AbstractTableModel {

    private String[] columnas = {"Days", "Number"};
    private ArrayList<arrayListGetSet> lista;
    
    public abstractTable() {

    }

    public abstractTable(ArrayList<arrayListGetSet> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return this.lista.get(fila).getN();
            case 1:
                return this.lista.get(fila).getPx();
            case 2:
                return this.lista.get(fila).getpX();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int i) {
        return this.columnas[i];
    }
}
