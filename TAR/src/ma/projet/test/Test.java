package ma.projet.test;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import ma.projet.entities.Femme;
import ma.projet.entities.Homme;
import ma.projet.entities.Mariage;
import ma.projet.entities.MariageKey;
import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;
import ma.projet.service.MariageService;

public class Test {

    public static Date generateDateFormat(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, 0, 0, 0);
        Date date = calendar.getTime();
        return date;
    }

    public static void main(String[] args) throws ParseException {
        HommeService hs = new HommeService();
        FemmeService fs = new FemmeService();
        MariageService ms = new MariageService();

/*
        Mariage mariage = new Mariage(new MariageKey(1, 7, generateDateFormat(2022,01,01),generateDateFormat(2023,01,01),4));
        ms.create(mariage);
        Mariage mariage2 = new Mariage(new MariageKey(2, 8, generateDateFormat(2022,01,01),generateDateFormat(2022,02,01)));
        ms.create(mariage2);
        Mariage mariage3 = new Mariage(new MariageKey(3, 9, generateDateFormat(2022,01,01), generateDateFormat(2023,01,01),1));
        ms.create(mariage3);
        Mariage mariage4 = new Mariage(new MariageKey(4, 10, generateDateFormat(2022,01,01),generateDateFormat(2023,01,01),1));
        ms.create(mariage4);
        Mariage mariage5 = new Mariage(new MariageKey(5, 11, generateDateFormat(2022,01,01),generateDateFormat(2023,01,01),0));
        ms.create(mariage5);
        Mariage mariage6 = new Mariage(new MariageKey(1, 14, generateDateFormat(2022,03,01),generateDateFormat(2023,01,01),2));
        ms.create(mariage6);
        Mariage mariage8 = new Mariage(new MariageKey(3, 8, generateDateFormat(2022,03,01),generateDateFormat(2023,01,01),2));
        ms.create(mariage8);
       */ 
        
       /*for (int i=1;i<=5;i++){
        Random random = new Random();
        int annee=random.nextInt(2)+2001;
        int mois=random.nextInt(12)+1;
        int jour=random.nextInt(29)+1;
        String num="06";
        for(int j=1;j<=8;j++){
            int alnum=random.nextInt(10);
            num=num+alnum;
        }
        int numero=Integer.parseInt(num);

       Homme Homme=new Homme("lastname"+i,"firstname"+i,numero,"address"+i,generateDateFormat(annee, mois, jour));
          hs.create(Homme);
    }
       
       for (int i=1;i<=10;i++){
        Random random = new Random();
        int annee=random.nextInt(2)+2001;
        int mois=random.nextInt(12)+1;
        int jour=random.nextInt(29)+1;
        String num="06";
        for(int j=1;j<=8;j++){
            int alnum=random.nextInt(10);
            num=num+alnum;
        }
        int numero=Integer.parseInt(num);

       Femme femme1=new Femme("lastname"+i,"firstname"+i,numero,"address"+i,generateDateFormat(annee, mois, jour));
          fs.create(femme1);
    }

     System.out.println("the ladies are : ");
     for(Femme femmeinfo:fs.findAll()){
        System.out.println(femmeinfo);
     }*/
    
    //hs.displayGetWives(2, generateDateFormat(2020, 01, 01), generateDateFormat(2024, 02, 01));

    //fs.displayCountEnfantsFemmeEntreDates(8, generateDateFormat(2020, 01, 01), generateDateFormat(2023, 02, 01));

    //fs.displayWomenMarriedMultipleTimes();

    //hs.displayMenMarriedByFourWomenBetweenDates( generateDateFormat(2020, 01, 01), generateDateFormat(2025, 02, 01));

    hs.displayAllMarriagesOfMan(2);
    
    }
}
