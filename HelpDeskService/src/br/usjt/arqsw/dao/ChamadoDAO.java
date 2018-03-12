package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;

public class ChamadoDAO {
	
	public ArrayList<Chamado> listarChamados(Fila fila) throws IOException {
		String query = "SELECT CH.ID_CHAMADO, "
							+ "CH.DESCRICAO, "
							+ "CH.STATUS, "
							+ "CH.DT_ABERTURA, "
							+ "CH.DT_FECHAMENTO, "
							+ "FI.ID_FILA, "
							+ "FI.NM_FILA "
						+ "FROM CHAMADO AS CH "
						+ "INNER JOIN FILA AS FI ON CH.ID_FILA = FI.ID_FILA "
						+ "WHERE FI.ID_FILA = ? ";
		
		ArrayList<Chamado> chamados = new ArrayList<>();
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(query);){
			pst.setInt(1, fila.getId());
			try(ResultSet rs = pst.executeQuery();){				
				while(rs.next()) {
					Chamado chamado = new Chamado();
					chamado.setId(rs.getInt("CH.ID_CHAMADO"));
					chamado.setDescricao(rs.getString("CH.DESCRICAO"));
					chamado.setStatus(rs.getString("CH.STATUS"));
					chamado.setDt_abertura(rs.getDate("CH.DT_ABERTURA"));
					chamado.setDt_fechamento(rs.getDate("CH.DT_FECHAMENTO"));
					fila.setId(rs.getInt("FI.ID_FILA"));
					fila.setNome(rs.getString("FI.NM_FILA"));
					chamado.setFila(fila);					
					chamados.add(chamado);
				}
			}catch (SQLException e) {
				throw new IOException(e);
			}			
		} catch (SQLException e1) {
			throw new IOException(e1);
		}
		return chamados;
	}

}
