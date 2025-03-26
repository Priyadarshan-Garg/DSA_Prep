package org.example.entites;

import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private String trainName;
    private int TrainNum;
    private List<List<Integer>> seats;
    Map<String, String> ArrivalTime;
    private List<String> StationNames;
    public Train(){
    }
    public Train(String trainId,String trainName,int trainNum,List<List<Integer>> seats,Map<String,String> arrivalTime,List<String> stationNames){
        this.trainName = trainName;
        this.ArrivalTime=arrivalTime;
        this.seats = seats;
        this.trainId=trainId;
        this.StationNames=stationNames;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public List<String> getStationNames() {
        return StationNames;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public String getTrainId() {
        return trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public int getTrainNum() {
        return TrainNum;
    }

    public Map<String, String> getArrivalTime() {
        return ArrivalTime;
    }

    public void setArrivalTime(Map<String, String> arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public void setStationNames(List<String> stationNames) {
        StationNames = stationNames;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setTrainNum(int trainNum) {
        TrainNum = trainNum;
    }
    public String getTrainInfo(){
            return String.format("Train Id is : %s  and TrainNum is: %s",trainId,TrainNum);
    }
}
