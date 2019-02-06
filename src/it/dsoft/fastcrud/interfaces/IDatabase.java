package it.dsoft.fastcrud.interfaces;

import java.sql.SQLException;
import java.util.LinkedHashSet;

import it.dsoft.fastcrud.exceptions.ConfigurationException;
import it.dsoft.fastcrud.exceptions.ObjectMapException;
import it.dsoft.fastcrud.exceptions.TableNameException;

/**
 * Database interface
 * @author Daniele De Falco
 *
 */
public interface IDatabase {
	public <T> int Create(T object) throws SQLException, ConfigurationException, ObjectMapException, TableNameException, Exception;
	public <T> void Update(T object) throws SQLException, ConfigurationException, ObjectMapException, TableNameException, Exception;
	public <T> void Delete(T object) throws SQLException, ConfigurationException, ObjectMapException, TableNameException, Exception;
	public <T> LinkedHashSet<T> Read(String query, Class<T> clazz) throws SQLException, ConfigurationException, Exception;
}
