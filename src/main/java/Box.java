import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Fruit> fruits = new ArrayList<>();

    public void addingFruit(Fruit fruit){
        if(fruits.isEmpty() || fruits.get(0).getClass().equals(fruit.getClass())){
            fruits.add(fruit);
        }else{
            System.out.println("В одну коробку нельзя клать разные фрукты");
        }
    }

    public void addingFruit(Box box){
        if(fruits.isEmpty() || fruits.get(0).getClass().equals(box.getClass())){
            fruits.addAll(box.getFruits());
        }else{
            System.out.println("В одну коробку нельзя клать разные фрукты");
        }
    }

    public List<Fruit> getFruits(){
        List<Fruit> answer = new ArrayList<>();
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
