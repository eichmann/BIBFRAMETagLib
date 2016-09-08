package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaContinuedUnderNewTitleByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaContinuedUnderNewTitleByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaContinuedUnderNewTitleByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaContinuedUnderNewTitleByIterator theMultimediaContinuedUnderNewTitleByIterator = (MultimediaContinuedUnderNewTitleByIterator)findAncestorWithClass(this, MultimediaContinuedUnderNewTitleByIterator.class);
			pageContext.getOut().print(theMultimediaContinuedUnderNewTitleByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for continuedUnderNewTitleBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for continuedUnderNewTitleBy tag ");
		}
		return SKIP_BODY;
	}
}

