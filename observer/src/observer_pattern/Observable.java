package observer_pattern;

public interface Observable {
    /*
    * Definiremos las funciones de attach y notify
    * La idea es que cada observer se pueda enganchar o hacer attach a un observable y cada vez que se añada un nuevo video vamos a llamar a la función notify
    * La función notify llamará al update de todos los observers o suscriptores
    * */

    /* Función para suscribirse a nuestro canal de youtube */
    public void attach(Observer o);

    /* Función para desuscribirse a nuestro canal de youtube */
    public void detach(Observer o);

    /* Función para notificar sobre cambios en el objeto Obsevable */
    public void notifySuscribers();
}
