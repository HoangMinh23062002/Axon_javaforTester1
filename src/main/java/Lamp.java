public class Lamp {
    boolean lightStatus = false;
    private String roomName;
    public Lamp( String room){
        roomName =room;
        System.out.println("Creating the "+ room+ " room");
    }
    public void printColor(){
        if(lightStatus){
            System.out.println("Light "+roomName+" is on");
        }
        else {
            System.out.println("light " + roomName+" is off");
        }
    }
}
