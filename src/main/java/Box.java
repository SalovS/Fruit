import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box <T extends Fruit>{
    private List<T> fruits = new ArrayList<>();

    public void addingFruit(T fruit){
        fruits.add(fruit);
    }

    public void movingFruits(Box<T> box){
        fruits.addAll((Collection<? extends T>) box.getFruits());
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
