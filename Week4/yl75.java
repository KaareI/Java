package Week4;

public class yl75 {
    public static class DecreasingCounter {
        private int value;   // object variable that remembers the value of the counter
        private int initialValue;

        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
            initialValue = valueAtStart;
        }
    
        public void printValue() {
            System.out.println("value: " + this.value);
        }
    
        public void decrease() {
            // write here the code that decrements the value of counter by one
            if(this.value < 1){
                return;
            }
            this.value--;
        }
    
        // and here the rest of the methods
        public void reset(){
            this.value = 0;
        }

        public void setInitial(){
            this.value = initialValue;
        }

    }

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();

}


}
