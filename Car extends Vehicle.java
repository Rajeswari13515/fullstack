public class Car extends Vehicle{
public void fourwheelerEnabled(){
System.out.println("4 Wheeler");
}
public void applyAcceleration(){
System.out.println("200kmph");
}
public static void main(String[]args){
Car cr=new Car();
cr.applyBrake();
cr.applyHorn();
cr.fourWheelerEnabled();
}
}