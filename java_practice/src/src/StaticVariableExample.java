public class StaticVariableExample {

        // Static variable
        static int staticVar;

        public static void main(String[] args) {
            StaticVariableExample obj1 = new StaticVariableExample();
            StaticVariableExample obj2 = new StaticVariableExample();

            // Accessing and modifying the static variable using the class name
            StaticVariableExample.staticVar = 10;

            // The change is reflected in both instances
            System.out.println("obj1 staticVar: " + obj1.staticVar); // Output: 10
            System.out.println("obj2 staticVar: " + obj2.staticVar); // Output: 10

            // Modifying the static variable through any instance also affects others
            obj1.staticVar = 20;
            System.out.println("obj2 staticVar after modification through obj1: " + obj2.staticVar); // Output: 20
            System.out.println(StaticVariableExample.staticVar + "hewreer");
        }

}
