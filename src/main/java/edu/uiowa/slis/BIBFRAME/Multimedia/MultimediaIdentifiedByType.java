package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaIdentifiedByIterator theMultimediaIdentifiedByIterator = (MultimediaIdentifiedByIterator)findAncestorWithClass(this, MultimediaIdentifiedByIterator.class);
			pageContext.getOut().print(theMultimediaIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

