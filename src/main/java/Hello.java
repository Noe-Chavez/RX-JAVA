import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;

import javax.swing.*;

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
    }

}
