/**
 * This class is generated by jOOQ
 */
package org.yanlz.blog.db.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.types.ULong;
import org.yanlz.blog.db.tables.UserInfo;
import org.yanlz.blog.db.tables.records.UserInfoRecord;


/**
 * 用户基本信息表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserInfoDao extends DAOImpl<UserInfoRecord, org.yanlz.blog.db.tables.pojos.UserInfo, ULong> {

	/**
	 * Create a new UserInfoDao without any configuration
	 */
	public UserInfoDao() {
		super(UserInfo.TB_USER_INFO, org.yanlz.blog.db.tables.pojos.UserInfo.class);
	}

	/**
	 * Create a new UserInfoDao with an attached configuration
	 */
	public UserInfoDao(Configuration configuration) {
		super(UserInfo.TB_USER_INFO, org.yanlz.blog.db.tables.pojos.UserInfo.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected ULong getId(org.yanlz.blog.db.tables.pojos.UserInfo object) {
		return object.getUserId();
	}

	/**
	 * Fetch records that have <code>user_id IN (values)</code>
	 */
	public List<org.yanlz.blog.db.tables.pojos.UserInfo> fetchByUserId(ULong... values) {
		return fetch(UserInfo.TB_USER_INFO.USER_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>user_id = value</code>
	 */
	public org.yanlz.blog.db.tables.pojos.UserInfo fetchOneByUserId(ULong value) {
		return fetchOne(UserInfo.TB_USER_INFO.USER_ID, value);
	}

	/**
	 * Fetch records that have <code>nick_name IN (values)</code>
	 */
	public List<org.yanlz.blog.db.tables.pojos.UserInfo> fetchByNickName(String... values) {
		return fetch(UserInfo.TB_USER_INFO.NICK_NAME, values);
	}

	/**
	 * Fetch records that have <code>protrait_url IN (values)</code>
	 */
	public List<org.yanlz.blog.db.tables.pojos.UserInfo> fetchByProtraitUrl(String... values) {
		return fetch(UserInfo.TB_USER_INFO.PROTRAIT_URL, values);
	}

	/**
	 * Fetch records that have <code>telephone IN (values)</code>
	 */
	public List<org.yanlz.blog.db.tables.pojos.UserInfo> fetchByTelephone(String... values) {
		return fetch(UserInfo.TB_USER_INFO.TELEPHONE, values);
	}

	/**
	 * Fetch records that have <code>created_time IN (values)</code>
	 */
	public List<org.yanlz.blog.db.tables.pojos.UserInfo> fetchByCreatedTime(Timestamp... values) {
		return fetch(UserInfo.TB_USER_INFO.CREATED_TIME, values);
	}

	/**
	 * Fetch records that have <code>updated_time IN (values)</code>
	 */
	public List<org.yanlz.blog.db.tables.pojos.UserInfo> fetchByUpdatedTime(Timestamp... values) {
		return fetch(UserInfo.TB_USER_INFO.UPDATED_TIME, values);
	}

	/**
	 * Fetch records that have <code>status IN (values)</code>
	 */
	public List<org.yanlz.blog.db.tables.pojos.UserInfo> fetchByStatus(Byte... values) {
		return fetch(UserInfo.TB_USER_INFO.STATUS, values);
	}
}