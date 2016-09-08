package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaRelationType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaRelationType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaRelationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaRelationIterator theMultimediaRelationIterator = (MultimediaRelationIterator)findAncestorWithClass(this, MultimediaRelationIterator.class);
			pageContext.getOut().print(theMultimediaRelationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for relation tag ");
		}
		return SKIP_BODY;
	}
}

