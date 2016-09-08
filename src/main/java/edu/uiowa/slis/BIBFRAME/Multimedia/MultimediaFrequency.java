package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaFrequency extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaFrequency currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaFrequency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MultimediaFrequencyIterator theMultimedia = (MultimediaFrequencyIterator)findAncestorWithClass(this, MultimediaFrequencyIterator.class);
			pageContext.getOut().print(theMultimedia.getFrequency());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for frequency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for frequency tag ");
		}
		return SKIP_BODY;
	}
}

