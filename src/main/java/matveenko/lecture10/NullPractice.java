package matveenko.lecture10;

import java.util.Optional;

public class NullPractice {
    public static void main(String[] args) {
        Box box = createBox(-5);
        if (box != null) {
            System.out.println(createBox(-5).toString());
        } else {
            System.out.println("Box is not exist");
        }
        Optional<Box> optionalBox = createBoxOptinal(5);
        if(optionalBox.isPresent()){
            System.out.println(optionalBox.get());
        } else {
            System.out.println("Box is not exist");
        }
        box = createBoxNullObj(-5);
        System.out.println(box);
           }
    private static Optional<Box> createBoxOptinal(int size){
        if (size < 0) {
            return Optional.empty();
        } else {
            return  Optional.of(new  Box(size));
        }
    }
    private static Box createBoxNullObj(int size){
        if (size < 0) {
            return new EmptyBox();
        } else {
            return  new Box(size);
        }
    }
    private static Box createBox(int size) {
        if (size < 0) {
            return null;
        } else {
            return new Box(size);
        }
    }
    static class EmptyBox extends Box{
        @Override
        public String toString() {
            return "Box is not exist";
        }
    }
}
