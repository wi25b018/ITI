public class person2 {
    private String name;
    private double weight;
    private double height;


    public person2(){
        name = "UNKNOWN";
        weight = 70;
        height = 1.8;
    }
    public person2(String name, double weight, double height){
        this ();
        setName(name);
        setWeight(weight);
        setHeight(height);
    }
    public person2(person2 other){

        this(other.name, other.weight, other.height);
    }

    public double getBmi(){
        return weight / (height * height);

    }
    public String getName(){
        return name;
    }
    public void setName(String name){

        this.name =name;
    }
    public double getWeight (){

        return weight;
    }
    public void setWeight(double weight){

        if (weight > 0){
            this.weight =weight;
        } else{
            printError("weight"); //sout(" weight  must be >0");

        }
    }
    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        if(height > 0){
            this.height=height;
        } else{
            printError("height"); //sout("height must be >0");
        }
    }
    public String asString(){
        return String.format("name: %s, weight: %.2f, height: %2f m, bmi: %.2f", name, weight, height, getBmi());
    }
    private void printError(String update){
        System.out.println("value for " + update + " must be >0");
    }
}
