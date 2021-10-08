package com.example.comparable;

public class Fruit implements Comparable<Fruit>{

    private String fruitName;
    private String fruitDesc;

    private int fruitQTY;


    public Fruit(String fruitDesc, int fruitQTY) {
        this.fruitDesc = fruitDesc;
        this.fruitQTY = fruitQTY;
    }

    public Fruit(String name) {

        this.fruitName = name;


        public String getFruitName () {
            return fruitName;
        }

        public void setFruitName (String fruitName){
            this.fruitName = fruitName;
        }

        public String getFruitDesc () {
            return fruitDesc;
        }

        public void setFruitDesc (String fruitDesc){
            this.fruitDesc = fruitDesc;
        }

        public int getFruitQTY () {
            return fruitQTY;
        }

        public void setFruitQTY ( int fruitQTY){
            this.fruitQTY = fruitQTY;
        }


        @Override
        public int compareTo (Fruit that){

            if (this.fruitName.compareTo(that.fruitName) < 0) {

                return -1;
            } else if (this.fruitName.compareTo(that.fruitName) > 0) {
                return 1;

            } else {
                if (this.fruitQTY < that.fruitQTY) {
                    return 1;
                } else {
                    if (this.fruitQTY > that.fruitQTY) {
                        return -1;
                    }


                }

            }

            return 0;
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append(", fruitDesc='").append(fruitDesc).append('\'');
        sb.append(", fruitQTY=").append(fruitQTY);
        sb.append('}');
        return sb.toString();
    }
}
