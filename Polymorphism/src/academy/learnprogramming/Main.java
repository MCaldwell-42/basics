package academy.learnprogramming;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Shark eats lots of people.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }
    @Override
    public String plot(){
        return "Aliens coming for it all!";
    }
}

class VforVendetta extends Movie {
    public VforVendetta(){
        super("V for Vendetta");
    }
    @Override
    public String plot(){
        return "Gov of England unleashed plague on it's people and implement totalitarianism.";
    }
}

class forgettableMovie extends Movie {
    public forgettableMovie(){
        super("Forgettable");
    }
    //no plot method
}


public class Main {

    public static void main(String[] args) {
        for(int i =1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # "+i+" : "+ movie.getName() + "\n" +
                    "plot: "+ movie.plot()+ "\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 4) +1;
        System.out.println("Random number is "+randomNumber);
        switch (randomNumber) {
            case 1:
            return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new VforVendetta();
            case 4:
                return new forgettableMovie();
        }
        return null;
    }
}
