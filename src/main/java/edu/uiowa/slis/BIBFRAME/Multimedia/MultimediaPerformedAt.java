package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaPerformedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaPerformedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaPerformedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaPerformedAtIterator theMultimediaPerformedAtIterator = (MultimediaPerformedAtIterator)findAncestorWithClass(this, MultimediaPerformedAtIterator.class);
			pageContext.getOut().print(theMultimediaPerformedAtIterator.getPerformedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for performedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for performedAt tag ");
		}
		return SKIP_BODY;
	}
}

