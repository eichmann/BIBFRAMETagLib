package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaContinuedUnderNewTitleBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaContinuedUnderNewTitleBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaContinuedUnderNewTitleBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaContinuedUnderNewTitleByIterator theMultimediaContinuedUnderNewTitleByIterator = (MultimediaContinuedUnderNewTitleByIterator)findAncestorWithClass(this, MultimediaContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theMultimediaContinuedUnderNewTitleByIterator.getContinuedUnderNewTitleBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

