class Bill {
    int id, units, charge;
    static int count;

    Bill() {
        count++;
    }

    Bill(int Id, int Units, int Charge) {
        this.id = Id;
        this.units = Units;
        this.charge = Charge;
        count++;
    }

    void printBillDetails() {
        System.out.println("Bill ID: " + id);
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount: " + (units * charge));
    }

    double calculateBillAmount() {
        return (units * charge);
    }

    static int totalBillCount() {
        return count;
    }

    class ElectricityBill extends Bill {
        ElectricityBill(int Id, int Units, int Charge) {
            this.id = Id;
            this.units = Units;
            this.charge = Charge;
            count++;
        }

        ElectricityBill() {
            count++;
        }

        double calculateBillAmount() {
            return (0.02 * units * charge + units * charge);
        }
    }

    class MilkBill extends Bill {
        int suppliercharge = 1000;

        MilkBill(int Id, int Units, int Charge) {
            this.id = Id;
            this.units = Units;
            this.charge = Charge;
            count++;
        }

        MilkBill() {
            count++;
        }

        void printBillDetails() {
            System.out.println("Bill ID: " + id);
            System.out.println("Units Consumed: " + units);
            System.out.println("Bill Amount: " + (units * charge + suppliercharge));
        }

        double calculateBillAmount() {
            return (units * charge + suppliercharge);
        }
    }
}

public class ass{

    public static void main(String[] args) {
        Bill b1 = new Bill(1111, 35, 5);
        Bill.ElectricityBill b2 = new Bill().new ElectricityBill(1112, 40, 5);
        Bill.MilkBill b3 = new Bill().new MilkBill(1113, 45, 5);

        b1.printBillDetails();
        b2.printBillDetails();
        b3.printBillDetails();

        System.out.println("Total number of bills: " + Bill.totalBillCount());
    }
}
