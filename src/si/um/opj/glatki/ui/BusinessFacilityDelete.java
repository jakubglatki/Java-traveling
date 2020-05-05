package si.um.opj.glatki.ui;

import si.um.opj.glatki.logic.facility.Store;
import si.um.opj.glatki.logic.facility.Warehouse;
import si.um.opj.glatki.logic.transport.Truck;
import si.um.opj.glatki.logic.transport.Van;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BusinessFacilityDelete implements ActionListener {
    private ArrayList<Warehouse> warehouseArrayList;
    private ArrayList<Store> storeArrayList;

    private JList<Warehouse> warehouseJList;
    private JList<Store> storeJList;

    public BusinessFacilityDelete(ArrayList<Warehouse> warehouseArrayList, JList<Warehouse> bfDWarehouseList, ArrayList<Store> storeArrayList, JList<Store> bfDStoreList) {
        this.warehouseArrayList=warehouseArrayList;
        this.storeArrayList=storeArrayList;
        this.warehouseJList=bfDWarehouseList;
        this.storeJList=bfDStoreList;
    }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            DefaultListModel<Warehouse> warehouseModel = (DefaultListModel<Warehouse>) warehouseJList.getModel();
            DefaultListModel<Store> storeModel = (DefaultListModel<Store>) storeJList.getModel();

            if(warehouseJList.getSelectedIndex()>=0) {
                warehouseModel.remove(warehouseJList.getSelectedIndex());
                warehouseArrayList.remove(warehouseJList.getSelectedIndex());
            }

            if(storeJList.getSelectedIndex()>=0) {
                storeArrayList.remove(storeJList.getSelectedIndex());
                storeModel.remove(storeJList.getSelectedIndex());
            }

        }

}
