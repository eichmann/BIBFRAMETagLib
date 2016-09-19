package edu.uiowa.slis.BIBFRAME.NotatedMusic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotatedMusicRelationInverse extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static NotatedMusicRelationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NotatedMusicRelationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NotatedMusicRelationInverseIterator theNotatedMusicRelationInverseIterator = (NotatedMusicRelationInverseIterator)findAncestorWithClass(this, NotatedMusicRelationInverseIterator.class);
			pageContext.getOut().print(theNotatedMusicRelationInverseIterator.getRelationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NotatedMusic for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing NotatedMusic for relation tag ");
		}
		return SKIP_BODY;
	}
}

