package com.mylabs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsApp
{

    public static void main(String[] args)
    {
         List<Integer> numbers = new ArrayList<Integer>();
         List<MySecondNumber> secondList = new ArrayList<>();

         secondList.add(new MySecondNumber(78));
         secondList.add(new MySecondNumber(97));
         secondList.add(new MySecondNumber(67));

         secondList.sort(new MySecNumComparator());

        for (MySecondNumber num: secondList)
        {
            System.out.println(num.getNum());
        }

        List<UserDetail> userDetailList = new ArrayList<>();

        userDetailList.add(new UserDetail("prateek","indiagator@gmail.com"));
        userDetailList.add(new UserDetail("rajan","rajan@gmail.com"));
        userDetailList.add(new UserDetail("suzy","suzy@gmail.com"));
        userDetailList.add(new UserDetail("pramod","pramod@gmail.com"));

        List<Payment> paymentList = new ArrayList<>();
        paymentList.add(new Payment("rajan@gmail.com","43279"));
        paymentList.add(new Payment("suzy@gmail.com","43436"));
        paymentList.add(new Payment("rajan@gmail.com","76333"));
        paymentList.add(new Payment("pramod@gmail.com","53654"));

        List<PaymentDetail> paymentDetailList = new ArrayList<>();

        paymentDetailList.add(new PaymentDetail("43279","32434","97886",567));
        paymentDetailList.add(new PaymentDetail("43436","43677","43246",654));
        paymentDetailList.add(new PaymentDetail("76333","21314","97886",239));
        paymentDetailList.add(new PaymentDetail("53654","54357","97886",876));



        userDetailList.stream().filter(userDetail ->
                                    userDetail.getEmail().
                                            equals("rajan@gmail.com") ).
                                                    forEach(System.out::println);





     long c =    paymentDetailList.stream().filter(paymentDetail -> paymentDetail.getMerchant_id().equals("97886") ).
                map(paymentDetail -> paymentList.stream().
                        filter(payment -> payment.getPayment_id().
                                equals(paymentDetail.getPayment_id())).findAny().get() ).
                                    map(payment -> userDetailList.stream().
                                            filter(userDetail -> userDetail.getEmail().
                                                    equals(payment.getEmail())).findAny().get()).collect(Collectors.toSet()).stream().
                                                        map(userDetail -> {return userDetail.getName();}).count();

        System.out.println(c);

    }
}
