package Animals;

public class Dog {
    public String name;
    public String color;
    public float weight;
    public int height;
    public String status;

    public void eat(){}
    public void bark(){
        System.out.println("woff woff");
    }

    public String toGrab(){
        return "ball";
    }

    public String interact(String action){
        if (action.equals("care")){
            this.status = "happy";
        } else {
            this.status = "neutral";
        } return status;
    }
}
