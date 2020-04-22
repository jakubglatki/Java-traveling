package si.um.opj.glatki.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JPanel mainWindow;
    private JPanel pBusinessFacilities;
    private JPanel pVehicle;
    private JPanel pFoodItems;
    private JButton bBusinessFacilities;
    private JButton bVehicle;
    private JButton bFoodItems;
    private JPanel pannelsPanel;
    private JPanel buttonsPanel;
    private JTabbedPane tpBusinessFacility;
    private JPanel bfCreate;
    private JPanel bfEdit;
    private JPanel bfDelete;
    private JTabbedPane tpVehicle;
    private JPanel vCreate;
    private JPanel vEdit;
    private JPanel vDelete;
    private JPanel vLoad;
    private JPanel vUnload;
    private JTabbedPane tpFoodItems;
    private JPanel fiCreate;
    private JPanel fiEdit;
    private JPanel fiDelete;
    private JRadioButton warehouseRadioButton;
    private JTextField textField3;
    private JRadioButton storeRadioButton;
    private JTextField textField1;
    private JButton bfBCreate;
    private JLabel bfLName;
    private JPanel bfLoad;
    private JPanel bfUnload;
    private JRadioButton truckRadioButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton vBCreate;
    private JTextField numberOfTrailersTextField;
    private JRadioButton vanRadioButton;
    private JTextField textField2;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JRadioButton freshRadioButton;
    private JRadioButton frozenRadioButton;
    private JButton fiBCreate;
    private JLabel numberOfTrailersLabel;
    private JRadioButton freshRadioButtonVehicle;
    private JRadioButton frozenRadioButtonVehicle;
    private JLabel foodItemTypeLabel;
    private JList bfWarehouseListDelete;
    private JButton bfBDelete;
    private JList bfStoreListDelete;
    private JList vTruckListDelete;
    private JList vVanListDelete;
    private JButton vBDelete;
    private JList fiListDelete;
    private JButton fiBDelete;


    private void setButtonsVisibility(){
        pBusinessFacilities.setVisible(false);
        pVehicle.setVisible(false);
        pFoodItems.setVisible(false);
    }

    //this method changes visibility between number of tracks and food item type for vehicle
    private void setVehicleRadioButtonsVisibility(boolean visibility)
        {
            this.freshRadioButtonVehicle.setVisible(visibility);
            this.frozenRadioButtonVehicle.setVisible(visibility);
            this.foodItemTypeLabel.setVisible(visibility);
            this.numberOfTrailersTextField.setVisible(!visibility);
            this.numberOfTrailersLabel.setVisible(!visibility);
        }

    public GUI() {
        setVehicleRadioButtonsVisibility(false);
        bBusinessFacilities.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setButtonsVisibility();
                pBusinessFacilities.setVisible(true);
            }
        });
        bVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setButtonsVisibility();
                pVehicle.setVisible(true);
            }
        });
        bFoodItems.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setButtonsVisibility();
                pFoodItems.setVisible(true);
            }
        });
        warehouseRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                storeRadioButton.setSelected(false);
            }
        });
        storeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                warehouseRadioButton.setSelected(false);
            }
        });
        truckRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vanRadioButton.setSelected(false);
                setVehicleRadioButtonsVisibility(false);
            }
        });
        vanRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                truckRadioButton.setSelected(false);
                setVehicleRadioButtonsVisibility(true);
            }
        });
        freshRadioButtonVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frozenRadioButtonVehicle.setSelected(false);
            }
        });
        frozenRadioButtonVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                freshRadioButtonVehicle.setSelected(false);
            }
        });
        freshRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frozenRadioButton.setSelected(false);
            }
        });
        frozenRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                freshRadioButton.setSelected(false);
            }
        });
    }

    public static void main(String[] args) {
        int height = 512;
        int width = 768;


        JFrame frame = new JFrame("Transport application");
        frame.setPreferredSize(new Dimension(width, height));
        frame.setContentPane(new GUI().mainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
