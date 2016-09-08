package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaSupplementsIterator theMultimediaSupplementsIterator = (MultimediaSupplementsIterator)findAncestorWithClass(this, MultimediaSupplementsIterator.class);
			pageContext.getOut().print(theMultimediaSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for supplements tag ");
		}
		return SKIP_BODY;
	}
}

