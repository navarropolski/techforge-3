package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    private Connection conn;

    public DAO () {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(
                    "jbdc:mysql://localhost:3306/piloto-eafc24",
                    "root",
                    ""

            );
        }catch (Exception e) {
            System.out.println("Erro ao tentar conectar como banco de dados.");
        }


        public List<Carta> fildallCarta() {
            List<Carta> cartas = new ArrayList<>();
            String sql = "SELECT * FROM carta";

            try (PreparedStatement stmt = conn.prepareStatement();
                 ResultSet rs = stmt.executeQuery() {

                 while (rs.next()) {
                     Carta carta = new Carta();

                     carta.setConducao(rs.getInt("conducao"));
                     carta.setDefesa(rs.getInt("defesa"));
                     carta.setFinalizacao(rs.getInt("finalizacao"));
                     carta.setRitmo(rs.getInt("ritmo"));
                     carta.setPasse(rs.getInt("passe"));
                     carta.setPosicao(Posicao.valueOf(rs.getString("posicao")));
                     carta.setPais(findPaisById(rs.getInt("id_nacionalidade")));
                     carta.getPosicoesSecundarias(findPosicoeSecundarias(carta));
                     carta.calculateOverall();

                     cartas.add(carta);
                 }

            }catch (SQLException e){
                System.out.println("Falha ao tentar consultar cartas no banco");
            }

            return cartas;
        }

            public Pais findPaisById(int id) {
            Pais pais = new Pais();
            String sql = "SELECT * FROM pais WHERE id = ?";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1,id);
                try (ResultSet rs = stmt.executeQuery()) {
                    if(rs.next()) {
                        pais.setNome(rs.getString("nome"));
                        pais.setUrlImagem(rs.getString("url_imagem"));
                    }
                }


            }catch (SQLException e){
                System.out.println("Falha ao encontrar o país");
            }
            return pais;
        }
            public List<Posicao> findPosicoesSecundarias(Carta carta) {
            List<Posicao> posicoes = new ArrayList<Posicao>();

            String sql = "SELECT * FROM posicao_jogador WHERE id_jogador = ?";

            try(PreparedStatement stmt = conn.prepareStatement()){
                stmt.setInt(carta.getId());
                try(ResultSet rs = stmt.executeQuery()){
                    posicoes.add(Posicao.valueOf(rs.getString("ds_posicao")));


                }
            }
        }catch (SQLException e) {
            System.out.println("Falha ao tentar consultar as posicoes secundarias");
        }
        return posicoes;
    }
}