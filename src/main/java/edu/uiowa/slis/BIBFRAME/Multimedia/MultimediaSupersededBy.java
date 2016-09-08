package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSupersededByIterator theMultimediaSupersededByIterator = (MultimediaSupersededByIterator)findAncestorWithClass(this, MultimediaSupersededByIterator.class);
			pageContext.getOut().print(theMultimediaSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

