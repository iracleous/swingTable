package gr.codehub.swing;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MainApplication {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Fruit gallery");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CustomerGui customerGui  = new CustomerGui();
        jFrame.setContentPane( customerGui.getCustomerPanel());


        jFrame.setSize(500, 500);
        jFrame.setVisible(true);

       JTable jt= customerGui.getTable2();
        jt.setModel( createModel());

    }



    public static  TableModel createModel()
    {

        final String[] names = new String[]{"Id Number", "Category", "Fruit Name"};
        final String[][] data = new String[][]{
                {"I1", "A", "Apple"},
                {"I2", "A", "Orange"},
                {"I3", "B", "Water melon"},
                {"I4", "B", "Strawberry"},
        };
        return new DefaultTableModel(data, names);
    }




}
