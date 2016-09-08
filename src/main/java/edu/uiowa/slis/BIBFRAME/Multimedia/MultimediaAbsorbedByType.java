package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaAbsorbedByIterator theMultimediaAbsorbedByIterator = (MultimediaAbsorbedByIterator)findAncestorWithClass(this, MultimediaAbsorbedByIterator.class);
			pageContext.getOut().print(theMultimediaAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

