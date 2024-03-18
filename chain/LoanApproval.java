package chain;

// Step 1: Handler Interface
interface Authority {
    void processRequest(LoanRequest request);
}

// Step 2: Concrete Handlers
class Teacher implements Authority {
    @Override
    public void processRequest(LoanRequest request) {
    }
}

class DepartmentHead implements Authority {

    @Override
    public void processRequest(LoanRequest request) {
    }
}

class EducationalAdministration implements Authority {

    @Override
    public void processRequest(LoanRequest request) {
    }
}

// Supporting class for loan requests
class LoanRequest {
    private int days;

    public LoanRequest(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}

// Step 3: Client
public class LoanApproval {
    public static void main(String[] args) {
        // Setting up the chain
        Authority teacher = new Teacher();
        Authority departmentHead = new DepartmentHead();
        Authority admin = new EducationalAdministration();

        // Making a request
        LoanRequest request = new LoanRequest(4); // Request for 4 days of leave
        teacher.processRequest(request);
    }
}
