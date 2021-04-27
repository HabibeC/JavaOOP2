package com.company;

public class Main {

    public static void main(String[] args) {
        Camp camp1 = new Camp("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "Engin Demirog", 0);
        Camp camp2 = new Camp("Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACH)", "Engin Demirog", 0);
        Camp camp3 = new Camp("Programlamaya Giriş Temel Kurs", "Engin Demirog", 0);

        Category category1= new Category();
        category1.id=1;
        category1.name="Programlama";

        Instructor instructor1=new Instructor();
        instructor1.id=1;
        instructor1.name="Engin Demirog";

        CampManager campManager=new CampManager();
        campManager.addToHomepage(camp1);
        campManager.addToHomepage(camp2);
        campManager.addToHomepage(camp3);

        CategoryManager categoryManager=new CategoryManager();
        categoryManager.addToHomepage(category1);

    }
}
