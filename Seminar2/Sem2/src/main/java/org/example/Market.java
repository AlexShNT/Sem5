package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {
    List <Actor> orders = new ArrayList<>();
    Queue<Actor> que = new LinkedList<>();
    private int countQueue;
    private Actor lastActor;
    private Actor firstActor;


    @Override
    public void takeInQueue(Actor actor) {
        if (this.que.offer(actor)){
            this.lastActor = actor;
            System.out.println(this.lastActor.name + " перед Вами в очереди: " + (this.que.size() -1) + " человек");
        } else {
            System.out.println("ПРОБЛЕМА в очереди");
        }
    }


    @Override
    public void takeOrders() {
        this.orders.add(this.lastActor);
        this.lastActor.setMakeOrder(true);
        this.countQueue++;
        System.out.println("Ваш заказ №: " +(orders.size()));
    }

    @Override
    public void giveOrders() {
        this.firstActor = que.peek();
        if (this.firstActor != null){
            if (orders.indexOf(this.firstActor) >= 0){
                firstActor.setTakeOrder(true);
                releaseFromMarket((List<Actor>) que);
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        if (this.que.peek().isTakeOrder){
            this.que.remove();
            System.out.println("Сейчас в очереди: " + que.size() + " человек");
        }
    }

    @Override
    public void acceptToMarket(Actor actor) {
        takeInQueue(actor);
        takeOrders();
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        releaseFromQueue();
    }

    @Override
    public void update() {
        giveOrders();

    }
}
