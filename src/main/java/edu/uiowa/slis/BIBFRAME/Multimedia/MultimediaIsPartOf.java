package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsPartOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsPartOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsPartOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsPartOfIterator theMultimediaIsPartOfIterator = (MultimediaIsPartOfIterator)findAncestorWithClass(this, MultimediaIsPartOfIterator.class);
			pageContext.getOut().print(theMultimediaIsPartOfIterator.getIsPartOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isPartOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isPartOf tag ");
		}
		return SKIP_BODY;
	}
}

