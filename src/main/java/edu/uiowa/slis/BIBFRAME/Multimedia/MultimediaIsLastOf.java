package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIsLastOf extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIsLastOf currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIsLastOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIsLastOfIterator theMultimediaIsLastOfIterator = (MultimediaIsLastOfIterator)findAncestorWithClass(this, MultimediaIsLastOfIterator.class);
			pageContext.getOut().print(theMultimediaIsLastOfIterator.getIsLastOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for isLastOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for isLastOf tag ");
		}
		return SKIP_BODY;
	}
}

