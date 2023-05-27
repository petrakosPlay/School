package com.play;

public abstract class SchoolMember 
{
    protected String name;
    protected short floorNumber;
    protected short classNumber;
    protected short currentLocation;

    public String getName() {
        return name;
    }
    public short getFloorNumber() {
        return floorNumber;
    }
    public short getClassNumber() {
        return classNumber;
    }
    public short getCurrentLocation() {
        return currentLocation;
    }

    public abstract void showInfo();


}
