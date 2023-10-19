package Week9;

public class yl17 {
    // UserInterface interface
    interface UserInterface {
        void update();
    }

    // TextUserInterface class
    static class TextUserInterface implements UserInterface {
        @Override
        public void update() {
            System.out.println("Updating the user interface");
        }
    }

    // ApplicationLogic class
   static class ApplicationLogic {
        private UserInterface ui;

        public ApplicationLogic(UserInterface ui) {
            this.ui = ui;
        }

        public void execute(int howManyTimes) {
            for (int i = 0; i < howManyTimes; i++) {
                System.out.println("The application logic works");
                ui.update();
            }
        }
    }

    // Main class to test the application
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
