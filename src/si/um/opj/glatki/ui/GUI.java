package si.um.opj.glatki.ui;

import si.um.opj.glatki.logic.FoodItem;
import si.um.opj.glatki.logic.FoodItemType;
import si.um.opj.glatki.logic.facility.Location;
import si.um.opj.glatki.logic.facility.Store;
import si.um.opj.glatki.logic.facility.Warehouse;
import si.um.opj.glatki.logic.transport.Truck;
import si.um.opj.glatki.logic.transport.Van;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
    private JTextField bfCCapacity;
    private JRadioButton storeRadioButton;
    private JTextField bfCCity;
    private JButton bfBCreate;
    private JLabel bfLName;
    private JPanel bfAdd;
    private JRadioButton truckRadioButton;
    private JTextField vCRegistrationText;
    private JTextField vCVolumeText;
    private JTextField vCMaxWeightText;
    private JTextField vCAvgSpeedText;
    private JTextField vCLengthText;
    private JButton vBCreate;
    private JTextField vCNOTText;
    private JRadioButton vanRadioButton;
    private JTextField bfCName;
    private JTextField fiCLabelText;
    private JTextField fiCVolumeText;
    private JTextField fiCWeightText;
    private JTextField fiCExpirationDateText;
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
    private JList<Truck> vDTruckList;
    private JList<Van> vDVanList;
    private JButton vBDelete;
    private JList<FoodItem> fiDFoodItemList;
    private JButton fiBDelete;
    private JButton fiBEdit;
    private JList<FoodItem> fiEFoodItemList;
    private JList<Truck> vETruckList;
    private JList<Van> vEVanList;
    private JLabel vTruckEditListText;
    private JLabel vVanEditListText;
    private JRadioButton vTruckRadioButtonEdit;
    private JRadioButton vVanRadioButtonEdit;
    private JList bfWarehouseEditList;
    private JList<Store> bfEStoreList;
    private JLabel bfWarehouseEditListText;
    private JLabel bfStoreEditListText;
    private JRadioButton bfWarehouseRadioButtonEdit;
    private JRadioButton bfStoreRadioButtonEdit;
    private JLabel bfCapacityEditLabel;
    private JTextField bfECapacity;
    private JButton bfBEdit;
    private JLabel bfCapacityLabel;
    private JButton bfBAdd;
    private JLabel vNumberOfTrailersEditLabel;
    private JTextField vENOTText;
    private JLabel vFoodItemTypeEditText;
    private JRadioButton vFreshRadioButtonEdit;
    private JRadioButton vFrozenRadioButtonEdit;
    private JButton vBLoad;
    private JRadioButton fiFreshRadioButtonEdit;
    private JRadioButton fiFrozenRadioButtonEdit;
    private JTextField bfCCountry;
    private JList<Store> bfCStroeList;
    private JList<Warehouse> bfCWarehouseList;
    private JTextField bfECity;
    private JTextField bfECountry;
    private JTextField bfEName;
    private JList<Store> bfDStoreList;
    private JList<FoodItem> bfAFoodItemList;
    private JList<Warehouse> bfAWarehouseList;
    private JList<Warehouse> bfEWarehouseList;
    private JList<Warehouse> bfDWarehouseList;
    private JLabel bfCWarehouseText;
    private JLabel bfCStoreText;
    private JTextField vERegNumberText;
    private JTextField vEVolumeText;
    private JTextField vEMaxWeightText;
    private JTextField vEAvgSpeedText;
    private JList<Warehouse> vLWarehouseList;
    private JList<Truck> vLTruckList;
    private JList<Van> vLVanList;
    private JList<Truck> vUTruckList;
    private JList<Van> vUVanList;
    private JList<Warehouse> vUWarehouseList;
    private JList<Truck> vCTruckList;
    private JList<Van> vCVanList;
    private JLabel vCTruckText;
    private JLabel vCVanText;
    private JList<FoodItem> fiCFoodItemList;
    private JButton vEButton;
    private JButton vBUnload;
    private JTextField fiELabelText;
    private JTextField fiEVolumeText;
    private JTextField fiEWeightText;
    private JTextField fiEExperationDateText;
    private JScrollPane vCTruckSC;
    private JScrollPane vCVanSC;
    private JScrollPane vETruckSC;
    private JScrollPane vEVanSC;
    private JScrollPane bfCWarehouseSC;
    private JScrollPane bfCStoreSC;
    private JScrollPane bfEWarehouseSC;
    private JScrollPane bfEStoreSC;

    //Lists of business facilities, vehicles, and food items
    public ArrayList<Warehouse> warehouseArrayList= new ArrayList<Warehouse>();
    final private DefaultListModel<Warehouse> warehouseModel = new DefaultListModel<Warehouse>();

    public ArrayList<Store> storeArrayList = new ArrayList<Store>();
    final private DefaultListModel<Store> storeModel = new DefaultListModel<Store>();

    public ArrayList<Van> vanArrayList = new ArrayList<Van>();
    final private DefaultListModel<Van> vanModel = new DefaultListModel<Van>();

    public ArrayList<Truck> truckArrayList = new ArrayList<Truck>();
    final private DefaultListModel<Truck> truckModel = new DefaultListModel<Truck>();

    public ArrayList<FoodItem> foodItemArrayList = new ArrayList<FoodItem>();
    final private DefaultListModel<FoodItem> foodItemModel = new DefaultListModel<FoodItem>();


    //this method changes visibility between number of tracks and food item type for vehicle
    private void setVehicleRadioButtonsVisibility(boolean visibility)
        {
            this.freshRadioButtonVehicle.setVisible(visibility);
            this.frozenRadioButtonVehicle.setVisible(visibility);
            this.foodItemTypeLabel.setVisible(visibility);
            this.vCNOTText.setVisible(!visibility);
            this.numberOfTrailersLabel.setVisible(!visibility);
            this.vCTruckText.setVisible(!visibility);
            this.vCTruckList.setVisible(!visibility);
            this.vCVanList.setVisible(visibility);
            this.vCVanText.setVisible(visibility);
            this.vCTruckSC.setVisible(!visibility);
            this.vCVanSC.setVisible(visibility);
        }

        private void setVehicleRadioButtonsVisibilityEdit(boolean visibility)
        {

            this.vFreshRadioButtonEdit.setVisible(visibility);
            this.vFrozenRadioButtonEdit.setVisible(visibility);
            this.vNumberOfTrailersEditLabel.setVisible(!visibility);
            this.vENOTText.setVisible(!visibility);
            this.vEVanList.setVisible(visibility);
            this.vETruckList.setVisible(!visibility);
            this.vVanEditListText.setVisible(visibility);
            this.vTruckEditListText.setVisible(!visibility);
            this.vFoodItemTypeEditText.setVisible(visibility);
            this.vETruckSC.setVisible(!visibility);
            this.vEVanSC.setVisible(visibility);
        }

        private void setpBusinessFacilitiesRadioButtonVisibilityEdit(boolean visibility)
        {
            this.bfEStoreList.setVisible(visibility);
            this.bfStoreEditListText.setVisible(visibility);
            this.bfEWarehouseList.setVisible(!visibility);
            this.bfWarehouseEditListText.setVisible(!visibility);
            this.bfCapacityEditLabel.setVisible(!visibility);
            this.bfECapacity.setVisible(!visibility);
            this.bfEWarehouseSC.setVisible(!visibility);
            this.bfEStoreSC.setVisible(visibility);
        }

        private  void setBusisenessFacilitiesButtonsVisibilityCreate(boolean visibility)
        {

            this.bfCCapacity.setVisible(!visibility);
            this.bfCStroeList.setVisible(visibility);
            this.bfCStoreText.setVisible(visibility);
            this.bfCWarehouseList.setVisible(!visibility);
            this.bfCWarehouseText.setVisible(!visibility);
            this.bfCWarehouseSC.setVisible(!visibility);
            this.bfCStoreSC.setVisible(visibility);
            this.bfCapacityLabel.setVisible(!visibility);
        }
        private void setModelsToLists()
        {
            bfCWarehouseList.setModel(warehouseModel);
            bfEWarehouseList.setModel(warehouseModel);
            bfDWarehouseList.setModel(warehouseModel);
            bfAWarehouseList.setModel(warehouseModel);

            bfCStroeList.setModel(storeModel);
            bfEStoreList.setModel(storeModel);
            bfDStoreList.setModel(storeModel);

            bfAFoodItemList.setModel(foodItemModel);

            vCTruckList.setModel(truckModel);
            vETruckList.setModel(truckModel);
            vDTruckList.setModel(truckModel);
            vLTruckList.setModel(truckModel);
            vUTruckList.setModel(truckModel);

            vCVanList.setModel(vanModel);
            vEVanList.setModel(vanModel);
            vDVanList.setModel(vanModel);
            vLVanList.setModel(vanModel);
            vUVanList.setModel(vanModel);

            vLWarehouseList.setModel(warehouseModel);

            fiCFoodItemList.setModel(foodItemModel);
            fiEFoodItemList.setModel(foodItemModel);
            fiDFoodItemList.setModel(foodItemModel);
        }



    public GUI() {
        setVehicleRadioButtonsVisibility(false);
        setVehicleRadioButtonsVisibilityEdit(false);
        setpBusinessFacilitiesRadioButtonVisibilityEdit(true);
        setBusisenessFacilitiesButtonsVisibilityCreate(true);

        CardLayout cardLayout = (CardLayout)(pannelsPanel.getLayout());
        cardLayout.addLayoutComponent(pBusinessFacilities, "Business Facilities panel");
        cardLayout.addLayoutComponent(pVehicle, "Vehicles panel");
        cardLayout.addLayoutComponent(pFoodItems, "Food Items panel");
        setModelsToLists();

        bBusinessFacilities.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(pannelsPanel, "Business Facilities panel");
            }
        });
        bVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(pannelsPanel, "Vehicles panel");
            }
        });
        bFoodItems.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                cardLayout.show(pannelsPanel, "Food Items panel");
            }
        });
        warehouseRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                storeRadioButton.setSelected(false);
                setBusisenessFacilitiesButtonsVisibilityCreate(false);
            }
        });
        storeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                warehouseRadioButton.setSelected(false);
                setBusisenessFacilitiesButtonsVisibilityCreate(true);
            }
        });

        bfWarehouseRadioButtonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bfStoreRadioButtonEdit.setSelected(false);
                setpBusinessFacilitiesRadioButtonVisibilityEdit(false);
            }
        });
        bfStoreRadioButtonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bfWarehouseRadioButtonEdit.setSelected(false);
                setpBusinessFacilitiesRadioButtonVisibilityEdit(true);
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

        vTruckRadioButtonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vVanRadioButtonEdit.setSelected(false);
                setVehicleRadioButtonsVisibilityEdit(false);
            }
        });
        vVanRadioButtonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vTruckRadioButtonEdit.setSelected(false);
                setVehicleRadioButtonsVisibilityEdit(true);
            }
        });
        vFreshRadioButtonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vFrozenRadioButtonEdit.setSelected(false);
            }
        });
        vFrozenRadioButtonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vFreshRadioButtonEdit.setSelected(false);
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


        fiFreshRadioButtonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fiFrozenRadioButtonEdit.setSelected(false);
            }
        });
        fiFrozenRadioButtonEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fiFreshRadioButtonEdit.setSelected(false);
            }
        });


        bfBCreate.addActionListener(new BusinessFacilityCreate());
        bfBEdit.addActionListener(new BusinessFacilityEdit());
        bfBDelete.addActionListener(new BusinessFacilityDelete(warehouseArrayList, bfDWarehouseList, storeArrayList, bfDStoreList));
        bfBAdd.addActionListener(new BusinessFacilityAddFoodItem());

        vBCreate.addActionListener(new VehicleCreate());
        vEButton.addActionListener(new VehicleEdit());
        vBDelete.addActionListener(new VehicleDelete(vanArrayList, vDVanList, truckArrayList, vDTruckList));
        vBLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(vLWarehouseList.getSelectedIndex()>=0) {
                    int wIndex = vLWarehouseList.getSelectedIndex();

                    Warehouse warehouse = warehouseArrayList.get(wIndex);

                    if(vLVanList.getSelectedIndex()>=0)
                    {
                        int vIndex = vLVanList.getSelectedIndex();
                        Van van = vanArrayList.get(vIndex);
                        try {
                            warehouse.acceptVehicle(van);
                        }
                          catch (Exception e) {
                             e.printStackTrace();
                        }
                    }

                    else if(vLTruckList.getSelectedIndex()>=0)
                    {
                        int tIndex = vLTruckList.getSelectedIndex();
                        Truck truck = truckArrayList.get(tIndex);
                        try {
                        warehouse.acceptVehicle(truck);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    }
                }

            }
        });
        vBUnload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                    if(vUVanList.getSelectedIndex()>=0)
                    {
                        int vIndex = vUVanList.getSelectedIndex();
                        Van van = vanArrayList.get(vIndex);
                       van.unloadFoodItems();
                    }

                    else if(vUTruckList.getSelectedIndex()>=0) {
                        int tIndex = vUTruckList.getSelectedIndex();
                        Truck truck = truckArrayList.get(tIndex);
                        truck.unloadFoodItems();
                    }


            }
        });

        fiBCreate.addActionListener(new FoodItemCreate());
        fiBEdit.addActionListener(new FoodItemEdit());
        fiBDelete.addActionListener(new FoodItemDelete(foodItemArrayList, fiDFoodItemList));



    }



    public static void main(String[] args) {
        int height = 768;
        int width = 1152;


        JFrame frame = new JFrame("Transport application");
        frame.setPreferredSize(new Dimension(width, height));
        frame.setContentPane(new GUI().mainWindow);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }


    private class BusinessFacilityCreate implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String name =bfCName.getText();
            String city= bfCCity.getText();
            String country= bfCCountry.getText();
            Location location= new Location(city, country);


            if(warehouseRadioButton.isSelected())
            {
                int capacity = Integer.parseInt(bfCCapacity.getText());

                Warehouse warehouse = new Warehouse(name, location, capacity);
                warehouseModel.addElement(warehouse);
                warehouseArrayList.add(warehouse);
            }

            else if(storeRadioButton.isSelected())
            {
                Store store= new Store(name, location);
                storeModel.addElement(store);
                storeArrayList.add(store);
            }
        }
    }

    private class BusinessFacilityEdit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String name =bfEName.getText();
            String city= bfECity.getText();
            String country= bfECountry.getText();
            Location location= new Location(city, country);
            if(bfWarehouseRadioButtonEdit.isSelected())
            {
                if(bfEWarehouseList.getSelectedIndex()>=0)
                {
                    int index=bfEWarehouseList.getSelectedIndex();
                    Warehouse warehouse = warehouseArrayList.get(index);

                    warehouse.setName(name);
                    warehouse.setLocation(location);
                }
            }

            else if(bfStoreRadioButtonEdit.isSelected())
            {
                if(bfEStoreList.getSelectedIndex()>=0)
                {
                    int index=bfEStoreList.getSelectedIndex();
                    Store store = storeArrayList.get(index);

                    store.setName(name);
                    store.setLocation(location);
                }
            }
        }
    }




    private class BusinessFacilityAddFoodItem implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(bfAWarehouseList.getSelectedIndex()>=0 && bfAFoodItemList.getSelectedIndex()>=0) {
                int wIndex = bfAWarehouseList.getSelectedIndex();
                int fiIndex = bfAFoodItemList.getSelectedIndex();

                Warehouse warehouse = warehouseArrayList.get(wIndex);
                FoodItem foodItem = foodItemArrayList.get(fiIndex);

                warehouse.addItem(foodItem);
            }
        }
    }

    private class VehicleCreate implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            String regNum  = vCRegistrationText.getText();
            double volume = Double.parseDouble(vCVolumeText.getText());
            double maxWeight = Double.parseDouble(vCMaxWeightText.getText());
            double avgSpeed = Double.parseDouble(vCAvgSpeedText.getText());
            int length = Integer.parseInt(vCLengthText.getText());

            if(truckRadioButton.isSelected())
            {

                 int numbOfTrailers = Integer.parseInt(vCNOTText.getText());
                 Truck truck = new Truck (regNum, volume, maxWeight, avgSpeed, length, numbOfTrailers);

                truckModel.addElement(truck);
                truckArrayList.add(truck);
             }


            else if(vanRadioButton.isSelected())
            {
                FoodItemType foodItemType = null;
                if(freshRadioButtonVehicle.isSelected())
                {
                     foodItemType = FoodItemType.FRESH;
                }
                else if(frozenRadioButtonVehicle.isSelected())
                {
                     foodItemType = FoodItemType.FROZEN;
                }
                Van van= new Van(regNum, volume, maxWeight, avgSpeed, length, foodItemType);
                vanModel.addElement(van);
                vanArrayList.add(van);
            }
        }
    }

    private class VehicleEdit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String regNum = vERegNumberText.getText();
            double volume = Double.parseDouble(vEVolumeText.getText());
            double maxWeight = Double.parseDouble(vEMaxWeightText.getText());
            double avgSpeed = Double.parseDouble(vEAvgSpeedText.getText());

            if (vTruckRadioButtonEdit.isSelected()) {


                if(vETruckList.getSelectedIndex()>=0)
                {
                int numbOfTrailers = Integer.parseInt(vENOTText.getText());
                int index = vETruckList.getSelectedIndex();
                Truck truck=truckArrayList.get(index);

                truck.setRegistrationNumber(regNum);
                truck.setVolume(volume);
                truck.setMaxWeight(maxWeight);
                truck.setAverageSpeed(avgSpeed);
                truck.setNumberOfTrailers(numbOfTrailers);
            }
        }
            else if(vVanRadioButtonEdit.isSelected())
            {
                if(vEVanList.getSelectedIndex()>=0) {
                    FoodItemType foodItemType = null;
                    if (freshRadioButtonVehicle.isSelected()) {
                        foodItemType = FoodItemType.FRESH;
                    } else if (frozenRadioButtonVehicle.isSelected()) {
                        foodItemType = FoodItemType.FROZEN;
                    }
                    int index = vEVanList.getSelectedIndex();
                    Van van = vanArrayList.get(index);
                    van.setRegistrationNumber(regNum);
                    van.setVolume(volume);
                    van.setMaxWeight(maxWeight);
                    van.setAverageSpeed(avgSpeed);
                    van.setFoodItemType(foodItemType);
                }
            }
        }
    }

    private class FoodItemCreate implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            String label =fiCLabelText.getText();
            double volume = Double.parseDouble(fiCVolumeText.getText());
            double weight = Double.parseDouble(fiCWeightText.getText());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
            LocalDate expirationDate= LocalDate.parse(fiCExpirationDateText.getText(), formatter);
            FoodItemType foodItemType=null;

            if(freshRadioButton.isSelected())
            {
                foodItemType=FoodItemType.FRESH;
            }
            else if(frozenRadioButton.isSelected())
            {
                foodItemType=FoodItemType.FROZEN;
            }

            FoodItem foodItem=new FoodItem(label,volume,weight,expirationDate,foodItemType);
            foodItemModel.addElement(foodItem);
            foodItemArrayList.add(foodItem);

        }
    }

    private class FoodItemEdit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(fiEFoodItemList.getSelectedIndex()>=0) {
                String label = fiELabelText.getText();
                double volume = Double.parseDouble(fiEVolumeText.getText());
                double weight = Double.parseDouble(fiEWeightText.getText());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
                LocalDate expirationDate = LocalDate.parse(fiEExperationDateText.getText(), formatter);
                FoodItemType foodItemType = null;
                if (fiFreshRadioButtonEdit.isSelected()) {
                    foodItemType = FoodItemType.FRESH;
                } else if (fiFrozenRadioButtonEdit.isSelected()) {
                    foodItemType = FoodItemType.FROZEN;
                }
                int index = fiEFoodItemList.getSelectedIndex();
                FoodItem foodItem = foodItemArrayList.get(index);

                foodItem.setLabel(label);
                foodItem.setVolume(volume);
                foodItem.setExpirationDate(expirationDate);
                foodItem.setFoodItemType(foodItemType);
            }
        }
    }
}
