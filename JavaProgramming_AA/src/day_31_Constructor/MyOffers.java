package day_31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon", "SDET", 99000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("VA", "Sony", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, true);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, false, false);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank of America", "BA", 130000, true, true, false, true);

        System.out.println("offer1 = " + offer1);
        System.out.println("offer2 = " + offer2);
        System.out.println("offer3 = " + offer3);
        System.out.println("offer4 = " + offer4);
        System.out.println("offer5 = " + offer5);


        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};
        /*
2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
2.3.1 Write a program that can remove the offer objects that are not full-time
         */

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers)); // from myOffers Array to ArrayList

        fullTimeOffers.removeIf(p -> !p.isFullTime); // removes if the offer is not fulltime
        
        int fulTimeOffersCount = fullTimeOffers.size();
        System.out.println("fulTimeOffersCount = " + fulTimeOffersCount); // fulTimeOffersCount = 4
        /*
2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
2.4.1 Write a program that can remove all the offers that are not from local
         */

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p->!(p.location.equals("VA")||p.location.equals("FL") )); // removes the offer if the offer is not from local area

        System.out.println("localOffers = " + localOffers);

        int localOfferCounts = localOffers.size();
        System.out.println("localOfferCounts = " + localOfferCounts);

        for (Offer localOffer : localOffers) {
            System.out.println(localOffer.companyName + " " + localOffer.salary);
        }
        
        /*
2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
         */
        
        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p->!(p.hasBenefit||p.hasPTO)); // removes if the offers that does not have benefit and does not have PTO

        System.out.println("offersWithBenefits = " + offersWithBenefits);
        
        int offersWithBenefitsCounts = offersWithBenefits.size();
        System.out.println("offersWithBenefitsCounts = " + offersWithBenefitsCounts);
        
        /*
2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
2.6.1 Write a program that can remove all the offers that are not for SDET
         */
        
        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p->!p.jobTitle.equalsIgnoreCase("sdet")); // removes all the offers that are not for SDET

        System.out.println("sdetOffers = " + sdetOffers);

        int sdetOffersCount = sdetOffers.size();
        System.out.println("sdetOffersCount = " + sdetOffersCount);

        /*
2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
         */

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p->p.salary<100000); // removes all the offers that are offering less than 100K salary

        System.out.println("offersWith100K = " + offersWith100K);

        int offersWith100KCount = offersWith100K.size();

        System.out.println("offersWith100KCount = " + offersWith100KCount);

        for (Offer offer : offersWith100K) {
            System.out.println(offer.companyName + " : " + offer.jobTitle + " : " + offer.salary);
        }


    }
}
