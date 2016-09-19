package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaRelationInverseType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaRelationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaRelationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaRelationInverseIterator theMultimediaRelationInverseIterator = (MultimediaRelationInverseIterator)findAncestorWithClass(this, MultimediaRelationInverseIterator.class);
			pageContext.getOut().print(theMultimediaRelationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for relation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for relation tag ");
		}
		return SKIP_BODY;
	}
}

