package si.um.opj.glatki.ui;

import si.um.opj.glatki.logic.FoodItem;
import si.um.opj.glatki.logic.facility.Store;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FoodItemDelete implements ActionListener {

    private ArrayList<FoodItem> foodItemArrayList;
    private JList<FoodItem> foodItemJList;

    public FoodItemDelete(ArrayList<FoodItem> foodItemArrayList, JList<FoodItem> fiDFoodItemList) {
        this.foodItemArrayList=foodItemArrayList;
        this.foodItemJList=fiDFoodItemList;
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        DefaultListModel<FoodItem> foodItemModel = (DefaultListModel<FoodItem>) foodItemJList.getModel();

        if (foodItemJList.getSelectedIndex() >= 0) {
            foodItemArrayList.remove(foodItemJList.getSelectedIndex());
            foodItemModel.remove(foodItemJList.getSelectedIndex());
        }
    }
}
