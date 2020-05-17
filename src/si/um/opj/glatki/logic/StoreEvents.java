package si.um.opj.glatki.logic;

import si.um.opj.glatki.logic.exceptions.CapacityExceededException;
import si.um.opj.glatki.logic.exceptions.FoodItemTypeException;
import si.um.opj.glatki.logic.exceptions.VolumeExceededException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StoreEvents {

    public StoreEvents(){};

    public void addInfo(String info)
    {
        try
        {
            FileWriter fileWriter = new FileWriter("info.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime time = LocalDateTime.now();
            bufferedWriter.write("---\n");
            bufferedWriter.write(time.toString());
            bufferedWriter.write("\t" + info);
            bufferedWriter.write("\n---\n");
            bufferedWriter.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void addInfo(Exception e) {
        try {
            FileWriter fileWriter = new FileWriter("info.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime time = LocalDateTime.now();
            bufferedWriter.write("---\n");
            bufferedWriter.write(time.toString());
            bufferedWriter.write("\t" + e.getMessage());
            if (e instanceof VolumeExceededException) {
                VolumeExceededException volumeExceededException= new VolumeExceededException();
                bufferedWriter.write("\n Volume exceeded expection, GRAVITY=WARNING");
                bufferedWriter.write(String.valueOf(volumeExceededException));
            } else if (e instanceof CapacityExceededException) {
                CapacityExceededException capacityExceededException= new CapacityExceededException();
                bufferedWriter.write("\n Capacity exceeded expection, GRAVITY=WARNING");
                bufferedWriter.write(String.valueOf(capacityExceededException));
            } else if (e instanceof FoodItemTypeException) {
                FoodItemTypeException foodItemTypeException= new FoodItemTypeException();
                bufferedWriter.write("\n Food item type expection, GRAVITY=WARNING");
                bufferedWriter.write(String.valueOf(foodItemTypeException));
            }


            bufferedWriter.write("\n\n\n\n");
            bufferedWriter.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
