package gr.codehub.swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class CustomerGui {
    private JPanel customerPanel;
    private JTable table2;
    private JButton addRowButton;
    private JButton backButton;
    private JButton deleteRowButton;
    private JButton button4;

    public CustomerGui() {
        addRowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table2.getModel();
                model.addRow(new Object[]{"v1", "v2", "v3"});
            }
        });
        deleteRowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultTableModel model = (DefaultTableModel) table2.getModel();
                int[] rows = table2.getSelectedRows();
                for (int i = 0; i < rows.length; i++) {
                    model.removeRow(rows[i] - i);
                }


            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DefaultTableModel model = (DefaultTableModel) table2.getModel();
                int[] rows = table2.getSelectedRows();
                for (int indexRow = 0; indexRow < rows.length; indexRow++) {

                    //String text = table2.getModel().getValueAt(indexRow, 0).toString();

                    Vector<String> rowData = (Vector<String>) model.getDataVector().elementAt(rows[indexRow]);

                    Fruit fruit = new Fruit(rowData.elementAt(0), rowData.elementAt(1),rowData.elementAt(2));


                   // JOptionPane.showMessageDialog(null, rowData);
                    JOptionPane.showMessageDialog(null, fruit);




                }


            }
        });
    }

    public JTable getTable2() {
        return table2;
    }

    public void setTable2(JTable table2) {
        this.table2 = table2;
    }

    public JPanel getCustomerPanel() {
        return customerPanel;
    }
}
