package controller;

import model.Database;
import model.Etudiant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EtudiantController {

    public List<Etudiant> getAllEtudiants() throws SQLException {
        List<Etudiant> list = new ArrayList<>();
        Connection conn = Database.connect();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM etudiants");

        while (rs.next()) {
            list.add(new Etudiant(
                rs.getInt("id"),
                rs.getString("nom"),
                rs.getString("prenom"),
                rs.getString("email")
            ));
        }
        return list;
    }

    // Ajout, modification, suppression à implémenter...
}
