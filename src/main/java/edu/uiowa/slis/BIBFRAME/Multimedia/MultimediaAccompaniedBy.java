package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaAccompaniedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaAccompaniedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaAccompaniedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaAccompaniedByIterator theMultimediaAccompaniedByIterator = (MultimediaAccompaniedByIterator)findAncestorWithClass(this, MultimediaAccompaniedByIterator.class);
			pageContext.getOut().print(theMultimediaAccompaniedByIterator.getAccompaniedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for accompaniedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for accompaniedBy tag ");
		}
		return SKIP_BODY;
	}
}

