package com.oosic.webservice.mybatis.typehandlers;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.UUID;

import org.apache.ibatis.type.Alias;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

@MappedTypes(UUID.class)
@Alias("UUIDTypeHandler")
public class UUIDTypeHandler implements TypeHandler {

	@Override
	public void setParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		if (parameter == null) {
			ps.setNull(i, Types.CHAR);
		} else {
			String u = parameter.toString();
			ps.setString(i, u);
		}
	}

	@Override
	public Object getResult(ResultSet rs, String columnName) throws SQLException {
		Object object = rs.getObject(columnName);
		if (object == null)
			return null;
		String str = (String) object;
		UUID u = UUID.fromString(str);
		return u;
	}

	@Override
	public Object getResult(CallableStatement cs, int columnIndex) throws SQLException {
		Object object = cs.getObject(columnIndex);
		if (object == null)
			return null;
		String str = (String) object;
		UUID u = UUID.fromString(str);
		return u;
	}

}
