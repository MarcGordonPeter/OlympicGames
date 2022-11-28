public class Main {
    public static void main(String[] args) {
        CompositeTeam olympicsTeam = new CompositeTeam("Olympics Team");
        CompositeTeam asiaTeam = new CompositeTeam("Asia Team");
        CompositeTeam europeTeam = new CompositeTeam("Europe Team");
        CompositeTeam chinaTeam = new CompositeTeam("China Team");
        CompositeTeam germanyTeam = new CompositeTeam("Germany Team");
        CompositeTeam italyTeam = new CompositeTeam("Italy Team");
        CompositeTeam womansTeam = new CompositeTeam("Womans Team");
        CompositeTeam mensTeam = new CompositeTeam("Mens Team");

        womansTeam.addTeam(new Leaf("Teakwando", 10, 1));
        womansTeam.addTeam(new Leaf("Waterloo", 20, 2));
        womansTeam.addTeam(new Leaf("Artistic Gymnastics", 30, 3));
        mensTeam.addTeam(new Leaf("Shooting", 40, 4));
        chinaTeam.addTeam(mensTeam);
        chinaTeam.addTeam(womansTeam);

        womansTeam = new CompositeTeam("Womans Team");
        womansTeam.addTeam(new Leaf("Cycling", 50, 5));
        womansTeam.addTeam(new Leaf("Tennis", 60, 6));
        mensTeam = new CompositeTeam("Mens Team");
        mensTeam.addTeam(new Leaf("Table Tennis", 70, 7));
        mensTeam.addTeam(new Leaf("Football", 80, 8));
        germanyTeam.addTeam(mensTeam);
        germanyTeam.addTeam(womansTeam);

        womansTeam = new CompositeTeam("Womans Team");
        womansTeam.addTeam(new Leaf("Alpine Sky", 90, 9));
        mensTeam = new CompositeTeam("Mens Team");
        mensTeam.addTeam(new Leaf("Football", 100, 10));
        mensTeam.addTeam(new Leaf("Swimming Team", 110, 11));
        italyTeam.addTeam(mensTeam);
        italyTeam.addTeam(womansTeam);

        asiaTeam.addTeam(chinaTeam);
        europeTeam.addTeam(germanyTeam);
        europeTeam.addTeam(italyTeam);
        olympicsTeam.addTeam(asiaTeam);
        olympicsTeam.addTeam(europeTeam);

        germanyTeam.printInfoAtheletes("Mens Team");
        System.out.println("-----------");
        germanyTeam.printInfoMedals("All");
        System.out.println("-----------");
        asiaTeam.printInfoMedals("All");
        System.out.println("-----------");
        olympicsTeam.printInfoAtheletes("All");

    }
}
