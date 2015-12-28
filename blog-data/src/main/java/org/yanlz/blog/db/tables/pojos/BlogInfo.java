/**
 * This class is generated by jOOQ
 */
package org.yanlz.blog.db.tables.pojos;


import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.types.ULong;
import org.yanlz.blog.db.tables.interfaces.IBlogInfo;


/**
 * 文章信息表
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.1"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlogInfo implements IBlogInfo {

	private static final long serialVersionUID = -397778666;

	private ULong     blogId;
	private Long      blogAuthor;
	private Byte      blogType;
	private String    blogTitle;
	private String    blogAbstract;
	private String    blogContent;
	private Timestamp createdTime;
	private Timestamp updatedTime;
	private Long      commentCount;

	public BlogInfo() {}

	public BlogInfo(BlogInfo value) {
		this.blogId = value.blogId;
		this.blogAuthor = value.blogAuthor;
		this.blogType = value.blogType;
		this.blogTitle = value.blogTitle;
		this.blogAbstract = value.blogAbstract;
		this.blogContent = value.blogContent;
		this.createdTime = value.createdTime;
		this.updatedTime = value.updatedTime;
		this.commentCount = value.commentCount;
	}

	public BlogInfo(
		ULong     blogId,
		Long      blogAuthor,
		Byte      blogType,
		String    blogTitle,
		String    blogAbstract,
		String    blogContent,
		Timestamp createdTime,
		Timestamp updatedTime,
		Long      commentCount
	) {
		this.blogId = blogId;
		this.blogAuthor = blogAuthor;
		this.blogType = blogType;
		this.blogTitle = blogTitle;
		this.blogAbstract = blogAbstract;
		this.blogContent = blogContent;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
		this.commentCount = commentCount;
	}

	@NotNull
	@Override
	public ULong getBlogId() {
		return this.blogId;
	}

	@Override
	public void setBlogId(ULong blogId) {
		this.blogId = blogId;
	}

	@NotNull
	@Override
	public Long getBlogAuthor() {
		return this.blogAuthor;
	}

	@Override
	public void setBlogAuthor(Long blogAuthor) {
		this.blogAuthor = blogAuthor;
	}

	@NotNull
	@Override
	public Byte getBlogType() {
		return this.blogType;
	}

	@Override
	public void setBlogType(Byte blogType) {
		this.blogType = blogType;
	}

	@NotNull
	@Size(max = 200)
	@Override
	public String getBlogTitle() {
		return this.blogTitle;
	}

	@Override
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	@NotNull
	@Size(max = 500)
	@Override
	public String getBlogAbstract() {
		return this.blogAbstract;
	}

	@Override
	public void setBlogAbstract(String blogAbstract) {
		this.blogAbstract = blogAbstract;
	}

	@NotNull
	@Override
	public String getBlogContent() {
		return this.blogContent;
	}

	@Override
	public void setBlogContent(String blogContent) {
		this.blogContent = blogContent;
	}

	@NotNull
	@Override
	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	@Override
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	@NotNull
	@Override
	public Timestamp getUpdatedTime() {
		return this.updatedTime;
	}

	@Override
	public void setUpdatedTime(Timestamp updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Override
	public Long getCommentCount() {
		return this.commentCount;
	}

	@Override
	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("BlogInfo (");

		sb.append(blogId);
		sb.append(", ").append(blogAuthor);
		sb.append(", ").append(blogType);
		sb.append(", ").append(blogTitle);
		sb.append(", ").append(blogAbstract);
		sb.append(", ").append(blogContent);
		sb.append(", ").append(createdTime);
		sb.append(", ").append(updatedTime);
		sb.append(", ").append(commentCount);

		sb.append(")");
		return sb.toString();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IBlogInfo from) {
		setBlogId(from.getBlogId());
		setBlogAuthor(from.getBlogAuthor());
		setBlogType(from.getBlogType());
		setBlogTitle(from.getBlogTitle());
		setBlogAbstract(from.getBlogAbstract());
		setBlogContent(from.getBlogContent());
		setCreatedTime(from.getCreatedTime());
		setUpdatedTime(from.getUpdatedTime());
		setCommentCount(from.getCommentCount());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IBlogInfo> E into(E into) {
		into.from(this);
		return into;
	}
}