package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSupersededByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSupersededByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSupersededByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSupersededByIterator theMultimediaSupersededByIterator = (MultimediaSupersededByIterator)findAncestorWithClass(this, MultimediaSupersededByIterator.class);
			pageContext.getOut().print(theMultimediaSupersededByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

