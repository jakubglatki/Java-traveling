package si.um.opj.glatki.ui;

import si.um.opj.glatki.logic.transport.Truck;
import si.um.opj.glatki.logic.transport.Van;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VehicleDelete implements ActionListener {
    private  ArrayList<Van> vanArrayList;
    private ArrayList<Truck> truckArrayList;
    private JList<Van> vanJList;
    private JList<Truck> truckJList;

    public VehicleDelete(ArrayList<Van> vanArrayList, JList<Van> vCVanList, ArrayList<Truck> truckArrayList, JList<Truck> vCTruckList) {
        this.vanArrayList=vanArrayList;
        this.vanJList=vCVanList;
        this.truckArrayList=truckArrayList;
        this.truckJList=vCTruckList;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        DefaultListModel<Van> vanModel = (DefaultListModel<Van>) vanJList.getModel();
        DefaultListModel<Truck> truckModel = (DefaultListModel<Truck>) truckJList.getModel();

        if(vanJList.getSelectedIndex()>=0) {
            vanArrayList.remove(vanJList.getSelectedIndex());
            vanModel.remove(vanJList.getSelectedIndex());
        }

        if(truckJList.getSelectedIndex()>=0) {
            truckArrayList.remove(truckJList.getSelectedIndex());
            truckModel.remove(truckJList.getSelectedIndex());
        }
    }
}
