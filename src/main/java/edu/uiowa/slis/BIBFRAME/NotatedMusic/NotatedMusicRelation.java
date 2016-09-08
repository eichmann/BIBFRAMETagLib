package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicRelation extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicRelation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicRelationIterator theNotatedMusicRelationIterator = (NotatedMusicRelationIterator)findAncestorWithClass(this, NotatedMusicRelationIterator.class);
			pageContext.getOut().print(theNotatedMusicRelationIterator.getRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for relation tag ");
		}
		return SKIP_BODY;
	}
}

