import com.google.gson.Gson;
import model.Carta;
import model.DAO;
import model.Pais;
import model.Posicao;
import spark.Spark;

import java.util.List;

public class Main {

    private static final Gson GSON = new Gson();

    public static void main(String[] args) {

        DAO cartasDAO = new DAO();

        List<Carta> carta = cartasDAO.fildAllCarta();
        String cartasJSON = GSON.toJson(cartas);

        Spark.get("/", (request, response) -> "cartaJSON");
    }
}