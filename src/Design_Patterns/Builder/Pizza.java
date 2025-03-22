package Design_Patterns.Builder;

public class Pizza {
    private  String dough;
    private  String sauce;
    private  String topping;

    private Pizza(String dough,String sauce,String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }
    private Pizza(){

    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, and " + topping + " topping.";
    }

    public static class PizzaBuilderP {
        private Pizza p;

        public PizzaBuilderP() {
             p=new Pizza();
        }


        public PizzaBuilderP dough(String dough) {
            this.p.dough = dough;
            return this;
        }

        public PizzaBuilderP sauce(String sauce) {
            this.p.sauce = sauce;
            return this;
        }

        public PizzaBuilderP topping(String topping) {
            this.p.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(p.dough,p.sauce,p.topping);
            //builder pattern prevents to change values of pizza
            //outside without help of pizza builder
        }
    }
}
