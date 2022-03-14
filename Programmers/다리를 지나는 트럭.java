/*
 * Programmers coding test practice
 * exercise question(Stack/Queue)(level 2)
 * Problem name : 다리를 지나는 트럭
 */
 
 import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
       Queue<Truck> waiting = new LinkedList<>();
       Queue<Truck> on_bridge = new LinkedList<>();
       int time = 1;
       int bridge_weight = 0;


       // push all waiting trucks
        for(int i = 0; i < truck_weights.length; i++){
            waiting.add(new Truck(truck_weights[i]));
        }


        // add false truck
        for(int i = 0; i < bridge_length-1; i++) {
            on_bridge.add(new Truck(0));
        }

        System.out.println(waiting.size());

        assert waiting.peek() != null;
        bridge_weight += waiting.peek().wegiht;
        on_bridge.add(waiting.remove());

        System.out.println(on_bridge.size());

        while(!on_bridge.isEmpty()){
            int temp = 0;

            if(waiting.isEmpty() && bridge_weight == 0) break;

            if(!waiting.isEmpty()){
                temp = waiting.peek().wegiht;
            }

            if(bridge_weight + temp <= weight){
                bridge_weight -= on_bridge.remove().wegiht;

                if(!waiting.isEmpty()) {
                    on_bridge.add(waiting.remove());
                    bridge_weight += temp;
                } else {
                    on_bridge.add((new Truck(0)));
                }
            } else {
                bridge_weight -= on_bridge.remove().wegiht;

                if(bridge_weight  + temp<= weight && !waiting.isEmpty()){
                    on_bridge.add(waiting.remove());
                    bridge_weight += temp;
                } else {
                    on_bridge.add(new Truck(0));
                }
            }

            time++;
        }

        return time;
    }

 class Truck{

        int wegiht;

        Truck(int w){
            this.wegiht = w;
        }
    }
}
