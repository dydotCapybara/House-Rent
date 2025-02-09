package com.hspedu.extend_.exercise;

public class Computer {

    private String cpu;
    private String memory;
    private String disk;
    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
    //返回Computer详细信息
    public String getDetails(){
        return "CPU: " + this.cpu + "\nMemory: " + this.memory + "\nDisk: " + this.disk;
    }
}
