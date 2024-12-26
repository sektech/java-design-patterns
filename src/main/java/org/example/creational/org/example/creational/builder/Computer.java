package org.example.creational.org.example.creational.builder;

public class Computer {
    private String hddSize;
    private String ramSize;
    private boolean hasUSBC;

    public Computer(){}

    public Computer(ComputerBuilder builder){
        this.hasUSBC = builder.hasUSBC;
        this.hddSize= builder.hddSize;
        this.ramSize=builder.ramSize;
    }

    public static class ComputerBuilder {
        private String hddSize;
        private String ramSize;
        private boolean hasUSBC;
        public ComputerBuilder(){}
        public ComputerBuilder addHdd(String _hddSize){
            this.hddSize = _hddSize;
            return this;
        }
        public ComputerBuilder addRamSize(String _ramSize){
            this.ramSize = _ramSize;
            return this;
        }
        public ComputerBuilder addUsbC(boolean _hasUsb){
            this.hasUSBC = _hasUsb;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
    @Override
    public String toString() {
        return "ComputerBuilder{" +
                "hddSize='" + hddSize + '\'' +
                ", ramSize='" + ramSize + '\'' +
                ", hasUSBC=" + hasUSBC +
                '}';
    }

    public String getHddSize() {
        return hddSize;
    }

    public String getRamSize() {
        return ramSize;
    }

    public boolean isHasUSBC() {
        return hasUSBC;
    }
}