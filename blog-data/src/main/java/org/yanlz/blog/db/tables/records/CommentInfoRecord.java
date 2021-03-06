/**
 * This class is generated by jOOQ
 */
package org.yanlz.blog.db.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;
import org.yanlz.blog.db.tables.CommentInfo;
import org.yanlz.blog.db.tables.interfaces.ICommentInfo;


/**
 * 评论信息表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommentInfoRecord extends UpdatableRecordImpl<CommentInfoRecord> implements Record7<ULong, Long, Long, String, Long, Timestamp, Timestamp>, ICommentInfo {

	private static final long serialVersionUID = -757227647;

	/**
	 * Setter for <code>blog.tb_comment_info.comment_id</code>. 主键
	 */
	@Override
	public void setCommentId(ULong value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>blog.tb_comment_info.comment_id</code>. 主键
	 */
	@NotNull
	@Override
	public ULong getCommentId() {
		return (ULong) getValue(0);
	}

	/**
	 * Setter for <code>blog.tb_comment_info.comment_blog_id</code>. 评论文章ID
	 */
	@Override
	public void setCommentBlogId(Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>blog.tb_comment_info.comment_blog_id</code>. 评论文章ID
	 */
	@NotNull
	@Override
	public Long getCommentBlogId() {
		return (Long) getValue(1);
	}

	/**
	 * Setter for <code>blog.tb_comment_info.comment_user_id</code>. 评论人id
	 */
	@Override
	public void setCommentUserId(Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>blog.tb_comment_info.comment_user_id</code>. 评论人id
	 */
	@NotNull
	@Override
	public Long getCommentUserId() {
		return (Long) getValue(2);
	}

	/**
	 * Setter for <code>blog.tb_comment_info.comment_content</code>. 评论内容
	 */
	@Override
	public void setCommentContent(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>blog.tb_comment_info.comment_content</code>. 评论内容
	 */
	@NotNull
	@Size(max = 65535)
	@Override
	public String getCommentContent() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>blog.tb_comment_info.parent_id</code>. 评论父节点
	 */
	@Override
	public void setParentId(Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>blog.tb_comment_info.parent_id</code>. 评论父节点
	 */
	@Override
	public Long getParentId() {
		return (Long) getValue(4);
	}

	/**
	 * Setter for <code>blog.tb_comment_info.created_time</code>. 评论时间
	 */
	@Override
	public void setCreatedTime(Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>blog.tb_comment_info.created_time</code>. 评论时间
	 */
	@NotNull
	@Override
	public Timestamp getCreatedTime() {
		return (Timestamp) getValue(5);
	}

	/**
	 * Setter for <code>blog.tb_comment_info.updated_time</code>. 更新时间
	 */
	@Override
	public void setUpdatedTime(Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>blog.tb_comment_info.updated_time</code>. 更新时间
	 */
	@NotNull
	@Override
	public Timestamp getUpdatedTime() {
		return (Timestamp) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<ULong> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<ULong, Long, Long, String, Long, Timestamp, Timestamp> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<ULong, Long, Long, String, Long, Timestamp, Timestamp> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field1() {
		return CommentInfo.TB_COMMENT_INFO.COMMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field2() {
		return CommentInfo.TB_COMMENT_INFO.COMMENT_BLOG_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field3() {
		return CommentInfo.TB_COMMENT_INFO.COMMENT_USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return CommentInfo.TB_COMMENT_INFO.COMMENT_CONTENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field5() {
		return CommentInfo.TB_COMMENT_INFO.PARENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field6() {
		return CommentInfo.TB_COMMENT_INFO.CREATED_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Timestamp> field7() {
		return CommentInfo.TB_COMMENT_INFO.UPDATED_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value1() {
		return getCommentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value2() {
		return getCommentBlogId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value3() {
		return getCommentUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCommentContent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value5() {
		return getParentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value6() {
		return getCreatedTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Timestamp value7() {
		return getUpdatedTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentInfoRecord value1(ULong value) {
		setCommentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentInfoRecord value2(Long value) {
		setCommentBlogId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentInfoRecord value3(Long value) {
		setCommentUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentInfoRecord value4(String value) {
		setCommentContent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentInfoRecord value5(Long value) {
		setParentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentInfoRecord value6(Timestamp value) {
		setCreatedTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentInfoRecord value7(Timestamp value) {
		setUpdatedTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentInfoRecord values(ULong value1, Long value2, Long value3, String value4, Long value5, Timestamp value6, Timestamp value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ICommentInfo from) {
		setCommentId(from.getCommentId());
		setCommentBlogId(from.getCommentBlogId());
		setCommentUserId(from.getCommentUserId());
		setCommentContent(from.getCommentContent());
		setParentId(from.getParentId());
		setCreatedTime(from.getCreatedTime());
		setUpdatedTime(from.getUpdatedTime());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ICommentInfo> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CommentInfoRecord
	 */
	public CommentInfoRecord() {
		super(CommentInfo.TB_COMMENT_INFO);
	}

	/**
	 * Create a detached, initialised CommentInfoRecord
	 */
	public CommentInfoRecord(ULong commentId, Long commentBlogId, Long commentUserId, String commentContent, Long parentId, Timestamp createdTime, Timestamp updatedTime) {
		super(CommentInfo.TB_COMMENT_INFO);

		setValue(0, commentId);
		setValue(1, commentBlogId);
		setValue(2, commentUserId);
		setValue(3, commentContent);
		setValue(4, parentId);
		setValue(5, createdTime);
		setValue(6, updatedTime);
	}
}
