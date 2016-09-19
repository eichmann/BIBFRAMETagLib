package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicRelationInverseIterator theNotatedMusicRelationInverseIterator = (NotatedMusicRelationInverseIterator)findAncestorWithClass(this, NotatedMusicRelationInverseIterator.class);
			pageContext.getOut().print(theNotatedMusicRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for relation tag ");
		}
		return SKIP_BODY;
	}
}

