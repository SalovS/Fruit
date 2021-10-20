import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits = new ArrayList<>();

    public void addingFruit(T fruit){
        if(fruits.isEmpty() || fruits.get(0).getClass().equals(fruit.getClass())){
            fruits.add(fruit);
        }else{
            System.out.println("В одну коробку нельзя клать разные фрукты");
        }
    }

    public void movingFruits(Box box){
        if(fruits.isEmpty() || fruits.get(0).getClass().equals(box.getClass())){
            fruits.addAll(box.getFruits());
        }else{
            System.out.println("В одну коробку нельзя клать разные фрукты");
        }
    }

    public List<? extends Fruit> getFruits(){
        List<T> answer = new ArrayList<>();
        answer.addAll(fruits);
        fruits.clear();
        return answer;
    }

    public boolean Compare(Box box){
        return this.getWight() == box.getWight();
    }

    public double getWight(){
        if(fruits.isEmpty()) {
            return 0.0;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }
}
