package observer;

import java.util.ArrayList;

/**
 * defines a Golfer which implements subject
 * @author Fred Schein
 */
public class Golfer implements Subject {
    private ArrayList<Observer> observers;
    private String name;
    
    /**
     * Creates an instance of a Golfer
     * @param name
     */
    public Golfer(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * adds an observer of the Golfer
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * removes an observer of the Golfer
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * notifies an observer of the Golfer
     * calls update to update the necassary information
     * @param strokes
     * @param par
     */
    @Override
    public void notifyObserver(int strokes, int par) {
        for(Observer observer : observers) {
            observer.update(strokes, par);
        }
    }

    /**
     * user provides strokes and par for the hole score
     * calls notifyObserver() 
     * @param strokes
     * @param par
     */
    public void enterScore(int strokes, int par) {
        notifyObserver(strokes, par);
    }

    /**
     * returns String of the name of the Golfer
     * @return String name 
     */
    public String getName() {
        return name;
    }
}
