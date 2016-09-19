package edu.uiowa.slis.BIBFRAME.Multimedia;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MultimediaReceivedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MultimediaReceivedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MultimediaReceivedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MultimediaReceivedIterator theMultimediaReceivedIterator = (MultimediaReceivedIterator)findAncestorWithClass(this, MultimediaReceivedIterator.class);
			pageContext.getOut().print(theMultimediaReceivedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Multimedia for received tag ", e);
			throw new JspTagException("Error: Can't find enclosing Multimedia for received tag ");
		}
		return SKIP_BODY;
	}
}

