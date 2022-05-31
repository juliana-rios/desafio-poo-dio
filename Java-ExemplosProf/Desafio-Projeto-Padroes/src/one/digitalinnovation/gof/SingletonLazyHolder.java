package one.digitalinnovation.gof;

/**
 * Singleton "Lazy Holder"
 *
 *
 * @author juliana-rios
 *
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
        private SingletonLazyHolder() {
            super();
        }

        public static SingletonLazyHolder getInstancia() {
            return InstanceHolder.instancia;
        }

}