package pl.kk.vivus;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MrHis extends AcceptancePower {

    @Override
    protected double getMaxAllowedAmount() {
        return 500;
    }

    @Override
    protected String getRoleName() {
        return "Mr. Hi's";
    }

    @Override
    public void processRequest(LoanRequest request) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        Date d = new Date();
        String s = sdf.format(d);
        if (s.contains("06") && request.getAmount() < 500) {
            System.out.println(this.getRoleName() + " zatwierdza (m) kwotę: " + request.getAmount() + " pożyczki: "
                    + request.getPurpose());
        } else {
            super.processRequest(request);
//            if (new Random().nextBoolean()) {
//                System.out.println(this.getRoleName() + " zatwierdza (e) kwotę: " + request.getAmount() + " pożyczki: "
//                        + request.getPurpose());
//            } else {
//                System.out.println(this.getRoleName() + " NIE zatwierdza (e) kwotę: " + request.getAmount() + " pożyczki: "
//                        + request.getPurpose());
//            }
    }
}
}