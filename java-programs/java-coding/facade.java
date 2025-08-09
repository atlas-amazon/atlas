public class Main {
    public static void main(String[] args) {
        System.out.println("Facade Method DP - Structural Design Pattern\n");

        // Create the facade
        MallFacade mallFacade = new MallFacade();

        // Use the simplified interface
        mallFacade.getItems("Fruits");
        mallFacade.payBill("123", "billno-44", 500.0);
    }
}

// Subsystem 1: Store Staff Service
class StoreStaffService {
    public void getItems(String itemName) {
        System.out.println("Store staff fetched item: " + itemName);
    }
}

// Subsystem 2: Billing Counter Service
class BillingCounterService {
    public void payBill(String accountId, String billId, double amount) {
        System.out.println("Bill paid. Account: " + accountId + ", Bill ID: " + billId + ", Amount: ₹" + amount);
    }
}

// Facade Class
class MallFacade {
    private StoreStaffService storeStaffService;
    private BillingCounterService billingCounterService;

    public MallFacade() {
        this.storeStaffService = new StoreStaffService();
        this.billingCounterService = new BillingCounterService();
    }

    public void getItems(String items) {
        storeStaffService.getItems(items);
    }

    public void payBill(String accountId, String billId, double amount) {
        billingCounterService.payBill(accountId, billId, amount);
    }
}