package com.spring.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.mvc.model.User;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
		}

	@Override
	public int create(User user) {

		String sql = "insert into user(user_name, user_email, user_course, user_number) values(?,?,?,?)";

		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { user.getName(), user.getEmail(), user.getCourse(), user.getNumber()});

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<User> read() {
		
		List<User> userList = jdbcTemplate.query("select * from user", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();

				user.setId(rs.getInt("user_id"));
				user.setName(rs.getString("user_name"));
				user.setEmail(rs.getString("user_email"));
				user.setCourse(rs.getString("user_course"));
				user.setNumber(rs.getString("user_number"));

				return user;
			}

		});

		return userList;
	}

	@Override
	public List<User> findUserById(int userId) {

		List<User> userList = jdbcTemplate.query("select * from user where user_id=?",
				new Object[] { userId }, new RowMapper<User>() {

					@Override
					public User mapRow(ResultSet rs, int rowNum) throws SQLException {
						User user = new User();

						user.setId(rs.getInt("user_id"));
						user.setName(rs.getString("user_name"));
						user.setEmail(rs.getString("user_email"));
						user.setCourse(rs.getString("user_course"));
						user.setNumber(rs.getString("user_number"));

						return user;
					}

				});

		return userList;
	}

	@Override
	public int update(User user) {
		String sql = "update  user set user_name=?, user_email=?, user_course=?, user_number=? where user_id=?";

		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { user.getName(), user.getEmail(), user.getCourse(),user.getNumber(), user.getId() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int userId) {
		String sql = "delete from user where user_id=?";

		try {

			int counter = jdbcTemplate.update(sql, new Object[] { userId });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}
