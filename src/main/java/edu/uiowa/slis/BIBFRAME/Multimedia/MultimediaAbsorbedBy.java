package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaAbsorbedBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaAbsorbedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaAbsorbedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaAbsorbedByIterator theMultimediaAbsorbedByIterator = (MultimediaAbsorbedByIterator)findAncestorWithClass(this, MultimediaAbsorbedByIterator.class);
			pageContext.getOut().print(theMultimediaAbsorbedByIterator.getAbsorbedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

