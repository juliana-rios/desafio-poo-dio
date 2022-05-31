module br.com.dio.desafioprojetopadroesprojeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.dio.desafioprojetopadroesprojeto to javafx.fxml;
    exports br.com.dio.desafioprojetopadroesprojeto;
}