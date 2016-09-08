package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsPartOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsPartOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsPartOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsPartOfIterator theMultimediaIsPartOfIterator = (MultimediaIsPartOfIterator)findAncestorWithClass(this, MultimediaIsPartOfIterator.class);
			pageContext.getOut().print(theMultimediaIsPartOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

