import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Consumer;

import java.util.ArrayList;
import java.util.List;

public class Hello {

    public static void main(String[] args) {
        hello();
    }

    public static void hello() {
       Observable.just("Mediante un Consumer --> Hello World / Hola Mundo") // creando el observable.
                .subscribe(new Consumer<String>() { // suscribción de la acción.
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });

       Observable.just("Mediante una expresiómn lambda --> Hello World / Hola Mundo") // creando el observable.
                .subscribe(s -> {System.out.println(s);} // suscribción de la acción.
                );

       List<Task> tasks = new ArrayList<>(2);
       tasks.add(new Task("Tarea I", "RX-JAVA"));
       tasks.add(new Task("Tarea II", "Coroutine whit Kotlin"));

        List<Task> tasksOther = new ArrayList<>(2);
        tasks.add(new Task("Tarea I - Other", "RX-JAVA"));
        tasks.add(new Task("Tarea II - Other", "Coroutine whit Kotlin"));

       // Se crea el Observable.
       Observable<List<Task>> observableTasks = Observable.just(tasks, tasksOther);
       // suscribir al observable.
        observableTasks.subscribe(
                (listTask) -> {
                    for (Task task : listTask) System.out.println(task);
                }
        );

        Observable<Integer> integerObservable = Observable.just(1, 5, 8);
        integerObservable.subscribe(
                (a) -> {
                    System.out.println(a);
                }
        );


    }

}
