package org.example;

import java.util.PriorityQueue;

public class Task {
    String name;
    Integer priority;

    public Task(String name, Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.priority, a.priority));
        pq.add(new Task("task4", 1));
        pq.add(new Task("task3", 2));
        pq.add(new Task("task2", 3));
        pq.add(new Task("task1", 4));
        pq.add(new Task("task0", 4));

        for (int i = 0; i < pq.size(); i++) {
            System.out.println(pq.poll());
        }
    }

    @Override
    public String toString() {
        return "name: " + name + ", priority: " + priority;
    }
}
