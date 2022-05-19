
package Controllerpackage;

/**
 *
 * @author Yahia
 */
import Modelpackage.InvoiceHeader;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class HeaderTabelControl extends DefaultTableModel {

    private String[] cloNames = {"INV Num", "Customer Name", "Inv Date", "Total"};
    private ArrayList<InvoiceHeader> invoices;

    public HeaderTabelControl(ArrayList<InvoiceHeader> invoices) {
        this.cloNames = cloNames;
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        if(this.invoices ==null){
         invoices=new  ArrayList<>();
        }
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return cloNames.length;
    }

    @Override
    public void removeRow(int row) {
    invoices.remove(row);
    }
    

    @Override
    public Object getValueAt(int row, int cloume) {

        InvoiceHeader inv = invoices.get(row);
        switch (cloume) {
            case 0:
                return inv.getNum();
            case 1:
                return inv.getCusName();
            case 2:
                return inv.getDate();
            case 3:
                return inv.getInvTotal();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return cloNames[column];
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

}
