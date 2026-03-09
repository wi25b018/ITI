package phase1level1;

public class Person {

    private String name;
    private double weight;
    private double height;

    public Person(){
        name = "unknown";
        weight=70;
        height=1.8;
    }

    public double getBmi(){

        return weight/ (height* height);
    }

    public String getNAme(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        if(weight>0) {
            this.weight = weight;
        }else{
            printError("weight");
        }
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        if(height>0) {
            this.height = height;
        }else {
            printError("height");
        }
    }
    public String asString(){
        return String.format("name: %s, weight: %f kg, height: %f m, bmi: %f", name, weight, height, getBmi());
    }
    private void printError(String update){
        System.out.println("value for" + update + "must be > 0");
    }
}
