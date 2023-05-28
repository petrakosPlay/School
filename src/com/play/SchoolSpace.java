package com.play;

public abstract class SchoolSpace
{
    protected final short MAX_CAPACITY;
    protected SchoolMember[] currentMembers;
    protected short currentCapacity;
    protected short getIdx;
    protected short putIdx;

    public SchoolSpace(short maxCapacity)
    {
        MAX_CAPACITY = maxCapacity;
        currentCapacity = getIdx = putIdx = 0;
        currentMembers = new SchoolMember[MAX_CAPACITY];
    }

    public short getCurrentCapacity(){return this.currentCapacity;};
    public boolean isFull() {return currentCapacity == MAX_CAPACITY ? true : false;};
    public boolean isEmpty() {return currentCapacity == 0 ? true : false;};
    
    public abstract void print();
    public abstract boolean enter(SchoolMember schoolMember);
    public abstract SchoolMember exit();
    //public abstract void showInfo();
    public abstract void printCapacity();

}
