package Week8;

public class yl10 {
    public class CivilService implements NationalService {
        private int daysLeft;
    
        public CivilService() {
            this.daysLeft = 362;
        }
    
        @Override
        public int getDaysLeft() {
            return this.daysLeft;
        }
    
        @Override
        public void work() {
            if (this.daysLeft > 0) {
                this.daysLeft--;
            }
        }
    }

    public interface NationalService {
        int getDaysLeft();
        void work();
    }
    
    public class MilitaryService implements NationalService {
        private int daysLeft;
    
        public MilitaryService(int daysLeft) {
            this.daysLeft = daysLeft;
        }
    
        @Override
        public int getDaysLeft() {
            return this.daysLeft;
        }
    
        @Override
        public void work() {
            if (this.daysLeft > 0) {
                this.daysLeft--;
            }
        }
    }
    
    public static void main(String[] args) {
        // Test CivilService
        CivilService civilService = new yl10().new CivilService();
        System.out.println("Civil Service Days Left: " + civilService.getDaysLeft());

        for (int i = 0; i < 362; i++) {
            civilService.work();
        }

        System.out.println("Civil Service Days Left after working: " + civilService.getDaysLeft());

        // Test MilitaryService
        MilitaryService militaryService = new yl10().new MilitaryService(180);
        System.out.println("Military Service Days Left: " + militaryService.getDaysLeft());

        for (int i = 0; i < 180; i++) {
            militaryService.work();
        }

        System.out.println("Military Service Days Left after working: " + militaryService.getDaysLeft());
    }

}
